package ru.netology.hibernateorm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PERSONS")
public class Persons {

    @EmbeddedId
    private PersonKey personKey;
    @Column(nullable = true)
    private String phone;
    @Column(nullable = false)
    private String city_of_living;
}
