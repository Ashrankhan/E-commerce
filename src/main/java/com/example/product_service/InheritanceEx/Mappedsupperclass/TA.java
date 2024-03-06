package com.example.product_service.InheritanceEx.Singleclass;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "sc_TA")
@DiscriminatorValue("1")
public class TA extends User {
    private double Rating;

}
