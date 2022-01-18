package com.example.demo.Entity;

import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.io.Serializable;

@Data
@Entity
@Serialization
@IdClass(SMCRelationId.class)
public class SMCRelation implements Serializable {

    @Id
    private Long userId;

    @Id
    private Long masterId;

    @Id
    private Long courseId;

    @Id
    @NotNull
    @Size(min = 4, max = 4)
    private String term;


    @NotNull
    @Digits(integer = 2,fraction = 2)
    private long score;

}
