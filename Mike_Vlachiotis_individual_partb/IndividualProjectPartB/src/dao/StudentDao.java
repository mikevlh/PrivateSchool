/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import UserInput.ScanInput;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.ArrayList;
import java.util.List;
import model.Student;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import util.DbUtils;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 *
 * @author ironm
 */
public class StudentDao {

    public static List<Student> getAllStudents() {
        List<Student> result = new ArrayList<>();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;

        try {
            con = DbUtils.getConnection();
            String sql = "Select * from student";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Student s = new Student(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDate(4),
                        rs.getDouble(5));
                result.add(s);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(StudentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(StudentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }

        return result;
    }

    public static void insertStudent(Student s) {
        PreparedStatement ps = null;
        Connection con = null;

        try {
            con = DbUtils.getConnection();
            String sql = "insert into student(Stu_FName, Stu_LName, DOB, TuitionFees) values (?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, s.getFirstName());
            ps.setString(2, s.getLastName());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            String strDate = dateFormat.format(s.getDateOfBirth());

            try {
                java.sql.Date dob = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd")
                        .parse(strDate)
                        .getTime());
                ps.setDate(3, dob);
            } catch (ParseException ex) {
                java.util.logging.Logger.getLogger(StudentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

            ps.setDouble(4, s.getTuitionFees());
            ps.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(StudentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(StudentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }
    }
}
