/**
 * Domenico Didiano and Jimmy Huynh
 * Date: January, 24, 2020
 * ICS 4U1, ISU --- Stonks.
 * A program which mimics the stock market, allowing you to trade,
 * create artificial stocks, and trade with fake money.
 */

import java.text.NumberFormat;
import java.util.*;
import java.lang.*;

public class Main {

    private static Scanner inputStr = new Scanner(System.in);
    private static Scanner inputNum = new Scanner(System.in);
    private static Scanner inputChr = new Scanner(System.in);
    private static NumberFormat moneyFormat = NumberFormat.getCurrencyInstance();
    

    //Initialize Stocks for the user to fill in portfolio 1
    private static Stock userPortfolio1Sector1Stock1 = new Stock();
    private static Stock userPortfolio1Sector1Stock2 = new Stock();
    private static Stock userPortfolio1Sector1Stock3 = new Stock();
    private static Stock userPortfolio1Sector1Stock4 = new Stock();
    private static Stock userPortfolio1Sector1Stock5 = new Stock();

    private static Stock userPortfolio1Sector2Stock1 = new Stock();
    private static Stock userPortfolio1Sector2Stock2 = new Stock();
    private static Stock userPortfolio1Sector2Stock3 = new Stock();
    private static Stock userPortfolio1Sector2Stock4 = new Stock();
    private static Stock userPortfolio1Sector2Stock5 = new Stock();

    private static Stock userPortfolio1Sector3Stock1 = new Stock();
    private static Stock userPortfolio1Sector3Stock2 = new Stock();
    private static Stock userPortfolio1Sector3Stock3 = new Stock();
    private static Stock userPortfolio1Sector3Stock4 = new Stock();
    private static Stock userPortfolio1Sector3Stock5 = new Stock();

    private static Stock userPortfolio1Sector4Stock1 = new Stock();
    private static Stock userPortfolio1Sector4Stock2 = new Stock();
    private static Stock userPortfolio1Sector4Stock3 = new Stock();
    private static Stock userPortfolio1Sector4Stock4 = new Stock();
    private static Stock userPortfolio1Sector4Stock5 = new Stock();

    private static Stock userPortfolio1Sector5Stock1 = new Stock();
    private static Stock userPortfolio1Sector5Stock2 = new Stock();
    private static Stock userPortfolio1Sector5Stock3 = new Stock();
    private static Stock userPortfolio1Sector5Stock4 = new Stock();
    private static Stock userPortfolio1Sector5Stock5 = new Stock();

    private static Stock userPortfolio1Sector6Stock1 = new Stock();
    private static Stock userPortfolio1Sector6Stock2 = new Stock();
    private static Stock userPortfolio1Sector6Stock3 = new Stock();
    private static Stock userPortfolio1Sector6Stock4 = new Stock();
    private static Stock userPortfolio1Sector6Stock5 = new Stock();

    private static Stock userPortfolio1Sector7Stock1 = new Stock();
    private static Stock userPortfolio1Sector7Stock2 = new Stock();
    private static Stock userPortfolio1Sector7Stock3 = new Stock();
    private static Stock userPortfolio1Sector7Stock4 = new Stock();
    private static Stock userPortfolio1Sector7Stock5 = new Stock();

    //Initialize Stocks for the user to fill in portfolio 2
    private static Stock userPortfolio2Sector1Stock1 = new Stock();
    private static Stock userPortfolio2Sector1Stock2 = new Stock();
    private static Stock userPortfolio2Sector1Stock3 = new Stock();
    private static Stock userPortfolio2Sector1Stock4 = new Stock();
    private static Stock userPortfolio2Sector1Stock5 = new Stock();

    private static Stock userPortfolio2Sector2Stock1 = new Stock();
    private static Stock userPortfolio2Sector2Stock2 = new Stock();
    private static Stock userPortfolio2Sector2Stock3 = new Stock();
    private static Stock userPortfolio2Sector2Stock4 = new Stock();
    private static Stock userPortfolio2Sector2Stock5 = new Stock();

    private static Stock userPortfolio2Sector3Stock1 = new Stock();
    private static Stock userPortfolio2Sector3Stock2 = new Stock();
    private static Stock userPortfolio2Sector3Stock3 = new Stock();
    private static Stock userPortfolio2Sector3Stock4 = new Stock();
    private static Stock userPortfolio2Sector3Stock5 = new Stock();

    private static Stock userPortfolio2Sector4Stock1 = new Stock();
    private static Stock userPortfolio2Sector4Stock2 = new Stock();
    private static Stock userPortfolio2Sector4Stock3 = new Stock();
    private static Stock userPortfolio2Sector4Stock4 = new Stock();
    private static Stock userPortfolio2Sector4Stock5 = new Stock();

    private static Stock userPortfolio2Sector5Stock1 = new Stock();
    private static Stock userPortfolio2Sector5Stock2 = new Stock();
    private static Stock userPortfolio2Sector5Stock3 = new Stock();
    private static Stock userPortfolio2Sector5Stock4 = new Stock();
    private static Stock userPortfolio2Sector5Stock5 = new Stock();

    private static Stock userPortfolio2Sector6Stock1 = new Stock();
    private static Stock userPortfolio2Sector6Stock2 = new Stock();
    private static Stock userPortfolio2Sector6Stock3 = new Stock();
    private static Stock userPortfolio2Sector6Stock4 = new Stock();
    private static Stock userPortfolio2Sector6Stock5 = new Stock();

    private static Stock userPortfolio2Sector7Stock1 = new Stock();
    private static Stock userPortfolio2Sector7Stock2 = new Stock();
    private static Stock userPortfolio2Sector7Stock3 = new Stock();
    private static Stock userPortfolio2Sector7Stock4 = new Stock();
    private static Stock userPortfolio2Sector7Stock5 = new Stock();

    //Initialize Stocks for the user to fill in portfolio 3
    private static Stock userPortfolio3Sector1Stock1 = new Stock();
    private static Stock userPortfolio3Sector1Stock2 = new Stock();
    private static Stock userPortfolio3Sector1Stock3 = new Stock();
    private static Stock userPortfolio3Sector1Stock4 = new Stock();
    private static Stock userPortfolio3Sector1Stock5 = new Stock();

    private static Stock userPortfolio3Sector2Stock1 = new Stock();
    private static Stock userPortfolio3Sector2Stock2 = new Stock();
    private static Stock userPortfolio3Sector2Stock3 = new Stock();
    private static Stock userPortfolio3Sector2Stock4 = new Stock();
    private static Stock userPortfolio3Sector2Stock5 = new Stock();

    private static Stock userPortfolio3Sector3Stock1 = new Stock();
    private static Stock userPortfolio3Sector3Stock2 = new Stock();
    private static Stock userPortfolio3Sector3Stock3 = new Stock();
    private static Stock userPortfolio3Sector3Stock4 = new Stock();
    private static Stock userPortfolio3Sector3Stock5 = new Stock();

    private static Stock userPortfolio3Sector4Stock1 = new Stock();
    private static Stock userPortfolio3Sector4Stock2 = new Stock();
    private static Stock userPortfolio3Sector4Stock3 = new Stock();
    private static Stock userPortfolio3Sector4Stock4 = new Stock();
    private static Stock userPortfolio3Sector4Stock5 = new Stock();

    private static Stock userPortfolio3Sector5Stock1 = new Stock();
    private static Stock userPortfolio3Sector5Stock2 = new Stock();
    private static Stock userPortfolio3Sector5Stock3 = new Stock();
    private static Stock userPortfolio3Sector5Stock4 = new Stock();
    private static Stock userPortfolio3Sector5Stock5 = new Stock();

    private static Stock userPortfolio3Sector6Stock1 = new Stock();
    private static Stock userPortfolio3Sector6Stock2 = new Stock();
    private static Stock userPortfolio3Sector6Stock3 = new Stock();
    private static Stock userPortfolio3Sector6Stock4 = new Stock();
    private static Stock userPortfolio3Sector6Stock5 = new Stock();

    private static Stock userPortfolio3Sector7Stock1 = new Stock();
    private static Stock userPortfolio3Sector7Stock2 = new Stock();
    private static Stock userPortfolio3Sector7Stock3 = new Stock();
    private static Stock userPortfolio3Sector7Stock4 = new Stock();
    private static Stock userPortfolio3Sector7Stock5 = new Stock();

