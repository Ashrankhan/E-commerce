package com.example.product_service.Models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter

public abstract class Basemodel {
    private Long id;
    private Date craeteddate;
    private Date lastmodifieddate;
}
