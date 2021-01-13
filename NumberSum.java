import java.util.*;

 public class NumberSum {

    public static void main(String[] args) {
        
        Scanner userEnter = new Scanner(System.in);
        Integer userNum;
        
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
        
        double userNumSum = (userFirstNum + userSecondNum + userThirdNum + userFourthNum + userFifthNum);
        
        System.out.println("The sum of " + userFifthNum + " + " + userFourthNum + " + " + userThirdNum + 
        " + " + userSecondNum + " + " + userFirstNum + " = " + userNumSum);
        
    }
     
 }
