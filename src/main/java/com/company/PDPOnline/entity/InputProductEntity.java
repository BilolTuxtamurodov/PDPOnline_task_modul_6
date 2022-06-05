package com.company.PDPOnline.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "input_product")
public class InputProductEntity extends BaseEntity {
    @Column
    private Long amount;
    @Column
    private Long price;
    @Column
    private String expireDate;
    @Column
    private Integer productId;


}
