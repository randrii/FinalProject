package com.softserve.rybka.project;

import java.sql.*;

public class DBConnect {
    private Connection connection;
    private Statement statement;
    private ResultSet resultSet;
    
    public DBConnect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/maindb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "root");
            statement = connection.createStatement();
            
        } catch (Exception e) {
            System.out.println("Error:"+e);
        }
    }
        public void getData(){
            try {
               String query = "select * from test";
               resultSet = statement.executeQuery(query);
                System.out.println("Record fro DB");
                while(resultSet.next()){
                    String id = resultSet.getString("id");
                    String name = resultSet.getString("name");
                    String course = resultSet.getString("course");
               
                    System.out.println(id+" "+name+" "+course);
                }
            } catch (Exception e) {
                System.out.println("Err: "+e);
            }
        }
}
