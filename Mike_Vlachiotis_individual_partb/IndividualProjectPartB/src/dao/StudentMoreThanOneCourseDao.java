/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.StudentMoreThanOneCourse;
import util.DbUtils;

/**
 *
 * @author ironm
 */
public class StudentMoreThanOneCourseDao {

    public static List<StudentMoreThanOneCourse> getAllStudentsWithMoreThanOneCourses() {
        List<StudentMoreThanOneCourse> result = new ArrayList<>();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;

        try {
            con = DbUtils.getConnection();
            String sql = "SELECT STUDENT_ID,STU_FNAME,STU_LNAME\n"
                    + "FROM STUDENT\n"
                    + "JOIN STUDENTCOURSE ON STUDENT_ID = STU_INV_COU\n"
                    + "GROUP BY STUDENT_ID\n"
                    + "HAVING COUNT(STU_INV_COU) > 1;";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                StudentMoreThanOneCourse smtoc = new StudentMoreThanOneCourse(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3));

                result.add(smtoc);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(StudentMoreThanOneCourseDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(StudentMoreThanOneCourseDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }

        return result;
    }
}
