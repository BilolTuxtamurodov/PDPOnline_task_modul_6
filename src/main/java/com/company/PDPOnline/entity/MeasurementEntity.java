package com.company.PDPOnline.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Getter
@Setter
@Entity
@Table(name = "measurement")
public class MeasurementEntity extends BaseEntity {
    @Column
    private String  name;
    @Column
    private Boolean active = true;
}
