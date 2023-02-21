package com.baylor.timeline.demo;

import java.util.Date;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.baylor.timeline.demo.data.ContentRepository;
import com.baylor.timeline.demo.data.PersonRepository;
import com.baylor.timeline.demo.models.*;

@Configuration
public class DevelopmentConfig {
    
    @Bean
    public CommandLineRunner dataLoader(ContentRepository contentRepo, PersonRepository personRepo)
    {
        return new CommandLineRunner() {
            @Override
            public void run(String... args) throws Exception {
                Content c1 = new Content();
                c1.setTitle("Content title");
                c1.setApproved(false);
                c1.setCreatedAt(new Date());
                c1.setDescription("description");
                c1.setUploadedFile("example file.png");
                Content savedContent = contentRepo.save(c1);

                Person p1 = new Person();
                p1.addContent(savedContent);
                p1.setEmail("example@baylor.edu");
                p1.setFirstName("John");
                p1.setLastName("117");
                
                personRepo.save(p1);
            }
        };
    }
}
