package com.example.Mapping_OneToOne.model1;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="tbl_laptops")
@Getter
@Setter
public class Laptop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne
    @JoinColumn(name = "brand_id")
    private Brand brand;

    private BigDecimal price;

    public Laptop(LaptopRequest request) {
        this.name = request.getName();
        this.price = request.getPrice();
    }

}