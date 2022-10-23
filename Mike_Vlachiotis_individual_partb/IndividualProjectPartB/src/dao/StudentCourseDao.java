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
import model.StudentCourse;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import util.DbUtils;

/**
 *
 * @author ironm
 */
public class StudentCourseDao {

    public static List<StudentCourse> getAllStudentsPerCourse() {
        List<StudentCourse> result = new ArrayList<>();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;

        try {
            con = DbUtils.getConnection();
            String sql = "SELECT STUDENT_ID,STU_FNAME,STU_LNAME,COURSE_ID,COURSE_TITLE,private_school.course.stream,private_school.course.type,START_DATE,END_DATE\n"
                    + "FROM STUDENT\n"
                    + "JOIN STUDENTCOURSE ON STUDENT_ID = STU_INV_COU\n"
                    + "JOIN COURSE ON COURSE_ID = COU_INV_STU\n"
                    + "ORDER BY COURSE_TITLE;";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                StudentCourse sc = new StudentCourse(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8),
                        rs.getDate(9));
                result.add(sc);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(StudentCourseDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(StudentCourseDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }

        return result;
    }

//    public static void insertStudentsPerCourse(Trainer t) {
//        PreparedStatement ps = null;
//        Connection con = null;
//
//        
//        try {
//            con = DbUtils.getConnection();
//        String sql = "insert into Trainer(Tra_FName, Tra_LName, Subject) values (?,?,?)";
//            ps = con.prepareStatement(sql);
//            ps.setString(1, t.getFirstName());
//            ps.setString(2, t.getLastName());
//            ps.setString(3, t.getSubject());
//            ps.executeUpdate();
//        } catch (SQLException ex) {
//            java.util.logging.Logger.getLogger(TrainerDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } finally {
//            try {
//                ps.close();
//                con.close();
//            } catch (SQLException ex) {
//                java.util.logging.Logger.getLogger(TrainerDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            }
//
//        }
//    }
}
