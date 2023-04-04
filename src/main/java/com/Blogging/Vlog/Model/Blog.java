package com.Blogging.Vlog.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "blog_table")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class Blog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int blogId;
    private String blogTitle;
    private  String blogDescription;

    @ManyToOne
    @JoinColumn
    private User user;

    @ManyToOne
    @JoinColumn
    private Category category;
    @OneToMany(mappedBy = "blog",cascade = CascadeType.ALL)
    private List<Image> imageList;

    @OneToMany(mappedBy = "blog",cascade = CascadeType.ALL)
    private List<Comment> commentList;
}
