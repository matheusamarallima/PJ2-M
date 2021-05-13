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

    public static Set<Product> products = new HashSet<>();

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

    //Methods




    public void createAProduct(Product product) {
        products.add(product);
        System.out.println(products.toString());
    }

    public void ListAllProductsInProducts() {
        List<String> products1 = new ArrayList<>();
        for (Product product : products) {
            if (product.getName() != null) {
                products1.add("Product name: " + product.getName());
                products1.add("Product description: " + product.getDescription());
            }
        }
        if (products1.size() > 0) {
            System.out.println(products1);
        } else {
            System.out.println("Empty");
        }
    }

    public void searchForAProductInProducts(String SearchParameter) {
        for (Product product : products) {
                if (product.getName().equalsIgnoreCase(SearchParameter)) {
                    System.out.println("Product name: " + product.getName());
                    System.out.println("Product price: " + product.getPrice());
                    System.out.println("Product description: " + product.getDescription());
                    break;
                }
                System.out.println("Not found");
            }
        }


    public void searchForAProductInASubCollection(String SearchParameter,String name) {
        Collection coll = new Collection();
        String qualquercoisa = coll.returnSubCollectionName(name);
        for (Product product : products) {
            try {
                if (product.getName().equalsIgnoreCase(SearchParameter)) {
                    product.setSubCollectionName(qualquercoisa);
                    if (product.getSubCollectionName().equalsIgnoreCase(qualquercoisa)) {
                        System.out.println("Product's name: " + product.getName()+ "\nProduct's price: " + product.getPrice() + "\nProduct's description: " + product.getDescription());
                        break;
                    }
                }
            } catch (Exception e) {
                System.out.println("Product not found");
            }
        }
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
