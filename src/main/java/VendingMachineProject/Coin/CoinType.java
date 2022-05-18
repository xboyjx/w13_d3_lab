package VendingMachineProject.Coin;

public enum CoinType {

    OnePence(1),
    TwoPence(2),
    FivePence(5),
    TenPence(10),
    TwentyPence(20),
    FiftyPence(50),
    OnePound(100),
    TwoPound(200);

    private final int coinValue;

    CoinType(int coinValue) {
        this.coinValue = coinValue;
    }

    public int getCoinValue() {
        return coinValue;
    }
}
