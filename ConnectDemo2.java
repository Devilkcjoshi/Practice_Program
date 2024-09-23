package PracticeProgram;

import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class ConnectDemo2 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc_db?useSSL=false","root","kamal@144049");
        char choice = 'y';
        String name,gender,email,city;
        int age;
        while(choice != 'n'){
            System.out.print("Enter the name :- ");
            name = sc.nextLine();
            System.out.print("Enter age :- ");
            age = sc.nextInt();
            System.out.print("Enter gender :- ");
            gender = sc.next();
            System.out.print("Enter email :- ");
            email = sc.next();
            System.out.print("Enter city :- ");
            city = sc.next();
            PreparedStatement pr = con.prepareStatement("insert into `Students` values(?,?,?,?,?)");
            pr.setString(1,name);
            pr.setInt(2,age);
            pr.setString(3,gender);
            pr.setString(4,email);
            pr.setString(5,city);
            int i = pr.executeUpdate();
            if(i > 0){
                System.out.println("The data is added successfully.");
            }
            else{
                System.out.println("The data is not added successfully.");
            }
            System.out.print("Do you want to store another data if yes(type anything) or no(type n) :- ");
            choice = sc.next().charAt(0);
        }


    }
}