    //All Technology Sector Stocks
    private static Stock intelStock = new Stock("Intel", 'N', 60.54, 0.7, true);
    private static Stock appleStock = new Stock("Apple", 'N', 316.75, 0.8, true);
    private static Stock alphabetStock = new Stock("Alphabet", 'N', 1482.98, 0.9, true);
    private static Stock samsungStock = new Stock("Samsung", 'A', 218.32, 0.7, true);
    private static Stock microsoftStock = new Stock("Microsoft", 'N', 166.25, 0.8, true);
    private static Stock nvidiaStock = new Stock("Nvidia", 'A', 247.95, 0.1, true);
    private static Stock nintendoStock = new Stock("Nintendo", 'A', 53.26, 0.7, true);
    private static Stock amdStock = new Stock("AMD", 'A', 51.05, 0.1, true);

    //Array of all technology stocks
    private static Stock[] technologyArray = {intelStock, appleStock, alphabetStock, samsungStock, microsoftStock, nvidiaStock, nintendoStock, amdStock};

    //Technology Sector
    private static Sector technologySector = new Sector("Technology", technologyArray);

    //All Crypto Currency Stocks
    private static Stock bitcoinStock = new Stock("Bitcoin", 'N', 8700.32, 0.17, true);
    private static Stock doge_CoinStock = new Stock("Doge Coin", 'E', 1.37, 0.13, true);
    private static Stock litecoinStock = new Stock("Litecoin", 'A', 57.31, 0.16, true);
    private static Stock zCashStock = new Stock("zCash", 'F', 53.23, 0.1, true);
    private static Stock ethereumStock = new Stock("Ethereum", 'O', 168.19, 0.15, true);
    private static Stock zuccBuccStock = new Stock("ZuccBucc", 'N', 666.66, 0.2, true);
    private static Stock rippleStock = new Stock("Ripple", 'O', 1.23, 0.11, true);
    private static Stock dashStock = new Stock("Dash", 'F', 108.13, 0.14, true);

    //Array of crypto currency stocks
    private static Stock[] cryptoArray = {bitcoinStock, doge_CoinStock, litecoinStock, zCashStock, ethereumStock, zuccBuccStock, rippleStock, dashStock};

    //Crypto Currency Sector
    private static Sector cryptoCurrencySector = new Sector("Crypto Currency", cryptoArray);

    //All Retail Stocks
    private static Stock amazonStock = new Stock("Amazon", 'N', 1892.02, 0.09, true);
    private static Stock alibabaStock = new Stock("Alibaba", 'A', 222.26, 0.09, true);
    private static Stock bestBuyStock = new Stock("BestBuy", 'N', 90.24, 0.07, true);
    private static Stock costcoStock = new Stock("Costco", 'N', 313.26, 0.07, true);
    private static Stock rexallStock = new Stock("Rexall", 'N', 1329.28, 0.09, true);
    private static Stock wishStock = new Stock("Wish", 'A', 841.42, 0.08, true);
    private static Stock freshCoStock = new Stock("FreshCo", 'N', 64.82, 0.07, true);
    private static Stock ebayStock = new Stock("Ebay", 'N',35.72 , 0.08, true);

    //Array of retail stocks
    private static Stock[] retailArray = {amazonStock, alibabaStock, bestBuyStock, costcoStock, rexallStock, wishStock, freshCoStock, ebayStock};

    //Retail Sector
    private static Sector retailSector = new Sector("Retail", retailArray);

    //All auto Stocks
    private static Stock fordStock = new Stock("Ford", 'N', 9.21, 0.04, true);
    private static Stock volkswagenStock = new Stock("Volkswagen", 'E', 181.30, 0.06, true);
    private static Stock hondaStock = new Stock("Honda", 'A', 89.41, 0.03, true);
    private static Stock toyotaStock = new Stock("Toyota", 'A', 32.45, 0.04, true);
    private static Stock teslaStock = new Stock("Tesla", 'N', 523.89, 0.06, true);
    private static Stock volvoStock = new Stock("Volvo", 'E', 161.45, 0.05, true);
    private static Stock nissanStock = new Stock("Nissan", 'A', 29.41, 0.03, true);
    private static Stock ferrariStock = new Stock("Ferrari", 'E', 213.13, 0.06, true);

    //Array of auto Stocks
    private static Stock[] autoArray = {fordStock, volkswagenStock, hondaStock, toyotaStock, teslaStock, volvoStock, nissanStock, ferrariStock};

    //Auto Sector
    private static Sector autoSector = new Sector("Auto", autoArray);

    //All Aerospace and Defense Stocks
    private static Stock bombardierStock = new Stock("Bombardier", 'A', 1.29, 0.07, true);
    private static Stock generalElectricStock = new Stock("General Electric", 'A', 11.66, 0.08, true);
    private static Stock boeingStock = new Stock("Boeing", 'A', 313.37, 0.09, true);
    private static Stock unitedTechnologiesStock = new Stock("United Technologies", 'A', 59.41, 0.07, true);
    private static Stock airbusStock = new Stock("Airbus", 'A', 136.41, 0.08, true);
    private static Stock honeywellStock = new Stock("Honeywell", 'A', 180.93, 0.08, true);
    private static Stock spaceXStock = new Stock("SpaceX", 'A', 132.56, 0.09, true);
    private static Stock safranStock = new Stock("Safran", 'A', 142.00, 0.09, true);

    //Array of Aerospace and defence stocks
    private static Stock[] aeroArray = {bombardierStock, generalElectricStock, boeingStock, unitedTechnologiesStock, airbusStock, honeywellStock, spaceXStock, safranStock};

    //Aerospace Sector
    private static Sector aerospaceSector = new Sector("Aerospace", aeroArray);

    //All Financial / banks stocks
    private static Stock scotiaBankStock = new Stock("ScotiaBank", 'N', 72.63, 0.05, true);
    private static Stock cibcStock = new Stock("CIBC", 'N', 108.14, 0.07, true);
    private static Stock bankOfAmericaStock = new Stock("Bank of America", 'N', 34.26, 0.03, true);
    private static Stock bmoStock = new Stock("BMO", 'N', 104.34, 0.04, true);
    private static Stock hAndRBlockStock = new Stock("H and R Block", 'E', 53.63, 8.8, true);
    private static Stock tdStock = new Stock("TD", 'N', 73.96, 0.05, true);
    private static Stock rbcStock = new Stock("RBC", 'N', 106.79, 0.02, true);
    private static Stock tangerineStock = new Stock("Tangerine", 'O', 163.76, 0.06, true);

    //Array of Financial stocks
    private static Stock[] financialArray = {scotiaBankStock, cibcStock, bankOfAmericaStock, bmoStock, hAndRBlockStock, tdStock, rbcStock, tangerineStock};

    //Financial Sector
    private static Sector financialSector = new Sector("Financial", financialArray);

    //All food Stocks
    private static Stock mcDonaldsStock = new Stock("McDonalds", 'A', 211.16, 0.08, true);
    private static Stock wendysStock = new Stock("Wendys", 'A', 21.66, 0.09, true);
    private static Stock chipotleStock = new Stock("Chipotle", 'A', 870.73, 0.07, true);
    private static Stock dominosStock = new Stock("Dominos", 'A', 285.11, 0.05, true);
    private static Stock beyondMeatStock = new Stock("BeyondMeat", 'A', 129.18, 0.07, true);
    private static Stock pepsiCoStock = new Stock("PepsiCo", 'A', 141.86, 0.1, true);
    private static Stock heinekenStock = new Stock("Heineken", 'A', 99.86, 0.07, true);
    private static Stock henneseyStock = new Stock("Hennesey", 'A', 51.41, 0.12, true);

    //Array of food Stocks
    private static Stock[] foodArray = {mcDonaldsStock, wendysStock, chipotleStock, dominosStock, beyondMeatStock, pepsiCoStock, heinekenStock, henneseyStock};

    //Food Sector
    private static Sector foodSector = new Sector("Food", foodArray);

    //initialize sector array for first portfolio.
    private static Sector[] userSectors1 = new Sector[5];
    private static Portfolio portfolio1 = new Portfolio("",userSectors1);

