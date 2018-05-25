package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class DemoObject {

    private String name = "demo";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
