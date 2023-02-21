package com.baylor.timeline.demo.data;
import org.springframework.data.repository.CrudRepository;

import com.baylor.timeline.demo.models.Content;

public interface ContentRepository extends CrudRepository<Content, Long> {
    
}
