package entities;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Collection {

    public static Set<MainCollection> mainCollectionList = new HashSet<>();
    public static Set<SubCollection> subCollectionList = new HashSet<>();

    String nameCollection;
    String descriptionCollection;
    Set<String> keywordsCollection;

    public Collection() {
    }

    public Collection(String nameCollection, String descriptionCollection,
                      Set<String> keywordsCollection) {
        this.nameCollection = nameCollection;
        this.descriptionCollection = descriptionCollection;
        this.keywordsCollection = keywordsCollection;
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

    public String returnSubCollectionName(String subname){
        for(SubCollection subCollection : subCollectionList){
            if(subCollection.getNameCollection().equalsIgnoreCase(subname)){
                return subCollection.getNameCollection();
            }System.out.println("Subcollection not found");
        }
        return null;
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