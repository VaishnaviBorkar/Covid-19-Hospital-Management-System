
package mgmtsys.dao;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import mgmtsys.dbutil.DatabaseConnection;
import mgmtsys.gui.ViewDoctor;
public class ViewDoctordao {
public static void searchDr( String getDrId)
{
  DefaultTableModel dtm=(DefaultTableModel)ViewDoctor.viewDoctortable.getModel();
 TableRowSorter sort=new TableRowSorter(dtm);
 ViewDoctor.viewDoctortable.setRowSorter(sort);
 sort.setRowFilter(RowFilter.regexFilter(getDrId));
}
      public static void viewDoctor() 
    {
        Connection con;
        con=DatabaseConnection.getCon();
        PreparedStatement ps;
          try {
              ps = con.prepareStatement("select *from doctor");
        ResultSet rs=ps.executeQuery();
         DefaultTableModel m1;
          m1 = (DefaultTableModel)ViewDoctor.viewDoctortable.getModel();
        m1.setRowCount(0);
       while(rs.next())
        {
                m1.addRow(new Object[]{
                    rs.getString("DoctorId"),rs.getString("FirstName"),rs.getString("LastName"),
                   rs.getString("ContactNo"), rs.getString("gender"),rs.getString("Address"),rs.getString("JoiningDate"),
                    rs.getString("SpecialistIn"),rs.getString("Sallary"),rs.getString("ADate"),
                    rs.getString("ATime")
                });
        }
    }
    
    catch (SQLException ex) {
              Logger.getLogger(ViewDoctordao.class.getName()).log(Level.SEVERE, null, ex);}
    }
}

