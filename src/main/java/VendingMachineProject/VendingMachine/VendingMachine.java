package VendingMachineProject.VendingMachine;

import VendingMachineProject.Coin.Coin;
import VendingMachineProject.Coin.CoinType;

import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Slot> slots;
    private int coinsBalance;
    private ArrayList<Coin> returnedCoins;

    public VendingMachine() {
        this.slots = new ArrayList<>();
        this.coinsBalance = 0;
        this.returnedCoins = new ArrayList<>();
    }

    public ArrayList<Slot> getSlots() {
        return slots;
    }

    public ArrayList<Coin> getReturnedCoins() {
        return returnedCoins;
    }

    public void addSlots(Slot slot){
        this.slots.add(slot);
    }

    public int getCoinsBalance() {
        return coinsBalance;
    }

    public void addToReturnedCoins(Coin coin){
        returnedCoins.add(coin);
    }

    public void addCoin(Coin coin){
        if(coin.getCoinType() == CoinType.TwoPence || coin.getCoinType() == CoinType.OnePence){
            addToReturnedCoins(coin);
        }
        else{
            this.coinsBalance += coin.getCoinType().getCoinValue();
        }
    }

    public Slot turnStringToSlot(String slotCode){
        for( int i =0; i<slots.size(); i++){
            if (slots.get(i).getSlotCode() == slotCode){
                return slots.get(i);
            }
        }
        return null;
    }

    public void sellProduct(Slot slot){
        if(slots.contains(slot)){
            if(coinsBalance >= slot.getStock().get(0).getProductType().getProductValue()){
                coinsBalance -= slot.getStock().get(0).getProductType().getProductValue();
                slot.getStock().remove(0);
            }
        }
    }

}
