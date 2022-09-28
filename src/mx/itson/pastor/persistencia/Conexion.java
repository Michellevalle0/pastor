package mx.itson.pastor.persistencia;
 
import java.sql.Connection;
import java.sql.DriverManager;

public class Conexion {
    
    public static Connection obtener(){
            Connection conexion = null;
            try { 
               conexion = DriverManager.getConnection("jdbc:mysql://localhost:3308/pastordb?user=root&password=");
               
               
            } catch (Exception e) {
                System.err.print(e.getMessage());
                
            }
            return conexion;
    }
               
     //   public static boolean guardar(String nombre, String direccion, String telefono, String email){




//}





    }
 