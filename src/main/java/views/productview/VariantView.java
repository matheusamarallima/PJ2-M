package views.productview;

import entities.*;
import views.collectionview.CollectionCreationView;

import java.util.InputMismatchException;
import java.util.Scanner;

import static views.mainView.mainMenu;

public class VariantView {

    CollectionCreationView collectionCreationView = new CollectionCreationView();
    static MainCollection mainCollection = new MainCollection();
    static SubCollection subCollection = new SubCollection();
    static Scanner sc = new Scanner(System.in);

    public static void optionsForProductView() {
        int option = 99;
        do {
            try {
                System.out.println("------------------------------");
                System.out.println("Select one of the following options\n");
                System.out.println("1-- Add a Sneaker");
                System.out.println("2-- Add a T-Shirt");
                System.out.println("3-- Add Pants");
                System.out.println("4-- Add a whole new product");
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
                    createSneakersMenu();
                    break;
                case 2:
                    createTshirtMenu();
                    break;
                case 3:
                    createPantsMenu();
                    break;
                case 4:
                    createAnotherTypeOfProduct();
                    break;
                default:
                    break;
            }
        } while (option != 0);
    }

    public static void createSneakersMenu() {
        System.out.println("------------------------------");
        System.out.println("Creating a sneaker\n");
        System.out.println("Enter the name of the product");
        String name = sc.nextLine();
        double price = 0;
        try {
            System.out.println("Enter the product's price");
            price = sc.nextDouble();
        } catch (InputMismatchException i) {
            System.out.println("You can only add numbers");
            createSneakersMenu();
        }
        sc.nextLine();
        System.out.println("Enter the product's description");
        String description = sc.nextLine();
        int quantity = 0;
        try {
            System.out.println("Enter the product's quantity");
            quantity = sc.nextInt();
        } catch (InputMismatchException | NumberFormatException err) {
            System.out.println("Invalid entry");
            createSneakersMenu();
        }
        System.out.println();

        Sneakers sneakers = new Sneakers();
        boolean allComplete;
        do {
            allComplete = EnumSelectionView.variantSneakerMenu(sneakers);
        } while (!allComplete);

        ImageView imageView = new ImageView();
        imageView.addImage();

        CollectionCreationView coll = new CollectionCreationView();
        coll.insertCollection();
        coll.insertSubCollection();

        Product product = new Product(name, price, description, quantity, subCollection.getNameCollection());

        product.createAProduct(product);

        System.out.println("Product created!");
        mainMenu();
    }

    public static void createTshirtMenu() {
        System.out.println("------------------------------");
        System.out.println("Creating a Tshirt\n");
        System.out.println("Enter the name of the product");
        String name = sc.nextLine();
        double price = 0;
        try {
            System.out.println("Enter the product's price");
            price = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException i) {
            System.out.println("You can only add numbers");
            createTshirtMenu();
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
            createTshirtMenu();
        }
        System.out.println();

        TShirt tShirt = new TShirt();
        boolean allComplete;
        do {
            allComplete = EnumSelectionView.variantTShirtMenu(tShirt);
        } while (!allComplete);

        ImageView imageView = new ImageView();
        imageView.addImage();

        CollectionCreationView coll = new CollectionCreationView();
        coll.insertCollection();
        coll.insertSubCollection();

        Product product = new Product(name, price, description, quantity, subCollection.getNameCollection());
        product.createAProduct(product);

        System.out.println("Product created!");
        mainMenu();
    }

    public static void createPantsMenu() {
        System.out.println("------------------------------");
        System.out.println("Creating a Pants\n");
        System.out.println("Enter the name of the product");
        String name = sc.nextLine();
        double price = 0;
        try {
            System.out.println("Enter the product's price");
            price = sc.nextDouble();
            sc.nextLine();
        } catch (InputMismatchException i) {
            System.out.println("You can only add numbers");
            createPantsMenu();
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
            createPantsMenu();
        }
        System.out.println();

        Pants pants = new Pants();
        boolean allComplete;
        do {
            allComplete = EnumSelectionView.PantsMenu(pants);
        } while (!allComplete);

        ImageView imageView = new ImageView();
        imageView.addImage();

        CollectionCreationView coll = new CollectionCreationView();
        coll.insertCollection();
        coll.insertSubCollection();

        Product product = new Product(name, price, description, quantity, subCollection.getNameCollection());
        product.createAProduct(product);

        System.out.println("Product created!");
        mainMenu();
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

        product.createAProduct(product);

        System.out.println("Product created!");
        mainMenu();

    }
}


