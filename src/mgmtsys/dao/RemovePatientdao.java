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
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import mgmtsys.dbutil.DatabaseConnection;
import mgmtsys.gui.RemovePatient;
/**
 *
 * @author welcome
 */
public class RemovePatientdao {
    public static void displaytablePatient()
    {
        Connection con;
        con=DatabaseConnection.getCon();
        PreparedStatement ps;
          try {
              ps = con.prepareStatement("select *from patient");
        ResultSet rs=ps.executeQuery();
         DefaultTableModel m1;
          m1 = (DefaultTableModel)RemovePatient.viewPatientTable.getModel();
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
//    insert into discharge table
       public static int getBackup()
    {
        int j=0;
        int row[]=RemovePatient.viewPatientTable.getSelectedRows();
        for(int i=0;i<row.length;i++)
        {
              String value=RemovePatient.viewPatientTable.getModel().getValueAt(row[i], 0).toString();
                Connection con;
               con = DatabaseConnection.getCon();
                 Statement st;
              try
              {
                          st=con.createStatement();
                         ResultSet rs=st.executeQuery("select * from patient where PatientId="+value);
                         if(rs.next())
                         {
                                String p_Id=rs.getString("PatientId");
                                String name=rs.getString("FullName");
                                String contact=rs.getString("ContactNo");
                                   String gender=rs.getString("Gender");
                                String address=rs.getString("Address");
                                  String Age=rs.getString("Age");
                                String blodgrp=rs.getString("BloodGroup");
                                String Positivity=rs.getString("Positivity");
                                String bed=rs.getString("Bed");
                                String adddate=rs.getString("AdmitDate");
                                String addtime=rs.getString("AdmitTime");
                                 DateFormat df=new SimpleDateFormat("dd/MM/yy");
                                 Date d= new Date();
                                 String discharged_date=df.format(d);
                                String sql="insert into dischargedpatient values("+p_Id+",' "+name+" ',' "+contact+" ',' "+gender+" ',' "+address+" ', "+Age+" ,' "+blodgrp+" ',' "+Positivity+" ',' "+bed+" ','"+adddate+" ','"+addtime+" ','"+discharged_date+" ')";
                                j = st.executeUpdate(sql);
                         }
              }
              catch(Exception e)
              {
                    JOptionPane.showMessageDialog(null, e);
              }
        }
        return j ;
    }
      //insert into dead record table.
     public static int getDeadPatients()
    {
        int j=0;
        int row[]=RemovePatient.viewPatientTable.getSelectedRows();
        for(int i=0;i<row.length;i++)
        {
              String value=RemovePatient.viewPatientTable.getModel().getValueAt(row[i], 0).toString();
                Connection con;
               con = DatabaseConnection.getCon();
                 Statement st;
              try
              {
                          st=con.createStatement();
                         ResultSet rs=st.executeQuery("select * from patient where PatientId="+value);
                         if(rs.next())
                         {
                                String p_Id=rs.getString("PatientId");
                                String name=rs.getString("FullName");
                                String contact=rs.getString("ContactNo");
                                   String gender=rs.getString("Gender");
                                String address=rs.getString("Address");
                                  String Age=rs.getString("Age");
                                String blodgrp=rs.getString("BloodGroup");
                                String Positivity=rs.getString("Positivity");
                                String bed=rs.getString("Bed");
                                String adddate=rs.getString("AdmitDate");
                                String addtime=rs.getString("AdmitTime");
                                 DateFormat df=new SimpleDateFormat("dd/MM/yy");
                                 Date d= new Date();
                                 String death_date=df.format(d);
                                String sql="insert into deadpatients values("+p_Id+",' "+name+" ',' "+contact+" ',' "+gender+" ',' "+address+" ', "+Age+" ,' "+blodgrp+" ',' "+Positivity+" ',' "+bed+" ','"+adddate+" ','"+addtime+" ','"+death_date+" ')";
                                j = st.executeUpdate(sql);
                         }
              }
              catch(Exception e)
              {
                    JOptionPane.showMessageDialog(null, e);
              }
        }
        return j ;
    }
    
      public static int deleteSelectedRow(int getSrow){
           String cell;
           int n = 0;
                try
            {
               cell = (String)RemovePatient.viewPatientTable.getModel().getValueAt(getSrow,0);
                Connection con;
                con=DatabaseConnection.getCon();
                PreparedStatement ps;
                  ps=con.prepareStatement("delete from patient where PatientId='"+cell+"'");
                   n=ps.executeUpdate(); 
              } catch (SQLException ex) {
                  Logger.getLogger(RemoveDoctordao.class.getName()).log(Level.SEVERE, null, ex);
              }
           return n;
           }
      public static int deleteAll() throws SQLException
      {
          Connection con;
          con=DatabaseConnection.getCon();
          PreparedStatement ps=con.prepareStatement("delete from patient");
          int rs=ps.executeUpdate();
          return rs;
      }
           }

