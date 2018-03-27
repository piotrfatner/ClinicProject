package com.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;

import javax.sql.RowSet;
import java.sql.*;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = {"com","com.controller", "com.config"})
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","marta123");
            Statement statement = connect.createStatement();
            ResultSet rs = statement.executeQuery("select * from TEST;");
            rs.next();
            System.out.println(rs.getString(1));
            System.out.println(rs.getString(2));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
