package views.productview;


import entities.Product;
import entities.SubCollection;

import java.util.InputMismatchException;
import java.util.Scanner;

import static views.mainView.mainMenu;
import static views.productview.VariantView.collection;

public class ProductMainView {

    static Scanner sc = new Scanner(System.in);
    static SubCollection subs = new SubCollection();

    public static void productManagementMainView() {

        Product product = new Product();
        int option = 99;

        do {
            try {
                System.out.println("------------------------------");
                System.out.println("Please select one of the following options: \n");
                System.out.println("1 -- Create product");
                System.out.println("2 -- Search a product by name");
                System.out.println("3 -- List all products");
                System.out.println("0 -- Back to main menu");
                System.out.println("------------------------------");

                option = sc.nextInt();
                sc.nextLine();
            }catch(InputMismatchException | NumberFormatException err){
                System.out.println("------------------------------");
                System.out.println("Invalid entry");
                System.out.println("------------------------------");
                mainMenu();
            }

            switch (option) {
                case 1:
                    VariantView.optionsForProductView();
                    break;
                case 2:
                    System.out.println("------------------------------");
                    System.out.println("Type the term you're looking for");
                    String term = sc.nextLine();
                    collection.searchForAProductInProducts(term);
                    System.out.println("------------------------------");
                    break;
                case 3:
                    System.out.println("------------------------------");
                    collection.ListAllProductsInProducts();
                    System.out.println("------------------------------");
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



