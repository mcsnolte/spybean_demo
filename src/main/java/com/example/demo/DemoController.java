package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoObject demoObject;

    @RequestMapping(value = "/now", method = RequestMethod.GET)
    public DemoObject now() {
        return this.demoObject;
    }

}
