
package dao;

import  java.sql.Connection;
import java.sql.DriverManager;
public class ConnectionFactory {
    public Connection getConexao(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost/mercado", "root" , "root");
            
        }catch(Exception erro){
            throw new RuntimeException("erro1: " + erro);
        }
    }
}
