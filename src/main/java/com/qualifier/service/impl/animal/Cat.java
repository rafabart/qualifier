package com.qualifier.service.impl.animal;

import com.qualifier.service.Animal;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

// @Primary define que em caso de mais de uma implememtação de interface, a classe Cat será usada como opção primaria.
@Primary
@Service
public class Cat implements Animal {

    @Override
    public String action() {
        return "Meow";
    }
}
