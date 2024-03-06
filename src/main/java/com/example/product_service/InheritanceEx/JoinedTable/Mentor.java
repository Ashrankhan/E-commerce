package com.example.product_service.InheritanceEx.Singleclass;


import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "sc_Mentor")
@DiscriminatorValue("2")
public class Mentor extends User {

    private int gradyear;
}
