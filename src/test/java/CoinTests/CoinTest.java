package CoinTests;

import VendingMachineProject.Coin.Coin;
import VendingMachineProject.Coin.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CoinTest {

    Coin coin;

    @Before
    public void before(){
        coin = new Coin(CoinType.FiftyPence);
    }

    @Test
    public void coinHasCoinType(){
        assertEquals(CoinType.FiftyPence, coin.getCoinType());
    }

    @Test
    public void coinTypeHasValue(){
        assertEquals(50, coin.getCoinType().getCoinValue());
    }
}
