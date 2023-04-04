package com.Blogging.Vlog.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="image_table")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int imageId;
    private String imageTitle;
    private String imageUrl;
    @ManyToOne
    @JoinColumn
    private Blog blog;
}
