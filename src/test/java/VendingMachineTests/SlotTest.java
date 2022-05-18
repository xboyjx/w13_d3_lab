package VendingMachineTests;

import VendingMachineProject.Product.Product;
import VendingMachineProject.Product.ProductType;
import VendingMachineProject.VendingMachine.Slot;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SlotTest {

    Slot slot;
    Product product;

    @Before
    public void before(){
        slot = new Slot("A1");
        product = new Product(ProductType.Cola);
    }

    @Test
    public void slotHasCode(){
        assertEquals("A1", slot.getSlotCode());
    }

    @Test
    public void slotHasStockList(){
        assertEquals(0, slot.getStock().size());
    }

    @Test
    public void slotCanAddStock(){
        slot.addStock(product);
        assertEquals(1, slot.getStock().size());
    }

    @Test
    public void canRemoveStock(){
        slot.addStock(product);
        slot.sellProduct();
        assertEquals(0, slot.getStock().size());
    }
}
