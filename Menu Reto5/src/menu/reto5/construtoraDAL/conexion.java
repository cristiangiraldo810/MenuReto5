
package menu.reto5.construtoraDAL;

import java.sql.*;

public class conexion {
    
    String strConexionDB = "jdbc:sqlite:C:/Users/Cristian y Guisel/OneDrive/Documentos/NetBeansProjects/Menu Reto5/ProyectosConstruccion.db";
    Connection con = null;
    
    public conexion() {
        
        try {
            Class.forName("org.sqlite.JDBC");
            con = DriverManager.getConnection(strConexionDB);
            
            System.out.println("Conexion establecida");
        } catch (Exception e) {
            System.out.println("Error de conexion" + e );
        }
        
    }

    public ResultSet consultarRegistro(String strSentenciaSQL){
        try {
            PreparedStatement pstm = con.prepareStatement(strSentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
        } catch (Exception e) {
            System.out.println("e");
            return null;
        }
 
    }

        


public ResultSet consultarRegistro2(String strSentenciaSQL){
    try {
            PreparedStatement pstm = con.prepareStatement(strSentenciaSQL);
            ResultSet respuesta2 = pstm.executeQuery();
            return respuesta2;

        } catch (Exception e) {
            System.out.println("p");
            return null;
        }
 
}

}
        

