/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.platzi.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author OTLUS
 */
public class ConnectionFactory {
    
    public static Connection establecerConexion() throws SQLException {
        
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app","root","");
    }
    
    public static Connection pruebitas()throws SQLException{
        return DriverManager.getConnection("jdbc:mysql://localhost/ComerSwift?useTimeZone=True&serverTimeZone=UTC"
        ,"root","Yilverteamo320");
    }
    
    /*"jdbc:mysql://localhost/ComerSwift?useTimeZone=True&serverTimeZone=UTC"
        ,"root","Yilverteamo320"*/
    
}//No tocar
