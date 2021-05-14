package entities;

import java.util.*;

public class Collection {

    public static Set<Collection> collectionList = new HashSet<>();
    String nameCollection;
    String descriptionCollection;
    Set<String> keywordsCollection;
    List<SubCollection> subCollectionList = new ArrayList<>();
    List<Product> productsList = new ArrayList<>();

    public Collection() {
    }

    public Collection(String nameCollection, String descriptionCollection,
                      Set<String> keywordsCollection) {
        this.nameCollection = nameCollection;
        this.descriptionCollection = descriptionCollection;
        this.keywordsCollection = keywordsCollection;
    }

    public static Set<Collection> getCollectionList() {
        return collectionList;
    }

    public static void setCollectionList(Set<Collection> collectionList) {
        Collection.collectionList = collectionList;
    }

    public String getNameCollection() {
        return nameCollection;
    }

    public void setNameCollection(String nameCollection) {
        this.nameCollection = nameCollection;
    }

    public String getDescriptionCollection() {
        return descriptionCollection;
    }

    public void setDescriptionCollection(String descriptionCollection) {
        this.descriptionCollection = descriptionCollection;
    }

    public Set<String> getKeywordsCollection() {
        return keywordsCollection;
    }

    public void setKeywordsCollection(Set<String> keywordsCollection) {
        this.keywordsCollection = keywordsCollection;
    }


    public void createProduct(Product product) {
        productsList.add(product);
        System.out.println(productsList.toString());
    }


    public void ListAllProductsInProducts() {
        List<String> products1 = new ArrayList<>();
        for (Product product : productsList) {
            if (product.getName() != null) {
                products1.add("Product name: " + product.getName());
                products1.add("Product description: " + product.getDescription());
                products1.add("Product variant" + product.getAttributesList());
            }
        }
        if (products1.size() > 0) {
            System.out.println(products1);
        } else {
            System.out.println("Empty");
        }
    }


    public void searchForAProductInProducts(String SearchParameter) {
        for (Product product : productsList) {
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
        for (Product product : productsList) {
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



    public void listAllCollections(){
        System.out.println(getCollectionList()) ;
        SubCollection subs = new SubCollection();
        System.out.println(subCollectionList.toString());
    }



    public String returnSubCollectionName(String subname){
        for(SubCollection subCollection : subCollectionList){
            if(subCollection.getNameCollection().equalsIgnoreCase(subname)){
                return subCollection.getNameCollection();
            }System.out.println("Subcollection not found");
        }
        return null;
    }

    public SubCollection createASubCollection(SubCollection subCollection){
        subCollectionList.add(subCollection);
        return subCollection;
    }



    @Override
    public String toString() {
        return "Collection: " +
                "Collection's name: " + nameCollection + '\'' +
                ", collection's description: '" + descriptionCollection + '\'' +
                ", keywords: " + keywordsCollection +
                " ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Collection)) return false;
        Collection that = (Collection) o;
        return Objects.equals(nameCollection, that.nameCollection) && Objects.equals(descriptionCollection, that.descriptionCollection) && Objects.equals(keywordsCollection, that.keywordsCollection);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameCollection, descriptionCollection, keywordsCollection);
    }
}