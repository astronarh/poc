package ru.astronarh.poc.dao;

import org.springframework.data.annotation.Id;

import java.util.Map;
import java.util.UUID;

public class Product {
    @Id
    private String id = UUID.randomUUID().toString();

    private long productId;

    private String productName;

    private Map<String, String> prices;

    public Product() {
    }

    public Product(long productId, String productName, Map<String, String> prices) {
        this.productId = productId;
        this.productName = productName;
        this.prices = prices;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Map<String, String> getPrices() {
        return prices;
    }

    public void setPrices(Map<String, String> prices) {
        this.prices = prices;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", productId=" + productId +
                ", productName='" + productName + '\'' +
                ", prices=" + prices +
                '}';
    }
}