    //Initialize user Sectors for portfolio 1
    private static Sector userTechnology1 = new Sector("Technology");
    private static Sector userCrypto1 = new Sector("Crypto Currency");
    private static Sector userRetail1 = new Sector("Retail");
    private static Sector userAuto1 = new Sector("Auto");
    private static Sector userAerospace1 = new Sector("Aerospace");
    private static Sector userFinancial1 = new Sector("Financial");
    private static Sector userFood1 = new Sector("Food");

    //initialize sector array for second portfolio.
    private static Sector[] userSectors2 = new Sector[5];
    private static Portfolio portfolio2 = new Portfolio("",userSectors2);

    //Initialize user Sectors for portfolio 2
    private static Sector userTechnology2 = new Sector("Technology");
    private static Sector userCrypto2 = new Sector("Crypto Currency");
    private static Sector userRetail2 = new Sector("Retail");
    private static Sector userAuto2 = new Sector("Auto");
    private static Sector userAerospace2 = new Sector("Aerospace");
    private static Sector userFinancial2 = new Sector("Financial");
    private static Sector userFood2 = new Sector("Food");

    //Initialize sector array for third portfolio.
    private static Sector[] userSectors3 = new Sector[5];
    private static Portfolio portfolio3 = new Portfolio("",userSectors3);

    //Initialize user Sectors for portfolio 3
    private static Sector userTechnology3 = new Sector("Technology");
    private static Sector userCrypto3 = new Sector("Crypto Currency");
    private static Sector userRetail3 = new Sector("Retail");
    private static Sector userAuto3 = new Sector("Auto");
    private static Sector userAerospace3 = new Sector("Aerospace");
    private static Sector userFinancial3 = new Sector("Financial");
    private static Sector userFood3 = new Sector("Food");

    private static Portfolio[] portfolios = {portfolio1, portfolio2, portfolio3};

    private static int numPortfolios = 0;

    //User menu selection
    private static int choice;
    //Prevents user from adding the same sector or Stock twice
    private static Boolean[] chosen = {true, true, true, true, true, true, true};
    private static Boolean[] chosenStock = {true, true, true, true, true, true, true, true};
    //Temp stock array to fill sectors
    private static Stock[] tempStocks1 = new Stock[5];
    private static Stock[] tempStocks2= new Stock[5];
    private static Stock[] tempStocks3 = new Stock[5];
    private static Stock[] tempStocks4 = new Stock[5];
    private static Stock[] tempStocks5 = new Stock[5];
    private static Stock[] tempStocks6 = new Stock[5];
    private static Stock[] tempStocks7 = new Stock[5];
    //user stock choice
    private static int stockChoice;
    private static double currentPriceTemp;
    private static double volatilityTemp;
    private static char regionTemp;

    //Menu navigator
    private static int gameChoice;
    private static int menuChoice;
    private static int sectorChoice;
    private static boolean taken = false;

    //Trade Stocks temporary objects
    private static Stock currentStock;
    private static Stock newStock;
    


    public static void main(String[]args){


        /**
         * WHEN YOU END THE DAY, DO THE FOLLOWING:
         * 1. clear dailyProfit.
         * 2. change price with volatility.
         * 3. update new price;
         * 4. set beginDayPrice.
         */



        do{
            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
            System.out.println("1. Play");
            System.out.println("2. About us\n");
            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
            gameChoice = inputNum.nextInt();

            if(gameChoice == 1){

                do{


                    if(numPortfolios < 1){
                        gameChoice = 1;
                    }else{
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("1. Create a Portfolio (max of three)");
                        //Only allow user to select Portfolios if they have more then one
                        if(numPortfolios < 3)
                            System.out.println("2. Select Portfolio");

                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");

                        gameChoice = inputNum.nextInt();
                    }

                    //create portfolio
                    if(gameChoice == 1){
                        numPortfolios++;
                        createPortfolio();
                    }
                    //Continue with the rest of the game
                    else if(gameChoice == 2){
                        if(numPortfolios == 3){
                            do {
                                System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                                System.out.println("Which portfolio would you like to access");
                                System.out.println("1. " + portfolio1.getName());
                                System.out.println("2. " + portfolio2.getName());
                                System.out.println("3. " + portfolio3.getName());
                                System.out.println("0. Go back");
                                System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                                gameChoice = inputNum.nextInt();


                                //Portfolio 1
                                if (gameChoice == 1) {

                                    basicMenu(portfolio1);
                                }
                                //Portfolio 2
                                else if (gameChoice == 2) {
                                    basicMenu(portfolio2);
                                }
                                //Portfolio
                                else if (gameChoice == 3) {
                                    basicMenu(portfolio3);
                                }
                                else{
                                    System.out.println("Please enter a correct number");
                                }
                            }while(gameChoice != 0);
                        }
                        else{
                            do {
                                System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                                System.out.println("Which portfolio would you like to access");
                                System.out.println("1. " + portfolio1.getName());
                                System.out.println("2. " + portfolio2.getName());
                                System.out.println("0 to go back");
                                System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                                gameChoice = inputNum.nextInt();

                                if (gameChoice == 1) {
                                    basicMenu(portfolio1);
                                } else if (gameChoice == 2) {

                                }
                                else{
                                    System.out.println("Please enter a correct number");
                                }

                            }while(gameChoice != 0);
                        }




                    }

                }while(gameChoice != 0);

            }
            else if(gameChoice == 2){
                System.out.println("test 2");
            }


        }while(gameChoice != 0);




    }


    private static void createPortfolio(){

        if(numPortfolios == 1){
            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
            System.out.print("Enter the name of your first portfolio\n");
            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");

            portfolio1.setName(inputStr.nextLine());

            for (int i = 0; i < userSectors1.length; i++){

                do{
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                    System.out.println("Please choose what sectors you want in your portfolio");
                    System.out.println("Choose carefully you will not be able to change them later!");
                    System.out.println("1. Technology, 2. Crypto Currency, 3. Retail, 4. Auto, 5. Aerospace and Defence, 6. Financial, 7. Food\n");
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                    choice = inputNum.nextInt();

                    //User chooses technology sector and stocks within.
                    if (choice == 1 && chosen[0]) {
                        //Set the chosen sector
                        userSectors1[i] = userTechnology1;

                        //Fills Sector One stocks
                        fillPortfolioOneSectorOne();
                        userSectors1[i].setInstruments(tempStocks1);
                        //Prevents user from adding the same sector twice
                        chosen[0] = false;


                        //clears double stock check
                        for(int u = 0; u < chosenStock.length; u++){
                            chosenStock[u] = true;
                        }

                        break;
                    }
                    //User chooses Crypto sector and stocks within.
                    else if (choice == 2 && chosen[1]) {
                        userSectors1[i] = userCrypto1;

                        //Prevents user from adding the same sector twice
                        chosen[1] = false;

                        fillPortfolioOneSectorTwo();
                        userSectors1[i].setInstruments(tempStocks2);

                        //clears double stock check
                        for(int u = 0; u < chosenStock.length; u++){
                            chosenStock[u] = true;
                        }
                        break;
                    }
                    //User chooses Retail sector and stocks within.
                    else if (choice == 3 && chosen[2]) {
                        userSectors1[i] = userRetail1;

                        //Prevents user from adding the same sector twice
                        chosen[2] = false;

                        fillPortfolioOneSectorThree();
                        userSectors1[i].setInstruments(tempStocks3);


                        //clears double stock check
                        for(int u = 0; u < chosenStock.length; u++){
                            chosenStock[u] = true;
                        }

                        break;
                    }
                    //User chooses Auto sector and stocks within.
                    else if (choice == 4 && chosen[3]) {
                        userSectors1[i] = userAuto1;

                        //Prevents user from adding the same sector twice
                        chosen[3] = false;

                        fillPortfolioOneSectorFour();
                        userSectors1[i].setInstruments(tempStocks4);



                        //clears double stock check
                        for(int u = 0; u < chosenStock.length; u++){
                            chosenStock[u] = true;
                        }
                        break;
                    }
                    //User chooses Aerospace sector and stocks within.
                    else if (choice == 5 && chosen[4]) {
                        userSectors1[i] = userAerospace1;

                        //Prevents user from adding the same sector twice
                        chosen[4] = false;

                        fillPortfolioOneSectorFive();
                        userSectors1[i].setInstruments(tempStocks5);



                        //clears double stock check
                        for(int u = 0; u < chosenStock.length; u++){
                            chosenStock[u] = true;
                        }

                        break;
                    }
                    //User chooses Financial sector and stocks within.
                    else if (choice == 6 && chosen[5]) {
                        userSectors1[i] = userFinancial1;

                        //Prevents user from adding the same sector twice
                        chosen[5] = false;

                        fillPortfolioOneSectorSix();
                        userSectors1[i].setInstruments(tempStocks6);



                        //clears double stock check
                        for(int u = 0; u < chosenStock.length; u++){
                            chosenStock[u] = true;
                        }

                        break;
                    }
                    //User chooses Food sector and stocks within.
                    else if (choice == 7 && chosen[6]) {
                        userSectors1[i] = userFood1;

                        //Prevents user from adding the same sector twice
                        chosen[6] = false;

                        fillPortfolioOneSectorSeven();
                        userSectors1[i].setInstruments(tempStocks7);



                        //clears double stock check
                        for(int u = 0; u < chosenStock.length; u++){
                            chosenStock[u] = true;
                        }

                        break;
                    }
                    else if(choice<1 || choice>7) {
                        System.out.println("Please enter a number from 1-7");
                    }
                    else {
                        System.out.println("Sector already selected. Pick something else.");
                    }
                }while(userSectors1[i] == null);
            }
            portfolio1.setSectors(userSectors1);
            for(int i = 0; i < portfolio1.chosenDivisions.length; i++){

                for(int u = 0; u < portfolio1.chosenDivisions[i].instruments.length; u++){
                    portfolio1.chosenDivisions[i].instruments[u].buyShares();
                    portfolio1.cashLeftover -= 1000;
                }

            }

        }
        else if(numPortfolios == 2){



        }
        else if(numPortfolios == 3){



        }



    }

