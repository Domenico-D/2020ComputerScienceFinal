public class Sector {

    private String name;
    private double sectorProfitLoss;
    private char sectorVolatality;
    private Stock[] instruments;

    public Sector(String nm, Stock[] stocks){

        name = nm;
        instruments = stocks;

    }

    public void sectorVolatility(){

        //Constants to store volatility levels to determine char
        final double high = 10;
        final double medium = 20;
        final double low = 30;

        //For loop to add up all of the volatility of each stock in the sector
        int volatilityTotal = 0;

        for(int i = 0; i < instruments.length; i++){

            volatilityTotal += instruments[i].getVolability;

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
    }

    public void getProfit()

    public double getSectorProfitLoss() {
        return sectorProfitLoss;
    }

    public char getSectorVolatality() {
        return sectorVolatality;
    }
}
