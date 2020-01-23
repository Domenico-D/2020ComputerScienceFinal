/**
 * Last Updated: January 20, 2020
 * Defines what a sector is, holding stocks that are then placed within a portfolio.
 */

import java.util.Arrays;
import java.util.Collections;

public class Sector {

    private String name;
    private double sectorProfitLoss;
    private char sectorVolatality;
    public Stock[] instruments;

    public Sector(String nm){
        name = nm;
    }

    public Sector(String nm, Stock[] stocks){

        name = nm;
        instruments = stocks;

    }

    public void setInstruments(Stock[] stocks){
        instruments = stocks;
    }

    //Add up profit from each of the Stocks and return
    public double getSectorProfitLoss() {

        double profitLoss = 0;

        for(int i = 0; i < instruments.length; i++ ){
            profitLoss += instruments[i].getProfitLoss();
        }

        sectorProfitLoss = profitLoss;

        return sectorProfitLoss;
    }

    //Gets the total Sector Volatility as a char to show the user the level of volatility
    public char getSectorVolatality() {

        //Constants to store volatility levels to determine char
        final double high = 0.1;
        final double medium = 0.06;

        //For loop to add up all of the volatility of each stock in the sector
        double volatilityTotal = 0;

        for(int i = 0; i < instruments.length; i++){

            volatilityTotal += instruments[i].getVolatility();

        }

        //Get average volatility
        double vAverage = volatilityTotal / instruments.length;

        //Check how high volatility is and assign it a char based on average velocity
        if(vAverage >= high){
            sectorVolatality = 'H';
        }
        else if(vAverage >= medium){
            sectorVolatality = 'M';
        }
        else{
            sectorVolatality = 'L';
        }

        return sectorVolatality;
    }

    //Adds a new stock to an empty slot and re organizes the array
    public void addStock(Stock newStock){

        for(int i = 0; i < instruments.length; i++){

            if(instruments[i] == null){
                instruments[i] = newStock;
                break;
            }
        }


    }

    //Removes a stock and reorganizez the array
    public void removeStock(int choice){

        instruments[choice] = null;

    }

    public double getDailyProfit(){
        double dailyProfit = 0;

        for(int i = 0; i<instruments.length; i++)
        {
            dailyProfit += instruments[i].getDayProfit();
        }
        return dailyProfit;
    }

    //NEED TO ADD getDailyProfit();

//    public void organize(){
//
//        Stock[] tempArrayStocks = new Stock[5];
//        double[] doubleArray = new double[5];
//        int counter = 0;
//
//        for(int i = 0; i < instruments.length; i++){
//            if(instruments[i] != null){
//                //Organize the array from objects to null
//                tempArrayStocks[counter] = instruments[i];
//                //Organize the array from Profit to null and multiply by one
//                if(instruments[i].getProfitLoss() !=0) {
//                    doubleArray[counter] = instruments[i].getProfitLoss() * -1;
//                }
//                else{
//                    doubleArray[counter]= instruments[i].getCurrentPrice() * -1;
//                }
//                counter++;
//            }
//        }
//        instruments = tempArrayStocks;
////
////        reverseOrder(doubleArray);
////
////        //Convert the array back to regular values which puts it in order by highest to lowest
////        for(int i = 0; i < doubleArray.length; i++){
////            doubleArray[i]*= -1;
////
////        }
////
////        for(int i = 0; i < tempArrayStocks.length; i++){
////
////            //use the the array sorted from objects to null to re order the main array from highest profit stock to lowest
////            if(tempArrayStocks[i] != null){
////
////                //Check each array slot that isnt null and check which highest to lowest slot it equals and set it to that slot in the main array
////                if(tempArrayStocks[i].getProfitLoss() == doubleArray[0]){
////                    instruments[0] = tempArrayStocks[i];
////                }
////                else if(tempArrayStocks[i].getProfitLoss() == doubleArray[1]){
////                    instruments[1] = tempArrayStocks[i];
////                }
////                else if(tempArrayStocks[i].getProfitLoss() == doubleArray[2]){
////                    instruments[2] = tempArrayStocks[i];
////                }
////                else if(tempArrayStocks[i].getProfitLoss() == doubleArray[3]){
////                    instruments[3] = tempArrayStocks[i];
////                }
////                else if(tempArrayStocks[i].getProfitLoss() == doubleArray[4]){
////                    instruments[4] = tempArrayStocks[i];
////                }
////            }else{
////                //Set all other sections to null that have been reorganized
////                instruments[i] = tempArrayStocks[i];
////            }
////        }
//    }

    private static void reverseOrder(double[] nums) {
        Arrays.sort(nums);
        double[] reverseSortedNum = new double[nums.length];
        for (int i = 0; i < nums.length; i++)
        {
            reverseSortedNum[i] = nums[nums.length - 1 - i];
        }
    }

    public void tradeStock(Stock newStock, Stock oldStock){

        for(int i = 0; i < instruments.length; i++){
            if(instruments[i] == oldStock){

                //Get Price and number of shares of New Stock
                double newStockPrice = newStock.getCurrentPrice();

                //Get Price and number of shares of old stock
                double oldStockPrice = instruments[i].getCurrentPrice();
                double oldNumShares = instruments[i].getCurrentPrice();

                //Calculate amount of new Stock Shares
                double newShares = (oldStockPrice * oldNumShares) / newStockPrice;

                //Wipe old stock from user sector and add new stock
                instruments[i] = null;
                instruments[i] = newStock;
                instruments[i].buyShares(newShares, newStockPrice);
            }
        }
    }

    public String getName(){
        return name;
    }

    //finish toString
    public String toString(){
        String str = "";

        for(int i=0;i<instruments.length;i++)
        {
            str += instruments[i].toString();
        }

        return str;
    }




}
