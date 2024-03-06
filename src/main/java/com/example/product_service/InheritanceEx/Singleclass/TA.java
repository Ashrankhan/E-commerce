package com.example.product_service.InheritanceEx.Tableperclass.Singleclass.sds;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity(name = "tpc_ta")
public class TA extends User{
    private double Rating;

}
