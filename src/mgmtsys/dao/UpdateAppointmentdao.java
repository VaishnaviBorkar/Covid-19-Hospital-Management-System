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
import mgmtsys.dbutil.DatabaseConnection;
import mgmtsys.gui.UpdateAppointment;
import mgmtsys.po.AppointmentPO;

/**
 *
 * @author welcome
 */
public class UpdateAppointmentdao {
    public static String upfetchpAppointment(AppointmentPO uapo) throws SQLException{
  try{
        Connection con;
       con = DatabaseConnection.getCon();
          PreparedStatement ps;
        ps = con.prepareStatement("select *from appointment where PatientId=?");
               ps.setString(1, uapo.getId());
               ResultSet rs=ps.executeQuery();
             if(rs.next())
               {
                   uapo.setFname(rs.getString("FirstName"));
                   uapo.setLname(rs.getString("LastName"));
                   uapo.setContactno(rs.getString("ContactNo"));
                   uapo.setGender(rs.getString("gender"));
                   uapo.setAddress(rs.getString("Address"));
                   uapo.setEmail(rs.getString("EmailiD"));
                   uapo.setSelDr(rs.getString("AppDoctorId"));
                   uapo.setDisease(rs.getString("Disease"));
                   uapo.setAppdate(rs.getString("AppointmentDate"));
                   return rs.getString("FirstName");
               }       
//               return rs.getString("FirstName");
                 } catch (SQLException ex) {
               Logger.getLogger(UpdateDoctordao.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           return null;
}
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
               UpdateAppointment.jComboBox2.addItem(cb1);
            }
    }
       public static int updateAppointment(AppointmentPO uapo) throws Exception
       {
           Connection con;
               con=DatabaseConnection.getCon();
               PreparedStatement ps;
                int rs;
       ps = con.prepareStatement("update appointment set AppDoctorId=?,FirstName=?,LastName=?,ContactNo=?,EmailId=?,Address=?,Gender=?,Disease=?,AppointmentDate=?,AppointmentTime=? where PatientId=?");
       ps.setString(1, uapo.getSelDr());
        ps.setString(2,uapo.getFname());
       ps.setString(3,uapo.getLname());
       ps.setString(4,uapo.getContactno());
       ps.setString(5,uapo.getEmail());
       ps.setString(6,uapo.getAddress());
       ps.setString(7, uapo.getGender());
       ps.setString(8, uapo.getDisease());
       ps.setString(9,uapo.getAppdate());
       ps.setString(10,uapo.getApp_time());
       ps.setString(11,uapo.getId());
        rs=ps.executeUpdate();
                if(rs!=0)
               {
                  return 1;
               }
                else
                {
                    return 0;
                }
       }
       
}