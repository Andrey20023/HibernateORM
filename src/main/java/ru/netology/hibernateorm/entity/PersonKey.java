package ru.netology.hibernateorm.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class PersonKey implements Serializable {
    @Column(nullable = false, length = 50)
    private String Name;
    @Column(nullable = false, length = 50)
    private String surname;
    private int age;

}
