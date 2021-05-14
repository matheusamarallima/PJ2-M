package entities;


import java.util.*;

public class Product {

    String name;
    double price;
    String description;
    int quantity;
    List<Image> images;
    String subCollectionName;
    List<Attributes> attributesList = new ArrayList<>();


    public Product(String name, double price, String description, int quantity, String subCollectionName) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.quantity = quantity;
        this.subCollectionName = subCollectionName;
    }

    public Product() {}

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getDescription() {
        return description;
    }

    public int getQuantity() {
        return quantity;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getSubCollectionName() {
        return subCollectionName;
    }

    public void setSubCollectionName(String subCollectionName) {
        this.subCollectionName = subCollectionName;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

    public List<Attributes> getAttributesList() {
        return attributesList;
    }

    public void setAttributesList(List<Attributes> attributesList) {
        this.attributesList = attributesList;
    }


    public void createAnAttribute(Attributes attributes) {
        attributesList.add(attributes);
        System.out.println(attributes.toString());
    }


    @Override
    public String toString() {
        return "Product{" +
                "Name of the product: " + name + '\'' +
                ", product's price: " + price +
                ", product's description: " + description + '\'' +
                ", product's quantity: " + quantity +
                ", subCollectionName='" + subCollectionName + '\'' +
                ", attributesList=" + attributesList +
                '}';
    }
}
