import java.util.*;
import java.io.*;
import java.sql.*;
import java.util.Scanner;

public class jdbcCon {
    public static void main(String[] args) throws Exception {
        try {
            String url = "jdbc:mysql://localhost:3306/studrec";
            String username = "root";
            String pwd = "admin@root";
            String query = "select * from stud";
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, username, pwd);
            System.out.println("connection created");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query);
            rs.next();
            String name = rs.getString("name");
            System.out.println("Name is" + name);
            st.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}