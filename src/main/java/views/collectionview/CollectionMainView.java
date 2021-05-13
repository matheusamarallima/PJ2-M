package views.collectionview;

import entities.Product;
import entities.SubCollection;

import java.util.InputMismatchException;
import java.util.Scanner;

import static views.mainView.mainMenu;

public class CollectionMainView {
    static CollectionCreationView coll = new CollectionCreationView();
    static Scanner sc = new Scanner(System.in);
    static MainCollection mainColl  = new MainCollection();
    static SubCollection subs = new SubCollection();
    static Product product = new Product();

    public static void collection() {

        int option = 99;
        do {
            try {
                System.out.println("Enter the number that corresponds to one of the options below");
                System.out.println("1 - Create a main collection");
                System.out.println("2 - Create a SubCollection");
                System.out.println("3 - List all collections");
                System.out.println("4 - Search product in subcollection");
                System.out.println("0 - Back to main menu");

                option = sc.nextInt();
                sc.nextLine();
            } catch (InputMismatchException | NumberFormatException err) {
                System.out.println("Invalid entry");
                mainMenu();
            }

            switch (option) {
                case 1:
                    coll.insertCollection();
                    break;
                case 2:
                    coll.insertSubCollection();
                    break;
                case 3:
                    mainColl.listAllCollections();
                    break;
                case 4:
                    System.out.println("Enter the name of the subcollection");
                    String subsname = sc.nextLine();
                    System.out.println("Type the term you're looking for");
                    String SearchParameter = sc.nextLine();
                    product.searchForAProductInASubCollection(SearchParameter, subsname);
                    break;
                case 0:
                    mainMenu();
                    break;
                default:
                    break;
            }
        } while (option != 0);
    }
}

