package com.Blogging.Vlog.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "comment_table")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int commentId;
    private String commentDescription;

    @ManyToOne
    @JoinColumn
    private Blog blog;

    @ManyToOne
    @JoinColumn
    private User user;
}
