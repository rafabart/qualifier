package com.qualifier.service.impl.bird;

import com.qualifier.service.Bird;
import org.springframework.stereotype.Service;

@Service
public class Penguin implements Bird {

    @Override
    public String action() {
        return "Swim";
    }
}
