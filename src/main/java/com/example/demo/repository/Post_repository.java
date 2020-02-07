package com.example.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.*;
import com.example.demo.models.Post;

public interface Post_repository extends JpaRepository<Post, Long> {
	List<Post> findAll();

}
