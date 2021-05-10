package entities;

import java.util.*;


public class MainCollection extends Collection {

    public MainCollection() {
    }

    public MainCollection(String name, String description, Set<String> keywords) {
        super(name, description, keywords);
    }

    public Set<MainCollection> getMainCollectionList() {
        return mainCollectionList;
    }

    public void createCollection(MainCollection mainCollection){
        mainCollectionList.add(mainCollection);
    }

    public void listAllCollections(){
        System.out.println(getMainCollectionList()) ;
        SubCollection subs = new SubCollection();
        System.out.println(subCollectionList.toString());
    }

    @Override
    public String toString() {
        return
                "Main Collection's name: " + nameCollection + '\'' +
                ", collection's description: '" + descriptionCollection + '\'' +
                ", collection's keywords: " + keywordsCollection +
                " ";
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



