package entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class SubCollection extends Collection{


    public SubCollection(String name, String description, Set<String> keywords, MainCollection mainCollection) {
        super(name, description, keywords);
    }

    public SubCollection() {

    }

    public Set<SubCollection> getSubCollectionList() {
        subCollectionList.stream().findAny().toString();
        return subCollectionList;
    }

    public SubCollection createASubCollection(SubCollection subCollection){
        subCollectionList.add(subCollection);
        return subCollection;
    }

    public void searchForAProductInASubCollection(Set<Product> products, SubCollection subCollection, String SearchParameter){
        for(Product product : products){
            if(product.getSubCollectionName().equalsIgnoreCase(subCollection.getNameCollection())){
                if(product.getName().equalsIgnoreCase(SearchParameter)){
                    System.out.println(product.getName());
                    break;
                } System.out.println("Not found");
            }
        }
    }

    public void ListAllProductsInASubCollection(Set<Product> products, SubCollection subCollection){
        List<Product> products1 = new ArrayList<>();
        for(Product product : products){
            if(product.getSubCollectionName().equalsIgnoreCase(subCollection.getNameCollection())){
                products1.add(product);
            }
        }
        if(products1.size()>0){
            System.out.println(products1);
        }else{
            System.out.println("Empty");
        }
    }

    public boolean existSubCollection(String subCollectionName){
        return  subCollectionList.contains(subCollectionName);
    }
    public boolean existCollection(String collectionName){
        return  subCollectionList.contains(collectionName);
    }

    @Override
    public String toString() {
        return "SubCollection: " +
                "Subcollection's name: " + nameCollection + '\'' +
                ", subcollection's description: " + descriptionCollection + '\'' +
                ", keywords: " + keywordsCollection +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}


