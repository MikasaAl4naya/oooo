package com.company.factories;


import com.company.jackets.Jacket;
import com.company.trousers.Trousers;
// Абстрактная фабрика знает обо всех (абстрактных) типах продуктов.
public interface Factories {
    Jacket createJacket();
    Trousers createTrousers();
}
