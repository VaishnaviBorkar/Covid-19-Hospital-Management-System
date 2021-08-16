package mgmtsys.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import mgmtsys.dbutil.DatabaseConnection;
import mgmtsys.po.BedmanagePo;

/**
 *
 * @author welcome
 */
public class Bedmanagedao {
    public static void tGeneral(BedmanagePo bmpo ) throws SQLException
    {
      Connection con;
        con=DatabaseConnection.getCon();
        PreparedStatement ps;
       ps=con.prepareStatement("select totGeneral from bed");
      ResultSet rs=ps.executeQuery();
     if(rs.next())
     {
        bmpo.settGeneral(rs.getString("totGeneral"));
     }
    
    }
    
    public static void updateTgeneral(BedmanagePo bmpo) throws SQLException
    {
         Connection con;
        con=DatabaseConnection.getCon();
        PreparedStatement ps;
       ps=con.prepareStatement("update bed set totgeneral=?");
       ps.setString(1,bmpo.gettGeneral());
        int rs=ps.executeUpdate();
    }
    //for icu
     public static void tIcu(BedmanagePo bmpo ) throws SQLException
    {
      Connection con;
        con=DatabaseConnection.getCon();
        PreparedStatement ps;
       ps=con.prepareStatement("select toticu from bed");
      ResultSet rs=ps.executeQuery();
     if(rs.next())
     {
        bmpo.settIcu(rs.getString("totIcu"));
     }
    
    }
        public static void updateTicu(BedmanagePo bmpo) throws SQLException
    {
         Connection con;
        con=DatabaseConnection.getCon();
        PreparedStatement ps;
       ps=con.prepareStatement("update bed set toticu=?");
       ps.setString(1,bmpo.gettIcu());
        int rs=ps.executeUpdate();
    }
}
