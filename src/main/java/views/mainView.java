package views;

import views.collectionview.CollectionMainView;
import views.productview.ProductMainView;

import java.util.Scanner;

public class mainView {

    public static void mainMenu() {
    Scanner sc = new Scanner(System.in);
        int option = 99;

        do{
            try{
                System.out.println("------------------------------");
                System.out.println("Welcome to the main menu");
                System.out.println("Please select one of the following options: ");
                System.out.println("1 -- Product management menu");
                System.out.println("2 -- Collection management menu");
                System.out.println("0 -- Exit");
                System.out.println("------------------------------");
                option = sc.nextInt();
            }catch (Exception e){
                System.out.println("------------------------------");
                System.err.println("Invalid");
                System.out.println("------------------------------");
                mainMenu();
            }
            switch(option){
                case 1:
                    ProductMainView.productManagementMainView();
                    break;
                case 2:
                    CollectionMainView.collection();
                    break;
                case 0:
                    System.out.println("------------------------------");
                    System.out.println("Exiting");
                    System.out.println("------------------------------");
                    break;
                default:
                    break;
            }
        }while(option != 0);
    }
}
