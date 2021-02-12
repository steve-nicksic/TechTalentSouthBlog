package com.tts.techtalentblog.controller;


import com.tts.techtalentblog.model.BlogPost;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogPostController {

    @GetMapping(value = "/")
    public String index(BlogPost blogPost) {
        return "blogpost/index";
    }
}

// @Controller - this class annotation helps send out the template, rather than write directly from the controller

// @GetMapping - this annotation used for index method, returns specified template, 'index' in blog post template directory
