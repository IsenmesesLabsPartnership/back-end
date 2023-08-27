package ru.eshop.website.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
@Entity
@Data
@Table(name = "laptops")
public class Laptop extends BaseEntity {
    @ManyToOne
    private Brand brand;
    private String modelName;
    private String HardDiskSize;
    private String ramMemorySize;
    private String operatingSystem;
    private String price;


}
