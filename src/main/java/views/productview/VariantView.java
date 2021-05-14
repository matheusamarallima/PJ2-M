package views.productview;

import entities.*;
import views.collectionview.CollectionCreationView;

import java.util.InputMismatchException;
import java.util.Scanner;

import static views.mainView.mainMenu;

public class VariantView {

    CollectionCreationView collectionCreationView = new CollectionCreationView();
    static Collection collection = new Collection();
    static SubCollection subCollection = new SubCollection();
    static Scanner sc = new Scanner(System.in);

    public static void optionsForProductView() {
        int option = 99;
        do {
            try {
                System.out.println("------------------------------");
                System.out.println("Select one of the following options\n");
                System.out.println("1-- Create a product");
                System.out.println("0-- Exit");
                System.out.println("------------------------------");
                option = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException | NumberFormatException err) {
                System.out.println("Invalid entry");
                mainMenu();
            }

            switch (option) {
                case 1:
                    createAnotherTypeOfProduct();
                    break;
                default:
                    break;
            }
        } while (option != 0);
    }


    public static void createAnotherTypeOfProduct() {
        System.out.println("------------------------------");
        System.out.println("Creating a whole different product\n");
        System.out.println("Enter the name of the product");
        String name = sc.nextLine();
        double price = 0;
        try {
            System.out.println("Enter the product's price");
            price = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException i) {
            System.out.println("You can only add numbers");
            createAnotherTypeOfProduct();
        }
        System.out.println("Enter the product's description");
        String description = sc.nextLine();
        int quantity = 0;
        try {
            System.out.println("Enter the product's quantity");
            quantity = sc.nextInt();
            sc.nextLine();
        } catch (InputMismatchException | NumberFormatException err) {
            System.out.println("Invalid entry");
            createAnotherTypeOfProduct();
        }
        Product product = new Product(name, price, description, quantity, subCollection.getNameCollection());

        ImageView imageView = new ImageView();
        imageView.addImage();

        CollectionCreationView coll = new CollectionCreationView();
        coll.insertCollection();
        coll.insertSubCollection();


        Attributes att = new Attributes();
        att.setAtbName("Teste de atributo");

        product.createAnAttribute(att);


        Values val = new Values();
        val.setValueName("Teste de value");



        collection.createProduct(product);

        System.out.println("Product created!");
        mainMenu();

    }
}


