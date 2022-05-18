package VendingMachineProject.Product;

public enum ProductType {

    Cola(100),
    Crisps(50),
    sweet(65);

    private final int productValue;

    ProductType(int productValue) {
        this.productValue = productValue;
    }

    public int getProductValue() {
        return productValue;
    }
}
