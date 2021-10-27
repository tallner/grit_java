package com.cte;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
//        int age,discountAge=20;
//        int maxNrOfUsers = 3;
        String name;
        String inputPw;
//        String[] userName = {"John", "Mike", "Sarah"};
//        String[] userPw = {"pw1", "pw2", "pw3"};



        System.out.println( "Enter your Name: " );
        name = userInput.next();

        System.out.println( "Enter your password: " );
        inputPw = userInput.next();

        if (checkLogin(name,inputPw)) System.out.println("pw found");
        else System.out.println("not found");

//        if (password.equals(inputPw)) System.out.println("correct pw");
//        else System.out.println("not correct pw");

//        for (int i = 0; i < maxNrOfUsers; i++) {
            //find the Name and its corresponding pw
//            if ((userName[i].equals(name)) & (userPw[i].equals(inputPw)))
//            {
//                System.out.println("correct pw");
//                break;
//            }
////            else System.out.println("not correct pw");
//        }

//        System.out.println( "Enter your age: " );
//        age = userInput.nextInt();


     //   if (age > discountAge) System.out.println("Eligible");
      //  else System.out.println("not eligible");

//        checkDiscountEligible(discountAge,age,"john");
    }

    private static boolean checkLogin(String name, String inputPw) {
        String[] userName = {"John", "Mike", "Sarah"};
        String[] userPw = {"pw1", "pw2", "pw3"};

        for (int i = 0; i < userName.length; i++) {
            //find the Name and its corresponding pw
            if ((userName[i].equals(name)) && (userPw[i].equals(inputPw))) return true;
        }
        return false;
    }


//    private static boolean changePassword(String name, String inputPw) {
//        String[] userName = {"John", "Mike", "Sarah"};
//        String[] userPw = {"pw1", "pw2", "pw3"};
//
//        for (int i = 0; i < userName.length; i++) {
//            //find the Name and its corresponding pw
//            if ((userName[i].equals(name)) && (userPw[i].equals(inputPw))) return true;
//        }
//        return false;
//    }
//
//    private static void checkDiscountEligible(int discountAge, int userInput, String name) {
//        if (userInput > discountAge) System.out.println(name + "Eligible");
//        else System.out.println(name+"Not Eligible");
//    }
//
//    private static void checkDiscountEligible(int discountAge, int userInput) {
//        if (userInput>discountAge) System.out.println("Eligible");
//        else System.out.println("Not Eligible");
//    }


}


