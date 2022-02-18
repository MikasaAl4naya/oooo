package com.company.factories;

import com.company.jackets.CotofeyJacket;
import com.company.jackets.Jacket;
import com.company.trousers.CotofeyTrousers;
import com.company.trousers.Trousers;

public class CotofeyFactory implements Factories{
    @Override
    public Jacket createJacket() {
        return new CotofeyJacket();
    }

    @Override
    public Trousers createTrousers() {
        return new CotofeyTrousers();
    }
}
