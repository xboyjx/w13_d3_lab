package ProductTests;

import VendingMachineProject.Product.Product;
import VendingMachineProject.Product.ProductType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ProductTest {

    Product product;

    @Before
    public void before(){
        product = new Product(ProductType.Cola);
    }

    @Test
    public void productHasProductType(){
        assertEquals(ProductType.Cola, product.getProductType());
    }

    @Test
    public void productTypeHasValue(){
        assertEquals(100, product.getProductType().getProductValue());
    }
}
