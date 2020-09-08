package com.qualifier.service.impl.mammal;

import com.qualifier.service.Mammal;

public class Man implements Mammal {

    @Override
    public String move() {
        return "walk";
    }
}
