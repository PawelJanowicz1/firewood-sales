package org.example.firewoodsales.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Product  {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String type;

    @Column
    private int length;

    @Column
    private int volume;
}