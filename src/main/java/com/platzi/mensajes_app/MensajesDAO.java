/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author OTLUS
 */
public class MensajesDAO {
    
    public static void crearMensajeDB(Mensajes mensaje){
        //Se establecio la conexion
        ConnectionFactory db_connect = new ConnectionFactory();
        
        try(Connection conexion = db_connect.establecerConexion()){
            PreparedStatement ps = null;
           //Se crea la sentencia a ejecutar en la base de datos 
            try{
                String query = "INSERT INTO mensajes (mensaje,autor_mensaje) VALUES(?,?)";
                ps=conexion.prepareStatement(query);
                ps.setString(1, mensaje.getMensaje());
                ps.setString(2,mensaje.getAutor_mensaje());
                ps.executeUpdate();
                System.out.println("El mensaje fue creado correctamente");
                
                
            }catch(SQLException e){
                System.out.println("oops!\nHubo un problema al crear el mensaje!\n"+e);
            }finally{
                //Finalmente cuando el Update fue realizado cerramos la conexión
                if(conexion != null){
                    conexion.close();
                }               
            }                      
        }catch(SQLException e){
            System.out.println("oops!\nHubo un problema al estableces la conexion!\n"+e);
        }       
        
    }
    
    public static void leerMensajesDB(){
        
        ConnectionFactory db_connect = new ConnectionFactory();
        
        PreparedStatement ps =null;
        ResultSet rs = null;
        
        
        try(Connection conexion = db_connect.establecerConexion()){
            
            String query = "SELECT * FROM mensajes";
            ps = conexion.prepareStatement(query);
            rs = ps.executeQuery();
            
            while(rs.next()){
                JOptionPane.showMessageDialog(null,"ID: "+rs.getInt("id_mensaje")
                +"\nMensaje: "+ rs.getString("mensaje")
                +"\nAutor: "+ rs.getString("autor_mensaje")
                +"\nFecha: "+ rs.getString("fecha_mensaje")
                +"\n");
            }
            System.out.println("Lectura de la base de datos realizada con éxito!");
            
            //Finalmente se cierra la conexión luego de la lectura
            conexion.close();
            
        }catch(SQLException e){
            System.out.println("oops!\nHubo un problema al estableces la conexion!\n"+e);
        }
        
        
        
    }
    
    public static void borrarMensajesDB(int id_mensaje){
        /*TO DO*/
    }
    
    public static void actualizarMensajesDB(Mensajes mensaje){
        /*TO DO*/
    }
    
}//No tocar
