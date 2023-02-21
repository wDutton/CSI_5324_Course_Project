package com.baylor.timeline.demo.models;


import java.time.LocalDate;
import java.util.Date;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Content {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Date createdAt = new Date();

    @Nonnull
    private String creatorId;

    private boolean isApproved;

    private String uploadedFile;

    private String description;

    @Nonnull
    private String title;

    private LocalDate dateOfEvent;

    private LocalDate dateOfExpiration;
}
