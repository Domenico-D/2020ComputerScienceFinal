/**
 * Domenico Didiano and Jimmy Huynh
 * Date: January, 24, 2020
 * ICS 4U1, ISU --- Stonks.
 * A program which mimics the stock market, allowing you to trade,
 * create artificial stocks, and trade with fake money.
 */

import java.util.*;
import java.lang.*;

public class Main {

    public static Scanner inputStr = new Scanner(System.in);
    public static Scanner inputNum = new Scanner(System.in);



    public static Portfolio portfolio1 = new Portfolio();
    public static Sector[] userSectors1 = new Sector[5];
    public static Portfolio portfolio2 = new Portfolio();
    public static Sector[] userSectors2 = new Sector[5];
    public static Portfolio portfolio3 = new Portfolio();
    public static Sector[] userSectors3 = new Sector[5];

    public static Portfolio[] portfolios = {portfolio1, portfolio2, portfolio3};

    public static int numPortfolios = 0;


    public static void main(String[]args){


        int choice, gameChoice;

        //All Technology Sector Stocks
        Stock intelStock = new Stock("Intel", 'A', 59.41, 8.8, true);
        Stock appleStock = new Stock("Apple", 'A', 59.41, 8.8, true);
        Stock alphabetStock = new Stock("Alphabet", 'A', 59.41, 8.8, true);
        Stock samsungStock = new Stock("Samsung", 'A', 59.41, 8.8, true);
        Stock microsoftStock = new Stock("Microsoft", 'A', 59.41, 8.8, true);
        Stock nvidiaStock = new Stock("Nvidia", 'A', 59.41, 8.8, true);
        Stock nintendoStock = new Stock("Nintendo", 'A', 59.41, 8.8, true);
        Stock amdStock = new Stock("AMD", 'A', 59.41, 8.8, true);

        //Array of all technology stocks
        Stock[] technologyArray = {intelStock, appleStock, alphabetStock, samsungStock, microsoftStock, nvidiaStock, nintendoStock, amdStock};

        //Technology Sector
        Sector technologySector = new Sector("Technology", technologyArray);

        //All Crypto Currency Stocks
        Stock bitcoinStock = new Stock("Bitcoin", 'A', 59.41, 8.8, true);
        Stock doge_CoinStock = new Stock("Doge Coin", 'A', 59.41, 8.8, true);
        Stock litecoinStock = new Stock("Litecoin", 'A', 59.41, 8.8, true);
        Stock zCashStock = new Stock("zCash", 'A', 59.41, 8.8, true);
        Stock ethereumStock = new Stock("Ethereum", 'A', 59.41, 8.8, true);
        Stock zuccBuccStock = new Stock("ZuccBucc", 'A', 59.41, 8.8, true);
        Stock rippleStock = new Stock("Ripple", 'A', 59.41, 8.8, true);
        Stock dashStock = new Stock("Dash", 'A', 59.41, 8.8, true);

        //Array of crypto currency stocks
        Stock[] cryptoArray = {bitcoinStock, doge_CoinStock, litecoinStock, zCashStock, ethereumStock, zuccBuccStock, rippleStock, dashStock};

        //Crypto Currency Sector
        Sector cryptoCurrencySector = new Sector("Crypto Currency", cryptoArray);

        //All Retail Stocks
        Stock amazonStock = new Stock("Amazon", 'A', 59.41, 8.8, true);
        Stock alibabaStock = new Stock("Alibaba", 'A', 59.41, 8.8, true);
        Stock bestBuyStock = new Stock("BestBuy", 'A', 59.41, 8.8, true);
        Stock costcoStock = new Stock("Costco", 'A', 59.41, 8.8, true);
        Stock rexallStock = new Stock("Rexall", 'A', 59.41, 8.8, true);
        Stock wishStock = new Stock("Wish", 'A', 59.41, 8.8, true);
        Stock freshCoStock = new Stock("FreshCo", 'A', 59.41, 8.8, true);
        Stock ebayStock = new Stock("Ebay", 'A', 59.41, 8.8, true);

        //Array of retail stocks
        Stock[] retailArray = {amazonStock, alibabaStock, bestBuyStock, costcoStock, rexallStock, wishStock, freshCoStock, ebayStock};

        //Retail Sector
        Sector retailSector = new Sector("Retail", retailArray);

        //All auto Stocks
        Stock fordStock = new Stock("Ford", 'A', 59.41, 8.8, true);
        Stock volkswagenStock = new Stock("Volkswagen", 'A', 59.41, 8.8, true);
        Stock hondaStock = new Stock("Honda", 'A', 59.41, 8.8, true);
        Stock toyotaStock = new Stock("Toyota", 'A', 59.41, 8.8, true);
        Stock teslaStock = new Stock("Tesla", 'A', 59.41, 8.8, true);
        Stock volvoStock = new Stock("Volvo", 'A', 59.41, 8.8, true);
        Stock nissanStock = new Stock("Nissan", 'A', 59.41, 8.8, true);
        Stock ferrariStock = new Stock("Ferrari", 'A', 59.41, 8.8, true);

        //Array of auto Stocks
        Stock[] autoArray = {fordStock, volkswagenStock, hondaStock, toyotaStock, teslaStock, volvoStock, nissanStock, ferrariStock};

        //Auto Sector
        Sector autoSector = new Sector("Auto", autoArray);

        //All Aerospace and Defense Stocks
        Stock bombardierStock = new Stock("Bombardier", 'A', 59.41, 8.8, true);
        Stock generalElectricStock = new Stock("General Electric", 'A', 59.41, 8.8, true);
        Stock boeingStock = new Stock("Boeing", 'A', 59.41, 8.8, true);
        Stock unitedTechnologiesStock = new Stock("United Technologies", 'A', 59.41, 8.8, true);
        Stock airbusStock = new Stock("Airbus", 'A', 59.41, 8.8, true);
        Stock honeywellStock = new Stock("Honeywell", 'A', 59.41, 8.8, true);
        Stock spaceXStock = new Stock("SpaceX", 'A', 59.41, 8.8, true);
        Stock safronStock = new Stock("Safron", 'A', 59.41, 8.8, true);

        //Array of Aerospace and defence stocks
        Stock[] aeroArray = {bombardierStock, generalElectricStock, boeingStock, unitedTechnologiesStock, airbusStock, honeywellStock, spaceXStock, safronStock};

        //Aerospace Sector
        Sector aerospaceSector = new Sector("Aerospace", aeroArray);

        //All Financial / banks stocks
        Stock scotiaBankStock = new Stock("ScotiaBank", 'A', 59.41, 8.8, true);
        Stock cibcStock = new Stock("CIBC", 'A', 59.41, 8.8, true);
        Stock bankOfAmericaStock = new Stock("Bank of America", 'A', 59.41, 8.8, true);
        Stock bmoStock = new Stock("BMO", 'A', 59.41, 8.8, true);
        Stock hAndRBlockStock = new Stock("H and R Block", 'A', 59.41, 8.8, true);
        Stock tdStock = new Stock("TD", 'A', 59.41, 8.8, true);
        Stock rbcStock = new Stock("RBC", 'A', 59.41, 8.8, true);
        Stock tangerineStock = new Stock("Tangerine", 'A', 59.41, 8.8, true);

        //Array of Financial stocks
        Stock[] financialArray = {scotiaBankStock, cibcStock, bankOfAmericaStock, bmoStock, hAndRBlockStock, tdStock, rbcStock, tangerineStock};

        //Financial Sector
        Sector financialSector = new Sector("Financial", financialArray);

        //All food Stocks
        Stock mcDonaldsStock = new Stock("McDonalds", 'A', 59.41, 8.8, true);
        Stock wendysStock = new Stock("Wendys", 'A', 59.41, 8.8, true);
        Stock chipotleStock = new Stock("Chipotle", 'A', 59.41, 8.8, true);
        Stock dominoesStock = new Stock("Dominoes", 'A', 59.41, 8.8, true);
        Stock beyondMeatStock = new Stock("BeyondMeat", 'A', 59.41, 8.8, true);
        Stock pepsiCoStock = new Stock("PepsiCo", 'A', 59.41, 8.8, true);
        Stock heinekenStock = new Stock("Heineken", 'A', 59.41, 8.8, true);
        Stock henneseyStock = new Stock("Hennesey", 'A', 59.41, 8.8, true);

        //Array of food Stocks
        Stock[] foodArray = {mcDonaldsStock, wendysStock, chipotleStock, dominoesStock, beyondMeatStock, pepsiCoStock, heinekenStock, henneseyStock};

        //Food Sector
        Sector foodSector = new Sector("Food", foodArray);


        do{

            System.out.println("1. Play");
            System.out.println("2. About us");

            choice = inputNum.nextInt();

            if(choice == 1){

                do{

                    System.out.println("1. Create a Portfolio");
                    //Only allow user to select Portfolios if they have more then one
                    if(numPortfolios > 1){
                        System.out.println("2. Select Portfolio");
                    }

                    gameChoice = inputNum.nextInt();

                    if(gameChoice == 1){
                        numPortfolios++;

                        createPortfolio();

                    }
                    else if(gameChoice == 2){

                    }

                }while(gameChoice != 0);

            }
            else if(choice == 2){
                System.out.println("test 2");
            }


        }while(choice != 0);



        /**
         * WHEN YOU END THE DAY, DO THE FOLLOWING:
         * 1. clear dailyProfit.
         * 2. change price with volatility.
         * 3. update new price;
         * 4. set beginDayPrice.
         */
    }

    static void createPortfolio(){

        if(numPortfolios == 1){

            System.out.print("Enter the name of your first portfolio: ");
            portfolio1.setName(inputStr.nextLine());

            for (int i = 0; i < userSectors1.length; i++){

                System.out.println("Please choose what sectors you want in your portfolio");
                System.out.print("1. Technology, 2. Crypto Currency, 3. Retail, 4. Auto, 5. Aerospace and Defence, 6. Financial, 7. Food: ");

                userSectors1
            }

        }
        else if(numPortfolios == 2){



        }
        else if(numPortfolios == 3){



        }
    }

}
