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
import mgmtsys.dbutil.DatabaseConnection;
import mgmtsys.gui.AddAppointment;
//import mgmtsys.gui.UpdateAppointment;
import mgmtsys.po.AppointmentPO;

/**
 *
 * @author welcome
 */
public class AddAppointmentdao {
    public static void getDr()throws Exception
    {
           Connection con;
            con= DatabaseConnection.getCon();
            PreparedStatement ps=con.prepareStatement("Select * from doctor");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                String cb1;
                cb1 =rs.getString("DoctorId")+" "+rs.getString("SpecialistIn");    
                AddAppointment.jComboBox2.addItem(cb1);
            }
    }
    public static boolean check_dr(AppointmentPO aapo) throws SQLException
    {
          Connection con;
            con= DatabaseConnection.getCon();
            PreparedStatement ps=con.prepareStatement("Select * from appointment");
            ResultSet rs=ps.executeQuery();
            while(rs.next())
            {
                 String date=aapo.getAppdate();
                 String dr=aapo.getSelDr();
                 String time=aapo.getApp_time();
                 if(dr.equals(rs.getString("AppDoctorId")) && date.equals(rs.getString("AppointmentDate"))&& time.equals(rs.getString("AppointmentTime")))
                         {
                             return false;
                         }
            }
            return true;
            }
    
    public static int addAppointment(AppointmentPO aapo) throws SQLException
    {
        int restl ;
       Connection con;
       con = DatabaseConnection.getCon();
        PreparedStatement ps;
       String ap_dr=aapo.getSelDr();
       String app_date=aapo.getAppdate();
       ps =con.prepareStatement("Insert into appointment(AppDoctorId,FirstName,LastName,ContactNo,EmailId,Address,gender,Disease,AppointmentDate,AppointmentTime,EntryDate,EntryTime)values(?,?,?,?,?,?,?,?,?,?,?,?)");
       ps.setString(1,aapo.getSelDr());
       ps.setString(2, aapo.getFname());
        ps.setString(3, aapo.getLname());
       ps.setString(4, aapo.getContactno());
       ps.setString(5, aapo.getEmail());
       ps.setString(6, aapo.getAddress());
       ps.setString(7, aapo.getGender());
       ps.setString(8, aapo.getDisease());
       ps.setString(9, aapo.getAppdate());
       ps.setString(10, aapo.getApp_time());
       ps.setString(11, aapo.getDate());
       ps.setString(12, aapo.getTime());
       restl =ps.executeUpdate();      
         if(restl!=1)
       {
           return 0;
       }
         
    else
       {
           return 1;
       }
    }
}