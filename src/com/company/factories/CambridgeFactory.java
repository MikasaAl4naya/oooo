package com.company.factories;

import com.company.jackets.CambridgeJacket;
import com.company.jackets.Jacket;
import com.company.trousers.CambridgeTrousers;
import com.company.trousers.Trousers;

public class CambridgeFactory implements Factories{
    @Override
    public Jacket createJacket() {
        return new CambridgeJacket();
    }

    @Override
    public Trousers createTrousers() {
        return new CambridgeTrousers();
    }
}
