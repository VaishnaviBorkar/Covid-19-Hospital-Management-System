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
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import mgmtsys.dbutil.DatabaseConnection;
import mgmtsys.gui.ViewAppointment;
//import mgmtsys.gui.ViewDoctor;

/**
 *
 * @author welcome
 */
public class ViewAppointmentdao {
       public static void viewAppointment() 
    {
        Connection con;
        con=DatabaseConnection.getCon();
        PreparedStatement ps;
          try {
              ps = con.prepareStatement("select *from appointment");
        ResultSet rs=ps.executeQuery();
         DefaultTableModel m1;
          m1 = (DefaultTableModel)ViewAppointment.viewAppointmentTable.getModel();
        m1.setRowCount(0);
       while(rs.next())
        {
                m1.addRow(new Object[]{
                    rs.getString("PatientId"),rs.getString("AppDoctorId"),rs.getString("FirstName"),rs.getString("LastName"),
                   rs.getString("ContactNo"),rs.getString("EmailId"),rs.getString("Address"), rs.getString("gender"),
                    rs.getString("Disease"),rs.getString("AppointmentDate"),rs.getString("AppointmentTime"),rs.getString("EntryDate"),
                    rs.getString("EntryTime")
                });
        }
    }
    
    catch (SQLException ex) {
              Logger.getLogger(ViewDoctordao.class.getName()).log(Level.SEVERE, null, ex);}
    }
       public static void searchappoitnt(String getAppt)
       {
   DefaultTableModel dtm=(DefaultTableModel)ViewAppointment.viewAppointmentTable.getModel();
 TableRowSorter sort=new TableRowSorter(dtm);
 ViewAppointment.viewAppointmentTable.setRowSorter(sort);
 sort.setRowFilter(RowFilter.regexFilter(getAppt));
       }
       
     
}
