package com.company.PDPOnline.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "output_table")
public class OutputEntity extends BaseEntity {
    @Column
    private LocalDateTime date = LocalDateTime.now();
    @Column
    private String factureNumber;
    @Column
    private String code;


    @Column(name = "warehouse_id", nullable = false)
    private Integer warehouseId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "warehouse_id", insertable = false, updatable = false)
    private WarehouseEntity warehouse;

    @Column(name = "client_id", nullable = false)
    private Integer clientId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "client_id", insertable = false, updatable = false)
    private ClientEntity client;

    @Column(name = "currency_id", nullable = false)
    private Integer currencyId;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "currency_id", insertable = false, updatable = false)
    private CurrencyEntity currency;

}
