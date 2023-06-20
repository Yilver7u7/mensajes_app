/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author OTLUS
 */
public class MensajesDAO {
    
    public static void crearMensajeDB(Mensajes mensaje){
        
        ConnectionFactory db_connect = new ConnectionFactory();
        
        try(Connection conexion = db_connect.establecerConexion()){
            PreparedStatement ps = null;
            
            try{
                String query = "INSERT INTO mensajes (mensaje,autor_mensaje) VALUES(?,?)";
                ps=conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2,mensaje.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("El mensaje fue creado correctamente");
                
                
            }catch(SQLException e){
                System.out.println("oops!\nHubo un problema al crear el mensaje!\n"+e);
            }
            
            
        }catch(SQLException e){
            System.out.println("oops!\nHubo un problema al estableces la conexion!\n"+e);
        }       
        
    }
    
    public static void leerMensajesDB(){
        /*TO DO*/
    }
    
    public static void borrarMensajesDB(int id_mensaje){
        /*TO DO*/
    }
    
    public static void actualizarMensajesDB(Mensajes mensaje){
        /*TO DO*/
    }
    
}//No tocar
