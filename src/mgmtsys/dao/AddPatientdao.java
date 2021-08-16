package mgmtsys.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import mgmtsys.dbutil.DatabaseConnection;
import mgmtsys.po.PatientPO;

/**
 *
 * @author welcome
 */
public class AddPatientdao {
    public static int addPatient(PatientPO ptpo)throws Exception
   {     int restl ;
       Connection con;
       con = DatabaseConnection.getCon();
        PreparedStatement ps; 
       ps =con.prepareStatement("Insert into patient(FullName,ContactNo,gender,Address,Age,BloodGroup,Positivity,Bed,AdmitDate,AdmitTime)values(?,?,?,?,?,?,?,?,?,?)");
       ps.setString(1, ptpo.getFname());
       ps.setString(2, ptpo.getContactno());
       ps.setString(3, ptpo.getGender());
       ps.setString(4, ptpo.getAddress());
       ps.setString(5, ptpo.getAge());
       ps.setString(6,ptpo.getBldgrp());
       ps.setString(7, ptpo.getPerpos());
       ps.setString(8, ptpo.getBed());
       ps.setString(9,ptpo.getDate());
       ps.setString(10,ptpo.getTime());
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
     public static String checkgeneral(PatientPO ptpo)throws Exception
     {
         Connection con;
         String count=null;
         con = DatabaseConnection.getCon();
         PreparedStatement ps; 
         ps =con.prepareStatement("Select count(*) from patient where Bed=?");
         ps.setString(1, ptpo.getBed());
         ResultSet rs=ps.executeQuery();
            if(rs.next())
       {
        count=rs.getString("count(*)");
       }
        return count;
     }
     
     public static String checkicu(PatientPO ptpo)throws Exception
     {
       Connection con;
         String count=null;
       con = DatabaseConnection.getCon();
        PreparedStatement ps; 
        
       ps =con.prepareStatement("Select count(*) from patient where Bed=?");
       ps.setString(1, ptpo.getBed());
       ResultSet rs=ps.executeQuery();
            if(rs.next())
       {
        count=rs.getString("count(*)");
       }
        return count;
        }
}
