package com.example.demo;

import com.example.demo.post.Post;
import com.example.demo.post.PostClient;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

//    @Bean
//    CommandLineRunner commandLineRunner(PostClient postClient) {
//        return args -> {
//            List<Post> posts = postClient.getPosts();
//            System.out.println(posts);
//        };
//    }

}
