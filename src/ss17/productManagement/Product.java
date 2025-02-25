package ss17.productManagement;


import java.io.Serializable;

public class Product implements Serializable {
    // Biến serialVersionUID có tác dụng xác nhận object lúc gửi/nhận

    private int id;
    private String name;
    private double price;
    private String description;


    public Product(int id, String name, double price, String description) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }
}