package com.cte;
import java.util.Scanner;

class Flight {
    private int speed;
    private Pilot p1 = new Pilot(12,"Johan",true,"long", "10000mClub", "propeller", "jet");
//
//    @Override
//    public String toString() {
//        return "Flight{" +
//                "p1=" + p1 +
//                '}';
//    }

    //constructor
    public Flight(int speed){
        this.speed = 9;
    }

    public int getSpeed() {
        return speed;
    }
    public int setSpeed(int s) {
        if (s > 0 && s < 10000) this.speed = s;
        else System.out.println("bad");

        return this.speed;
    }

    public Pilot getP1() {
        return p1;
    }
    public void setP1(Pilot p1) {
        this.p1 = p1;
    }
}

public class Main {

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
//        Product p1 = new Product(5,65,"myPhone");
        Flight f1 = new Flight(6);

        for (int i = 0; i < f1.getP1().flightSkills.length; i++) {
            System.out.println(f1.getP1().flightSkills[i]);
        }



//        Flight f2 = new Flight(7);
//
//        String name = new String("John");
//        String name1 = "John";

//        Calculator myCalc = new Calculator();
//        String name;
//        String inputPw;
//        double inputNumber1;
//        int inputNumber2;
//
//        p1.setId(10);
//
//        System.out.println(p1.getId());
//
//        f1.setSpeed(-58);






//        System.out.println("First number?");
//        inputNumber1 = userInput.nextDouble();
//        if (inputNumber1 != 5 && inputNumber1 != 6) System.out.println("Not 5 or 6");

//        System.out.println("Second number?");
//        inputNumber2 = userInput.nextInt();
//        if (inputNumber2 != 5 && inputNumber2 != 6) System.out.println("Not 5 or 6");

        //odd or even
//        int modResult = (int) inputNumber1 % 2;
      //  System.out.println(modResult);
//        if (((int) inputNumber1 % 2) == 0) System.out.println("EVEN");
//        else System.out.println("ODD");

//        System.out.println(
//                "Choose arithmetic:" +
//                        '\n' + '\t' + "s - Subtract" +
//                        '\n' + '\t' + "a - Add" +
//                        '\n' + '\t' + "m - Multiply" +
//                        '\n' + '\t' + "d - Divide"
//        );
//        switch (userInput.next()) {
//            case "s"-> System.out.println("Sub of these numbers are " + sub((int) inputNumber1,inputNumber2));
//            case "a" -> System.out.println("Sum of these numbers are " + sum((int) inputNumber1,inputNumber2));
//            case "m" -> System.out.println("Mul of these numbers are " + mul((int) inputNumber1,inputNumber2));
//            case "d" -> System.out.println("Div of these numbers are " + div(inputNumber1,inputNumber2));
//            default -> System.out.println("wrong selection");
//        }
//



//        System.out.println("Sum of these numbers are " + sum((int) inputNumber1,inputNumber2));
//        System.out.println("Sub of these numbers are " + sub((int) inputNumber1,inputNumber2));
//        System.out.println("Mul of these numbers are " + mul((int) inputNumber1,inputNumber2));
//        System.out.println("Div of these numbers are " + div(inputNumber1,inputNumber2));
//        System.out.println("DivDouble of these numbers are " + div((double) inputNumber1,inputNumber2));
//        System.out.println("DivFloat of these numbers are " + div((float) inputNumber1, inputNumber2));
//        System.out.println("ave is" +
//        ave(sum((int) inputNumber1,inputNumber2),sum((int) inputNumber1,inputNumber2),sum((int) inputNumber1,inputNumber2),sum((int) inputNumber1,inputNumber2))
//        );

        //Enter a number and output a color
//        System.out.println("Enter a number?");
//        switch(userInput.nextInt()) {
//            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 -> System.out.println("BLUE");
//                //break;
//            case 11,12,13,14, 15, 16, 17, 18, 19, 20 -> System.out.println("RED");
//                //break;
//            case 21,22,23,24,25,26,27,28,29,30 -> System.out.println("GREEN");
//                //break;
//            default -> System.out.println("no color");
//        }



    }

    public static int sum(int num1, int num2) {
        return (num1+num2);
    }
    public static int sub(int num1, int num2) {
        return (num1-num2);
    }
    public static int mul(int num1, int num2) {
        return (num1*num2);
    }
    public static int div(int num1, int num2) {
        return (num1/num2);
    }
    public static double div(double num1, double num2) {
        return (num1/num2);
    }
    public static float div(float num1, long num2) {
        return (num1/num2);
    }
    public static float ave(int num1, int num2, int num3, int num4) {
        return ((num1+num2+num3+num4)/4);
    }

//    private static boolean checkLogin(String name, String inputPw) {
//        String[] userName = {"John", "Mike", "Sarah"};
//        String[] userPw = {"pw1", "pw2", "pw3"};
//
//        for (int i = 0; i < userName.length; i++) {
//            //find the Name and its corresponding pw
//            if ((userName[i].equals(name)) && (userPw[i].equals(inputPw))) return true;
//        }
//        return false;
//    }



}


