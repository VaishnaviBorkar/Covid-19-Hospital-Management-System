
 /* To change this license header, choose License Headers in Project Properties.
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
import mgmtsys.po.PatientPO;
public class UpdatePatientdao {
    public static int updatePatient(PatientPO ptpo) throws SQLException
    {   Connection con;
               con=DatabaseConnection.getCon();
               PreparedStatement ps;
                int rs;
       ps = con.prepareStatement("update patient set  FullName=?,ContactNo=?,Gender=?,Address=?,Age=?,BloodGroup=?,Positivity=?,Bed=?where PatientId=?");
       ps.setString(1,ptpo.getFname());
       ps.setString(2,ptpo.getContactno());
        ps.setString(3, ptpo.getGender());
        ps.setString(4, ptpo.getAddress());
        ps.setString(5, ptpo.getAge());
       ps.setString(6, ptpo.getBldgrp());
         ps.setString(7, ptpo.getPerpos());
       ps.setString(8, ptpo.getBed());
            ps.setString(9, ptpo.getP_id());
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

    public static String upfetchpPatient(PatientPO uppo)
    {
        try 
        {
               Connection con;
               con=DatabaseConnection.getCon();
               PreparedStatement ps=con.prepareStatement("select *from patient where PatientId=?");
               ps.setString(1, uppo.getP_id());
               ResultSet rs=ps.executeQuery();
               String reslt;
               if(rs.next())
               {
                   uppo.setFname(rs.getString("FullName"));
                   uppo.setContactno(rs.getString("ContactNo"));
                   uppo.setGender(rs.getString("Gender"));
                   uppo.setAddress(rs.getString("Address"));
                   uppo.setAge(rs.getString("Age"));
                  uppo.setBldgrp(rs.getString("BloodGroup"));
                   uppo.setPerpos(rs.getString("Positivity"));
                   return rs.getString("FullName");
               }
           } catch (SQLException ex) {
               Logger.getLogger(UpdateDoctordao.class.getName()).log(Level.SEVERE, null, ex);
           }
    return null;
    }
}
 