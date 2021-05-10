import entities.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {

    @Test
    @DisplayName("Should create a product")
    public void shouldCreateAProduct(){
        Product product = new Product();
        product.setName("kiko");
        product.setPrice(21);
        product.setQuantity(1);
        product.setDescription("Yes");


        assertEquals("kiko", product.getName());
        if(product.getName().equalsIgnoreCase("kiko")){
            System.out.println("Passed");
        }else{
            System.out.println("Error");
        }
    }
    @Test
    @DisplayName("Should return an product")
    public void searchAProduct(){
        Product product = new Product();
        product.setName("Exemplo");
        product.setPrice(11);
        product.setDescription("Exemplo2");

    // trocar os methods de voidX
        //

    }



}
