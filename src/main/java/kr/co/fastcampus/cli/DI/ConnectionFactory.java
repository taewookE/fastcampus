package kr.co.fastcampus.cli.DI;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public Connection createConnection() throws SQLException {
        String url = "jdbc:h2:mem:test;MODE=MySQL";
        return DriverManager.getConnection(url,"sa","");
    }
}
