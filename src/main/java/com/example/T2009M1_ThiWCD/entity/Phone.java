package com.example.T2009M1_ThiWCD.entity;

import com.example.T2009M1_ThiWCD.entity.base.BaseEntity;

import java.time.LocalDateTime;

public class Phone extends BaseEntity {
    private int id;
    private String name;
    private String brand;
    private String description;
    private double price;
    private PhoneStatus status;

    public Phone() {
    }

    public Phone(int id, String name, String image, String description, double price, int categoryId, LocalDateTime openingDate, PhoneStatus status) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.description = description;
        this.price = price;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public PhoneStatus getStatus() {
        return status;
    }

    public void setStatus(PhoneStatus status) {
        this.status = status;
    }

    public static final class ProductBuilder {
        protected LocalDateTime createdAt;
        protected LocalDateTime updatedAt;
        protected LocalDateTime deletedAt;
        protected int createdBy;
        protected int updatedBy;
        protected int deletedBy;
        private int id;
        private String name;
        private String image;
        private String description;
        private double price;
        private PhoneStatus status;

        private ProductBuilder() {
        }

        public static ProductBuilder aProduct() {
            return new ProductBuilder();
        }

        public ProductBuilder withId(int id) {
            this.id = id;
            return this;
        }

        public ProductBuilder withName(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder withImage(String image) {
            this.image = image;
            return this;
        }

        public ProductBuilder withDescription(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder withPrice(double price) {
            this.price = price;
            return this;
        }

        public ProductBuilder withStatus(PhoneStatus status) {
            this.status = status;
            return this;
        }

        public ProductBuilder withCreatedAt(LocalDateTime createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public ProductBuilder withUpdatedAt(LocalDateTime updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public ProductBuilder withDeletedAt(LocalDateTime deletedAt) {
            this.deletedAt = deletedAt;
            return this;
        }

        public ProductBuilder withCreatedBy(int createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        public ProductBuilder withUpdatedBy(int updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        public ProductBuilder withDeletedBy(int deletedBy) {
            this.deletedBy = deletedBy;
            return this;
        }

        public Phone build() {
            Phone phone = new Phone();
            phone.setId(id);
            phone.setName(name);
            phone.setBrand(image);
            phone.setDescription(description);
            phone.setPrice(price);
            phone.setStatus(status);
            phone.updatedAt = this.updatedAt;
            phone.deletedAt = this.deletedAt;
            phone.createdBy = this.createdBy;
            phone.deletedBy = this.deletedBy;
            phone.updatedBy = this.updatedBy;
            phone.createdAt = this.createdAt;
            return phone;
        }
    }

}
