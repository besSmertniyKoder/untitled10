package view;

import controller.MathController;

import java.util.Scanner;

public class ExampleView {
    private MathController mathController = new MathController();
    public void getNumbers(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a");
        int a = scanner.nextInt();
        System.out.println("enter b");
        int b = scanner.nextInt();
        System.out.println(mathController.getNumbers(a,b));


    }


}
