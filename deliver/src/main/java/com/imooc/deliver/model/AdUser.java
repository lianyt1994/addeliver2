package com.imooc.deliver.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;

@Data
@Entity
public class AdUser {

    @Id
    private Integer id;

    /** 订单id. */
    private String name;

    /** 商品id. */
    private String feature;
}
