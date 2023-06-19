/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author OTLUS
 */
public class Mensajes_app {

    public static void main(String[] args) throws SQLException {
        
        
        try{
            Connection conn = ConnectionFactory.establecerConexion();
            
            if(conn != null){
                System.out.println("Conexión Exitosa, todo fine!!");
                conn.close();
                System.out.println("Conexión Finalizada");
            }
            
        }catch(SQLException e){
            System.out.println("Error al establecer la conexión! ====> "+e);
        }
        
        
        
    }//No tocar
}//No tocar
