package com.company.trousers;

public class CambridgeTrousers implements Trousers {
    @Override
    public void print(int x) {
        System.out.print("Был осуществлен заказ на " + x +"брюк линейки 'Кембриджский'");
    }
}
