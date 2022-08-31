package test;

import java.util.Scanner;


public class Test1 {
    public static void main(String[] args) {
        Test1 test = new Test1();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число");
        int number = scanner.nextInt();
        System.out.println(test.sayHello(number));
    }

    public String sayHello(int number) {

            if(number > 7){
                return "Privet";
            }
        return "";
    }





}
