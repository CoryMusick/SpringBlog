package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PostController {
    @GetMapping("/posts")
    @ResponseBody
    public String postIndex(){
        return "Post Index Page";
    }

    @GetMapping("/posts/{id}")
    @ResponseBody
    public String post(@PathVariable int id){
        return "Displays post with id of " + id;
    }

    @GetMapping("/posts/create")
    @ResponseBody
    public String createPost(){
        return "View the form for creating a post ";
    }

    @PostMapping("/posts/create")
    @ResponseBody
    public String createPostFromForm(){
        return "create a new post ";
    }

}
