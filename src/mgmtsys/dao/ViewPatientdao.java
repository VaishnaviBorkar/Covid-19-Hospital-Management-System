/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgmtsys.dao;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import mgmtsys.dbutil.DatabaseConnection;
import mgmtsys.gui.DeadPatients;
import mgmtsys.gui.DischargedPatients;
import mgmtsys.gui.ViewPatient;

/**
 *
 * @author welcome
 */
public class ViewPatientdao {
    public static void searchpatient( String getDrId)
{
  DefaultTableModel dtm=(DefaultTableModel)ViewPatient.viewPatientTable.getModel();
 TableRowSorter sort=new TableRowSorter(dtm);
 ViewPatient.viewPatientTable.setRowSorter(sort);
 sort.setRowFilter(RowFilter.regexFilter(getDrId));
}
 public static void viewPatientTable() 
    {
        Connection con;
        con=DatabaseConnection.getCon();
        PreparedStatement ps;
          try {
              ps = con.prepareStatement("select *from patient");
        ResultSet rs=ps.executeQuery();
         DefaultTableModel m1;
          m1 = (DefaultTableModel)ViewPatient.viewPatientTable.getModel();
        m1.setRowCount(0);
       while(rs.next())
        {
                m1.addRow(new Object[]{
                    rs.getString("PatientId"),rs.getString("FullName"),
                    rs.getString("ContactNo"), rs.getString("gender"),rs.getString("Address"),rs.getString("Age"),
                    rs.getString("BloodGroup"),rs.getString("Positivity"),rs.getString("Bed"),rs.getString("AdmitDate"),
                    rs.getString("AdmitTime")
                });
        }
    }
    catch (SQLException ex) {
              Logger.getLogger(ViewDoctordao.class.getName()).log(Level.SEVERE, null, ex);}
    }

//view discharge patient

public static void viewDischarhgedPatientTable() 
    {
        Connection con;
        con=DatabaseConnection.getCon();
        PreparedStatement ps;
          try {
              ps = con.prepareStatement("select *from dischargedpatient");
        ResultSet rs=ps.executeQuery();
         DefaultTableModel m1;
          m1 = (DefaultTableModel)DischargedPatients.viewDischargedPatientTable.getModel();
        m1.setRowCount(0);
       while(rs.next())
        {
                m1.addRow(new Object[]{
                    rs.getString("PatientId"),rs.getString("FullName"),
                    rs.getString("ContactNo"), rs.getString("gender"),rs.getString("Address"),rs.getString("Age"),
                    rs.getString("BloodGroup"),rs.getString("Positivity"),rs.getString("Bed"),rs.getString("AdmitDate"),
                    rs.getString("AdmitTime"),rs.getString("DischargeDate")
                });
        }
    }
    catch (SQLException ex) {
              Logger.getLogger(ViewDoctordao.class.getName()).log(Level.SEVERE, null, ex);}
    }
  public static void searchDischargedpatient(String getDrId)
{
  DefaultTableModel dtm=(DefaultTableModel)DischargedPatients.viewDischargedPatientTable.getModel();
 TableRowSorter sort=new TableRowSorter(dtm);
 DischargedPatients.viewDischargedPatientTable.setRowSorter(sort);
 sort.setRowFilter(RowFilter.regexFilter(getDrId));
}
  //view dead patients
public static void viewDeadedPatientTable() 
    {
        Connection con;
        con=DatabaseConnection.getCon();
        PreparedStatement ps;
          try {
              ps = con.prepareStatement("select *from deadpatients");
        ResultSet rs=ps.executeQuery();
         DefaultTableModel m1;
          m1 = (DefaultTableModel)DeadPatients.viewDeadPatientTable.getModel();
        m1.setRowCount(0);
       while(rs.next())
        {
                m1.addRow(new Object[]{
                    rs.getString("PatientId"),rs.getString("FullName"),
                    rs.getString("ContactNo"), rs.getString("gender"),rs.getString("Address"),rs.getString("Age"),
                    rs.getString("BloodGroup"),rs.getString("Positivity"),rs.getString("Bed"),rs.getString("AdmitDate"),
                    rs.getString("AdmitTime"),rs.getString("DeathDate")
                });
        }
    }
    catch (SQLException ex) {
              Logger.getLogger(ViewDoctordao.class.getName()).log(Level.SEVERE, null, ex);}
    }
public static void searchDeadpatient (String getDrId)
{
  DefaultTableModel dtm=(DefaultTableModel)DeadPatients.viewDeadPatientTable.getModel();
 TableRowSorter sort=new TableRowSorter(dtm);
 DeadPatients.viewDeadPatientTable.setRowSorter(sort);
  sort.setRowFilter(RowFilter.regexFilter(getDrId));
}
  

}