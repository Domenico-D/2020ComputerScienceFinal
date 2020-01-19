/**
 * Last Updated: Jan 19, 2020
 * Defines what a stock is, and how it can be manipulated within a sector.
 */

public class Stock {
    private String name;
    private char region;
    private int daysOwned;
    private double sharesOwned;
    private double currentPrice;
    private double priceWhenBought;
    private double volatility;
    private boolean active;

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

    public double getProfit()
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

}
