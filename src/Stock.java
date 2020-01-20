/**
 * Last Updated: Jan 19, 2020
 * Defines what a stock is, and how it can be manipulated within a sector.
 */

import java.text.NumberFormat;

public class Stock {
    private String name;
    private char region;
    private int daysOwned;
    private double sharesOwned;
    private double beginDayPrice;
    private double currentPrice;
    private double priceWhenBought;
    private double volatility;
    private boolean active;

    //track daily price profit with a variable at the start of each day.

    public Stock(String nm, char location, double goingPrice, double risk, boolean openMarket)
    {
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

    public double getProfitLoss()
    {
        return (currentPrice - priceWhenBought) * sharesOwned;
    }

    public void updateDays()
    {
        daysOwned++;
    }

    public void buyShares(double purchase)
    {
        sharesOwned += purchase;
        priceWhenBought = currentPrice;
    }
    public void sellShares(double sell)
    {
        sharesOwned -= sell;
    }

    public double getDayProfit()
    {
        double dayProfit = 0;

        dayProfit += (currentPrice-beginDayPrice)*sharesOwned;

        return dayProfit;
    }

    public String toString()
    {

        String str;

        NumberFormat nfMoney = NumberFormat.getCurrencyInstance();
        NumberFormat nfRound = NumberFormat.getInstance();

        //price, risk, open market
        str = String.format("%25s %4s %8s %4s %6s",name,region,nfMoney.format(currentPrice),nfRound.format(volatility),active+"\n");

        return str;
    }


}
