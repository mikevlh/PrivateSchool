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
import model.Assignment;
import java.sql.PreparedStatement;
import java.sql.Connection;
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
public class AssignmentDao {

    public static List<Assignment> getAllAssignments() {
        List<Assignment> result = new ArrayList<>();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;

        try {
            con = DbUtils.getConnection();
            String sql = "Select * from assignment";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Assignment a = new Assignment(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getTimestamp(4),
                        rs.getDouble(5),
                        rs.getDouble(6));
                result.add(a);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(AssignmentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AssignmentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }

        return result;
    }

    public static void insertTrainer(Assignment a) {
        PreparedStatement ps = null;
        Connection con = null;

        try {
            con = DbUtils.getConnection();
            String sql = "insert into Assignment(Ass_Title, Description, Sub_Date_Time, Oral_Mark, Total_Mark) values (?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, a.getTitle());
            ps.setString(2, a.getDescription());

            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String strDate = dateFormat.format(a.getSubDateTime());

            java.sql.Date assDate;
            try {
                assDate = new java.sql.Date(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
                        .parse(strDate)
                        .getTime());
                ps.setDate(3, assDate);
            } catch (ParseException ex) {
                java.util.logging.Logger.getLogger(AssignmentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

            ps.setDouble(4, a.getOralMark());
            ps.setDouble(5, a.getTotalMark());
            ps.executeUpdate();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(AssignmentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                ps.close();
                con.close();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(AssignmentDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }
    }
}
