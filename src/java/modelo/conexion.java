/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Evolution
 */
public class conexion {
    private Connection conn;
    private final String jdbc;
    private final String ruta;
    private final String usuario;
    private final String clave;

    public conexion() {
        this.conn = null;
        this.jdbc = "com.mysql.jdc.Driver";
        this.ruta = "jdbc:mysql://127.0.0.1:3306/combobox";
        this.usuario = "root";
        this.clave = "evolution";
    }

    public Connection AbrirConexion(){
        try {
            Class.forName(this.jdbc);
            this.conn = DriverManager.getConnection(this.ruta, this.usuario, this.clave);
            
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
        return this.conn;
    }

  
    }