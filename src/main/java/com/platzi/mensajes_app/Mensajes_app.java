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
        
        
        //pruebaConexionMain();
        
        int opcion = 0;
        //System.out.println(opcion);
        
        do{
            opcion = opciones();
            switch(opcion){
                case 1:
                    MensajesService.crearMensaje();
                    System.out.println("Mensajito gg");
                    break;
                case 2:
                    MensajesService.listarMensajes();
                    System.out.println("Opcion 2");
                    break;
                case 3:
                    System.out.println("Opcion 3");
                    break;
                case 4:
                    MensajesService.borrarMensaje();
                    System.out.println("Opcion 4");
                    break;
                default:
                    System.out.println("Por favor escoja una opción correcta");
                    break;
            }
        
        }while(opcion != 5);
        System.out.println("Gracias por preferinos");
        System.exit(0);
        
        
        
    }//No tocar
    
    public static int opciones(){
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("------------------------------------"
                + "\nAplicación de mensajes"
                + "\n1. Crear Mensaje"
                + "\n2. Lista de Mensajes"
                + "\n3. Editar Mensajes"
                + "\n4. Eliminar mensaje"
                + "\n5. Salir"));
        return opcion;
    }
    
    public static void pruebaConexionMain(){
        /*TO DO*/
        try{
            Connection conn = ConnectionFactory.pruebitas();
            
            if(conn != null){
                System.out.println("Conexión Exitosa, todo fine!!");
                conn.close();
                System.out.println("Conexión Finalizadax");
            }
            
        }catch(SQLException e){
            System.out.println("Error al establecer la conexión! ====> "+e);
        }
    }
    
    
    
}//No tocar
