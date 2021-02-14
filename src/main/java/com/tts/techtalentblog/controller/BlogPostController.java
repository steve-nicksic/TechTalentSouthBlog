package com.tts.techtalentblog.controller;


import com.tts.techtalentblog.model.BlogPost;
import com.tts.techtalentblog.repo.BlogPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BlogPostController {

    @Autowired
    private BlogPostRepository blogPostRepository;

    @GetMapping(value = "/")
    public String index(BlogPost blogPost) {
        return "blogpost/index";
    }

    private BlogPost blogPost;

    @PostMapping(value = "/")
    public String addNewBlogPost (BlogPost blogPost, Model model) {
        blogPostRepository.save(new BlogPost(blogPost.getTitle(), blogPost.getAuthor(), blogPost.getBlogEntry()));
        model.addAttribute("title", blogPost.getTitle());
        model.addAttribute("author", blogPost.getAuthor());
        model.addAttribute("blogEntry", blogPost.getBlogEntry());
        return "blogpost/result";
    }
}

// @Controller - this class annotation helps send out the template, rather than write directly from the controller

// @GetMapping - this annotation used for index method, returns specified template, 'index' in blog post template directory

// @Autowired - to add our BlogPostRepository to the controller

// @PostMapping - added another method to take in data entered into form and add it to the database
// This method will post the information to the database and display a "confirmation' on  a new template called "result"
