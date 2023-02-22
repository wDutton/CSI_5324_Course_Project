package com.baylor.timeline.demo.data;
import org.springframework.data.repository.CrudRepository;

import com.baylor.timeline.demo.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
    
}
