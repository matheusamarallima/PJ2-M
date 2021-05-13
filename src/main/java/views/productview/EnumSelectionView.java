package views.productview;

import entities.Pants;
import enums.*;

import java.util.Scanner;

public class EnumSelectionView {

    static Scanner sc = new Scanner(System.in);

    public static boolean variantSneakerMenu(Sneakers sneakers) {

        boolean allComplete = false;
        try {
            System.out.println("Product Variants: ");
            System.out.println("Colors BLUE, RED, GREEN, BLACK, WHITE");
            System.out.println("Colors: ");
            sneakers.setColor(Color.valueOf(sc.nextLine().toUpperCase()));

            System.out.println("Gender Female or Male");
            System.out.println("Gender: ");
            sneakers.setGender(Gender.valueOf(sc.nextLine().toUpperCase()));

            System.out.println("Sizes available 38, 40, 42, 44, 46");
            System.out.println("Size: ");
            sneakers.setSneakersSize(SneakersSize.valueOf("_" + sc.nextLine().toUpperCase()));

            System.out.println("Activity: CASUALFIT, SOCIALCLOTHING, GYM, FOOTBALL, RUNNING, SWIMMING");
            System.out.println("Activity: ");
            sneakers.setActivity(Activity.valueOf(sc.nextLine().toUpperCase()));


            if (sneakers.getActivity() != null) {
                allComplete = true;
            }
        } catch (Exception err) {
            System.err.println("Option Unavailable");
        }
        return allComplete;
    }

    public static boolean variantTShirtMenu(TShirt tShirt) {

        boolean allComplete = false;
        try {
            System.out.println("Product Variants: ");
            System.out.println("Colors BLUE, RED, GREEN, BLACK, WHITE");
            System.out.println("Color: ");
            tShirt.setColor(Color.valueOf(sc.nextLine().toUpperCase()));

            System.out.println("Gender Female or Male");
            System.out.println("Gender: ");
            tShirt.setGender(Gender.valueOf(sc.nextLine().toUpperCase()));

            System.out.println("Sizes available XS, S, M, L, XL, XXL");
            System.out.println("Size: ");
            tShirt.settShirtSize(TShirtSize.valueOf(sc.nextLine().toUpperCase()));

            System.out.println("Sleeve 'Short' or 'Long'");
            System.out.println("Sleeve type: ");
            tShirt.setVariantType(VariantType.valueOf(sc.nextLine().toUpperCase()));


            if (tShirt.getVariantType() != null) {
                allComplete = true;
            }
        } catch (Exception err) {
            System.err.println("Option Unavailable");
        }
        return allComplete;
    }

    public static boolean PantsMenu(Pants pants) {

        boolean allComplete = false;
        try {
            System.out.println("Product Variants: ");
            System.out.println("Gender Female or Male");
            System.out.println("Gender: ");
            pants.setGender(Gender.valueOf(sc.nextLine().toUpperCase()));

            System.out.println("Sizes available XS, S, M, L, XL, XXL");
            System.out.println("Size: ");
            pants.setPantsSize(PantsSize.valueOf(sc.nextLine().toUpperCase()));

            System.out.println("Materials: COTTON, SILK, LINEN, WOOL, LEATHER");
            System.out.println("Pants material: ");
            pants.setMaterials(Materials.valueOf(sc.nextLine().toUpperCase()));


            if (pants.getMaterials() != null) {
                allComplete = true;
            }
        } catch (Exception err) {
            System.err.println("Option Unavailable");
        }
        return allComplete;
    }
}
