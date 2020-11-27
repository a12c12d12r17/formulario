package clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author camilo
 */
public class conectar {
    
    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String pass = "";
    private static final String url = "jdbc:mysql://localhost:3306/dbtienda";

    public conectar() {
        conn = null;
        try{
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, pass);
            if(conn != null){
                System.out.println("la conexion se establecio bien");
            }
        }catch(ClassNotFoundException | SQLException e){
            System.out.println("Error al conectar con la DB "+e);
        }
    }
    public Connection getConnection(){
        return conn;
    }
    public void desconectar (){
        conn = null;
        if(conn==null){
            System.out.println("se desconecto la base de datos");
        }
    }
}


