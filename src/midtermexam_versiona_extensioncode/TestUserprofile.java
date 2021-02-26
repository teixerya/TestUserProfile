/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermexam_versiona_extensioncode;

import java.util.Scanner;

/**
 *
 * @author ryanteixeira
 */
public class TestUserprofile {

    private UserProfile users[] = new UserProfile[100];//room for 100 online players!
     
    /**
     * Main method with call to private run method, to encapsulate our
     * main functionality.
     * @param args - not used
     */
    public static void main(String[] args) 
     {
       TestUserprofile newProfile = new TestUserprofile();
       newProfile.run();
    }
     /**
     * method that takes in the User's name and chosen password
     * and then continues prompting until the password is valid based on the
     * following two rules:
     * 1. The password must be at least length 8
     * 2. The password must contain at least one "special character"
     * 
     */
    private void run()
    {
        int userCount=0;//keep track of number of users for array
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter your desired user name:");
        String userName = sc.nextLine();
        
        System.out.println("\nComedy"+ "\nDrama"+ "\nAction"+ "\nMystery");

        System.out.println("Enter Genre:");
        String genre = sc.nextLine();
//        PasswordValidator validator = new PasswordValidator();
        //call password validator
//        validator.validate(password);
        
        UserProfile newUser = new UserProfile(userName, genre);
        users[userCount] = newUser;//add the new user to the user list
        userCount++;
        System.out.println("New User Added");
        System.out.println("UserName: " + userName);
        System.out.println("Genre: " + genre);
    }//end run method 
}//end class
