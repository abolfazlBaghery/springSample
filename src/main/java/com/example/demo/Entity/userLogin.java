package com.example.demo.Entity;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
public class userLogin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    @NotNull
    private String userName;

    @NotNull
    private String passWord;

    @NotNull
    @Column(name="locked", columnDefinition = "boolean default true")
    private boolean locked;

    @OneToOne(mappedBy = "userlogin", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private student student;

    @OneToOne(mappedBy = "userlogin", cascade = CascadeType.ALL)
    @PrimaryKeyJoinColumn
    private master master;

}
