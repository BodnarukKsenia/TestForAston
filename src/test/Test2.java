package test;

import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {

        Test2 test = new Test2();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя");
        String name = scanner.nextLine();
        System.out.println(test.sayHelloVyacheslav(name));


    }
    public String sayHelloVyacheslav(String name){

        if(name.equalsIgnoreCase("Вячеслав")){
            return "Привет, Вячеслав";
        } else {
        return "Нет такого имени";
        }
    }
}
