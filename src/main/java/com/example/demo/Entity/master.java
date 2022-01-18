package com.example.demo.Entity;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@Entity
public class master {

    @Id
    private long user_id;


    @NotNull
    @Size(min = 8, max = 8)
    private long masId;

    @NotNull
    @Size(min = 10, max = 10)
    private long cmId;

    @NotNull
    @Size(min = 3, max = 50)
    private String firstName;

    @NotNull
    @Size(min = 3, max = 50)
    private String lastName;

    @NotNull
    @Size(min = 11, max = 11)
    private long phone;


    @OneToOne
    @MapsId
    @JoinColumn(name = "user_id")
    private userLogin userlogin;


}
