package com.company;

import com.company.factories.Factories;
import com.company.jackets.Jacket;
import com.company.trousers.Trousers;
/**
 * Код, использующий фабрику, не волнует с какой конкретно фабрикой он работает.
 * Все получатели продуктов работают с продуктами через абстрактный интерфейс.
 */
public class Application {
    private Jacket jacket;
    private Trousers trousers;
    public Application(Factories factories)
    {
        jacket=factories.createJacket();
        trousers=factories.createTrousers();
    }
    public void print(int number)
    {
        jacket.print(number);
        trousers.print(number);
    }
}
