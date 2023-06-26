package main.controller;

import main.entity.Post;
import main.services.PostsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
@RestController
public class PostsController {

    @Autowired
    private PostsService service;
    @RequestMapping("/posts")
    public List<Post> getPosts() {

        return service.getPosts();
    }


    @RequestMapping("/posts/{id}")
    public Post getPost(@PathVariable int id) {
        return service.getPost(id);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/posts")
    public void addPost(@RequestBody Post post) {
        service.addPost(post);
    }
    @RequestMapping(method = RequestMethod.PUT, value = "/posts/{id}")
    public void updatePost(@RequestBody Post post) {
        service.updatePost(post);
    }
    @RequestMapping(method = RequestMethod.DELETE, value = "/posts/{id}")
    public void deletePost(@PathVariable int id) {
        service.deletePost(id);
    }





}
