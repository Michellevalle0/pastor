/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mx.itson.pastor.persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import mx.itson.pastor.entidades.Cliente;

/**
 *
 * @author melis
 */
public class ClienteDAO {
    
    public static List<Cliente> obtenerTodos(){
        List<Cliente> clientes = new ArrayList<>();
        try {
            Connection connection = Conexion.obtener();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT, id, nombre, direccion, telefono, email FROM cliente");
            while(resultSet.next()) {
                Cliente c = new Cliente();
                c.setId(resultSet.getInt(1));
                c.setNombre(resultSet.getNString(2));
                c.setDireccion(resultSet.getString(3));
                c.setTelefono(resultSet.getNString(4));
                c.setEmail(resultSet.getString(5));
                
            }
            
            
        } catch (Exception ex) { 
            System.err.print("Ocurrió un error: " + ex.getMessage());
            
        }
        return clientes;

      


    }
            
     public static boolean guardar(String nombre, String direccion , String telefono, String email){
     boolean resultado = false;
     try{
     Connection conecction = new connection
     String consulta = "INSERT INTO 
    
}




}




    
    
}
