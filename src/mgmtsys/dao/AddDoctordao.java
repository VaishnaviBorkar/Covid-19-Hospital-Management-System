
package mgmtsys.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import mgmtsys.dbutil.DatabaseConnection;
import mgmtsys.po.DoctorPO;
public class AddDoctordao {
   public static int addDoctor(DoctorPO adpo)throws Exception
   {     int restl ;
       Connection con;
       con = DatabaseConnection.getCon();
        PreparedStatement ps;
        
        ps =con.prepareStatement("Insert into doctor(FirstName,LastName,ContactNo,gender,Address,JoiningDate,SpecialistIn,sallary,ADate,ATime)values(?,?,?,?,?,?,?,?,?,?)");
       ps.setString(1, adpo.getFname());
        ps.setString(2, adpo.getLname());
       ps.setString(3, adpo.getContactno());
       ps.setString(4, adpo.getGender());
       ps.setString(5, adpo.getAddress());
       ps.setString(6, adpo.getJoiningdate());
       ps.setString(7, adpo.getSpecialistin());
       ps.setString(8, adpo.getSallary());
       ps.setString(9, adpo.getDate());
       ps.setString(10, adpo.getTime());
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
   public static boolean check_drs(DoctorPO dpo)throws Exception
   {
       Connection con;
       con=DatabaseConnection.getCon();
       PreparedStatement ps=con.prepareCall("select *from doctor");
       ResultSet rs=ps.executeQuery();
      while(rs.next()){
          String fname=dpo.getFname();
          String Lname=dpo.getLname();
          String phone=dpo.getContactno();
          if(fname.equals(rs.getString("FirstName"))&&Lname.equals(rs.getString("LastName"))&&phone.equals(rs.getString("ContactNo")))
          {
              return false;
          }
  
              }
      return true;
       
   }        
}
