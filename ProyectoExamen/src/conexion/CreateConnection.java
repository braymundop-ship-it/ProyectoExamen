/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 *
 * @author josue
 */
public class CreateConnection {
    
        static Properties props = new Properties();

    String hostname;
    String port;
    String database;
    String username;
    String password;
    
public CreateConnection() {

    try {
        InputStream in = Files.newInputStream(
                Paths.get("src/conexion/db_config.properties")
        );

        props.load(in);
        in.close();

    } catch (Exception e) {
        System.out.println(e.getMessage());
    }

    loadProperties();
}
public void loadProperties() {
    this.hostname = props.getProperty("hostname");
    this.port = props.getProperty("port");
    this.database = props.getProperty("database");
    this.username = props.getProperty("username");
    this.password = props.getProperty("password");
}
public Connection getConnection() throws SQLException {

    String url = "jdbc:postgresql://" + hostname + ":" + port + "/" + database;

    return DriverManager.getConnection(url, username, password);
}
}
