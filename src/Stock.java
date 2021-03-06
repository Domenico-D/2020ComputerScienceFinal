/**
 * Defines what a stock is, and how it can be manipulated within a sector.
 */

import java.text.NumberFormat;
import java.util.Random;

public class Stock
{

    private Random random = new Random();
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
    public Stock()
    {
        name = " ";
        region = ' ';
        currentPrice = 0;
        volatility = 0.0;
        active = false;
        priceWhenBought = 0;
        beginDayPrice = 0;
    }

    public Stock(String nm, char location, double goingPrice, double risk, boolean openMarket)
    {
        name = nm;
        region = location;
        currentPrice = goingPrice;
        volatility = risk;
        active = openMarket;
        priceWhenBought = goingPrice;
        beginDayPrice = goingPrice;
    }


    public String getName()
    {
        return name;
    }

    public void setName(String nm)
    {
        name = nm;
    }

    public char getRegion()
    {
        return region;
    }

    public void setRegion(char location)
    {
        region = location;
    }

    public double getCurrentPrice()
    {
        return currentPrice;
    }

    public void setCurrentPrice(double goingPrice)
    {
        currentPrice = goingPrice;
        priceWhenBought = goingPrice;
        beginDayPrice = goingPrice;
    }

    public double getVolatility()
    {
        return volatility;
    }

    public void setVolatility(double risk)
    {
        volatility = risk;
    }

    public double getProfitLoss()
    {
        return (currentPrice - priceWhenBought) * sharesOwned;
    }

    public double getSharesOwned()
    {
        return sharesOwned;
    }

    public double getPriceWhenBought()
    {
        return priceWhenBought;
    }

    public boolean getActive()
    {
        return active;
    }

    public void setActive(boolean bool)
    {
        active = bool;
    }

    public double getTotal()
    {
        double total = (getPriceWhenBought() * sharesOwned) + getProfitLoss();

        return total;
    }

    public double getDayProfit()
    {
        double dayProfit = 0;

        dayProfit += (currentPrice - beginDayPrice) * sharesOwned;

        return dayProfit;
    }

    public void updateDays()
    {
        daysOwned++;
    }

    public void buyShares()
    {
        sharesOwned = 1000 / currentPrice;
        priceWhenBought = currentPrice;

    }

    public void buyShares(double shares, double newCurrentPrice)
    {
        sharesOwned = shares;
        priceWhenBought = newCurrentPrice;
    }

    public String toString()
    {

        String str;

        NumberFormat nfMoney = NumberFormat.getCurrencyInstance();
        NumberFormat nfRound = NumberFormat.getInstance();


        str = String.format("%9s %-25s %-8s %-15s %10s %10s %15s", "", name, region, nfMoney.format(currentPrice), nfRound.format(volatility), active, daysOwned + "\n");

        return str;
    }

    public void updateStockPrice()
    {

        double increase = currentPrice * volatility;
        int chance = random.nextInt(10) + 1;

        if (volatility > 0.1)
        {
            //Run if volatility is high
            if (chance > 4)
            {
                currentPrice += increase;
            }
            else
            {
                currentPrice -= increase;
            }
        }
        else if (volatility > 0.06)
        {
            //Run if volatility is medium
            if (chance > 2)
            {
                currentPrice += increase;
            }
            else
            {
                currentPrice -= increase;
            }
        }
        else
        {
            //Run if volatility is low
            if (chance > 1)
            {
                currentPrice += increase;
            }
            else
            {
                currentPrice -= increase;
            }
        }

    }

    public void updateBeginDayPrice()
    {
        beginDayPrice = currentPrice;
    }


}
