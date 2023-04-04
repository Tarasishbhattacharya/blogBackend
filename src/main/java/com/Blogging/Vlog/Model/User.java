package com.Blogging.Vlog.Model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Entity
@Table(name = "user_table")
@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String name;
    private int age;
    private String email;
    private String country;
    private String mobile;
    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Blog> blogList;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Comment> commentList;
}
