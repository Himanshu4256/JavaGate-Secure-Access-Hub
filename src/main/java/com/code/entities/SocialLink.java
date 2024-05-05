package com.code.entities;

import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Document
@NoArgsConstructor
@AllArgsConstructor
public class SocialLink {
    @Id
    private Long id;
    private String link;
    private String title;
    @ManyToOne
    private Contact contact;
}
