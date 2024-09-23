package PracticeProgram;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnectDemo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String name,email,pass,gender,city;
        System.out.print("Enter name :- ");
        name = sc.nextLine();
        System.out.print("Enter email :- ");
        email = sc.next();
        System.out.print("Enter password :- ");
        pass = sc.next();
        System.out.print("Enter gender :- ");
        gender = sc.next();
        System.out.print("Enter city :- ");
        city = sc.nextLine();
        sc.nextLine();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con  = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?useSSL=false","root","kamal@144049");
        PreparedStatement pr = con.prepareStatement("insert into `register` values(?,?,?,?,?)");
        pr.setString(1,name);
        pr.setString(2,email);
        pr.setString(3,pass);
        pr.setString(4,gender);
        pr.setString(5,city);
        int i = pr.executeUpdate();
        if(i>0){
            System.out.println("success");
        }
        else{
            System.out.println("fail");
        }
        con.close();
        pr.close();
    }
}
