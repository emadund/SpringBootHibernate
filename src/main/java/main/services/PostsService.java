package main.services;

import main.entity.Post;
import main.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostsService {
      @Autowired
      private PostRepository repo;

    public List<Post> getPosts() {
        List<Post> list  = new ArrayList<>();
        for (Post post: repo.findAll()) {
            list.add(post);
        }
        return list;
    }
    public Post getPost(int id) {

        return repo.findById(id).get();
    }

    public void addPost(Post post) {
       repo.save(post);
    }
    public void updatePost(Post post) {
       repo.save(post);
    }
    public void deletePost(int id) {
        repo.deleteById(id);
    }
}
