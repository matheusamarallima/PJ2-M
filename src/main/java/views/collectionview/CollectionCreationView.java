package views.collectionview;

import entities.Collection;
import entities.SubCollection;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class CollectionCreationView {

    static Scanner sc = new Scanner(System.in);

    public void insertSubCollection() {

        SubCollection subs = new SubCollection();
        System.out.println("Insert the product's SubCollection's name:");
        subs.setNameCollection(sc.nextLine());
        System.out.println("SubCollection Description");
        subs.setDescriptionCollection(sc.nextLine());

        System.out.println("Keywords: ");
        Set<String> keywords = new HashSet<>();
        for(int c = 0; c < 6; c++){
            System.out.println("Enter the keyword");
            System.out.println("Number: " + (c + 1));
            keywords.add(sc.nextLine());
        }subs.setKeywordsCollection(keywords);

         subs.createASubCollection(subs);
        System.out.println("SubCollection created!");

    }

    public void insertCollection(){

        Collection coll = new Collection;
        System.out.println("Insert the product's Collection's name:");
        coll.setNameCollection(sc.nextLine());
        System.out.println("Insert the product's Collection's description");
        coll.setDescriptionCollection(sc.nextLine());

        System.out.println("Keywords: ");
        Set<String> keywords = new HashSet<>();
        for(int c = 0; c < 6; c++){
            System.out.println("Enter the keyword");
            System.out.println("Number: " + (c + 1));
            keywords.add(sc.nextLine());
        }coll.setKeywordsCollection(keywords);

        coll.createCollection(coll);
        System.out.println("Collection created!");
    }

}
