/**
 * Last Updated: January 20, 2020
 * A class that defines what a portfolio is and how it works.
 */

public class Portfolio {

    private String name;
    private double totalProfitLoss;
    private double moneyInvested;
    public double cashLeftover = 25000;     //cold hard cash. changed in main.
    private double capital;
    private int trades;

    public Sector[] chosenDivisions; //chosen in main file, taken from a temp array that stores all possible choices.
    // the number of elements is open to change.

    public Portfolio(String nm, Sector[]chosen) {
        name = nm;
        chosenDivisions = chosen;
        totalProfitLoss = 0;
        moneyInvested = 0;
        capital = moneyInvested + cashLeftover;
        trades = 8;
    }

    public void setSectors(Sector[] sectorArray){
        chosenDivisions = sectorArray;
    }

    public String getSectors(){
        String str = "";

        for(int i = 0; i < chosenDivisions.length; i++){
            str += (i + 1) + " " + chosenDivisions[i].getName() + "\n";
        }

        return str;
    }

    public String getName() {
        return name;
    }

    public double getTotalProfitLoss() {
        double tempTotalProfit=0;
        for(int i=0; i<chosenDivisions.length; i++)
        {
            tempTotalProfit += chosenDivisions[i].getSectorProfitLoss();
        }
        totalProfitLoss = tempTotalProfit;
        return totalProfitLoss;
    }

    public double getDailyProfit() {
        //printed at the end of each day.
        double dailyProfit = 0;

        for(int i = 0; i<chosenDivisions.length; i++)
        {
            dailyProfit += chosenDivisions[i].getDailyProfit();
        }

        return dailyProfit;
    }

    public double getMoneyInvested() {
        return moneyInvested;
    }

    public double getCashLeftover() {
        return cashLeftover;
    }

    public double getCapital() {
        return capital;
    }

    public int getTrades() {
        return trades;
    }

    public void setName(String nm) {
        name = nm;
    }

    public String getStocks(int choice){
        return chosenDivisions[choice].toString();
    }

    public String toString() {
        String str="";

        for(int i = 0; i<chosenDivisions.length;i++)
        {
            str+=chosenDivisions[i].toString();
        }

        return str;

    }

    public double calculateCapital


}
