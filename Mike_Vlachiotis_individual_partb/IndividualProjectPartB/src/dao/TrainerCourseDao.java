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
import model.TrainerCourse;
import util.DbUtils;

/**
 *
 * @author ironm
 */
public class TrainerCourseDao {

    public static List<TrainerCourse> getAllTrainersPerCourse() {
        List<TrainerCourse> result = new ArrayList<>();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;

        try {
            con = DbUtils.getConnection();
            String sql = "SELECT TRAINER_ID,TRA_FNAME,TRA_LNAME,private_school.TRAINER.SUBJECT,COURSE_ID,COURSE_TITLE,private_school.course.STREAM,private_school.COURSE.TYPE,START_DATE,END_DATE\n"
                    + "FROM TRAINER\n"
                    + "JOIN TRAINERSCOURSE ON TRAINER_ID = TRA_INV_COU\n"
                    + "JOIN COURSE ON COU_INV_TRA = COURSE_ID\n"
                    + "ORDER BY COURSE_TITLE;";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                TrainerCourse tc = new TrainerCourse(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4),
                        rs.getInt(5),
                        rs.getString(6),
                        rs.getString(7),
                        rs.getString(8),
                        rs.getDate(9),
                        rs.getDate(10));
                result.add(tc);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(TrainerCourseDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(TrainerCourseDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }

        return result;
    }
}
