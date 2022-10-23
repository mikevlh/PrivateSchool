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
import model.AssCourse;
import util.DbUtils;

/**
 *
 * @author ironm
 */
public class AssCourseDao {

    public static List<AssCourse> getAllAssignmentsPerCourse() {
        List<AssCourse> result = new ArrayList<>();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;

        try {
            con = DbUtils.getConnection();
            String sql = "SELECT COURSE_ID,COURSE_TITLE,private_school.COURSE.STREAM,private_school.COURSE.TYPE,START_DATE,END_DATE,ASS_ID,ASS_TITLE,SUB_DATE_TIME\n"
                    + "FROM ASSIGNMENT\n"
                    + "JOIN ASSCOURSE ON ASS_ID = ASS_INV_COU\n"
                    + "JOIN COURSE ON COURSE_ID = COU_INV_ASS\n"
                    + "ORDER BY COURSE_TITLE;";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                AssCourse ac = new AssCourse(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getDate(5),
                        rs.getDate(6),
                        rs.getInt(7),
                        rs.getString(8),
                        rs.getTimestamp(9));
                result.add(ac);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(AssCourseDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AssCourseDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }

        return result;
    }
}
