package com.harry;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by patharh on 12-11-2016.
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String hello() {
        return "Is this bootiful or what?";
    }

}
