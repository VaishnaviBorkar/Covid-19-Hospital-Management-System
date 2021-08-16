/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgmtsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import mgmtsys.dbutil.DatabaseConnection;
import mgmtsys.gui.RemoveDoctor;

public class RemoveDoctordao {
      public static void displaytableDoctor() 
    {
        Connection con;
        con=DatabaseConnection.getCon();
        PreparedStatement ps;
          try {
              ps = con.prepareStatement("select *from doctor");
        ResultSet rs=ps.executeQuery();
         DefaultTableModel m1;
          m1 = (DefaultTableModel)RemoveDoctor.viewDoctortable.getModel();
        m1.setRowCount(0);
       while(rs.next())
        {
                m1.addRow(new Object[]{
                    rs.getString("DoctorId"),rs.getString("FirstName"),rs.getString("LastName"),
                   rs.getString("ContactNo"), rs.getString("gender"),rs.getString("Address"),rs.getString("JoiningDate"),
                    rs.getString("SpecialistIn"),rs.getString("Sallary"),rs.getString("ADate"),
                    rs.getString("ATime")
                });
        }
}
    catch (SQLException ex) {
              Logger.getLogger(ViewDoctordao.class.getName()).log(Level.SEVERE, null, ex);}
    }
      
      public static int deleteSelectedRow(int getSrow){
           String cell;
           int n = 0;
                try
            {
               cell = (String)RemoveDoctor.viewDoctortable.getModel().getValueAt(getSrow,0);
                Connection con;
                con=DatabaseConnection.getCon();
                PreparedStatement ps;
                  ps=con.prepareStatement("delete from doctor where DoctorId='"+cell+"'");
                   n=ps.executeUpdate(); 
              } catch (SQLException ex) {
                  Logger.getLogger(RemoveDoctordao.class.getName()).log(Level.SEVERE, null, ex);
              }
           return n;
           }
        public static int deleteAll() throws SQLException
      { 
          int n;
           Connection con;
             con=DatabaseConnection.getCon();
                PreparedStatement ps;
                ps=con.prepareStatement("delete from doctor");
                 n=ps.executeUpdate();   
                  return n;
          }
         
      }
           
