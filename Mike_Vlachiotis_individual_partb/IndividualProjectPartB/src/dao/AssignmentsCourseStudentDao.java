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
import model.AssignmentsCourseStudent;
import util.DbUtils;

/**
 *
 * @author ironm
 */
public class AssignmentsCourseStudentDao {

    public static List<AssignmentsCourseStudent> getAllAssignmentsPerStudentPerCourse() {
        List<AssignmentsCourseStudent> result = new ArrayList<>();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;

        try {
            con = DbUtils.getConnection();
            String sql = "SELECT STUDENT_ID,STU_FNAME,STU_LNAME,COURSE_ID,COURSE_TITLE,private_school.course.stream,private_school.course.type,START_DATE,END_DATE,ASS_ID,ASS_TITLE,SUB_DATE_TIME\n"
                    + "FROM STUDENT\n"
                    + "JOIN studentcourse ON STUDENT_ID = Stu_Inv_Cou\n"
                    + "JOIN COURSE ON COU_INV_STU = COURSE_ID\n"
                    + "JOIN asscourse ON COURSE_ID = COU_INV_ASS\n"
                    + "JOIN ASSIGNMENT ON ASS_INV_COU = ASS_ID\n"
                    + "ORDER BY STUDENT_ID;";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                AssignmentsCourseStudent acs = new AssignmentsCourseStudent(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getInt(4),
                        rs.getString(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getDate(8),
                        rs.getDate(9),
                        rs.getInt(10),
                        rs.getString(11),
                        rs.getTimestamp(12));
                result.add(acs);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(AssignmentsCourseStudentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AssignmentsCourseStudentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }

        return result;
    }
}
