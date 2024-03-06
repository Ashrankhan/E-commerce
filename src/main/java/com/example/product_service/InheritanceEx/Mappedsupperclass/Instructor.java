package com.example.product_service.InheritanceEx.Singleclass;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "sc_Instructor")
@DiscriminatorValue("3")
public class Instructor extends User {
    private String Company;
}
