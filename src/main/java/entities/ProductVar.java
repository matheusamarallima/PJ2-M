package entities;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductVar {

    Scanner sc = new Scanner(System.in);


    List<String> activityList = new ArrayList<>();
    List<String> colorList = new ArrayList<>();
    List<String> genderList = new ArrayList<>();
    List<String> materialsList = new ArrayList<>();
    List<String> clothsSizeList = new ArrayList<>();
    List<String> tShirtTypesList = new ArrayList<>();




    public ProductVar() {
        activityPreset();
        colorPreset();
        genderPreset();
        materialsPreset();
        clothsSizePreset();
        tShirtTypes();


    }

    private boolean activityPreset(){
        String fill = "a";
        if(fill == "a"){


            activityList.add("Casual");
            activityList.add("Social Clothing");
            activityList.add("Gym");
            activityList.add("Football");
            activityList.add("Running");
            activityList.add("Swimming");
            return true;
        }

        return false;
    }
    private boolean colorPreset(){
        String fill = "a";
        if(fill == "a"){
            colorList.add("Blue");
            colorList.add("Red");
            colorList.add("Green");
            colorList.add("Black");
            colorList.add("White");
            return true;
        }

        return false;
    }

    private boolean genderPreset(){
        String fill = "a";
        if(fill == "a"){
            genderList.add("Male");
            genderList.add("Female");
            return true;
        }

        return false;
    }

    private boolean materialsPreset(){
        String fill = "a";
        if(fill == "a"){
            materialsList.add("Cotton");
            materialsList.add("Silk");
            materialsList.add("Linen");
            materialsList.add("Wool");
            materialsList.add("Leather");
            return true;
        }

        return false;
    }
    private boolean clothsSizePreset(){
        String fill = "a";
        if(fill == "a"){
            clothsSizeList.add("XSmall");
            clothsSizeList.add("Small");
            clothsSizeList.add("Medium");
            clothsSizeList.add("Large");
            clothsSizeList.add("X Large");
            clothsSizeList.add("XX Large");
            clothsSizeList.add("XXX Large");
            return true;
        }

        return false;
    }
    private boolean tShirtTypes(){
        String fill = "a";
        if(fill == "a"){
            tShirtTypesList.add("Long");
            tShirtTypesList.add("Short");

            return true;
        }

        return false;
    }


    public void testePrint(){
        System.out.println("Activity List:"  + activityList);
        System.out.println("Color List:"  + colorList);
        System.out.println("Gender List:"  + genderList);
        System.out.println("Materials List:"  + materialsList);
        System.out.println("Cloths sizes List:"  + clothsSizeList);
        System.out.println("T Shirts types List:"  + tShirtTypesList);


    }


}
