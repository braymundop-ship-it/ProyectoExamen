package conexion;

import java.sql.SQLException;

public class test {

    public static void main(String[] args) throws SQLException {

        CreateConnection conexion = new CreateConnection();
        conexion.getConnection();

        System.out.println("Conexion establecida");
    }
}