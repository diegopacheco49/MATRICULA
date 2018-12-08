package Coneccion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
import java.sql.SQLException;

public class sistema{
    static Connection con = null;
    //MODIF
    public Connection coneccion(){
        try {
            String url = "jdbc:sqlserver://DESKTOP-5S44I5P\\MSSQLSERVER4:1433;databaseName=sgmbd";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con=DriverManager.getConnection(url,"sa","123");                   
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error en la Coneccion: "+e);
        }
        return con;
    }
}