    private static void fillPortfolioOneSectorOne(){
        //Fill Stocks with user choices in Sector 1
        for(int o = 0; o < tempStocks1.length; o++){

            do{
                System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                System.out.println("Please choose or create the stocks you want in this sector");
                System.out.println("1. Choose Stock");
                System.out.println("2. Create Stock");
                System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if(choice == 1){
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                    System.out.format("%-25s %4s %8s %4s %6s","Name","Region","Price","Volatility","Active" + "\n");
                    System.out.println(technologySector.toString());
                    System.out.print("Which stock would you like to add?\n");
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                    stockChoice = inputNum.nextInt();

                    if(stockChoice == 1 && chosenStock[0]){
                        tempStocks1[o] = technologyArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 2 && chosenStock[1]){
                        tempStocks1[o] = technologyArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 3 && chosenStock[2]){
                        tempStocks1[o] = technologyArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 4 && chosenStock[3]){
                        tempStocks1[o] = technologyArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 5 && chosenStock[4]){
                        tempStocks1[o] = technologyArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 6 && chosenStock[5]){
                        tempStocks1[o] = technologyArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 7 && chosenStock[6]){
                        tempStocks1[o] = technologyArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 8 && chosenStock[7]){
                        tempStocks1[o] = technologyArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice > 8 || stockChoice < 1){
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else {
                        System.out.println("\nStock already selected. Pick something else.");
                    }


                }
                //Create stocks
                else if(choice == 2){

                    //Slot 1
                    if(o == 0){
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector1Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector1Stock1.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock1.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock1.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks1[o] = userPortfolio1Sector1Stock1;

                    }
                    //Slot 2
                    else if(o == 1){

                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector1Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector1Stock2.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock2.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock2.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks1[o] = userPortfolio1Sector1Stock2;
                    }
                    //Slot 3
                    else if(o == 2){
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector1Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector1Stock3.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock3.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock3.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks1[o] = userPortfolio1Sector1Stock3;
                    }
                    //Slot 4
                    else if(o == 3){
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector1Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector1Stock4.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock4.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock4.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks1[o] = userPortfolio1Sector1Stock4;
                    }
                    //Slot 5
                    else{
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector1Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector1Stock5.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock5.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock5.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks1[o] = userPortfolio1Sector1Stock5;
                    }

                }


            }while(tempStocks1[o] == null);

        }

    }

    private static void fillPortfolioOneSectorTwo(){
        //Fill Stocks with user choices in Sector 1
        for(int o = 0; o < tempStocks2.length; o++){

            do{
                System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                System.out.println("Please choose or create the stocks you want in this sector");
                System.out.println("1. Choose Stock");
                System.out.println("2. Create Stock");
                System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if(choice == 1){
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                    System.out.format("%-25s %4s %8s %4s %6s","Name","Region","Price","Volatility","Active" + "\n");
                    System.out.println(cryptoCurrencySector.toString());
                    System.out.print("Which stock would you like to add?\n");
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                    stockChoice = inputNum.nextInt();

                    if(stockChoice == 1 && chosenStock[0]){
                        tempStocks2[o] = cryptoArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 2 && chosenStock[1]){
                        tempStocks2[o] = cryptoArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 3 && chosenStock[2]){
                        tempStocks2[o] = cryptoArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 4 && chosenStock[3]){
                        tempStocks2[o] = cryptoArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 5 && chosenStock[4]){
                        tempStocks2[o] = cryptoArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 6 && chosenStock[5]){
                        tempStocks2[o] = cryptoArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 7 && chosenStock[6]){
                        tempStocks2[o] = cryptoArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 8 && chosenStock[7]){
                        tempStocks2[o] = cryptoArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice > 8 || stockChoice < 1){
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else {
                        System.out.println("\nStock already selected. Pick something else.");
                    }

                }
                //Create stocks
                else if(choice == 2){

                    //Slot 1
                    if(o == 0){
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector2Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector2Stock1.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock1.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock1.setVolatility(volatilityTemp);

                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks2[o] = userPortfolio1Sector2Stock1;

                    }
                    //Slot 2
                    else if(o == 1){

                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector2Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector2Stock2.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock2.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock2.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks2[o] = userPortfolio1Sector2Stock2;
                    }
                    //Slot 3
                    else if(o == 2){
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector2Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector2Stock3.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock3.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock3.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks2[o] = userPortfolio1Sector2Stock3;
                    }
                    //Slot 4
                    else if(o == 3){
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector2Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector2Stock4.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock4.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock4.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks2[o] = userPortfolio1Sector2Stock4;
                    }
                    //Slot 5
                    else{
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector2Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector2Stock5.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock5.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock5.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks2[o] = userPortfolio1Sector2Stock5;
                    }

                }

            }while(tempStocks2[o] == null);

        }
    }

    private static void fillPortfolioOneSectorThree(){
        //Fill Stocks with user choices in Sector 1
        for(int o = 0; o < tempStocks3.length; o++){

            do{
                System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                System.out.println("Please choose or create the stocks you want in this sector");
                System.out.println("1. Choose Stock");
                System.out.println("2. Create Stock");
                System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if(choice == 1){
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                    System.out.format("%-25s %4s %8s %4s %6s","Name","Region","Price","Volatility","Active" + "\n");
                    System.out.println(retailSector.toString());
                    System.out.print("Which stock would you like to add?\n");
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                    stockChoice = inputNum.nextInt();

                    if(stockChoice == 1 && chosenStock[0]){
                        tempStocks3[o] = retailArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 2 && chosenStock[1]){
                        tempStocks3[o] = retailArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 3 && chosenStock[2]){
                        tempStocks3[o] = retailArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 4 && chosenStock[3]){
                        tempStocks3[o] = retailArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 5 && chosenStock[4]){
                        tempStocks3[o] = retailArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 6 && chosenStock[5]){
                        tempStocks3[o] = retailArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 7 && chosenStock[6]){
                        tempStocks3[o] = retailArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 8 && chosenStock[7]){
                        tempStocks3[o] = retailArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice > 8 || stockChoice < 1){
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else {
                        System.out.println("\nStock already selected. Pick something else.");
                    }

                }
                //Create stocks
                else if(choice == 2){

                    //Slot 1
                    if(o == 0){
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector3Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector3Stock1.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock1.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock1.setVolatility(volatilityTemp);

                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks3[o] = userPortfolio1Sector3Stock1;

                    }
                    //Slot 2
                    else if(o == 1){

                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector3Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector3Stock2.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock2.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock2.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks3[o] = userPortfolio1Sector3Stock2;
                    }
                    //Slot 3
                    else if(o == 2){
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector3Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector3Stock3.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock3.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock3.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks3[o] = userPortfolio1Sector3Stock3;
                    }
                    //Slot 4
                    else if(o == 3){
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector3Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector3Stock4.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock4.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock4.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks3[o] = userPortfolio1Sector3Stock4;
                    }
                    //Slot 5
                    else{
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector3Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector3Stock5.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock5.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock5.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks3[o] = userPortfolio1Sector3Stock5;
                    }

                }

            }while(tempStocks3[o] == null);

        }
    }

    private static void fillPortfolioOneSectorFour(){
        //Fill Stocks with user choices in Sector 1
        for(int o = 0; o < tempStocks4.length; o++){

            do{
                System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                System.out.println("Please choose or create the stocks you want in this sector");
                System.out.println("1. Choose Stock");
                System.out.println("2. Create Stock");
                System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if(choice == 1){
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                    System.out.format("%-25s %4s %8s %4s %6s","Name","Region","Price","Volatility","Active" + "\n");
                    System.out.println(autoSector.toString());
                    System.out.print("Which stock would you like to add?\n");
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                    stockChoice = inputNum.nextInt();

                    if(stockChoice == 1 && chosenStock[0]){
                        tempStocks4[o] = autoArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 2 && chosenStock[1]){
                        tempStocks4[o] = autoArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 3 && chosenStock[2]){
                        tempStocks4[o] = autoArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 4 && chosenStock[3]){
                        tempStocks4[o] = autoArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 5 && chosenStock[4]){
                        tempStocks4[o] = autoArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 6 && chosenStock[5]){
                        tempStocks4[o] = autoArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 7 && chosenStock[6]){
                        tempStocks4[o] = autoArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 8 && chosenStock[7]){
                        tempStocks4[o] = autoArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice > 8 || stockChoice < 1){
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else {
                        System.out.println("\nStock already selected. Pick something else.");
                    }

                }
                //Create stocks
                else if(choice == 2){

                    //Slot 1
                    if(o == 0){
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector4Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector4Stock1.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock1.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock1.setVolatility(volatilityTemp);

                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks4[o] = userPortfolio1Sector4Stock1;

                    }
                    //Slot 2
                    else if(o == 1){

                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector4Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector4Stock2.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock2.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock2.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks4[o] = userPortfolio1Sector4Stock2;
                    }
                    //Slot 3
                    else if(o == 2){
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector4Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector4Stock3.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock3.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock3.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks4[o] = userPortfolio1Sector4Stock3;
                    }
                    //Slot 4
                    else if(o == 3){
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector4Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector4Stock4.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock4.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock4.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks4[o] = userPortfolio1Sector4Stock4;
                    }
                    //Slot 5
                    else{
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector4Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector4Stock5.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock5.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock5.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks4[o] = userPortfolio1Sector4Stock5;
                    }

                }

            }while(tempStocks4[o] == null);

        }
    }

    private static void fillPortfolioOneSectorFive(){
        //Fill Stocks with user choices in Sector 1
        for(int o = 0; o < tempStocks5.length; o++){

            do{
                System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                System.out.println("Please choose or create the stocks you want in this sector");
                System.out.println("1. Choose Stock");
                System.out.println("2. Create Stock");
                System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if(choice == 1){
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                    System.out.format("%-25s %4s %8s %4s %6s","Name","Region","Price","Volatility","Active" + "\n");
                    System.out.println(aerospaceSector.toString());
                    System.out.print("Which stock would you like to add?\n");
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                    stockChoice = inputNum.nextInt();

                    if(stockChoice == 1 && chosenStock[0]){
                        tempStocks5[o] = aeroArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 2 && chosenStock[1]){
                        tempStocks5[o] = aeroArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 3 && chosenStock[2]){
                        tempStocks5[o] = aeroArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 4 && chosenStock[3]){
                        tempStocks5[o] = aeroArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 5 && chosenStock[4]){
                        tempStocks5[o] = aeroArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 6 && chosenStock[5]){
                        tempStocks5[o] = aeroArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 7 && chosenStock[6]){
                        tempStocks5[o] = aeroArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 8 && chosenStock[7]){
                        tempStocks5[o] = aeroArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice > 8 || stockChoice < 1){
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else {
                        System.out.println("\nStock already selected. Pick something else.");
                    }

                }
                //Create stocks
                else if(choice == 2){

                    //Slot 1
                    if(o == 0){
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector5Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector5Stock1.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock1.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock1.setVolatility(volatilityTemp);

                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks5[o] = userPortfolio1Sector5Stock1;

                    }
                    //Slot 2
                    else if(o == 1){

                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector5Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector5Stock2.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock2.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock2.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks5[o] = userPortfolio1Sector5Stock2;
                    }
                    //Slot 3
                    else if(o == 2){
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector5Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector5Stock3.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock3.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock3.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks5[o] = userPortfolio1Sector5Stock3;
                    }
                    //Slot 4
                    else if(o == 3){
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector5Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector5Stock4.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock4.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock4.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks5[o] = userPortfolio1Sector5Stock4;
                    }
                    //Slot 5
                    else{
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector5Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector5Stock5.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock5.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock5.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks5[o] = userPortfolio1Sector5Stock5;
                    }

                }

            }while(tempStocks5[o] == null);

        }
    }

    private static void fillPortfolioOneSectorSix(){
        //Fill Stocks with user choices in Sector 1
        for(int o = 0; o < tempStocks6.length; o++){

            do{
                System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                System.out.println("Please choose or create the stocks you want in this sector");
                System.out.println("1. Choose Stock");
                System.out.println("2. Create Stock");
                System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if(choice == 1){
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                    System.out.format("%-25s %4s %8s %4s %6s","Name","Region","Price","Volatility","Active" + "\n");
                    System.out.println(financialSector.toString());
                    System.out.print("Which stock would you like to add?\n");
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                    stockChoice = inputNum.nextInt();

                    if(stockChoice == 1 && chosenStock[0]){
                        tempStocks6[o] = financialArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 2 && chosenStock[1]){
                        tempStocks6[o] = financialArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 3 && chosenStock[2]){
                        tempStocks6[o] = financialArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 4 && chosenStock[3]){
                        tempStocks6[o] = financialArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 5 && chosenStock[4]){
                        tempStocks6[o] = financialArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 6 && chosenStock[5]){
                        tempStocks6[o] = financialArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 7 && chosenStock[6]){
                        tempStocks6[o] = financialArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 8 && chosenStock[7]){
                        tempStocks6[o] = financialArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice > 8 || stockChoice < 1){
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else {
                        System.out.println("\nStock already selected. Pick something else.");
                    }

                }
                //Create stocks
                else if(choice == 2){

                    //Slot 1
                    if(o == 0){
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector6Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector6Stock1.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock1.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock1.setVolatility(volatilityTemp);

                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks6[o] = userPortfolio1Sector6Stock1;

                    }
                    //Slot 2
                    else if(o == 1){

                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector6Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector6Stock2.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock2.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock2.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks6[o] = userPortfolio1Sector6Stock2;
                    }
                    //Slot 3
                    else if(o == 2){
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector6Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector6Stock3.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock3.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock3.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks6[o] = userPortfolio1Sector6Stock3;
                    }
                    //Slot 4
                    else if(o == 3){
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector6Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector6Stock4.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock4.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock4.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks6[o] = userPortfolio1Sector6Stock4;
                    }
                    //Slot 5
                    else{
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector6Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector6Stock5.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock5.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock5.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks6[o] = userPortfolio1Sector6Stock5;
                    }

                }

            }while(tempStocks6[o] == null);

        }
    }

    private static void fillPortfolioOneSectorSeven(){
        //Fill Stocks with user choices in Sector 1
        for(int o = 0; o < tempStocks7.length; o++){

            do{
                System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                System.out.println("Please choose or create the stocks you want in this sector");
                System.out.println("1. Choose Stock");
                System.out.println("2. Create Stock");
                System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if(choice == 1){
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                    System.out.format("%-25s %4s %8s %4s %6s","Name","Region","Price","Volatility","Active" + "\n");
                    System.out.println(foodSector.toString());
                    System.out.print("Which stock would you like to add?\n");
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                    stockChoice = inputNum.nextInt();

                    if(stockChoice == 1 && chosenStock[0]){
                        tempStocks7[o] = foodArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 2 && chosenStock[1]){
                        tempStocks7[o] = foodArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 3 && chosenStock[2]){
                        tempStocks7[o] = foodArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 4 && chosenStock[3]){
                        tempStocks7[o] = foodArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 5 && chosenStock[4]){
                        tempStocks7[o] = foodArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 6 && chosenStock[5]){
                        tempStocks7[o] = foodArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 7 && chosenStock[6]){
                        tempStocks7[o] = foodArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice == 8 && chosenStock[7]){
                        tempStocks7[o] = foodArray[stockChoice-1];
                        chosenStock[stockChoice-1] = false;
                        break;
                    }
                    else if(stockChoice > 8 || stockChoice < 1){
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else {
                        System.out.println("\nStock already selected. Pick something else.");
                    }

                }
                //Create stocks
                else if(choice == 2){

                    //Slot 1
                    if(o == 0){
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector7Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector7Stock1.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock1.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock1.setVolatility(volatilityTemp);

                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks7[o] = userPortfolio1Sector7Stock1;

                    }
                    //Slot 2
                    else if(o == 1){

                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector7Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector7Stock2.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock2.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock2.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks7[o] = userPortfolio1Sector7Stock2;
                    }
                    //Slot 3
                    else if(o == 2){
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector7Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector7Stock3.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock3.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock3.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks7[o] = userPortfolio1Sector7Stock3;
                    }
                    //Slot 4
                    else if(o == 3){
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector7Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector7Stock4.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock4.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock4.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks7[o] = userPortfolio1Sector7Stock4;
                    }
                    //Slot 5
                    else{
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Enter the name of your stock");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                        userPortfolio1Sector7Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the region as a single letter");
                            System.out.println("N for North America, E for Europe, A for Asia, F for Africa, O for Oceania ");
                            System.out.println("Make sure it is a capital letter!");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector7Stock5.setRegion(regionTemp);

                        }while(!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O' ));

                        //Loop makes sure they enter a valid stock price
                        do {
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the current stock price(It must be less the 1000.0 and greater than 0.0) ");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock5.setCurrentPrice(currentPriceTemp);

                        }while(!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do{
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.println("Enter the stocks volatility (It must be less than or equal to 0.2 and greater than 0)");
                            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock5.setVolatility(volatilityTemp);
                        }while(!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks7[o] = userPortfolio1Sector7Stock5;
                    }

                }

            }while(tempStocks7[o] == null);

        }
    }

    private static void basicMenu(Portfolio folio){
        do {
            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
            System.out.println("1. Add Investment");
            System.out.println("2. Take Profit/Loss");
            System.out.println("3. Trade Stock");
            System.out.println("4. List Sectors");
            System.out.println("5. Determine total Capital");
            System.out.println("6. End day");
            System.out.println("Current Balance: " + moneyFormat.format(folio.getCashLeftover()));
            System.out.println("0. Go back");
            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
            menuChoice = inputNum.nextInt();

            //Add Investment
            if (menuChoice == 1) {
                do
                {
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                    System.out.println(folio.getSectors());
                    System.out.println("0. to go back");
                    System.out.println("Which Sector would you like to access?");
                    System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                    sectorChoice = inputNum.nextInt();

                    //Opens the sector of user choice
                    if(sectorChoice > 5 || sectorChoice < 1){
                        System.out.println("Please enter one of the available Sectors");
                    }
                    else{
                        //Prints out all the instruments in that sector
                        for(int i = 0; i < folio.chosenDivisions[sectorChoice -1].instruments.length; i++){
                            if(folio.chosenDivisions[sectorChoice - 1].instruments[i] != null)
                                System.out.println(folio.chosenDivisions[sectorChoice - 1].instruments[i].toString());
                        }
                        //Check if there are any open slots in that sector
                        for(int i = 0; i < folio.chosenDivisions[sectorChoice-1].instruments.length; i++){
                            if(folio.chosenDivisions[sectorChoice-1].instruments[i] == null){

                                //Checks which Sector the user is in (example technology or retail) to know which stocks to allow them to buy
                                if(folio.chosenDivisions[sectorChoice-1].getName().equalsIgnoreCase("technology")){
                                    taken = false;
                                    //print available stocks for purchase in technology sector
                                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                                    System.out.format("%-25s %4s %8s %4s %6s","Name","Region","Price","Volatility","Active" + "\n");
                                    System.out.println(technologySector.toString());
                                    System.out.print("Which stock would you like to add?\n");
                                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                                    stockChoice = inputNum.nextInt();

                                    //Checks to see if user is trying to buy a duplicate stock
                                    for(int u = 0; u < folio.chosenDivisions[sectorChoice-1].instruments.length; u++){
                                        //Check all non null slots for a duplicate
                                        if(folio.chosenDivisions[sectorChoice-1].instruments[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (technologyArray[stockChoice-1].getName().equalsIgnoreCase(folio.chosenDivisions[sectorChoice - 1].instruments[u].getName())) {
                                                System.out.println("Sorry you already have this stock choose another one.");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    //Checks if the stock is taken
                                    if(!taken){
                                        folio.chosenDivisions[sectorChoice-1].instruments[i] = technologyArray[stockChoice -1];
                                        folio.chosenDivisions[sectorChoice-1].instruments[i].buyShares();
                                        folio.cashLeftover -=  1000;
                                        System.out.println(folio.chosenDivisions[sectorChoice-1].instruments[i].toString());
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in crypto sector
                                else if(folio.chosenDivisions[sectorChoice-1].getName().equalsIgnoreCase("Crypto Currency")){
                                    taken = false;
                                    //print available stocks for purchase in crypto sector
                                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                                    System.out.format("%-25s %4s %8s %4s %6s","Name","Region","Price","Volatility","Active" + "\n");
                                    System.out.println(cryptoCurrencySector.toString());
                                    System.out.print("Which stock would you like to add?\n");
                                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for(int u =0; u < folio.chosenDivisions[sectorChoice-1].instruments.length; u++){
                                        //Check all non null slots for a duplicate
                                        if(folio.chosenDivisions[sectorChoice-1].instruments[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (cryptoArray[stockChoice-1].getName().equalsIgnoreCase(folio.chosenDivisions[sectorChoice - 1].instruments[u].getName())) {
                                                System.out.println("Sorry you already have this stock choose another one.");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    //Checks if the stock is taken
                                    if(!taken){
                                        folio.chosenDivisions[sectorChoice-1].instruments[i] = cryptoArray[stockChoice -1];
                                        folio.chosenDivisions[sectorChoice-1].instruments[i].buyShares();
                                        folio.cashLeftover -=  1000;
                                        System.out.println(folio.chosenDivisions[sectorChoice-1].instruments[i].toString());
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in retail sector
                                else if(folio.chosenDivisions[sectorChoice-1].getName().equalsIgnoreCase("Retail")){
                                    taken = false;
                                    //print available stocks for purchase in retail sector
                                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                                    System.out.format("%-25s %4s %8s %4s %6s","Name","Region","Price","Volatility","Active" + "\n");
                                    System.out.println(retailSector.toString());
                                    System.out.print("Which stock would you like to add?\n");
                                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for(int u =0; u < folio.chosenDivisions[sectorChoice-1].instruments.length; u++){
                                        //Check all non null slots for a duplicate
                                        if(folio.chosenDivisions[sectorChoice-1].instruments[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (retailArray[stockChoice-1].getName().equalsIgnoreCase(folio.chosenDivisions[sectorChoice - 1].instruments[u].getName())) {
                                                System.out.println("Sorry you already have this stock choose another one.");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    //Checks if the stock is taken
                                    if(!taken){
                                        folio.chosenDivisions[sectorChoice-1].instruments[i] = retailArray[stockChoice -1];
                                        folio.chosenDivisions[sectorChoice-1].instruments[i].buyShares();
                                        folio.cashLeftover -=  1000;
                                        System.out.println(folio.chosenDivisions[sectorChoice-1].instruments[i].toString());
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in auto sector
                                else if(folio.chosenDivisions[sectorChoice-1].getName().equalsIgnoreCase("Auto")){
                                    taken = false;
                                    //print available stocks for purchase in auto sector
                                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                                    System.out.format("%-25s %4s %8s %4s %6s","Name","Region","Price","Volatility","Active" + "\n");
                                    System.out.println(autoSector.toString());
                                    System.out.print("Which stock would you like to add?\n");
                                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for(int u =0; u < folio.chosenDivisions[sectorChoice-1].instruments.length; u++){
                                        //Check all non null slots for a duplicate
                                        if(folio.chosenDivisions[sectorChoice-1].instruments[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (autoArray[stockChoice-1].getName().equalsIgnoreCase(folio.chosenDivisions[sectorChoice - 1].instruments[u].getName())) {
                                                System.out.println("Sorry you already have this stock choose another one.");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    //Checks if the stock is taken
                                    if(!taken){
                                        folio.chosenDivisions[sectorChoice-1].instruments[i] = autoArray[stockChoice -1];
                                        folio.chosenDivisions[sectorChoice-1].instruments[i].buyShares();
                                        folio.cashLeftover -=  1000;
                                        System.out.println(folio.chosenDivisions[sectorChoice-1].instruments[i].toString());
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in aerospace sector
                                else if(folio.chosenDivisions[sectorChoice-1].getName().equalsIgnoreCase("Aerospace")){
                                    taken = false;
                                    //print available stocks for purchase in aero sector
                                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                                    System.out.format("%-25s %4s %8s %4s %6s","Name","Region","Price","Volatility","Active" + "\n");
                                    System.out.println(aerospaceSector.toString());
                                    System.out.print("Which stock would you like to add?\n");
                                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for(int u =0; u < folio.chosenDivisions[sectorChoice-1].instruments.length; u++){
                                        //Check all non null slots for a duplicate
                                        if(folio.chosenDivisions[sectorChoice-1].instruments[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (aeroArray[stockChoice-1].getName().equalsIgnoreCase(folio.chosenDivisions[sectorChoice - 1].instruments[u].getName())) {
                                                System.out.println("Sorry you already have this stock choose another one.");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    //Checks if the stock is taken
                                    if(!taken){
                                        folio.chosenDivisions[sectorChoice-1].instruments[i] = aeroArray[stockChoice -1];
                                        folio.chosenDivisions[sectorChoice-1].instruments[i].buyShares();
                                        folio.cashLeftover -=  1000;
                                        System.out.println(folio.chosenDivisions[sectorChoice-1].instruments[i].toString());
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in financial sector
                                else if(folio.chosenDivisions[sectorChoice-1].getName().equalsIgnoreCase("Financial")){
                                    taken = false;
                                    //print available stocks for purchase in financial sector
                                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                                    System.out.format("%-25s %4s %8s %4s %6s","Name","Region","Price","Volatility","Active" + "\n");
                                    System.out.println(financialSector.toString());
                                    System.out.print("Which stock would you like to add?\n");
                                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for(int u =0; u < folio.chosenDivisions[sectorChoice-1].instruments.length; u++){
                                        //Check all non null slots for a duplicate
                                        if(folio.chosenDivisions[sectorChoice-1].instruments[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (financialArray[stockChoice-1].getName().equalsIgnoreCase(folio.chosenDivisions[sectorChoice - 1].instruments[u].getName())) {
                                                System.out.println("Sorry you already have this stock choose another one.");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    //Checks if the stock is taken
                                    if(!taken){
                                        folio.chosenDivisions[sectorChoice-1].instruments[i] = financialArray[stockChoice -1];
                                        folio.chosenDivisions[sectorChoice-1].instruments[i].buyShares();
                                        folio.cashLeftover -=  1000;
                                        System.out.println(folio.chosenDivisions[sectorChoice-1].instruments[i].toString());
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in food sector
                                else if(folio.chosenDivisions[sectorChoice-1].getName().equalsIgnoreCase("Food")){
                                    taken = false;
                                    //print available stocks for purchase in food sector
                                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                                    System.out.format("%-25s %4s %8s %4s %6s","Name","Region","Price","Volatility","Active" + "\n");
                                    System.out.println(foodSector.toString());
                                    System.out.print("Which stock would you like to add?\n");
                                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for(int u =0; u < folio.chosenDivisions[sectorChoice-1].instruments.length; u++){
                                        //Check all non null slots for a duplicate
                                        if(folio.chosenDivisions[sectorChoice-1].instruments[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (foodArray[stockChoice-1].getName().equalsIgnoreCase(folio.chosenDivisions[sectorChoice - 1].instruments[u].getName())) {
                                                System.out.println("Sorry you already have this stock choose another one.");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    //Checks if the stock is taken
                                    if(!taken){
                                        folio.chosenDivisions[sectorChoice-1].instruments[i] = foodArray[stockChoice -1];
                                        folio.chosenDivisions[sectorChoice-1].instruments[i].buyShares();
                                        folio.cashLeftover -=  1000;
                                        System.out.println(folio.chosenDivisions[sectorChoice-1].instruments[i].toString());
                                        taken = false;
                                        break;
                                    }
                                    taken = false;
                                }
                               // break;
                            }
                        }

                      }

                }while(sectorChoice != 0);


            }
            //Take Profit / Loss
            else if(menuChoice == 2){
                do
                {
                    //Print out sectors for the user to choose
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                    System.out.println(folio.getSectors());
                    System.out.println("0. to go back");
                    System.out.println("Which Sector would you like to access?");
                    System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                    sectorChoice = inputNum.nextInt();

                    //Print out stocks within chosen Sector
                    if(sectorChoice == 1){
                        for(int i = 0; i < folio.chosenDivisions[sectorChoice - 1].instruments.length; i++){
                            if(folio.chosenDivisions[sectorChoice - 1].instruments[i] != null)
                                System.out.println(folio.chosenDivisions[sectorChoice - 1].instruments[i].toString());
                        }
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Which stock would you like to take profit/loss");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        sectorChoice = inputNum.nextInt();

                        if(folio.chosenDivisions[0].instruments[sectorChoice -1] != null){
                            folio.cashLeftover += folio.chosenDivisions[0].instruments[sectorChoice - 1].takeProfitLoss();
                            folio.chosenDivisions[0].removeStock(sectorChoice-1);
                            for(int i = 0; i < folio.chosenDivisions[0].instruments.length; i++){
                                if(folio.chosenDivisions[0].instruments[i] != null)
                                    System.out.println(folio.chosenDivisions[0].instruments[i].toString());
                            }
                        }else{
                            System.out.println("Please choose a different stock");
                        }
                    }
                    //Sector 2
                    else if(sectorChoice == 2){
                        for(int i = 0; i < folio.chosenDivisions[sectorChoice - 1].instruments.length; i++){
                            if(folio.chosenDivisions[sectorChoice - 1].instruments[i] != null)
                                System.out.println(folio.chosenDivisions[sectorChoice - 1].instruments[i].toString());
                        }
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Which stock would you like to take profit/loss");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        sectorChoice = inputNum.nextInt();

                        if(folio.chosenDivisions[1].instruments[sectorChoice -1] != null){
                            folio.cashLeftover += folio.chosenDivisions[1].instruments[sectorChoice - 1].takeProfitLoss();
                            folio.chosenDivisions[1].removeStock(sectorChoice-1);
                            for(int i = 0; i < folio.chosenDivisions[1].instruments.length; i++){
                                if(folio.chosenDivisions[1].instruments[i] != null)
                                    System.out.println(folio.chosenDivisions[1].instruments[i].toString());
                            }
                        }else{
                            System.out.println("Please choose a different stock");
                        }
                    }
                    //Sector 3
                    else if(sectorChoice == 3){
                        for(int i = 0; i < folio.chosenDivisions[sectorChoice - 1].instruments.length; i++){
                            if(folio.chosenDivisions[sectorChoice - 1].instruments[i] != null)
                                System.out.println(folio.chosenDivisions[sectorChoice - 1].instruments[i].toString());
                        }
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Which stock would you like to take profit/loss");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        sectorChoice = inputNum.nextInt();

                        if(folio.chosenDivisions[2].instruments[sectorChoice -1] != null){
                            folio.cashLeftover += folio.chosenDivisions[2].instruments[sectorChoice - 1].takeProfitLoss();
                            folio.chosenDivisions[2].removeStock(sectorChoice-1);
                            for(int i = 0; i < folio.chosenDivisions[2].instruments.length; i++){
                                if(folio.chosenDivisions[2].instruments[i] != null)
                                    System.out.println(folio.chosenDivisions[2].instruments[i].toString());
                            }
                        }else{
                            System.out.println("Please choose a different stock");
                        }
                    }
                    //Sector 4
                    else if(sectorChoice == 4){
                        for(int i = 0; i < folio.chosenDivisions[sectorChoice - 1].instruments.length; i++){
                            if(folio.chosenDivisions[sectorChoice - 1].instruments[i] != null)
                                System.out.println(folio.chosenDivisions[sectorChoice - 1].instruments[i].toString());
                        }
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Which stock would you like to take profit/loss");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        sectorChoice = inputNum.nextInt();

                        if(folio.chosenDivisions[3].instruments[sectorChoice -1] != null){
                            folio.cashLeftover += folio.chosenDivisions[3].instruments[sectorChoice - 1].takeProfitLoss();
                            folio.chosenDivisions[3].removeStock(sectorChoice-1);
                            for(int i = 0; i < folio.chosenDivisions[3].instruments.length; i++){
                                if(folio.chosenDivisions[3].instruments[i] != null)
                                    System.out.println(folio.chosenDivisions[3].instruments[i].toString());
                            }
                        }else{
                            System.out.println("Please choose a different stock");
                        }
                    }
                    //Sector 5
                    else if(sectorChoice == 5){
                        for(int i = 0; i < folio.chosenDivisions[sectorChoice - 1].instruments.length; i++){
                            if(folio.chosenDivisions[sectorChoice - 1].instruments[i] != null)
                                System.out.println(folio.chosenDivisions[sectorChoice - 1].instruments[i].toString());
                        }
                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Which stock would you like to take profit/loss");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        sectorChoice = inputNum.nextInt();

                        if(folio.chosenDivisions[4].instruments[sectorChoice -1] != null){
                            folio.cashLeftover += folio.chosenDivisions[4].instruments[sectorChoice - 1].takeProfitLoss();
                            folio.chosenDivisions[4].removeStock(sectorChoice-1);
                            for(int i = 0; i < folio.chosenDivisions[4].instruments.length; i++){
                                if(folio.chosenDivisions[4].instruments[i] != null)
                                    System.out.println(folio.chosenDivisions[4].instruments[i].toString());
                            }
                        }else{
                            System.out.println("Please choose a different stock");
                        }
                    }
                }while(sectorChoice !=0);
            }
            //Trade Stock
            else if(menuChoice == 3){

                do
                {
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                    System.out.println(folio.getSectors());
                    System.out.println("0. to go back");
                    System.out.println("Which Sector would you like to access?");
                    System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                    sectorChoice = inputNum.nextInt();

                    //Opens the sector of user choice
                    if (sectorChoice > 5 || sectorChoice < 1)
                    {
                        System.out.println("Please enter one of the available Sectors");
                    }
                    else {
                        //Prints out all the instruments in that sector
                        for (int i = 0; i < folio.chosenDivisions[sectorChoice - 1].instruments.length; i++) {

                            if (folio.chosenDivisions[sectorChoice - 1].instruments[i] != null)
                                System.out.println(folio.chosenDivisions[sectorChoice - 1].instruments[i].toString());

                        }

                        System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        System.out.println("Which stock would you like to trade?");
                        System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                        stockChoice = inputNum.nextInt();

                        if(stockChoice == 1){
                            currentStock = folio.chosenDivisions[sectorChoice - 1].instruments[stockChoice-1];
                        }
                        else if(stockChoice == 2){
                            currentStock = folio.chosenDivisions[sectorChoice - 1].instruments[stockChoice - 1];
                        }
                        else if(stockChoice == 3){
                            currentStock = folio.chosenDivisions[sectorChoice - 1].instruments[stockChoice -1];
                        }
                        else if(stockChoice == 4){
                            currentStock = folio.chosenDivisions[sectorChoice - 1].instruments[stockChoice - 1];
                        }
                        else if(stockChoice == 5){
                            currentStock = folio.chosenDivisions[sectorChoice - 1].instruments[stockChoice - 1];
                        }
                        else{
                            System.out.println("Please enter a valid stock");
                        }

                        if(folio.chosenDivisions[sectorChoice-1].getName().equalsIgnoreCase("technology")){
                            taken = false;
                            //print available stocks for purchase in technology sector
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                            System.out.format("%-25s %4s %8s %4s %6s","Name","Region","Price","Volatility","Active" + "\n");
                            System.out.println(technologySector.toString());
                            System.out.print("Which stock would you like to add?\n");
                            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]");
                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for(int u = 0; u < folio.chosenDivisions[sectorChoice-1].instruments.length; u++){
                                //Check all non null slots for a duplicate
                                if(folio.chosenDivisions[sectorChoice-1].instruments[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (technologyArray[stockChoice-1].getName().equalsIgnoreCase(folio.chosenDivisions[sectorChoice - 1].instruments[u].getName())) {
                                        System.out.println("Sorry you already have this stock choose another one.");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if(!taken){
                                if(stockChoice == 1){
                                    newStock = technologyArray[sectorChoice-1];

                                }
                                else if(stockChoice == 2){
                                    newStock = technologyArray[sectorChoice-1];
                                }
                                else if(stockChoice == 3){
                                    newStock = technologyArray[sectorChoice-1];
                                }
                                else if(stockChoice == 4){
                                    newStock = technologyArray[sectorChoice-1];
                                }
                                else if(stockChoice == 5){
                                    newStock = technologyArray[sectorChoice-1];
                                }
                                else if(stockChoice == 6){
                                    newStock = technologyArray[sectorChoice-1];
                                }
                                else if(stockChoice == 7){
                                    newStock = technologyArray[sectorChoice-1];
                                }
                                else if(stockChoice == 8){
                                    newStock = technologyArray[sectorChoice-1];
                                }
                                else{
                                    System.out.println("Please enter a valid stock");
                                }

                                folio.chosenDivisions[sectorChoice - 1].tradeStock(newStock, currentStock);

                            }
                        }


                    }
                }while(sectorChoice != 0);

            }
            //List Sectors
            else if(menuChoice == 4){
                do
                {
                    System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                    System.out.println(folio.getSectors());
                    System.out.println("0. to go back");
                    System.out.println("Which Sector would you like to access?");
                    System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
                    sectorChoice = inputNum.nextInt();

                    //Opens the sector of user choice
                    if (sectorChoice > 5 || sectorChoice < 1)
                    {
                        System.out.println("Please enter one of the available Sectors");
                    } else
                    {
                        //Prints out all the instruments in that sector
                        for (int i = 0; i < folio.chosenDivisions[sectorChoice - 1].instruments.length; i++)
                        {
                            if (folio.chosenDivisions[sectorChoice - 1].instruments[i] != null)
                                System.out.println(folio.chosenDivisions[sectorChoice - 1].instruments[i].toString());
                        }
                    }
                }while(sectorChoice != 0);
            }
            //Determine total Capital
            else if(menuChoice == 5){

                folio.getCapital();

            }
            //End Day
            else if(menuChoice == 6){

            }
            else{
                System.out.println("Please enter a correct number.");
            }

        }while(menuChoice != 0);
    }




}
