package com.company;

import com.company.factories.CambridgeFactory;
import com.company.factories.CotofeyFactory;
import com.company.factories.Factories;

import java.util.Scanner;

public class Main {
    private static Application configureApplication(int choice) {
        Application app;
        Factories factory;
        if(choice == 1){
            factory = new CotofeyFactory();
        } else {
            factory = new CambridgeFactory();
        }
        app = new Application(factory);
        return app;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int choice = 0;

        System.out.println("1. Котофей");
        System.out.println("2. Кембриджский профессор");

        choice = in.nextInt();
        System.out.println("Введите размер партии:");
        int number = in.nextInt();

        Application app = configureApplication(choice);
        app.print(number);
    }
}
