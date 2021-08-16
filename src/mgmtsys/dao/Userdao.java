
//1.login page database connection & queries on database
package mgmtsys.dao;
import java.sql.*;
import mgmtsys.po.User;
import mgmtsys.dbutil.DatabaseConnection;

public class Userdao {
    public static String validateUser(User u) throws SQLException
    {
        Connection con;
        con = DatabaseConnection.getCon();
        PreparedStatement ps=con.prepareStatement("select *from admin where adminname=? and password=?");
        ps.setString(1,u.getAdminName());
        ps.setString(2, u.getPassword());
        ResultSet rs=ps.executeQuery();
        String loginid=null;
        if(rs.next())
        {
            loginid=rs.getString(1);
        }
        return  loginid;
    }
    
}
