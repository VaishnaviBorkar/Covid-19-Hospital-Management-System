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
import mgmtsys.po.DoctorPO;
import mgmtsys.dbutil.DatabaseConnection;

/**
 *
 * @author welcome
 */
public class UpdateDoctordao {
       public static int updateDoctor(DoctorPO udpo)throws Exception
       {
               Connection con;
               con=DatabaseConnection.getCon();
               PreparedStatement ps;
                int rs;
       ps = con.prepareStatement("update doctor set  FirstName=?,LastName=?,ContactNo=?,gender=?,Address=?,JoiningDate=?,SpecialistIn=?,Sallary=? where DoctorId=?");
       ps.setString(1, udpo.getFname());
        ps.setString(2, udpo.getLname());
       ps.setString(3, udpo.getContactno());
       ps.setString(4, udpo.getGender());
       ps.setString(5, udpo.getAddress());
       ps.setString(6, udpo.getJoiningdate());
       ps.setString(7, udpo.getSpecialistin());
       ps.setString(8, udpo.getSallary());
       ps.setString(9, udpo.getId());
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
           
       public static String upfetchDoctor(DoctorPO udpo)
       {
           try {
               Connection con;
               con=DatabaseConnection.getCon();
               PreparedStatement ps=con.prepareStatement("select *from doctor where DoctorId=?");
               ps.setString(1, udpo.getId());
               ResultSet rs=ps.executeQuery();
               if(rs.next())
               {
                   udpo.setFname(rs.getString("FirstName"));
                   udpo.setLname(rs.getString("LastName"));
                   udpo.setContactno(rs.getString("ContactNo"));
                   udpo.setGender(rs.getString("gender"));
                   udpo.setAddress(rs.getString("Address"));
                   udpo.setJoiningdate(rs.getString("JoiningDate"));
                   udpo.setSpecialistin(rs.getString("SpecialistIn"));
                   udpo.setSallary(rs.getString("Sallary"));
                   return rs.getString("FirstName");
               }
           } catch (SQLException ex) {
               Logger.getLogger(UpdateDoctordao.class.getName()).log(Level.SEVERE, null, ex);
           }
           
           return null;
       }
    
}
