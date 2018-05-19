package com.amir.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author am.azizkhani on 2018-05-15.
 */
@Controller
public class RedirectController {

    @GetMapping("/url")
    public String redirect(String url) {
        try {
            new URL(url);
        } catch (MalformedURLException e) {
            return "InvalidUrl";
        }
        return "redirect:" + url;
    }

    @GetMapping("/")
    public String redirect2() {
        return "amir";
    }
}