package ss12.BaiTap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

class ProductManager {
    
    private ArrayList<Product> productList = new ArrayList<>();
    // Add a product
    public void addProduct(Product product) {
        productList.add(product);
        System.out.println("Product added successfully.");
    }

    // Edit a product by id
    public void editProductById(int id, String newName, double newPrice) {
        for (Product product : productList) {
            if (product.getId() == id) {
                product.setName(newName);
                product.setPrice(newPrice);
                System.out.println("Product updated successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Delete a product by id
    public void deleteProductById(int id) {
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).getId() == id) {
                productList.remove(i);
                System.out.println("Product deleted successfully.");
                return;
            }
        }
        System.out.println("Product not found.");
    }

    // Display all products
    public void displayProducts() {
        if (productList.isEmpty()) {
            System.out.println("No products to display.");
        } else {
            for (Product product : productList) {
                System.out.println(product);
            }
        }
    }

    // Search for a product by name
    public void searchProductByName(String name) {
        boolean found = false;
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                System.out.println(product);
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found with the name: " + name);
        }
    }

    // Sort products by price in ascending order
    public void sortProductsByPriceAscending() {
        Comparator<Product> priceComparator = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return (int) (p1.getPrice()- p2.getPrice());
            }
        };
        productList.sort(priceComparator);
        System.out.println("Products sorted by price in ascending order.");
    }

    // Sort products by price in descending order
    public void sortProductsByPriceDescending() {
        Comparator<Product> priceComparator = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return (int) (p2.getPrice()- p1.getPrice());
            }
        };
        productList.sort(priceComparator);
        System.out.println("Products sorted by price in descending order.");
    }
}