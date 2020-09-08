package com.qualifier.service.impl.animal;

import com.qualifier.service.Animal;
import org.springframework.stereotype.Service;

@Service
public class Dog implements Animal {

    @Override
    public String action() {
        return "Auau";
    }
}
