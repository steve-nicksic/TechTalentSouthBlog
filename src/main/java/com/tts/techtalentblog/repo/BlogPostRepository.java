package com.tts.techtalentblog.repo;

import com.tts.techtalentblog.model.BlogPost;
import org.springframework.data.repository.CrudRepository;

public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {
}

// we extend the functionality to include the functionality of the Spring CrudRepository, importing the methods needed
// to modify data in our database.