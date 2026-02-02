package model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
   
    private static final String URL = "jdbc:mysql://localhost:3306/restaurante";
    private static final String USER = "root"; 
    private static final String PASSWORD = "Matheus110207@";
    
    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao conectar no banco de dados", e);
        }
    }
}