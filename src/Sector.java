public class Sector {

    private String name;
    private double sectorProfitLoss;
    private char sectorVolatality;
    private Stock[] instruments;

    public Sector(String nm, Stock[] stocks){

        name = nm;
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

    public char getSectorVolatality() {

        //Constants to store volatility levels to determine char
        final double high = 10;
        final double medium = 20;

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

    public void addStock(Stock newStock){

        for(int i = 0; i < instruments.length; i++){

            if(instruments[i] == null){
                instruments[i] = newStock;
                break;
            }
        }
    }

    public void removeStock(int choice){

        instruments[choice] = null;

    }

    //NEED TO ADD getDailyProfit();

    public void organize(){

        for(int i = 0; i < instruments.length; i++){
            instruments[i]
        }
    }

    //Needs toString

}
