package com.qualifier.service.impl.mammal;

import com.qualifier.service.Mammal;

public class Dolphin implements Mammal {

    @Override
    public String move() {
        return "swim";
    }
}
