/**
 * Last Updated: January 20, 2020
 * A class that defines what a portfolio is and how it works.
 */

public class Portfolio
{

    public double cashLeftover = 25000;     //cold hard cash. changed in main.
    public Sector[] chosenDivisions; //chosen in main file, taken from a temp array that stores all possible choices.
    private String name;
    private int daysOpened;
    private double totalProfitLoss;
    private double moneyInvested;
    private int trades;
    private double dailyProfit;

    // the number of elements is open to change.

    public Portfolio(String nm, Sector[] chosen)
    {
        name = nm;
        chosenDivisions = chosen;
        totalProfitLoss = 0;
        moneyInvested = 0;
        trades = 8;
    }

    //Accessors
    public String getSectors()
    {
        String str = "";

        for (int i = 0; i < chosenDivisions.length; i++)
        {
            str +="\t" + (i + 1) + ". " + "「" + chosenDivisions[i].getName()+ "」" + "\n";
        }

        return str;
    }
    public String getName()
    {
        return name;
    }

    public void totalProfitLossCalculation()
    {

        totalProfitLoss += dailyProfit;

    }

    public double getTotalProfitLoss(){
        return totalProfitLoss;
    }

    public double getDailyProfit()
    {
        //printed at the end of each day.
        double daily = 0;

        for (int i = 0; i < chosenDivisions.length; i++)
        {
            daily += chosenDivisions[i].getDailyProfit();
        }

        dailyProfit = daily;
        return daily;
    }

    public double getDailyProfitSaved(){
        return dailyProfit;
    }

    public double getMoneyInvested()
    {
        moneyInvested = 0;

        for (int i = 0; i < chosenDivisions.length; i++)
        {
            moneyInvested += chosenDivisions[i].getSectorCapital();
        }

        return moneyInvested;
    }

    public double getCashLeftover()
    {
        return cashLeftover;
    }

    public int getTrades()
    {
        return trades;
    }

    public double getTotalCapital()
    {

        double totalCapital = getCashLeftover() + getMoneyInvested();

        return totalCapital;
    }

    public Sector[] getChosenDivisions()
    {
        return chosenDivisions;
    }

    public int getDaysOpened()
    {
        return daysOpened;
    }

    //Mutators
    public void setSectors(Sector[] sectorArray)
    {
        chosenDivisions = sectorArray;
    }

    public void setName(String nm)
    {
        name = nm;
    }


    public void updateTrades()
    {
        trades--;
    }

    public String toString()
    {
        String str = "";

        for (int i = 0; i < chosenDivisions.length; i++)
        {
            str += (i + 1) + " " + chosenDivisions[i].toString();
        }

        return str;

    }

    public void updateSectors()
    {
        for (int i = 0; i < chosenDivisions.length; i++)
        {
            chosenDivisions[i].updateAllSectorStocks();
        }
    }

    public void activateRegion(boolean active, int rnd)
    {

        //Reset all stocks to active
        for (int i = 0; i < chosenDivisions.length; i++)
        {
            for (int j = 0; j < chosenDivisions[i].getInstruments().length; j++)
            {
                if (chosenDivisions[i].getInstruments()[j] != null)
                {
                    chosenDivisions[i].getInstruments()[j].setActive(true);
                }
            }

        }

        for (int i = 0; i < chosenDivisions.length; i++)
        {
            for (int j = 0; j < chosenDivisions[i].getInstruments().length; j++)
            {
                if (chosenDivisions[i].getInstruments()[j] != null)
                {
                    if (rnd == 1 || rnd == 2)
                    {
                        if (chosenDivisions[i].getInstruments()[j].getRegion() == 'N')
                        {
                            chosenDivisions[i].getInstruments()[j].setActive(active);
                        }
                    }
                    else if (rnd == 3 || rnd == 4)
                    {
                        if (chosenDivisions[i].getInstruments()[j].getRegion() == 'E')
                        {
                            chosenDivisions[i].getInstruments()[j].setActive(active);
                        }
                    }
                    else if (rnd == 5 || rnd == 6)
                    {
                        if (chosenDivisions[i].getInstruments()[j].getRegion() == 'A')
                        {
                            chosenDivisions[i].getInstruments()[j].setActive(active);
                        }
                    }
                    else if (rnd == 7 || rnd == 8)
                    {
                        if (chosenDivisions[i].getInstruments()[j].getRegion() == 'F')
                        {
                            chosenDivisions[i].getInstruments()[j].setActive(active);
                        }
                    }
                    else if (rnd == 9 || rnd == 10)
                    {
                        if (chosenDivisions[i].getInstruments()[j].getRegion() == 'O')
                        {
                            chosenDivisions[i].getInstruments()[j].setActive(active);
                        }
                    }
                }
            }

        }

    }

    public void resetTrades()
    {
        trades = 8;
    }

    public void updateDaysOpened()
    {
        daysOpened++;
        for (int i = 0; i < chosenDivisions.length; i++)
        {
            for (int u = 0; u < chosenDivisions[i].getInstruments().length; u++)
            {
                if (chosenDivisions[i].getInstruments()[u] != null)
                {
                    chosenDivisions[i].getInstruments()[u].updateDays();
                }
            }
        }
    }

    public void updateAllBeginDayPrice(){
        for(int i = 0; i < chosenDivisions.length; i++){
            chosenDivisions[i].updateBeginDayPrice();
        }
    }




}
