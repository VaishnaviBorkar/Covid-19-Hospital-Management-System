/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mgmtsys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import mgmtsys.dbutil.DatabaseConnection;

/**
 *
 * @author welcome
 */
public class CountAppointments {
     public static String countAppointment() throws Exception
    {
        String count=null;
            Connection con;
            con= DatabaseConnection.getCon();
            PreparedStatement ps=con.prepareStatement("Select count(*) from appointment");
            ResultSet rs=ps.executeQuery();
            if(rs.next())
       {
        count=rs.getString("count(*)");
       }
        return count;
    }
}
