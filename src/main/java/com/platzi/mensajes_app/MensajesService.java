/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.mensajes_app;

import javax.swing.JOptionPane;

/**
 *
 * @author OTLUS
 */
public class MensajesService {
    
    
    public static void crearMensaje(){
        //Se crean las variables que posteriormente almacenaran el valor en un objeto de tipo Mensajes
        String mensaje = JOptionPane.showInputDialog("Escriba su mensaje");
        String nombre_autor = JOptionPane.showInputDialog("Escriba el nombre del autor del mensaje");
        
        //Se crea la instancia de objeto que maneja MensajesDAO con las variables creadas anteriormente
        //Para que se puedan almacenar correctamente
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre_autor);
        
        //Enviamos el objeto con los valores que va a requerir para hacer el update en la base de datos
        MensajesDAO.crearMensajeDB(registro);
    }
    
    public static void listarMensajes(){
        MensajesDAO.leerMensajesDB();
    }
    
    public static void borrarMensaje(){
        /*TO DO*/
    }
    
    public static void editarMensaje(){
        /*TO DO*/
    }
    
}//No tocar
