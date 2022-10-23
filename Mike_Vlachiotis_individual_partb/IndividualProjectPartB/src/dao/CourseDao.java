/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;
import model.Course;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import util.DbUtils;

/**
 *
 * @author ironm
 */
public class CourseDao {

    public static List<Course> getAllCourses() {
        List<Course> result = new ArrayList<>();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;

        try {
            con = DbUtils.getConnection();
            String sql = "Select * from course";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Course c = new Course(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getDate(6));
                result.add(c);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(CourseDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(CourseDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }

        return result;
    }

    public static void insertCourse(Course c) {
        PreparedStatement ps = null;
        Connection con = null;

        try {
            con = DbUtils.getConnection();
            String sql = "insert into Course(Course_Title, course.Stream, course.type, start_date, end_date) values (?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, c.getTitle());
            ps.setString(2, c.getStream());
            ps.setString(3, c.getType());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String strDate = dateFormat.format(c.getStartDate());
            String endDate = dateFormat.format(c.getEndDate());

            try {
                java.sql.Date startDate1 = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd")
                        .parse(strDate)
                        .getTime());
                java.sql.Date endDate1 = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd")
                        .parse(endDate)
                        .getTime());
                ps.setDate(4, startDate1);
                ps.setDate(5, endDate1);
            } catch (ParseException ex) {
                java.util.logging.Logger.getLogger(StudentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }
            ps.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(TrainerDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(TrainerDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }
    }
}
