package VendingMachineTests;

import VendingMachineProject.Coin.Coin;
import VendingMachineProject.Coin.CoinType;
import VendingMachineProject.Product.Product;
import VendingMachineProject.Product.ProductType;
import VendingMachineProject.VendingMachine.Slot;
import VendingMachineProject.VendingMachine.VendingMachine;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    VendingMachine vendingMachine;
    Coin coin;
    Slot slot;
    Product product;

    @Before
    public void before(){
        vendingMachine = new VendingMachine();
        coin = new Coin(CoinType.OnePence);
        slot = new Slot("A1");
        product = new Product(ProductType.Cola);
    }

    @Test
    public void vendingMachineHasSlots(){
        assertEquals(0, vendingMachine.getSlots().size());
    }

    @Test
    public void canAddSlots(){
        vendingMachine.addSlots(slot);
        assertEquals(1, vendingMachine.getSlots().size());
    }

    @Test
    public void vendingMachineHasCoinsBalance(){
        assertEquals(0, vendingMachine.getCoinsBalance());
    }

    @Test
    public void canAddCoins(){
        vendingMachine.addCoin(coin);
        assertEquals(1, vendingMachine.getReturnedCoins().size());
    }

    @Test
    public void canConvertStringToSlot(){
        vendingMachine.addSlots(slot);
        assertEquals(slot, vendingMachine.turnStringToSlot("A1"));
    }

    @Test
    public void canSellProduct(){
        vendingMachine.addCoin(coin);
        slot.addStock(product);
        vendingMachine.addSlots(slot);
        vendingMachine.sellProduct(vendingMachine.turnStringToSlot("A1"));
        assertEquals(0, vendingMachine.getCoinsBalance());
    }

}
