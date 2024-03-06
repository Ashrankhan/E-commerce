package com.example.product_service.InheritanceEx.Tableperclass.Singleclass.sds;


import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity(name = "tpc_Mentor")
public class Mentor extends User{

    private int gradyear;
}
