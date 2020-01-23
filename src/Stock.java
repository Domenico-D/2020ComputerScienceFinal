/**
 * Last Updated: Jan 19, 2020
 * Defines what a stock is, and how it can be manipulated within a sector.
 */

import java.text.NumberFormat;
import java.util.Random;

public class Stock  {

    private Random random =  new Random();
    private String name;
    private char region;
    private int daysOwned;
    private double sharesOwned;
    private double beginDayPrice;
    private double currentPrice;
    private double priceWhenBought;
    //max volatility of 0.15
    private double volatility;
    private boolean active;

    //track daily price profit with a variable at the start of each day.
    public Stock(){

    }

    public Stock(String nm, char location, double goingPrice, double risk, boolean openMarket) {
        name = nm;
        region = location;
        currentPrice = goingPrice;
        volatility = risk;
        active = openMarket;
    }


    public String getName()
    {
        return name;
    }
    public char getRegion()
    {
        return region;
    }
    public int getDaysOwned()
    {
        return daysOwned;
    }
    public double getSharesOwned()
    {
        return sharesOwned;
    }
    public double getCurrentPrice()
    {
        return currentPrice;
    }
    public double getPriceWhenBought()
    {
        return priceWhenBought;
    }
    public double getVolatility()
    {
        return volatility;
    }
    public double getProfitLoss()
    {
        return (currentPrice - priceWhenBought) * sharesOwned;
    }

    public void setName(String nm)
    {
        name = nm;
    }
    public void setRegion(char location)
    {
        region = location;
    }
    public void setCurrentPrice(double goingPrice)
    {
        currentPrice = goingPrice;
    }
    public void setVolatility(double risk)
    {
        volatility = risk;
    }

    public void updateDays()
    {
        daysOwned++;
    }

    public void buyShares() {
        //2500
        sharesOwned = 1000 / currentPrice;
        priceWhenBought = currentPrice;
    }
    public void sellShares(double sell)
    {
        sharesOwned -= sell;
    }

    public double getDayProfit() {
        double dayProfit = 0;

        dayProfit += (currentPrice-beginDayPrice)*sharesOwned;

        return dayProfit;
    }

    public String toString() {

        String str;

        NumberFormat nfMoney = NumberFormat.getCurrencyInstance();
        NumberFormat nfRound = NumberFormat.getInstance();

        //price, risk, open market
        str = String.format("%-25s %4s %8s %4s %6s",name,region,nfMoney.format(currentPrice),nfRound.format(volatility),active+"\n");

        return str;
    }

    public void updateStockPrice(){

        double increase = currentPrice * volatility;
        int chance =  random.nextInt(10) + 1;

        if(volatility > 0.1 ){
            //Run if volatility is high
            if(chance > 4){
                currentPrice += increase;
            }else{
                currentPrice -= increase;
            }
        }
        else if(volatility > 0.06){
            //Run if volatility is medium
            if(chance > 2){
                currentPrice += increase;
            }else{
                currentPrice -= increase;
            }
        }
        else{
            //Run if volatility is low
            if(chance > 1){
                currentPrice += increase;
            }else{
                currentPrice -= increase;
            }
        }

    }

    public void updateStockPriceDay(){

       //At the end of the day update multiple times for overnight affect
        for(int i = 0; i < 5; i++ ){
            updateStockPrice();
        }

    }

    public double takeProfitLoss(){

        double cash = currentPrice * sharesOwned;

        return cash;
    }


}
