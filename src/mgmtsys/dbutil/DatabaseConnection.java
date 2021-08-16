/*
class to establish the onnection of the project
 */
package mgmtsys.dbutil;
import java.sql.*;
import javax.swing.JOptionPane;
public class DatabaseConnection {
    private static Connection con;
    static
            {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mgmtsysdb","root","");
          //  JOptionPane.showMessageDialog(null,"Connection Establish Successfully..","Done",JOptionPane.INFORMATION_MESSAGE);
              
            }
        catch(ClassNotFoundException e1)
        {
           JOptionPane.showMessageDialog(null,"error in Loading Driver class"+e1.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        catch(SQLException e2)
        {
          JOptionPane.showMessageDialog(null,"Connection Not Establish.."+e2.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }   
}

    public static Connection getCon() {
        return con;
    }

    public static void setCon(Connection con) {
        DatabaseConnection.con = con;
    }
    public static void closeCon()
    {
        try
        {
            if(con!=null)
            {
                con.close();
            }
            
        }catch(SQLException e3)
        {
          JOptionPane.showMessageDialog(null,"Connection Not Establish.."+e3.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
    }
    
}