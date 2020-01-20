/**
 * Last Updated: January 19, 2020
 * A class that defines what a portfolio is and how it works.
 */

public class Portfolio {

    private String name;
    private double totalProfitLoss;
    private double moneyInvested;
    private double cashLeftover;     //cold hard cash.
    private double dailyProfit;      //printed at the end of each day.
    private double capital;
    private int trades;

    private Sector[] chosenDivisions; //chosen in main file, taken from a temp array that stores all possible choices.
    // the number of elements is open to change.
    private Sector[] availableDivisions; //rest of divisions, not chosen in temp array.

    public Portfolio(String nm, Sector[]chosen, Sector[]available)
    {
        name = nm;
        chosenDivisions = chosen;
        availableDivisions = available;
        totalProfitLoss = 0;
        moneyInvested = 0;
        cashLeftover = 10000;
        dailyProfit = 0;
        capital = moneyInvested + cashLeftover;
        trades = 8;
    }

    public String getName()
    {
        return name;
    }
    public double getTotalProfitLoss()
    {
        double tempTotalProfit=0;
        for(int i=0; i<chosenDivisions.length; i++)
        {
            tempTotalProfit += chosenDivisions[i].getSectorProfitLoss();
        }
        totalProfitLoss = tempTotalProfit;
        return totalProfitLoss;
    }
    public double getMoneyInvested()
    {
        return moneyInvested;
    }
    public double getCashLeftover()
    {
        return cashLeftover;
    }
    public double getDailyProfit()
    {
        return dailyProfit;
    }
    public double getCapital()
    {
        return capital;
    }
    public int getTrades()
    {
        return trades;
    }

    //NEED TO IMPLEMENT A PRINT FOR THE SECTORS.

    public void setName(String nm)
    {
        name = nm;
    }

}
