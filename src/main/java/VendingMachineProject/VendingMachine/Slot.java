package VendingMachineProject.VendingMachine;

import VendingMachineProject.Product.Product;

import java.util.ArrayList;

public class Slot {

    private ArrayList<Product> stock;
    private String slotCode;

    public Slot(String slotCode) {
        this.slotCode = slotCode;
        this.stock = new ArrayList<>();
    }

    public ArrayList<Product> getStock() {
        return stock;
    }

    public String getSlotCode() {
        return slotCode;
    }

    public void addStock(Product product){
        stock.add(product);
    }


//    If adding customer will need to return Product so that it can be given to customer
    public void sellProduct(){
        this.stock.remove(0);
    }
}
