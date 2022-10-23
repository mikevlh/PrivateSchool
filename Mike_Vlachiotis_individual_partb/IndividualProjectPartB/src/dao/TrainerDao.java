/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.ArrayList;
import java.util.List;
import model.Trainer;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import util.DbUtils;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.sql.SQLException;

/**
 *
 * @author ironm
 */
public class TrainerDao {

    public static List<Trainer> getAllTrainers() {
        List<Trainer> result = new ArrayList<>();
        PreparedStatement ps = null;
        Connection con = null;
        ResultSet rs = null;

        try {
            con = DbUtils.getConnection();
            String sql = "Select * from trainer";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Trainer t = new Trainer(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4));
                result.add(t);
            }
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(TrainerDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } finally {
            try {
                rs.close();
                ps.close();
                con.close();
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(TrainerDao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
            }

        }

        return result;
    }

    public static void insertTrainer(Trainer t) {
        PreparedStatement ps = null;
        Connection con = null;

        try {
            con = DbUtils.getConnection();
            String sql = "insert into Trainer(Tra_FName, Tra_LName, Subject) values (?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, t.getFirstName());
            ps.setString(2, t.getLastName());
            ps.setString(3, t.getSubject());
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
