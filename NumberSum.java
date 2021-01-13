// This program will ask a user for a 5 digit number, they produce the sum of those 5 digits

import java.util.*;

 public class NumberSum {

    public static void main(String[] args) {
        
        Scanner userEnter = new Scanner(System.in);
        Integer userNum;
        
     // Begins user interaction
        System.out.println("Enter a 5-digit positive number: ");
        
        userNum = userEnter.nextInt();
        
        int userFirstNum = userNum%10;
        userNum = userNum/10;
        
        int userSecondNum = userNum%10;
        userNum = userNum/10;
        
        int userThirdNum = userNum%10;
        userNum = userNum/10;
        
        int userFourthNum = userNum%10;
        userNum = userNum/10;
        
        int userFifthNum = userNum;
        
     //Declares the variable userNumSum, as the sum of the data collected from user input
        double userNumSum = (userFirstNum + userSecondNum + userThirdNum + userFourthNum + userFifthNum);
        
     
     // Prints result to console
        System.out.println("The sum of " + userFifthNum + " + " + userFourthNum + " + " + userThirdNum + 
        " + " + userSecondNum + " + " + userFirstNum + " = " + userNumSum);
        
    }
     
 }
