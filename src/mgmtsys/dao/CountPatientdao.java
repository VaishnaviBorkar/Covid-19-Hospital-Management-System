package mgmtsys.dao;
import java.sql.*;
import mgmtsys.dbutil.DatabaseConnection;

public class CountPatientdao {
    public static String countPatients() throws Exception
    {
        String count=null;
            Connection con;
            con= DatabaseConnection.getCon();
            PreparedStatement ps=con.prepareStatement("Select count(*) from patient");
            ResultSet rs=ps.executeQuery();
            if(rs.next())
       {
        count=rs.getString("count(*)");
       }
        return count;
    }
     public static String countdischargedPatients() throws Exception
    {
        String count=null;
            Connection con;
            con= DatabaseConnection.getCon();
            PreparedStatement ps=con.prepareStatement("Select count(*) from dischargedpatient");
            ResultSet rs=ps.executeQuery();
            if(rs.next())
       {
        count=rs.getString("count(*)");
       }
        return count;
    }
       public static String countdeathPatients() throws Exception
    {
        String count=null;
            Connection con;
            con= DatabaseConnection.getCon();
            PreparedStatement ps=con.prepareStatement("Select count(*) from deadpatients");
            ResultSet rs=ps.executeQuery();
            if(rs.next())
       {
        count=rs.getString("count(*)");
       }
        return count;
    }
}
