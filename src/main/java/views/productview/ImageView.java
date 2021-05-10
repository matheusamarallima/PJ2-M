package views.productview;

import entities.Image;
import jdk.jfr.internal.tool.Main;
import views.mainView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImageView {


    public void addImage(){

        List<Image> images = new ArrayList<Image>();
        mainView main = new mainView();
        Scanner sc = new Scanner(System.in);

        int counter;
        System.out.println("Enter the quantity of photos to be added, maximum of 5: ");
        counter = sc.nextInt();
        sc.nextLine();
        if(counter > 5){
            System.out.println("Can't be more than 5");
            mainView.mainMenu();
        }

        for(int c = 0; c < counter; c++){
            Image image2 = new Image();
            System.out.println("Please enter the name of the image: ");
            image2.setImageName(sc.nextLine());
            System.out.println("Please enter the location of the image: ");
            image2.setUrl(sc.nextLine());
            images.add(image2);


        }
        System.out.println("Images created");






    }



}
