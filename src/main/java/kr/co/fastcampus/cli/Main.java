package kr.co.fastcampus.cli;

import kr.co.fastcampus.Member;

import java.sql.*;
import java.util.logging.Logger;
import lombok.*;


@Data
class Main {
    //private static Logger logger =

    public static void main(String[] args){

        Connection connection = null;

        try{
            Class.forName("org.h2.Driver");
            String url = "jdbc:h2:~/test;MODE=MySQL;";
            connection = DriverManager.getConnection(url , "sa","1234");
            Statement statement = connection.createStatement();

            ResultSet resultSet= statement.executeQuery("SELECT id, username,password from MEMBER");

            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String userName = resultSet.getString("username");
                String passWord = resultSet.getString("password");
                Member member = new Member(1,userName, passWord);


//                logger.info("id: "+ id +"pw: "+ passWord  + "name: "+userName );
            }

        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
