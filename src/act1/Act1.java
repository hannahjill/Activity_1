package act1;

import java.util.Scanner;

public class Act1 {

    public static void main(String[] args) {
        
        Scanner scn = new Scanner(System.in);
        
        System.out.println("Last Name: ");
        String lName = scn.nextLine();
        
        System.out.println("First Name: ");
        String fName = scn.nextLine();
        
        System.out.println("Middle Initial: ");
        char middleInitial = scn.next().charAt(0);
        
        System.out.println("Age: ");
        int Age = scn.nextInt();
        
        System.out.println("Gender: ");
        String Gender = scn.next();
        
        System.out.println("Birthday (MM/DD/YYYY): ");
        String Birthday = scn.next();
        
        System.out.println("\nExpected Output: ");
        
        System.out.println("Last Name: " + lName);
        System.out.println("First Name: " + fName);
        System.out.println("Middle Initial: " + middleInitial);
        System.out.println("Age: " + Age);
        System.out.println("Gender: " + Gender);
        System.out.println("Birthday: " + Birthday);
        
        scn.close();
    }
     }
    

