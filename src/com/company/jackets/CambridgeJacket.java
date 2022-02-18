package com.company.jackets;

public class CambridgeJacket implements Jacket{
    @Override
    public void print(int x) {
        System.out.print("Был осуществлен заказ на " + x +" пиджаков линейки 'Кембриджский' и ");
    }
}
