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

public class Main
{

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
    private static Stock intelStock = new Stock("Intel", 'N', 60.54, 0.07, true);
    private static Stock appleStock = new Stock("Apple", 'N', 316.75, 0.08, true);
    private static Stock alphabetStock = new Stock("Alphabet", 'N', 1482.98, 0.09, true);
    private static Stock samsungStock = new Stock("Samsung", 'A', 218.32, 0.07, true);
    private static Stock microsoftStock = new Stock("Microsoft", 'N', 166.25, 0.08, true);
    private static Stock nvidiaStock = new Stock("Nvidia", 'A', 247.95, 0.1, true);
    private static Stock nintendoStock = new Stock("Nintendo", 'A', 53.26, 0.07, true);
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
    private static Stock ebayStock = new Stock("Ebay", 'N', 35.72, 0.08, true);

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
    private static Stock hAndRBlockStock = new Stock("H and R Block", 'E', 53.63, 0.04, true);
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

    private static Sector[] defaultSectors = {technologySector, cryptoCurrencySector, retailSector, autoSector, aerospaceSector, financialSector, foodSector};

    //initialize sector array for first portfolio.
    private static Sector[] userSectors1 = new Sector[5];
    private static Portfolio portfolio1 = new Portfolio("", userSectors1);

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
    private static Portfolio portfolio2 = new Portfolio("", userSectors2);

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
    private static Portfolio portfolio3 = new Portfolio("", userSectors3);

    //Initialize user Sectors for portfolio 3
    private static Sector userTechnology3 = new Sector("Technology");
    private static Sector userCrypto3 = new Sector("Crypto Currency");
    private static Sector userRetail3 = new Sector("Retail");
    private static Sector userAuto3 = new Sector("Auto");
    private static Sector userAerospace3 = new Sector("Aerospace");
    private static Sector userFinancial3 = new Sector("Financial");
    private static Sector userFood3 = new Sector("Food");

    private static int numPortfolios = 0;

    //User menu selection
    private static int choice;
    //Prevents user from adding the same sector or Stock twice
    private static Boolean[] chosen = {true, true, true, true, true, true, true};
    private static Boolean[] chosenStock = {true, true, true, true, true, true, true, true};

    private static Boolean[] chosen2 = {true, true, true, true, true, true, true};
    private static Boolean[] chosenStock2 = {true, true, true, true, true, true, true, true};

    private static Boolean[] chosen3 = {true, true, true, true, true, true, true};
    private static Boolean[] chosenStock3 = {true, true, true, true, true, true, true, true};

    //Temp stock array to fill sectors.
    private static Stock[] tempStocks1 = new Stock[5];
    private static Stock[] tempStocks2 = new Stock[5];
    private static Stock[] tempStocks3 = new Stock[5];
    private static Stock[] tempStocks4 = new Stock[5];
    private static Stock[] tempStocks5 = new Stock[5];
    private static Stock[] tempStocks6 = new Stock[5];
    private static Stock[] tempStocks7 = new Stock[5];

    private static Stock[] temp2Stocks1 = new Stock[5];
    private static Stock[] temp2Stocks2 = new Stock[5];
    private static Stock[] temp2Stocks3 = new Stock[5];
    private static Stock[] temp2Stocks4 = new Stock[5];
    private static Stock[] temp2Stocks5 = new Stock[5];
    private static Stock[] temp2Stocks6 = new Stock[5];
    private static Stock[] temp2Stocks7 = new Stock[5];

    private static Stock[] temp3Stocks1 = new Stock[5];
    private static Stock[] temp3Stocks2 = new Stock[5];
    private static Stock[] temp3Stocks3 = new Stock[5];
    private static Stock[] temp3Stocks4 = new Stock[5];
    private static Stock[] temp3Stocks5 = new Stock[5];
    private static Stock[] temp3Stocks6 = new Stock[5];
    private static Stock[] temp3Stocks7 = new Stock[5];

    //user stock choice
    private static int stockChoice;
    private static double currentPriceTemp;
    private static double volatilityTemp;
    private static char regionTemp;

    //Menu navigator
    private static int gameChoice;
    private static int basicMenuChoice;
    private static int menuChoice;
    private static int sectorChoice;
    private static boolean taken = false;

    //Trade Stocks temporary objects
    private static Stock currentStock;
    private static Stock newStock;

    private static Random gen = new Random();

    public static void main(String[] args)
    {


        /**
         * WHEN YOU END THE DAY, DO THE FOLLOWING:
         * 1. clear dailyProfit.
         * 2. change price with volatility.
         * 3. update new price;
         * 4. set beginDayPrice.
         */

        System.out.println("┍━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\uD83D\uDCB5\uD83D\uDCB5\uD83D\uDCB5━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┑");
        System.out.println("\n\t      ::::::::    :::::::::::        ::::::::        ::::    :::        :::    :::        :::::::: \n" +
                "\t    :+:    :+:       :+:           :+:    :+:       :+:+:   :+:        :+:   :+:        :+:    :+: \n" +
                "\t   +:+              +:+           +:+    +:+       :+:+:+  +:+        +:+  +:+         +:+         \n" +
                "\t  +#++:++#++       +#+           +#+    +:+       +#+ +:+ +#+        +#++:++          +#++:++#++   \n" +
                "\t        +#+       +#+           +#+    +#+       +#+  +#+#+#        +#+  +#+                +#+    \n" +
                "\t#+#    #+#       #+#           #+#    #+#       #+#   #+#+#        #+#   #+#        #+#    #+#     \n" +
                "\t########        ###            ########        ###    ####        ###    ###        ########       \n");
        System.out.println("┕━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\uD83D\uDCB5\uD83D\uDCB5\uD83D\uDCB5━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┙");
        System.out.println("Welcome to Stonks! The game where you can practice trading stocks in an artificial market.\n");


        do
        {
            System.out.println("【Play the Game】");
            System.out.println("-----------------------------------------------------------");
            System.out.println("1. Play.");
            System.out.println("2. About us.");
            System.out.print("Enter your choice (-1 to exit): ");
            gameChoice = inputNum.nextInt();
            System.out.println("-----------------------------------------------------------");


            if (gameChoice == 1)
            {

                do
                {

                    if (numPortfolios < 1)
                    {
                        gameChoice = 1;
                    }
                    else
                    {

                        System.out.println("-----------------------------------------------------------");
                        System.out.println("\uD83D\uDCB0 Portfolio Menu \uD83D\uDCB0");
                        System.out.println("-----------------------------------------------------------");

                        System.out.println("◈◈ Create || Select ◈◈");
                        System.out.println("\t 1. Create a Portfolio (max of three)");
                        System.out.println("\t 2. Select Portfolio");
                        System.out.print("\t Enter your choice: ");
                        gameChoice = inputNum.nextInt();
                        //Line Break
                        System.out.println(" ");
                    }

                    //prevents creating more than 3 portfolios.
                    if (gameChoice == 1 && numPortfolios == 3)
                    {
                        System.out.println("Cannot create additional portfolio, already at 3.");
                    }
                    //create portfolio
                    else if (gameChoice == 1)
                    {
                        numPortfolios++;
                        createPortfolio();
                    }
                    //Continue with the rest of the game
                    else if (gameChoice == 2)
                    {
                        if (numPortfolios == 3)
                        {
                            do
                            {
                                System.out.println("\t★ Portfolio Selection ★");
                                System.out.println("\t---------------------------");
                                System.out.println("\t\tWhich portfolio would you like to access?");
                                System.out.println("\t\t1. " + portfolio1.getName());
                                System.out.println("\t\t2. " + portfolio2.getName());
                                System.out.println("\t\t3. " + portfolio3.getName());
                                System.out.println("\t\tEnter 0 to go back.");
                                System.out.print("\t\tYour choice: ");
                                menuChoice = inputNum.nextInt();

                                if (menuChoice == 1)                        //Portfolio 1
                                {
                                    basicMenu1();
                                }
                                else if (menuChoice == 2)                   //Portfolio 2
                                {
                                    basicMenu2();
                                }
                                else if (menuChoice == 3)                   //Portfolio 3
                                {
                                    basicMenu3();
                                }
                                else if (menuChoice == 0)                     //Exit
                                {
                                    System.out.println("\t\tExiting menu.");
                                }
                                else
                                {
                                    System.out.println("\t\tPlease enter a correct number");
                                }

                            } while (menuChoice != 0);

                        }
                        else if (numPortfolios == 2)
                        {
                            do
                            {
                                System.out.println("\t★ Portfolio Selection ★");
                                System.out.println("\t---------------------------");
                                System.out.println("\t\tWhich portfolio would you like to access?");
                                System.out.println("\t\t1. " + portfolio1.getName());
                                System.out.println("\t\t2. " + portfolio2.getName());
                                System.out.println("\t\tEnter 0 to go back.");
                                System.out.print("\t\tYour choice: ");
                                menuChoice = inputNum.nextInt();

                                if (menuChoice == 1)
                                {
                                    basicMenu1();
                                }
                                else if (menuChoice == 2)
                                {
                                    basicMenu2();
                                }
                                else if (menuChoice == 0)
                                {
                                    System.out.println("\t\tExiting menu.");
                                }
                                else
                                {
                                    System.out.println("\t\tPlease enter a correct number.");
                                }

                            } while (menuChoice != 0);
                        }
                        else
                        {
                            do
                            {
                                System.out.println("\t★ Portfolio Selection ★");
                                System.out.println("\t---------------------------");
                                System.out.println("\t\tWhich portfolio would you like to access?");
                                System.out.println("\t\t1. " + portfolio1.getName());
                                System.out.println("\t\tEnter 0 to go back.");
                                System.out.print("\t\tYour choice: ");
                                menuChoice = inputNum.nextInt();

                                if (menuChoice == 1)
                                {
                                    basicMenu1();
                                }
                                else if (menuChoice == 0)
                                {
                                    System.out.println("\t\tExiting menu.");
                                }
                                else
                                {
                                    System.out.println("\t\tPlease enter a correct number.");
                                }

                            } while (menuChoice != 0);
                        }
                    }
                } while (gameChoice != 0);
            }
            else if (gameChoice == 2)
            {
                System.out.println("test 2");
            }
            else if (gameChoice == -1)
            {
                System.out.println("Exiting. Have a good day.");
            }
            else
            {
                System.out.println("Please enter a valid choice.");
            }

        } while (gameChoice != -1);


    }

    private static void createPortfolio()
    {

        if (numPortfolios == 1)
        {
            System.out.println("\uD83D\uDCB0 Portfolio Creation \uD83D\uDCB0");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Enter the name of your first portfolio: ");
            portfolio1.setName(inputStr.nextLine());
            System.out.println(" ");

            for (int i = 0; i < userSectors1.length; i++)
            {

                do
                {
                    System.out.println("◈◈ Sector Setup ◈◈");
                    System.out.println("\t★ Select a sector. ★");
                    System.out.println("\t---------------------------");
                    System.out.println("\tPlease choose what sectors. you want in your portfolio.");
                    System.out.println("\n\t\t⚠⚠ Choose carefully. ⚠⚠");
                    System.out.println("\t\tYou will not be able to change them later!\n");
                    System.out.println("\t1. Technology, 2. Crypto Currency, 3. Retail, \n\t4. Auto, 5. Aerospace and Defence, 6. Financial, 7. Food\n");
                    System.out.print("\tEnter your choice: ");
                    choice = inputNum.nextInt();

                    if (chosen[choice - 1])
                    {
                        System.out.println("\n\t ★ Select your stocks. ★");
                        System.out.println("\t---------------------------");
                    }

                    //User chooses technology sector and stocks within.
                    if (choice == 1 && chosen[0])
                    {
                        //Set the chosen sector
                        userSectors1[i] = userTechnology1;

                        //Fills Sector One stocks
                        fillPortfolioOneSectorOne();
                        userSectors1[i].setInstruments(tempStocks1);
                        //Prevents user from adding the same sector twice
                        chosen[0] = false;


                        //clears double stock check
                        for (int u = 0; u < chosenStock.length; u++)
                        {
                            chosenStock[u] = true;
                        }

                        break;
                    }
                    //User chooses Crypto sector and stocks within.
                    else if (choice == 2 && chosen[1])
                    {
                        userSectors1[i] = userCrypto1;

                        //Prevents user from adding the same sector twice
                        chosen[1] = false;

                        fillPortfolioOneSectorTwo();
                        userSectors1[i].setInstruments(tempStocks2);

                        //clears double stock check
                        for (int u = 0; u < chosenStock.length; u++)
                        {
                            chosenStock[u] = true;
                        }
                        break;
                    }
                    //User chooses Retail sector and stocks within.
                    else if (choice == 3 && chosen[2])
                    {
                        userSectors1[i] = userRetail1;

                        //Prevents user from adding the same sector twice
                        chosen[2] = false;

                        fillPortfolioOneSectorThree();
                        userSectors1[i].setInstruments(tempStocks3);


                        //clears double stock check
                        for (int u = 0; u < chosenStock.length; u++)
                        {
                            chosenStock[u] = true;
                        }

                        break;
                    }
                    //User chooses Auto sector and stocks within.
                    else if (choice == 4 && chosen[3])
                    {
                        userSectors1[i] = userAuto1;

                        //Prevents user from adding the same sector twice
                        chosen[3] = false;

                        fillPortfolioOneSectorFour();
                        userSectors1[i].setInstruments(tempStocks4);


                        //clears double stock check
                        for (int u = 0; u < chosenStock.length; u++)
                        {
                            chosenStock[u] = true;
                        }
                        break;
                    }
                    //User chooses Aerospace sector and stocks within.
                    else if (choice == 5 && chosen[4])
                    {
                        userSectors1[i] = userAerospace1;

                        //Prevents user from adding the same sector twice
                        chosen[4] = false;

                        fillPortfolioOneSectorFive();
                        userSectors1[i].setInstruments(tempStocks5);


                        //clears double stock check
                        for (int u = 0; u < chosenStock.length; u++)
                        {
                            chosenStock[u] = true;
                        }

                        break;
                    }
                    //User chooses Financial sector and stocks within.
                    else if (choice == 6 && chosen[5])
                    {
                        userSectors1[i] = userFinancial1;

                        //Prevents user from adding the same sector twice
                        chosen[5] = false;

                        fillPortfolioOneSectorSix();
                        userSectors1[i].setInstruments(tempStocks6);


                        //clears double stock check
                        for (int u = 0; u < chosenStock.length; u++)
                        {
                            chosenStock[u] = true;
                        }

                        break;
                    }
                    //User chooses Food sector and stocks within.
                    else if (choice == 7 && chosen[6])
                    {
                        userSectors1[i] = userFood1;

                        //Prevents user from adding the same sector twice
                        chosen[6] = false;

                        fillPortfolioOneSectorSeven();
                        userSectors1[i].setInstruments(tempStocks7);


                        //clears double stock check
                        for (int u = 0; u < chosenStock.length; u++)
                        {
                            chosenStock[u] = true;
                        }

                        break;
                    }
                    else if (choice < 1 || choice > 7)
                    {
                        System.out.println("\t⚠ Please enter a number from 1-7. ⚠\n");
                    }
                    else
                    {
                        System.out.println("\t⚠⚠ Sector already selected. Pick something else. ⚠⚠\n");
                    }
                } while (userSectors1[i] == null);
            }
            portfolio1.setSectors(userSectors1);
            for (int i = 0; i < portfolio1.getChosenDivisions().length; i++)
            {

                for (int u = 0; u < portfolio1.getChosenDivisions()[i].getInstruments().length; u++)
                {
                    portfolio1.getChosenDivisions()[i].getInstruments()[u].buyShares();
                    portfolio1.cashLeftover -= 1000;
                }

            }
        }
        else if (numPortfolios == 2)
        {
            System.out.println("\uD83D\uDCB0 Portfolio Creation \uD83D\uDCB0");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Enter the name of your second portfolio: ");
            portfolio2.setName(inputStr.nextLine());
            System.out.println(" ");

            for (int i = 0; i < userSectors2.length; i++)
            {

                do
                {
                    System.out.println("◈◈ Sector Setup ◈◈");
                    System.out.println("\t★ Select a sector. ★");
                    System.out.println("\t---------------------------");
                    System.out.println("\tPlease choose what sectors. you want in your portfolio.");
                    System.out.println("\n\t\t⚠⚠ Choose carefully. ⚠⚠");
                    System.out.println("\t\tYou will not be able to change them later!\n");
                    System.out.println("\t1. Technology, 2. Crypto Currency, 3. Retail, \n\t4. Auto, 5. Aerospace and Defence, 6. Financial, 7. Food\n");
                    System.out.print("\tEnter your choice: ");
                    choice = inputNum.nextInt();
                    if (chosen2[choice - 1])
                    {
                        System.out.println("\n\t ★ Select your stocks. ★");
                        System.out.println("\t---------------------------");
                    }
                    //User chooses technology sector and stocks within.
                    if (choice == 1 && chosen2[0])
                    {
                        //Set the chosen sector
                        userSectors2[i] = userTechnology2;

                        //Fills Sector One stocks
                        fillPortfolioTwoSectorOne();
                        userSectors2[i].setInstruments(temp2Stocks1);
                        //Prevents user from adding the same sector twice
                        chosen2[0] = false;


                        //clears double stock check
                        for (int u = 0; u < chosenStock2.length; u++)
                        {
                            chosenStock2[u] = true;
                        }

                        break;
                    }
                    //User chooses Crypto sector and stocks within.
                    else if (choice == 2 && chosen2[1])
                    {
                        userSectors2[i] = userCrypto2;

                        //Prevents user from adding the same sector twice
                        chosen2[1] = false;

                        fillPortfolioTwoSectorTwo();
                        userSectors2[i].setInstruments(temp2Stocks2);

                        //clears double stock check
                        for (int u = 0; u < chosenStock2.length; u++)
                        {
                            chosenStock2[u] = true;
                        }
                        break;
                    }
                    //User chooses Retail sector and stocks within.
                    else if (choice == 3 && chosen2[2])
                    {
                        userSectors2[i] = userRetail2;

                        //Prevents user from adding the same sector twice
                        chosen2[2] = false;

                        fillPortfolioTwoSectorThree();
                        userSectors2[i].setInstruments(temp2Stocks3);


                        //clears double stock check
                        for (int u = 0; u < chosenStock2.length; u++)
                        {
                            chosenStock2[u] = true;
                        }

                        break;
                    }
                    //User chooses Auto sector and stocks within.
                    else if (choice == 4 && chosen2[3])
                    {
                        userSectors2[i] = userAuto2;

                        //Prevents user from adding the same sector twice
                        chosen2[3] = false;

                        fillPortfolioTwoSectorFour();
                        userSectors2[i].setInstruments(temp2Stocks4);


                        //clears double stock check
                        for (int u = 0; u < chosenStock2.length; u++)
                        {
                            chosenStock2[u] = true;
                        }
                        break;
                    }
                    //User chooses Aerospace sector and stocks within.
                    else if (choice == 5 && chosen2[4])
                    {
                        userSectors2[i] = userAerospace2;

                        //Prevents user from adding the same sector twice
                        chosen2[4] = false;

                        fillPortfolioTwoSectorFive();
                        userSectors2[i].setInstruments(temp2Stocks5);


                        //clears double stock check
                        for (int u = 0; u < chosenStock2.length; u++)
                        {
                            chosenStock2[u] = true;
                        }

                        break;
                    }
                    //User chooses Financial sector and stocks within.
                    else if (choice == 6 && chosen2[5])
                    {
                        userSectors2[i] = userFinancial2;

                        //Prevents user from adding the same sector twice
                        chosen2[5] = false;

                        fillPortfolioTwoSectorSix();
                        userSectors2[i].setInstruments(temp2Stocks6);


                        //clears double stock check
                        for (int u = 0; u < chosenStock2.length; u++)
                        {
                            chosenStock2[u] = true;
                        }

                        break;
                    }
                    //User chooses Food sector and stocks within.
                    else if (choice == 7 && chosen2[6])
                    {
                        userSectors2[i] = userFood2;

                        //Prevents user from adding the same sector twice
                        chosen2[6] = false;

                        fillPortfolioTwoSectorSeven();
                        userSectors2[i].setInstruments(temp2Stocks7);


                        //clears double stock check
                        for (int u = 0; u < chosenStock2.length; u++)
                        {
                            chosenStock2[u] = true;
                        }

                        break;
                    }
                    else if (choice < 1 || choice > 7)
                    {
                        System.out.println("\t⚠ Please enter a number from 1-7. ⚠\n");
                    }
                    else
                    {
                        System.out.println("\t⚠⚠ Sector already selected. Pick something else. ⚠⚠\n");
                    }
                } while (userSectors2[i] == null);
            }
            portfolio2.setSectors(userSectors2);
            for (int i = 0; i < portfolio2.getChosenDivisions().length; i++)
            {

                for (int u = 0; u < portfolio2.getChosenDivisions()[i].getInstruments().length; u++)
                {
                    portfolio2.getChosenDivisions()[i].getInstruments()[u].buyShares();
                    portfolio2.cashLeftover -= 1000;
                }

            }
        }
        else if (numPortfolios == 3)
        {
            System.out.println("\uD83D\uDCB0 Portfolio Creation \uD83D\uDCB0");
            System.out.println("-----------------------------------------------------------");
            System.out.print("Enter the name of your third portfolio: ");
            portfolio3.setName(inputStr.nextLine());
            System.out.println(" ");

            for (int i = 0; i < userSectors3.length; i++)
            {

                do
                {
                    System.out.println("◈◈ Sector Setup ◈◈");
                    System.out.println("\t★ Select a sector. ★");
                    System.out.println("\t---------------------------");
                    System.out.println("\tPlease choose what sectors. you want in your portfolio.");
                    System.out.println("\n\t\t⚠⚠ Choose carefully. ⚠⚠");
                    System.out.println("\t\tYou will not be able to change them later!\n");
                    System.out.println("\t1. Technology, 2. Crypto Currency, 3. Retail, \n\t4. Auto, 5. Aerospace and Defence, 6. Financial, 7. Food\n");
                    System.out.print("\tEnter your choice: ");
                    choice = inputNum.nextInt();
                    if (chosen3[choice - 1])
                    {
                        System.out.println("\n\t ★ Select your stocks. ★");
                        System.out.println("\t---------------------------");
                    }
                    //User chooses technology sector and stocks within.
                    if (choice == 1 && chosen3[0])
                    {
                        //Set the chosen sector
                        userSectors3[i] = userTechnology3;

                        //Fills Sector One stocks
                        fillPortfolioThreeSectorOne();
                        userSectors3[i].setInstruments(temp3Stocks1);
                        //Prevents user from adding the same sector twice
                        chosen3[0] = false;


                        //clears double stock check
                        for (int u = 0; u < chosenStock3.length; u++)
                        {
                            chosenStock3[u] = true;
                        }

                        break;
                    }
                    //User chooses Crypto sector and stocks within.
                    else if (choice == 2 && chosen3[1])
                    {
                        userSectors3[i] = userCrypto3;

                        //Prevents user from adding the same sector twice
                        chosen3[1] = false;

                        fillPortfolioThreeSectorTwo();
                        userSectors3[i].setInstruments(temp3Stocks3);

                        //clears double stock check
                        for (int u = 0; u < chosenStock3.length; u++)
                        {
                            chosenStock3[u] = true;
                        }
                        break;
                    }
                    //User chooses Retail sector and stocks within.
                    else if (choice == 3 && chosen3[2])
                    {
                        userSectors3[i] = userRetail3;

                        //Prevents user from adding the same sector twice
                        chosen3[2] = false;

                        fillPortfolioThreeSectorThree();
                        userSectors3[i].setInstruments(temp3Stocks3);


                        //clears double stock check
                        for (int u = 0; u < chosenStock3.length; u++)
                        {
                            chosenStock3[u] = true;
                        }

                        break;
                    }
                    //User chooses Auto sector and stocks within.
                    else if (choice == 4 && chosen3[3])
                    {
                        userSectors3[i] = userAuto3;

                        //Prevents user from adding the same sector twice
                        chosen3[3] = false;

                        fillPortfolioThreeSectorFour();
                        userSectors3[i].setInstruments(temp3Stocks4);


                        //clears double stock check
                        for (int u = 0; u < chosenStock3.length; u++)
                        {
                            chosenStock3[u] = true;
                        }
                        break;
                    }
                    //User chooses Aerospace sector and stocks within.
                    else if (choice == 5 && chosen3[4])
                    {
                        userSectors3[i] = userAerospace3;

                        //Prevents user from adding the same sector twice
                        chosen3[4] = false;

                        fillPortfolioThreeSectorFive();
                        userSectors3[i].setInstruments(temp3Stocks5);


                        //clears double stock check
                        for (int u = 0; u < chosenStock3.length; u++)
                        {
                            chosenStock3[u] = true;
                        }

                        break;
                    }
                    //User chooses Financial sector and stocks within.
                    else if (choice == 6 && chosen3[5])
                    {
                        userSectors3[i] = userFinancial3;

                        //Prevents user from adding the same sector twice
                        chosen3[5] = false;

                        fillPortfolioThreeSectorSix();
                        userSectors3[i].setInstruments(temp3Stocks6);


                        //clears double stock check
                        for (int u = 0; u < chosenStock3.length; u++)
                        {
                            chosenStock3[u] = true;
                        }

                        break;
                    }
                    //User chooses Food sector and stocks within.
                    else if (choice == 7 && chosen3[6])
                    {
                        userSectors3[i] = userFood3;

                        //Prevents user from adding the same sector twice
                        chosen3[6] = false;

                        fillPortfolioThreeSectorSeven();
                        userSectors3[i].setInstruments(temp3Stocks7);


                        //clears double stock check
                        for (int u = 0; u < chosenStock3.length; u++)
                        {
                            chosenStock3[u] = true;
                        }

                        break;
                    }
                    else if (choice < 1 || choice > 7)
                    {
                        System.out.println("\t⚠ Please enter a number from 1-7. ⚠\n");
                    }
                    else
                    {
                        System.out.println("\t⚠⚠ Sector already selected. Pick something else. ⚠⚠\n");
                    }
                } while (userSectors3[i] == null);
            }
            portfolio3.setSectors(userSectors3);
            for (int i = 0; i < portfolio3.getChosenDivisions().length; i++)
            {

                for (int u = 0; u < portfolio3.getChosenDivisions()[i].getInstruments().length; u++)
                {
                    portfolio3.getChosenDivisions()[i].getInstruments()[u].buyShares();
                    portfolio3.cashLeftover -= 1000;
                }

            }
        }

    }

    //Portfolio 1 Creation
    private static void fillPortfolioOneSectorOne()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < tempStocks1.length; o++)
        {
            do
            {
                System.out.println("\t「Technology Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {

                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(technologySector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock[0])
                    {
                        tempStocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock[1])
                    {
                        tempStocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock[2])
                    {
                        tempStocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock[3])
                    {
                        tempStocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock[4])
                    {
                        tempStocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock[5])
                    {
                        tempStocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock[6])
                    {
                        tempStocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock[7])
                    {
                        tempStocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }


                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector1Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector1Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock1.setVolatility(volatilityTemp);
                            System.out.println(" ");

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks1[o] = userPortfolio1Sector1Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector1Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector1Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks1[o] = userPortfolio1Sector1Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector1Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector1Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks1[o] = userPortfolio1Sector1Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector1Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector1Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks1[o] = userPortfolio1Sector1Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector1Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector1Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector1Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks1[o] = userPortfolio1Sector1Stock5;
                    }

                }


            } while (tempStocks1[o] == null);

        }

    }

    private static void fillPortfolioOneSectorTwo()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < tempStocks2.length; o++)
        {

            do
            {
                System.out.println("\t「Crypto Currency Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(cryptoCurrencySector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock[0])
                    {
                        tempStocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock[1])
                    {
                        tempStocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock[2])
                    {
                        tempStocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock[3])
                    {
                        tempStocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock[4])
                    {
                        tempStocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock[5])
                    {
                        tempStocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock[6])
                    {
                        tempStocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock[7])
                    {
                        tempStocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }

                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector2Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector2Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks2[o] = userPortfolio1Sector2Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector2Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector2Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks2[o] = userPortfolio1Sector2Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector2Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector2Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks2[o] = userPortfolio1Sector2Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector2Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector2Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks2[o] = userPortfolio1Sector2Stock4;
                    }
                    //Slot 5
                    else
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector2Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector2Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector2Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks2[o] = userPortfolio1Sector2Stock5;
                    }

                }

            } while (tempStocks2[o] == null);

        }
    }

    private static void fillPortfolioOneSectorThree()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < tempStocks3.length; o++)
        {

            do
            {
                System.out.println("\t「Retail Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(retailSector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock[0])
                    {
                        tempStocks3[o] = retailArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock[1])
                    {
                        tempStocks3[o] = retailArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock[2])
                    {
                        tempStocks3[o] = retailArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock[3])
                    {
                        tempStocks3[o] = retailArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock[4])
                    {
                        tempStocks3[o] = retailArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock[5])
                    {
                        tempStocks3[o] = retailArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock[6])
                    {
                        tempStocks3[o] = retailArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock[7])
                    {
                        tempStocks3[o] = retailArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }


                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector3Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector3Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks3[o] = userPortfolio1Sector3Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector3Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector3Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks3[o] = userPortfolio1Sector3Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector3Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector3Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks3[o] = userPortfolio1Sector3Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector3Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector3Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks3[o] = userPortfolio1Sector3Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector3Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector3Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector3Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks3[o] = userPortfolio1Sector3Stock5;
                    }

                }

            } while (tempStocks3[o] == null);

        }
    }

    private static void fillPortfolioOneSectorFour()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < tempStocks4.length; o++)
        {

            do
            {
                System.out.println("\t「Auto Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();


                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(autoSector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock[0])
                    {
                        tempStocks4[o] = autoArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock[1])
                    {
                        tempStocks4[o] = autoArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock[2])
                    {
                        tempStocks4[o] = autoArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock[3])
                    {
                        tempStocks4[o] = autoArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock[4])
                    {
                        tempStocks4[o] = autoArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock[5])
                    {
                        tempStocks4[o] = autoArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock[6])
                    {
                        tempStocks4[o] = autoArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock[7])
                    {
                        tempStocks4[o] = autoArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }

                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector4Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector4Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks4[o] = userPortfolio1Sector4Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector4Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector4Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks4[o] = userPortfolio1Sector4Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector4Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector4Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks4[o] = userPortfolio1Sector4Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector4Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector4Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks4[o] = userPortfolio1Sector4Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector4Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector4Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector4Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks4[o] = userPortfolio1Sector4Stock5;
                    }

                }

            } while (tempStocks4[o] == null);

        }
    }

    private static void fillPortfolioOneSectorFive()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < tempStocks5.length; o++)
        {

            do
            {
                System.out.println("\t「Aerospace Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(aerospaceSector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock[0])
                    {
                        tempStocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock[1])
                    {
                        tempStocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock[2])
                    {
                        tempStocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock[3])
                    {
                        tempStocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock[4])
                    {
                        tempStocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock[5])
                    {
                        tempStocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock[6])
                    {
                        tempStocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock[7])
                    {
                        tempStocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }

                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector5Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector5Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks5[o] = userPortfolio1Sector5Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector5Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector5Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks5[o] = userPortfolio1Sector5Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector5Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector5Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks5[o] = userPortfolio1Sector5Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector5Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector5Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks5[o] = userPortfolio1Sector5Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector5Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector5Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector5Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks5[o] = userPortfolio1Sector5Stock5;
                    }

                }

            } while (tempStocks5[o] == null);

        }
    }

    private static void fillPortfolioOneSectorSix()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < tempStocks6.length; o++)
        {

            do
            {
                System.out.println("\t「Financial Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(financialSector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock[0])
                    {
                        tempStocks6[o] = financialArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock[1])
                    {
                        tempStocks6[o] = financialArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock[2])
                    {
                        tempStocks6[o] = financialArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock[3])
                    {
                        tempStocks6[o] = financialArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock[4])
                    {
                        tempStocks6[o] = financialArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock[5])
                    {
                        tempStocks6[o] = financialArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock[6])
                    {
                        tempStocks6[o] = financialArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock[7])
                    {
                        tempStocks6[o] = financialArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }

                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector6Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector6Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks6[o] = userPortfolio1Sector6Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector6Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector6Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks6[o] = userPortfolio1Sector6Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector6Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector6Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks6[o] = userPortfolio1Sector6Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector6Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector6Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks6[o] = userPortfolio1Sector6Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector6Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector6Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector6Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks6[o] = userPortfolio1Sector6Stock5;
                    }

                }

            } while (tempStocks6[o] == null);

        }
    }

    private static void fillPortfolioOneSectorSeven()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < tempStocks7.length; o++)
        {

            do
            {
                System.out.println("\t「Food Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(foodSector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock[0])
                    {
                        tempStocks7[o] = foodArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock[1])
                    {
                        tempStocks7[o] = foodArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock[2])
                    {
                        tempStocks7[o] = foodArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock[3])
                    {
                        tempStocks7[o] = foodArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock[4])
                    {
                        tempStocks7[o] = foodArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock[5])
                    {
                        tempStocks7[o] = foodArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock[6])
                    {
                        tempStocks7[o] = foodArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock[7])
                    {
                        tempStocks7[o] = foodArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }

                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector7Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector7Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks7[o] = userPortfolio1Sector7Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector7Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector7Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks7[o] = userPortfolio1Sector7Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector7Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector7Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks7[o] = userPortfolio1Sector7Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector7Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector7Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks7[o] = userPortfolio1Sector7Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio1Sector7Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio1Sector7Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio1Sector7Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        tempStocks7[o] = userPortfolio1Sector7Stock5;
                    }

                }

            } while (tempStocks7[o] == null);

        }
    }



    private static void fillPortfolioTwoSectorOne()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < temp2Stocks1.length; o++)
        {
            do
            {
                System.out.println("\t「Technology Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {

                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(technologySector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock2[0])
                    {
                        temp2Stocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock2[1])
                    {
                        temp2Stocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock2[2])
                    {
                        temp2Stocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock2[3])
                    {
                        temp2Stocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock2[4])
                    {
                        temp2Stocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock2[5])
                    {
                        temp2Stocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock2[6])
                    {
                        temp2Stocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock2[7])
                    {
                        temp2Stocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }


                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector1Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector1Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector1Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector1Stock1.setVolatility(volatilityTemp);
                            System.out.println(" ");

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks1[o] = userPortfolio2Sector1Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector1Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector1Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector1Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector1Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks1[o] = userPortfolio2Sector1Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector1Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector1Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector1Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector1Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks1[o] = userPortfolio2Sector1Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector1Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector1Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector1Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector1Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks1[o] = userPortfolio2Sector1Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector1Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector1Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector1Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector1Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks1[o] = userPortfolio2Sector1Stock5;
                    }

                }


            } while (temp2Stocks1[o] == null);

        }

    }

    private static void fillPortfolioTwoSectorTwo()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < temp2Stocks2.length; o++)
        {

            do
            {
                System.out.println("\t「Crypto Currency Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(cryptoCurrencySector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock2[0])
                    {
                        temp2Stocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock2[1])
                    {
                        temp2Stocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock2[2])
                    {
                        temp2Stocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock2[3])
                    {
                        temp2Stocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock2[4])
                    {
                        temp2Stocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock2[5])
                    {
                        temp2Stocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock2[6])
                    {
                        temp2Stocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock2[7])
                    {
                        temp2Stocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }

                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector2Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector2Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector2Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector2Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks2[o] = userPortfolio2Sector2Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector2Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector2Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector2Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector2Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks2[o] = userPortfolio2Sector2Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector2Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector2Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector2Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector2Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks2[o] = userPortfolio2Sector2Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector2Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector2Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector2Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector2Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks2[o] = userPortfolio2Sector2Stock4;
                    }
                    //Slot 5
                    else
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector2Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector2Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector2Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector2Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks2[o] = userPortfolio2Sector2Stock5;
                    }

                }

            } while (temp2Stocks2[o] == null);

        }
    }

    private static void fillPortfolioTwoSectorThree()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < temp2Stocks3.length; o++)
        {

            do
            {
                System.out.println("\t「Retail Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(retailSector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock2[0])
                    {
                        temp2Stocks3[o] = retailArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock2[1])
                    {
                        temp2Stocks3[o] = retailArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock2[2])
                    {
                        temp2Stocks3[o] = retailArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock2[3])
                    {
                        temp2Stocks3[o] = retailArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock2[4])
                    {
                        temp2Stocks3[o] = retailArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock2[5])
                    {
                        temp2Stocks3[o] = retailArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock2[6])
                    {
                        temp2Stocks3[o] = retailArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock2[7])
                    {
                        temp2Stocks3[o] = retailArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }


                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector3Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector3Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector3Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector3Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks3[o] = userPortfolio2Sector3Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector3Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector3Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector3Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector3Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks3[o] = userPortfolio2Sector3Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector3Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector3Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector3Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector3Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks3[o] = userPortfolio2Sector3Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector3Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector3Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector3Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector3Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks3[o] = userPortfolio2Sector3Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector3Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector3Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector3Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector3Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks3[o] = userPortfolio2Sector3Stock5;
                    }

                }

            } while (temp2Stocks3[o] == null);

        }
    }

    private static void fillPortfolioTwoSectorFour()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < temp2Stocks4.length; o++)
        {

            do
            {
                System.out.println("\t「Auto Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();


                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(autoSector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock2[0])
                    {
                        temp2Stocks4[o] = autoArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock2[1])
                    {
                        temp2Stocks4[o] = autoArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock2[2])
                    {
                        temp2Stocks4[o] = autoArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock2[3])
                    {
                        temp2Stocks4[o] = autoArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock2[4])
                    {
                        temp2Stocks4[o] = autoArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock2[5])
                    {
                        temp2Stocks4[o] = autoArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock2[6])
                    {
                        temp2Stocks4[o] = autoArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock2[7])
                    {
                        temp2Stocks4[o] = autoArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }

                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector4Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector4Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector4Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector4Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks4[o] = userPortfolio2Sector4Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector4Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector4Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector4Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector4Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks4[o] = userPortfolio2Sector4Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector4Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector4Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector4Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector4Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks4[o] = userPortfolio2Sector4Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector4Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector4Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector4Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector4Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks4[o] = userPortfolio2Sector4Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector4Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector4Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector4Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector4Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks4[o] = userPortfolio2Sector4Stock5;
                    }

                }

            } while (temp2Stocks4[o] == null);

        }
    }

    private static void fillPortfolioTwoSectorFive()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < temp2Stocks5.length; o++)
        {

            do
            {
                System.out.println("\t「Aerospace Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(aerospaceSector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock2[0])
                    {
                        temp2Stocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock2[1])
                    {
                        temp2Stocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock2[2])
                    {
                        temp2Stocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock2[3])
                    {
                        temp2Stocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock2[4])
                    {
                        temp2Stocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock2[5])
                    {
                        temp2Stocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock2[6])
                    {
                        temp2Stocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock2[7])
                    {
                        temp2Stocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }

                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector5Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector5Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector5Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector5Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks5[o] = userPortfolio2Sector5Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector5Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector5Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector5Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector5Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks5[o] = userPortfolio2Sector5Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector5Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector5Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector5Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector5Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks5[o] = userPortfolio2Sector5Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector5Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector5Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector5Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector5Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks5[o] = userPortfolio2Sector5Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector5Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector5Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector5Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector5Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks5[o] = userPortfolio2Sector5Stock5;
                    }

                }

            } while (temp2Stocks5[o] == null);

        }
    }

    private static void fillPortfolioTwoSectorSix()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < temp2Stocks6.length; o++)
        {

            do
            {
                System.out.println("\t「Financial Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(financialSector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock2[0])
                    {
                        temp2Stocks6[o] = financialArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock2[1])
                    {
                        temp2Stocks6[o] = financialArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock2[2])
                    {
                        temp2Stocks6[o] = financialArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock2[3])
                    {
                        temp2Stocks6[o] = financialArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock2[4])
                    {
                        temp2Stocks6[o] = financialArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock2[5])
                    {
                        temp2Stocks6[o] = financialArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock2[6])
                    {
                        temp2Stocks6[o] = financialArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock2[7])
                    {
                        temp2Stocks6[o] = financialArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }

                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector6Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector6Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector6Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector6Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks6[o] = userPortfolio2Sector6Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector6Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector6Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector6Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector6Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks6[o] = userPortfolio2Sector6Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector6Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector6Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector6Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector6Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks6[o] = userPortfolio2Sector6Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector6Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector6Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector6Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector6Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks6[o] = userPortfolio2Sector6Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector6Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector6Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector6Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector6Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks6[o] = userPortfolio2Sector6Stock5;
                    }

                }

            } while (temp2Stocks6[o] == null);

        }
    }

    private static void fillPortfolioTwoSectorSeven()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < temp2Stocks7.length; o++)
        {

            do
            {
                System.out.println("\t「Food Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(foodSector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock2[0])
                    {
                        temp2Stocks7[o] = foodArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock2[1])
                    {
                        temp2Stocks7[o] = foodArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock2[2])
                    {
                        temp2Stocks7[o] = foodArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock2[3])
                    {
                        temp2Stocks7[o] = foodArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock2[4])
                    {
                        temp2Stocks7[o] = foodArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock2[5])
                    {
                        temp2Stocks7[o] = foodArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock2[6])
                    {
                        temp2Stocks7[o] = foodArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock2[7])
                    {
                        temp2Stocks7[o] = foodArray[stockChoice - 1];
                        chosenStock2[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }

                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector7Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector7Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector7Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector7Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks7[o] = userPortfolio2Sector7Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector7Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector7Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector7Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector7Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks7[o] = userPortfolio2Sector7Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector7Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector7Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector7Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector7Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks7[o] = userPortfolio2Sector7Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector7Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector7Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector7Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector7Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks7[o] = userPortfolio2Sector7Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio2Sector7Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio2Sector7Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio2Sector7Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio2Sector7Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp2Stocks7[o] = userPortfolio2Sector7Stock5;
                    }

                }

            } while (temp2Stocks7[o] == null);

        }
    }


    //Portfolio 3
    private static void fillPortfolioThreeSectorOne()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < temp3Stocks1.length; o++)
        {
            do
            {
                System.out.println("\t「Technology Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {

                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(technologySector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock3[0])
                    {
                        temp3Stocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock3[1])
                    {
                        temp3Stocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock3[2])
                    {
                        temp3Stocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock3[3])
                    {
                        temp3Stocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock3[4])
                    {
                        temp3Stocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock3[5])
                    {
                        temp3Stocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock3[6])
                    {
                        temp3Stocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock3[7])
                    {
                        temp3Stocks1[o] = technologyArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }


                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector1Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector1Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector1Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector1Stock1.setVolatility(volatilityTemp);
                            System.out.println(" ");

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks1[o] = userPortfolio3Sector1Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector1Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector1Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector1Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector1Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks1[o] = userPortfolio3Sector1Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector1Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector1Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector1Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector1Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks1[o] = userPortfolio3Sector1Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector1Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector1Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector1Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector1Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks1[o] = userPortfolio3Sector1Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector1Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector1Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector1Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector1Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks1[o] = userPortfolio3Sector1Stock5;
                    }

                }


            } while (temp3Stocks1[o] == null);

        }

    }

    private static void fillPortfolioThreeSectorTwo()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < temp3Stocks2.length; o++)
        {

            do
            {
                System.out.println("\t「Crypto Currency Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(cryptoCurrencySector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock3[0])
                    {
                        temp3Stocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock3[1])
                    {
                        temp3Stocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock3[2])
                    {
                        temp3Stocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock3[3])
                    {
                        temp3Stocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock3[4])
                    {
                        temp3Stocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock3[5])
                    {
                        temp3Stocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock3[6])
                    {
                        temp3Stocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock3[7])
                    {
                        temp3Stocks2[o] = cryptoArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }

                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector2Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");

                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector2Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector2Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector2Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks2[o] = userPortfolio3Sector2Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector2Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector2Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector2Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector2Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks2[o] = userPortfolio3Sector2Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector2Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector2Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector2Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector2Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks2[o] = userPortfolio3Sector2Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector2Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector2Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector2Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector2Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks2[o] = userPortfolio3Sector2Stock4;
                    }
                    //Slot 5
                    else
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector2Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector2Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector2Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector2Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks2[o] = userPortfolio3Sector2Stock5;
                    }

                }

            } while (temp3Stocks2[o] == null);

        }
    }

    private static void fillPortfolioThreeSectorThree()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < temp3Stocks3.length; o++)
        {

            do
            {
                System.out.println("\t「Retail Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(retailSector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock3[0])
                    {
                        temp3Stocks3[o] = retailArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock3[1])
                    {
                        temp3Stocks3[o] = retailArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock3[2])
                    {
                        temp3Stocks3[o] = retailArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock3[3])
                    {
                        temp3Stocks3[o] = retailArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock3[4])
                    {
                        temp3Stocks3[o] = retailArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock3[5])
                    {
                        temp3Stocks3[o] = retailArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock3[6])
                    {
                        temp3Stocks3[o] = retailArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock3[7])
                    {
                        temp3Stocks3[o] = retailArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }


                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector3Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector3Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector3Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector3Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks3[o] = userPortfolio3Sector3Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector3Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector3Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector3Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector3Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks3[o] = userPortfolio3Sector3Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector3Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector3Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector3Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector3Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks3[o] = userPortfolio3Sector3Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector3Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector3Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector3Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector3Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks3[o] = userPortfolio3Sector3Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector3Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector3Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector3Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector3Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks3[o] = userPortfolio3Sector3Stock5;
                    }

                }

            } while (temp3Stocks3[o] == null);

        }
    }

    private static void fillPortfolioThreeSectorFour()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < temp3Stocks4.length; o++)
        {

            do
            {
                System.out.println("\t「Auto Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();


                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(autoSector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock3[0])
                    {
                        temp3Stocks4[o] = autoArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock3[1])
                    {
                        temp3Stocks4[o] = autoArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock3[2])
                    {
                        temp3Stocks4[o] = autoArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock3[3])
                    {
                        temp3Stocks4[o] = autoArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock3[4])
                    {
                        temp3Stocks4[o] = autoArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock3[5])
                    {
                        temp3Stocks4[o] = autoArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock3[6])
                    {
                        temp3Stocks4[o] = autoArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock3[7])
                    {
                        temp3Stocks4[o] = autoArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }

                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector4Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector4Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector4Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector4Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks4[o] = userPortfolio3Sector4Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector4Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector4Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector4Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector4Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks4[o] = userPortfolio3Sector4Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector4Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector4Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector4Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector4Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks4[o] = userPortfolio3Sector4Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector4Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector4Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector4Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector4Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks4[o] = userPortfolio3Sector4Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector4Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector4Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector4Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector4Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks4[o] = userPortfolio3Sector4Stock5;
                    }

                }

            } while (temp3Stocks4[o] == null);

        }
    }

    private static void fillPortfolioThreeSectorFive()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < temp3Stocks5.length; o++)
        {

            do
            {
                System.out.println("\t「Aerospace Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(aerospaceSector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock3[0])
                    {
                        temp3Stocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock3[1])
                    {
                        temp3Stocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock3[2])
                    {
                        temp3Stocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock3[3])
                    {
                        temp3Stocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock3[4])
                    {
                        temp3Stocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock3[5])
                    {
                        temp3Stocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock3[6])
                    {
                        temp3Stocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock3[7])
                    {
                        temp3Stocks5[o] = aeroArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }

                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector5Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector5Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector5Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector5Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks5[o] = userPortfolio3Sector5Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector5Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector5Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector5Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector5Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks5[o] = userPortfolio3Sector5Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector5Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector5Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector5Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector5Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks5[o] = userPortfolio3Sector5Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector5Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector5Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector5Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector5Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks5[o] = userPortfolio3Sector5Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector5Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector5Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector5Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector5Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks5[o] = userPortfolio3Sector5Stock5;
                    }

                }

            } while (temp3Stocks5[o] == null);

        }
    }

    private static void fillPortfolioThreeSectorSix()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < temp3Stocks6.length; o++)
        {

            do
            {
                System.out.println("\t「Financial Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(financialSector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock3[0])
                    {
                        temp3Stocks6[o] = financialArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock3[1])
                    {
                        temp3Stocks6[o] = financialArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock3[2])
                    {
                        temp3Stocks6[o] = financialArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock3[3])
                    {
                        temp3Stocks6[o] = financialArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock3[4])
                    {
                        temp3Stocks6[o] = financialArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock3[5])
                    {
                        temp3Stocks6[o] = financialArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock3[6])
                    {
                        temp3Stocks6[o] = financialArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock3[7])
                    {
                        temp3Stocks6[o] = financialArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }

                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector6Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector6Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector6Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector6Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks6[o] = userPortfolio3Sector6Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector6Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector6Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector6Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector6Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks6[o] = userPortfolio3Sector6Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector6Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector6Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector6Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector6Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks6[o] = userPortfolio3Sector6Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector6Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector6Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector6Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector6Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks6[o] = userPortfolio3Sector6Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector6Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector6Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector6Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector6Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks6[o] = userPortfolio3Sector6Stock5;
                    }

                }

            } while (temp3Stocks6[o] == null);

        }
    }

    private static void fillPortfolioThreeSectorSeven()
    {
        //Fill Stocks with user choices in Sector 1
        for (int o = 0; o < temp3Stocks7.length; o++)
        {

            do
            {
                System.out.println("\t「Food Sector」");
                System.out.println("\t\tPlease choose or create the stocks you want in this sector.");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   1. Choose Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");
                System.out.println("\t\t┏ ━━┅━━━┅━━━┅━━━┅━━ ┓");
                System.out.println("\t\t   2. Create Stock");
                System.out.println("\t\t┗ ━━┅━━━┅━━━┅━━━┅━━ ┛");

                System.out.print("\t\tEnter your choice: ");
                choice = inputNum.nextInt();

                //Check if they want to create or choose a stock
                if (choice == 1)
                {
                    System.out.println("\n\t\t|Stocks List|");
                    System.out.println(foodSector.toString());

                    System.out.print("\t\tEnter the number for the stock you want to add: ");
                    stockChoice = inputNum.nextInt();
                    //LINEBREAK PRINT
                    System.out.println(" ");

                    if (stockChoice == 1 && chosenStock3[0])
                    {
                        temp3Stocks7[o] = foodArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 2 && chosenStock3[1])
                    {
                        temp3Stocks7[o] = foodArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 3 && chosenStock3[2])
                    {
                        temp3Stocks7[o] = foodArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 4 && chosenStock3[3])
                    {
                        temp3Stocks7[o] = foodArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 5 && chosenStock3[4])
                    {
                        temp3Stocks7[o] = foodArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 6 && chosenStock3[5])
                    {
                        temp3Stocks7[o] = foodArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 7 && chosenStock3[6])
                    {
                        temp3Stocks7[o] = foodArray[stockChoice - 1];
                        chosenStock3[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice == 8 && chosenStock3[7])
                    {
                        temp3Stocks7[o] = foodArray[stockChoice - 1];
                        chosenStock[stockChoice - 1] = false;
                        break;
                    }
                    else if (stockChoice > 8 || stockChoice < 1)
                    {
                        System.out.println("\nPlease enter a number between 1 and 8");
                    }
                    else
                    {
                        System.out.println("\t\t⚠ Stock already selected. Pick something else. ⚠\n");
                    }

                }
                //Create stocks
                else if (choice == 2)
                {

                    //Slot 1
                    if (o == 0)
                    {
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector7Stock1.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector7Stock1.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector7Stock1.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector7Stock1.setVolatility(volatilityTemp);

                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks7[o] = userPortfolio3Sector7Stock1;

                    }
                    //Slot 2
                    else if (o == 1)
                    {

                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector7Stock2.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector7Stock2.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector7Stock2.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector7Stock2.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks7[o] = userPortfolio3Sector7Stock2;
                    }
                    //Slot 3
                    else if (o == 2)
                    {
                        //paste o == 0 here and change stock 1 to 3
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector7Stock3.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector7Stock3.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector7Stock3.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector7Stock3.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks7[o] = userPortfolio3Sector7Stock3;
                    }
                    //Slot 4
                    else if (o == 3)
                    {
                        //paste o == 0 here and change stock 1 to 4
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector7Stock4.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector7Stock4.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector7Stock4.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector7Stock4.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks7[o] = userPortfolio3Sector7Stock4;
                    }
                    //Slot 5
                    else
                    {
                        //paste o == 0 here and change stock 1 to 5
                        System.out.println("\n\t\t|Stock Creation|\n");
                        System.out.print("\t\tStock name: ");
                        userPortfolio3Sector7Stock5.setName(inputStr.nextLine());

                        //Loop makes sure they enter a valid Region
                        do
                        {
                            System.out.println("\t\tEnter the CAPITAL LETTER that represents the region.");
                            System.out.println("\n\t\t\t-------------------------");
                            System.out.println("\t\t\t|   N = North America   |");
                            System.out.println("\t\t\t|   E = Europe          |");
                            System.out.println("\t\t\t|   A = Asia            |");
                            System.out.println("\t\t\t|   F = Africa          |");
                            System.out.println("\t\t\t|   O = Oceania         |");
                            System.out.println("\t\t\t-------------------------\n");
                            System.out.print("\t\tStock region: ");
                            regionTemp = inputChr.next().charAt(0);
                            userPortfolio3Sector7Stock5.setRegion(regionTemp);

                        }
                        while (!(regionTemp == 'N' || regionTemp == 'E' || regionTemp == 'A' || regionTemp == 'F' || regionTemp == 'O'));

                        //Loop makes sure they enter a valid stock price
                        do
                        {
                            System.out.print("\t\tStock price (between $1 - $1000): ");
                            currentPriceTemp = inputNum.nextDouble();
                            userPortfolio3Sector7Stock5.setCurrentPrice(currentPriceTemp);

                        } while (!(currentPriceTemp > 0 && currentPriceTemp <= 1000));

                        do
                        {
                            System.out.print("\t\tStock volatility (greater than 0, less than 0.2): ");
                            volatilityTemp = inputNum.nextDouble();
                            userPortfolio3Sector7Stock5.setVolatility(volatilityTemp);
                        } while (!(volatilityTemp > 0 && volatilityTemp <= 0.2));

                        temp3Stocks7[o] = userPortfolio3Sector7Stock5;
                    }

                }

            } while (temp3Stocks7[o] == null);

        }
    }



    //Menus for all 3 portfolios
    private static void basicMenu1()
    {
        do
        {
            //Update Sector Stock prices
            //Print out Main Menu
            System.out.println("\n-----------------------------------------------------------");
            System.out.println("\uD83D\uDCB0 Main Menu \uD83D\uDCB0");
            System.out.println("-----------------------------------------------------------");
            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t1. Add Investment");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t2. Take Profit/Loss");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t3. Trade Stock");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t4. List Sectors");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t5. Determine Total Capital");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t6. View Profit");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t7. Check Sector Volatility");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t8. End day");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\tEnter 0 to go back.");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");

            System.out.println("\t\t\uD83D\uDCB0\uD83D\uDCB0 Current Balance: " + moneyFormat.format(portfolio1.getCashLeftover()) + " \uD83D\uDCB0\uD83D\uDCB0");
            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
            System.out.print("Enter your choice: ");
            basicMenuChoice = inputNum.nextInt();
            System.out.println(" ");

            //Add Investment
            if (basicMenuChoice == 1 && portfolio1.getTrades() > 0)
            {
                do
                {
                    System.out.println("◈◈ Add Investment ◈◈");
                    System.out.println(portfolio1.getSectors());
                    System.out.println("\tEnter 0 to go back.");
                    
                    System.out.print("\n\tEnter the number of the sector you want to add to: ");
                    sectorChoice = inputNum.nextInt();

                    //Opens the sector of user choice
                    if (sectorChoice > 5 || sectorChoice < 1)
                    {
                        System.out.println("\t⚠ Please enter one of the available sectors. ⚠");
                    }
                    else
                    {
                        for (int i = 0; i < portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments().length; i++)
                        {
                            //Prints out stocks if there is an open slot.
                            if (portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] == null)
                            {
                                System.out.println("\t\t|Owned List|");
                                System.out.println(portfolio1.getChosenDivisions()[sectorChoice-1].toString());
                                System.out.println(" ");

                                System.out.println("\t\t|Stocks List|");
                                //Checks which Sector the user is in (example technology or retail) to know which stocks to allow them to buy
                                if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("technology"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in technology sector

                                    System.out.println(technologySector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();

                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (technologyArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = technologyArray[stockChoice - 1];
                                        portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio1.cashLeftover -= 1000;
                                        portfolio1.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in crypto sector
                                else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Crypto Currency"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in crypto sector
                                    System.out.println(cryptoCurrencySector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (cryptoArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = cryptoArray[stockChoice - 1];
                                        portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio1.cashLeftover -= 1000;
                                        portfolio1.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in retail sector
                                else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Retail"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in retail sector
                                    System.out.println(retailSector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (retailArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t:warning: Sorry, you already own this stock choose another one. :warning:\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = retailArray[stockChoice - 1];
                                        portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio1.cashLeftover -= 1000;
                                        portfolio1.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in auto sector
                                else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Auto"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in auto sector
                                    System.out.println(autoSector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (autoArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t:warning: Sorry, you already own this stock choose another one. :warning:\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = autoArray[stockChoice - 1];
                                        portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio1.cashLeftover -= 1000;
                                        portfolio1.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in aerospace sector
                                else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Aerospace"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in aero sector
                                    System.out.println(aerospaceSector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (aeroArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t:warning: Sorry, you already own this stock choose another one. :warning:\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = aeroArray[stockChoice - 1];
                                        portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio1.cashLeftover -= 1000;
                                        portfolio1.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in financial sector
                                else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Financial"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in financial sector
                                    System.out.println(technologySector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();

                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (financialArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t:warning: Sorry, you already own this stock choose another one. :warning:\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = financialArray[stockChoice - 1];
                                        portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio1.cashLeftover -= 1000;
                                        portfolio1.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in food sector
                                else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Food"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in food sector
                                    System.out.println(technologySector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();

                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (foodArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t:warning: Sorry, you already own this stock choose another one. :warning:\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = foodArray[stockChoice - 1];
                                        portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio1.cashLeftover -= 1000;
                                        portfolio1.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                            }
                            else
                            {
                                if (i==4)
                                System.out.println("\n\t\t⚠⚠ You cannot add stocks to a full sector. ⚠⚠\n");
                            }
                        }

                    }

                } while (sectorChoice != 0 && portfolio1.getTrades() > 0);

            }
            //Take Profit / Loss
            else if (basicMenuChoice == 2 && portfolio1.getTrades() > 0)
            {
                do
                {
                    //Print out sectors. for the user to choose
                    System.out.println("◈◈ Take Profit/Loss ◈◈");
                    System.out.println(portfolio1.getSectors());
                    System.out.println("\tEnter 0 to go back.");
                    System.out.print("\n\tEnter the number of the sector you want to take profit/loss from: ");
                    sectorChoice = inputNum.nextInt();
                    System.out.println(" ");

                    //Print out stocks within chosen Sector
                    if(sectorChoice<0 || sectorChoice>5)
                        System.out.println("\t⚠ Please enter one of the available sectors. ⚠");
                    else if (sectorChoice == 1)
                    {
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio1.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");

                        System.out.print("\t\tEnter the stock that you want to take profit/loss from: ");
                        sectorChoice = inputNum.nextInt();
                        System.out.println(" ");

                        if ((sectorChoice - 1) < 0 || (sectorChoice - 1) > 4)
                        {
                            System.out.println("\t\t⚠ Please enter one of the available stocks. ⚠\n");
                        }
                        else
                        {
                            if (portfolio1.getChosenDivisions()[0].getInstruments()[sectorChoice - 1] != null)
                            {
                                portfolio1.cashLeftover += portfolio1.getChosenDivisions()[0].getInstruments()[sectorChoice - 1].getTotal();
                                portfolio1.getChosenDivisions()[0].removeStock(sectorChoice - 1);
                                for (int i = 0; i < portfolio1.getChosenDivisions()[0].getInstruments().length; i++)
                                {
                                    portfolio1.getChosenDivisions()[i].toString();
                                }
                                portfolio1.updateTrades();
                            }
                            else
                            {
                                System.out.println("\t\t⚠ This slot is empty. ⚠\n");
                            }
                        }
                    }
                    //Sector 2
                    else if (sectorChoice == 2)
                    {
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio1.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");

                        System.out.print("\t\tEnter the stock that you want to take profit/loss from: ");
                        sectorChoice = inputNum.nextInt();
                        System.out.println(" ");

                        if ((sectorChoice - 1) < 0 || (sectorChoice - 1) > 4)
                        {
                            System.out.println("\t\t⚠ Please enter one of the available stocks. ⚠\n");
                        }
                        else
                        {
                            if (portfolio1.getChosenDivisions()[1].getInstruments()[sectorChoice - 1] != null)
                            {
                                portfolio1.cashLeftover += portfolio1.getChosenDivisions()[1].getInstruments()[sectorChoice - 1].getTotal();
                                portfolio1.getChosenDivisions()[1].removeStock(sectorChoice - 1);
                                for (int i = 0; i < portfolio1.getChosenDivisions()[1].getInstruments().length; i++)
                                {
                                    portfolio1.getChosenDivisions()[i].toString();
                                }
                                portfolio1.updateTrades();
                            }
                            else
                            {
                                System.out.println("\t\t⚠ This slot is empty. ⚠\n");
                            }
                        }
                    }
                    //Sector 3
                    else if (sectorChoice == 3)
                    {
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio1.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");

                        System.out.print("\t\tEnter the stock that you want to take profit/loss from: ");
                        sectorChoice = inputNum.nextInt();
                        System.out.println(" ");

                        if ((sectorChoice - 1) < 0 || (sectorChoice - 1) > 4)
                        {
                            System.out.println("\t\t⚠ Please enter one of the available stocks. ⚠\n");
                        }
                        else
                        {
                            if (portfolio1.getChosenDivisions()[2].getInstruments()[sectorChoice - 1] != null)
                            {
                                portfolio1.cashLeftover += portfolio1.getChosenDivisions()[2].getInstruments()[sectorChoice - 1].getTotal();
                                portfolio1.getChosenDivisions()[2].removeStock(sectorChoice - 1);
                                for (int i = 0; i < portfolio1.getChosenDivisions()[2].getInstruments().length; i++)
                                {
                                    portfolio1.getChosenDivisions()[i].toString();
                                }
                                portfolio1.updateTrades();
                            }
                            else
                            {
                                System.out.println("\t\t⚠ This slot is empty. ⚠\n");
                            }
                        }
                    }
                    //Sector 4
                    else if (sectorChoice == 4)
                    {
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio1.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");

                        System.out.print("\t\tEnter the stock that you want to take profit/loss from: ");
                        sectorChoice = inputNum.nextInt();
                        System.out.println(" ");

                        if ((sectorChoice - 1) < 0 || (sectorChoice - 1) > 4)
                        {
                            System.out.println("\t\t⚠ Please enter one of the available stocks. ⚠\n");
                        }
                        else
                        {
                            if (portfolio1.getChosenDivisions()[3].getInstruments()[sectorChoice - 1] != null)
                            {
                                portfolio1.cashLeftover += portfolio1.getChosenDivisions()[3].getInstruments()[sectorChoice - 1].getTotal();
                                portfolio1.getChosenDivisions()[3].removeStock(sectorChoice - 1);
                                for (int i = 0; i < portfolio1.getChosenDivisions()[3].getInstruments().length; i++)
                                {
                                    portfolio1.getChosenDivisions()[i].toString();
                                }
                                portfolio1.updateTrades();
                            }
                            else
                            {
                                System.out.println("\t\t⚠ This slot is empty. ⚠\n");
                            }
                        }
                    }
                    //Sector 5
                    else if (sectorChoice == 5)
                    {
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio1.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");

                        System.out.print("\t\tEnter the stock that you want to take profit/loss from: ");
                        sectorChoice = inputNum.nextInt();
                        System.out.println(" ");

                        if ((sectorChoice - 1) < 0 || (sectorChoice - 1) > 4)
                        {
                            System.out.println("\t\t⚠ Please enter one of the available stocks. ⚠\n");
                        }
                        else
                        {
                            if (portfolio1.getChosenDivisions()[4].getInstruments()[sectorChoice - 1] != null)
                            {
                                portfolio1.cashLeftover += portfolio1.getChosenDivisions()[4].getInstruments()[sectorChoice - 1].getTotal();
                                portfolio1.getChosenDivisions()[4].removeStock(sectorChoice - 1);
                                for (int i = 0; i < portfolio1.getChosenDivisions()[4].getInstruments().length; i++)
                                {
                                    portfolio1.getChosenDivisions()[i].toString();
                                }
                                portfolio1.updateTrades();
                            }
                            else
                            {
                                System.out.println("\t\t⚠ This slot is empty. ⚠\n");
                            }
                        }
                    }
                } while (sectorChoice != 0 && portfolio1.getTrades() > 0);

            }
            //Trade Stock
            else if (basicMenuChoice == 3 && portfolio1.getTrades() > 0)
            {

                do
                {
                    //Print out portfolio 1 sectors.
                    System.out.println("◈◈ Trade Stocks ◈◈");
                    System.out.println(portfolio1.getSectors());
                    System.out.println("\tEnter 0 to go back.");
                    System.out.print("\n\tEnter the number of the sector you want to access: ");
                    sectorChoice = inputNum.nextInt();

                    //Checks for proper input
                    if (sectorChoice > 5 || sectorChoice < 1)
                    {
                        System.out.println("\t⚠ Please enter one of the available sectors. ⚠");
                    }
                    //Opens the sector of user choice
                    else
                    {
                        do
                        {
                            //Prints out all the getInstruments() in that sector
                            System.out.println("\t\t|Owned List|");
                            System.out.println(portfolio1.getChosenDivisions()[sectorChoice-1].toString());

                            System.out.print("\t\t Enter the stock you would like to trade: ");
                            stockChoice = inputNum.nextInt();
                            //Asks user to choose one of their current stocks to trade with another
                            //Stores the stock of choice into currentStock
                            if (stockChoice == 1 && portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1] != null)
                            {
                                currentStock = portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1];
                                break;
                            }
                            else if (stockChoice == 2 && portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1] != null)
                            {
                                currentStock = portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1];
                                break;
                            }
                            else if (stockChoice == 3 && portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1] != null)
                            {
                                currentStock = portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1];
                                break;
                            }
                            else if (stockChoice == 4 && portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1] != null)
                            {
                                currentStock = portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1];
                                break;
                            }
                            else if (stockChoice == 5 && portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1] != null)
                            {
                                currentStock = portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1];
                                break;
                            }
                            else
                            {
                                System.out.println("\n\t⚠ Please enter one of the available stocks. ⚠\n");
                            }
                        } while (true);

                        if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("technology"))
                        {
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in technology sector
                            System.out.println(technologySector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (technologyArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }


                            }
                        }
                        else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Crypto Currency"))
                        {
                            taken = false;
                            //print available stocks for purchase in crypto sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(cryptoCurrencySector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (cryptoArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }
                            }
                        }
                        else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Retail"))
                        {
                            taken = false;
                            //print available stocks for purchase in retail sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(retailSector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (retailArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }

                            }
                        }
                        else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Auto"))
                        {
                            taken = false;
                            //print available stocks for purchase in auto sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(autoSector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (autoArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }

                            }
                        }
                        else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Aerospace"))
                        {
                            taken = false;
                            //print available stocks for purchase in aerospace sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(aerospaceSector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (aeroArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }

                            }
                        }
                        else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Financial"))
                        {
                            taken = false;
                            //print available stocks for purchase in financial sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(financialSector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (financialArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }


                            }
                        }
                        else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Food"))
                        {
                            taken = false;
                            //print available stocks for purchase in food sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(foodSector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (foodArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio1.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                    ;
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio1.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio1.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }
                            }
                        }


                    }
                } while (sectorChoice != 0 && portfolio1.getTrades() > 0);

            }
            //List Sectors
            else if (basicMenuChoice == 4)
            {
                do
                {
                    System.out.println("◈◈ List Sectors ◈◈");
                    System.out.println(portfolio1.getSectors());
                    System.out.println("\tEnter 0 to go back.");

                    System.out.print("\n\tEnter the number of the sector you want to list: ");
                    sectorChoice = inputNum.nextInt();


                    //Opens the sector of user choice
                    if (sectorChoice > 5 || sectorChoice < 1)
                    {
                        System.out.println("Please enter one of the available sectors.");
                    }
                    else
                    {
                        //Prints out all the getInstruments() in that sector
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio1.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");
                        System.out.println("\t\t|Stocks List|");
                        if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("technology"))
                        {
                            System.out.println(technologySector.toString());
                        }
                        else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Crypto Currency"))
                        {
                            System.out.println(cryptoCurrencySector.toString());
                        }
                        else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Retail"))
                        {
                            System.out.println(retailSector.toString());
                        }
                        else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Auto"))
                        {
                            System.out.println(autoSector.toString());
                        }
                        else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Aerospace"))
                        {
                            System.out.println(aerospaceSector.toString());
                        }
                        else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Financial"))
                        {
                            System.out.println(financialSector.toString());
                        }
                        else if (portfolio1.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Food"))
                        {
                            System.out.println(foodSector.toString());
                        }
                        System.out.println(" ");
                    }
                } while (sectorChoice != 0);
            }
            //Determine total Capital
            else if (basicMenuChoice == 5)
            {
                System.out.println("◈◈ Total Capital ◈◈");
                System.out.println("\n\t \uD83D\uDCB0\uD83D\uDCB0Total Capital of " + portfolio1.getName() + ": " + moneyFormat.format(portfolio1.getTotalCapital())+ " \uD83D\uDCB0\uD83D\uDCB0\n");
            }
            //View Profit
            else if (basicMenuChoice == 6)
            {
                System.out.println("◈◈ View Profit ◈◈");
                System.out.println("\t◖ " + portfolio1.getName()+" ◗");
                System.out.println("\t\t Total Profit/Loss: " + moneyFormat.format(portfolio1.getTotalProfitLoss()));
                System.out.println("\t\t Daily Profit/Loss: " + moneyFormat.format(portfolio1.getDailyProfit()) +"\n");

            }
            //Check Sector Volatility
            else if (basicMenuChoice == 7)
            {
                do
                {
                    System.out.println("◈◈ Check Sector Volatility ◈◈");
                    System.out.println(portfolio1.getSectors());
                    System.out.println("\tEnter 0 to go back.");
                    System.out.print("\n\tEnter the number of the sector you want to add to: ");
                    sectorChoice = inputNum.nextInt();

                    if (sectorChoice >= 1 && sectorChoice <= 5)
                    {
                        System.out.println("\n\t「"+portfolio1.getChosenDivisions()[sectorChoice - 1].getName()+"」");
                        System.out.println("\t\t The volatility of the sector is: " +
                        portfolio1.getChosenDivisions()[sectorChoice - 1].getSectorVolatality()+"\n");
                    }
                    else
                    {
                        System.out.println("\n\t⚠ Please enter one of the available sectors. ⚠\n");
                    }

                } while (sectorChoice != 0);
            }
            //End Day
            else if (basicMenuChoice == 8)
            {
                endDay();
            }
            else if (basicMenuChoice == 0)
            {
                System.out.println("⬅ Going back.");
            }
            else
            {
                if (portfolio1.getTrades() == 0)
                {
                    System.out.println("⚠⚠ You are out of trades. ⚠⚠");
                }
                System.out.println("⚠ Please enter a correct number. ⚠");
            }

        } while (basicMenuChoice != 0);
    }

    private static void basicMenu2()
    {
        do
        {
            //Update Sector Stock prices
            //Print out Main Menu
            System.out.println("\n-----------------------------------------------------------");
            System.out.println("\uD83D\uDCB0 Main Menu \uD83D\uDCB0");
            System.out.println("-----------------------------------------------------------");
            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t1. Add Investment");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t2. Take Profit/Loss");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t3. Trade Stock");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t4. List Sectors");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t5. Determine Total Capital");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t6. View Profit");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t7. Check Sector Volatility");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t8. End day");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\tEnter 0 to go back.");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");

            System.out.println("\t\t\uD83D\uDCB0\uD83D\uDCB0 Current Balance: " + moneyFormat.format(portfolio2.getCashLeftover()) + " \uD83D\uDCB0\uD83D\uDCB0");
            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
            System.out.print("Enter your choice: ");
            basicMenuChoice = inputNum.nextInt();
            System.out.println(" ");

            //Add Investment
            if (basicMenuChoice == 1 && portfolio2.getTrades() > 0)
            {
                do
                {
                    System.out.println("◈◈ Add Investment ◈◈");
                    System.out.println(portfolio2.getSectors());
                    System.out.println("\tEnter 0 to go back.");

                    System.out.print("\n\tEnter the number of the sector you want to add to: ");
                    sectorChoice = inputNum.nextInt();

                    //Opens the sector of user choice
                    if (sectorChoice > 5 || sectorChoice < 1)
                    {
                        System.out.println("\t⚠ Please enter one of the available sectors. ⚠");
                    }
                    else
                    {
                        for (int i = 0; i < portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments().length; i++)
                        {
                            //Prints out stocks if there is an open slot.
                            if (portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] == null)
                            {
                                System.out.println("\t\t|Owned List|");
                                System.out.println(portfolio2.getChosenDivisions()[sectorChoice-1].toString());
                                System.out.println(" ");

                                System.out.println("\t\t|Stocks List|");
                                //Checks which Sector the user is in (example technology or retail) to know which stocks to allow them to buy
                                if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("technology"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in technology sector

                                    System.out.println(technologySector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();

                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (technologyArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = technologyArray[stockChoice - 1];
                                        portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio2.cashLeftover -= 1000;

                                        portfolio2.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in crypto sector
                                else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Crypto Currency"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in crypto sector
                                    System.out.println(cryptoCurrencySector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (cryptoArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = cryptoArray[stockChoice - 1];
                                        portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio2.cashLeftover -= 1000;
                                        portfolio2.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in retail sector
                                else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Retail"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in retail sector
                                    System.out.println(retailSector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (retailArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t:warning: Sorry, you already own this stock choose another one. :warning:\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = retailArray[stockChoice - 1];
                                        portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio2.cashLeftover -= 1000;
                                        portfolio2.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in auto sector
                                else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Auto"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in auto sector
                                    System.out.println(autoSector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (autoArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t:warning: Sorry, you already own this stock choose another one. :warning:\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = autoArray[stockChoice - 1];
                                        portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio2.cashLeftover -= 1000;
                                        portfolio2.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in aerospace sector
                                else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Aerospace"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in aero sector
                                    System.out.println(aerospaceSector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (aeroArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t:warning: Sorry, you already own this stock choose another one. :warning:\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = aeroArray[stockChoice - 1];
                                        portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio2.cashLeftover -= 1000;
                                        portfolio2.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in financial sector
                                else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Financial"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in financial sector
                                    System.out.println(technologySector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();

                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (financialArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t:warning: Sorry, you already own this stock choose another one. :warning:\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = financialArray[stockChoice - 1];
                                        portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio2.cashLeftover -= 1000;
                                        portfolio2.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in food sector
                                else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Food"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in food sector
                                    System.out.println(technologySector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();

                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (foodArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t:warning: Sorry, you already own this stock choose another one. :warning:\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = foodArray[stockChoice - 1];
                                        portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio2.cashLeftover -= 1000;
                                        portfolio2.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                            }
                            else
                            {
                                if (i==4)
                                    System.out.println("\n\t\t⚠⚠ You cannot add stocks to a full sector. ⚠⚠\n");
                            }
                        }

                    }

                } while (sectorChoice != 0 && portfolio2.getTrades() > 0);

            }
            //Take Profit / Loss
            else if (basicMenuChoice == 2 && portfolio2.getTrades() > 0)
            {
                do
                {
                    //Print out sectors. for the user to choose
                    System.out.println("◈◈ Take Profit/Loss ◈◈");
                    System.out.println(portfolio2.getSectors());
                    System.out.println("\tEnter 0 to go back.");
                    System.out.print("\n\tEnter the number of the sector you want to take profit/loss from: ");
                    sectorChoice = inputNum.nextInt();
                    System.out.println(" ");

                    //Print out stocks within chosen Sector
                    if(sectorChoice<0 || sectorChoice>5)
                        System.out.println("\t⚠ Please enter one of the available sectors. ⚠");
                    else if (sectorChoice == 1)
                    {
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio2.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");

                        System.out.print("\t\tEnter the stock that you want to take profit/loss from: ");
                        sectorChoice = inputNum.nextInt();
                        System.out.println(" ");

                        if ((sectorChoice - 1) < 0 || (sectorChoice - 1) > 4)
                        {
                            System.out.println("\t\t⚠ Please enter one of the available stocks. ⚠\n");
                        }
                        else
                        {
                            if (portfolio2.getChosenDivisions()[0].getInstruments()[sectorChoice - 1] != null)
                            {
                                portfolio2.cashLeftover += portfolio2.getChosenDivisions()[0].getInstruments()[sectorChoice - 1].getTotal();
                                portfolio2.getChosenDivisions()[0].removeStock(sectorChoice - 1);
                                for (int i = 0; i < portfolio2.getChosenDivisions()[0].getInstruments().length; i++)
                                {
                                    portfolio2.getChosenDivisions()[i].toString();
                                }
                                portfolio2.updateTrades();
                            }
                            else
                            {
                                System.out.println("\t\t⚠ This slot is empty. ⚠\n");
                            }
                        }
                    }
                    //Sector 2
                    else if (sectorChoice == 2)
                    {
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio2.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");

                        System.out.print("\t\tEnter the stock that you want to take profit/loss from: ");
                        sectorChoice = inputNum.nextInt();
                        System.out.println(" ");

                        if ((sectorChoice - 1) < 0 || (sectorChoice - 1) > 4)
                        {
                            System.out.println("\t\t⚠ Please enter one of the available stocks. ⚠\n");
                        }
                        else
                        {
                            if (portfolio2.getChosenDivisions()[1].getInstruments()[sectorChoice - 1] != null)
                            {
                                portfolio2.cashLeftover += portfolio2.getChosenDivisions()[1].getInstruments()[sectorChoice - 1].getTotal();
                                portfolio2.getChosenDivisions()[1].removeStock(sectorChoice - 1);
                                for (int i = 0; i < portfolio2.getChosenDivisions()[1].getInstruments().length; i++)
                                {
                                    portfolio2.getChosenDivisions()[i].toString();
                                }
                                portfolio2.updateTrades();
                            }
                            else
                            {
                                System.out.println("\t\t⚠ This slot is empty. ⚠\n");
                            }
                        }
                    }
                    //Sector 3
                    else if (sectorChoice == 3)
                    {
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio2.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");

                        System.out.print("\t\tEnter the stock that you want to take profit/loss from: ");
                        sectorChoice = inputNum.nextInt();
                        System.out.println(" ");

                        if ((sectorChoice - 1) < 0 || (sectorChoice - 1) > 4)
                        {
                            System.out.println("\t\t⚠ Please enter one of the available stocks. ⚠\n");
                        }
                        else
                        {
                            if (portfolio2.getChosenDivisions()[2].getInstruments()[sectorChoice - 1] != null)
                            {
                                portfolio2.cashLeftover += portfolio2.getChosenDivisions()[2].getInstruments()[sectorChoice - 1].getTotal();
                                portfolio2.getChosenDivisions()[2].removeStock(sectorChoice - 1);
                                for (int i = 0; i < portfolio2.getChosenDivisions()[2].getInstruments().length; i++)
                                {
                                    portfolio2.getChosenDivisions()[i].toString();
                                }
                                portfolio2.updateTrades();
                            }
                            else
                            {
                                System.out.println("\t\t⚠ This slot is empty. ⚠\n");
                            }
                        }
                    }
                    //Sector 4
                    else if (sectorChoice == 4)
                    {
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio2.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");

                        System.out.print("\t\tEnter the stock that you want to take profit/loss from: ");
                        sectorChoice = inputNum.nextInt();
                        System.out.println(" ");

                        if ((sectorChoice - 1) < 0 || (sectorChoice - 1) > 4)
                        {
                            System.out.println("\t\t⚠ Please enter one of the available stocks. ⚠\n");
                        }
                        else
                        {
                            if (portfolio2.getChosenDivisions()[3].getInstruments()[sectorChoice - 1] != null)
                            {
                                portfolio2.cashLeftover += portfolio2.getChosenDivisions()[3].getInstruments()[sectorChoice - 1].getTotal();
                                portfolio2.getChosenDivisions()[3].removeStock(sectorChoice - 1);
                                for (int i = 0; i < portfolio2.getChosenDivisions()[3].getInstruments().length; i++)
                                {
                                    portfolio2.getChosenDivisions()[i].toString();
                                }
                                portfolio2.updateTrades();
                            }
                            else
                            {
                                System.out.println("\t\t⚠ This slot is empty. ⚠\n");
                            }
                        }
                    }
                    //Sector 5
                    else if (sectorChoice == 5)
                    {
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio2.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");

                        System.out.print("\t\tEnter the stock that you want to take profit/loss from: ");
                        sectorChoice = inputNum.nextInt();
                        System.out.println(" ");

                        if ((sectorChoice - 1) < 0 || (sectorChoice - 1) > 4)
                        {
                            System.out.println("\t\t⚠ Please enter one of the available stocks. ⚠\n");
                        }
                        else
                        {
                            if (portfolio2.getChosenDivisions()[4].getInstruments()[sectorChoice - 1] != null)
                            {
                                portfolio2.cashLeftover += portfolio2.getChosenDivisions()[4].getInstruments()[sectorChoice - 1].getTotal();
                                portfolio2.getChosenDivisions()[4].removeStock(sectorChoice - 1);
                                for (int i = 0; i < portfolio2.getChosenDivisions()[4].getInstruments().length; i++)
                                {
                                    portfolio2.getChosenDivisions()[i].toString();
                                }
                                portfolio2.updateTrades();
                            }
                            else
                            {
                                System.out.println("\t\t⚠ This slot is empty. ⚠\n");
                            }
                        }
                    }
                } while (sectorChoice != 0 && portfolio2.getTrades() > 0);

            }
            //Trade Stock
            else if (basicMenuChoice == 3 && portfolio2.getTrades() > 0)
            {

                do
                {
                    //Print out portfolio 1 sectors.
                    System.out.println("◈◈ Trade Stocks ◈◈");
                    System.out.println(portfolio2.getSectors());
                    System.out.println("\tEnter 0 to go back.");
                    System.out.print("\n\tEnter the number of the sector you want to access: ");
                    sectorChoice = inputNum.nextInt();

                    //Checks for proper input
                    if (sectorChoice > 5 || sectorChoice < 1)
                    {
                        System.out.println("\t⚠ Please enter one of the available sectors. ⚠");
                    }
                    //Opens the sector of user choice
                    else
                    {
                        do
                        {
                            //Prints out all the getInstruments() in that sector
                            System.out.println("\t\t|Owned List|");
                            System.out.println(portfolio2.getChosenDivisions()[sectorChoice-1].toString());

                            System.out.print("\t\t Enter the stock you would like to trade: ");
                            stockChoice = inputNum.nextInt();
                            //Asks user to choose one of their current stocks to trade with another
                            //Stores the stock of choice into currentStock
                            if (stockChoice == 1 && portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1] != null)
                            {
                                currentStock = portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1];
                                break;
                            }
                            else if (stockChoice == 2 && portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1] != null)
                            {
                                currentStock = portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1];
                                break;
                            }
                            else if (stockChoice == 3 && portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1] != null)
                            {
                                currentStock = portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1];
                                break;
                            }
                            else if (stockChoice == 4 && portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1] != null)
                            {
                                currentStock = portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1];
                                break;
                            }
                            else if (stockChoice == 5 && portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1] != null)
                            {
                                currentStock = portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1];
                                break;
                            }
                            else
                            {
                                System.out.println("\n\t⚠ Please enter one of the available stocks. ⚠\n");
                            }
                        } while (true);

                        if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("technology"))
                        {
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in technology sector
                            System.out.println(technologySector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (technologyArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }


                            }
                        }
                        else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Crypto Currency"))
                        {
                            taken = false;
                            //print available stocks for purchase in crypto sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(cryptoCurrencySector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (cryptoArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }
                            }
                        }
                        else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Retail"))
                        {
                            taken = false;
                            //print available stocks for purchase in retail sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(retailSector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (retailArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }

                            }
                        }
                        else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Auto"))
                        {
                            taken = false;
                            //print available stocks for purchase in auto sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(autoSector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (autoArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }

                            }
                        }
                        else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Aerospace"))
                        {
                            taken = false;
                            //print available stocks for purchase in aerospace sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(aerospaceSector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (aeroArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }

                            }
                        }
                        else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Financial"))
                        {
                            taken = false;
                            //print available stocks for purchase in financial sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(financialSector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (financialArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }


                            }
                        }
                        else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Food"))
                        {
                            taken = false;
                            //print available stocks for purchase in food sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(foodSector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (foodArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio2.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();

                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio2.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio2.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }
                            }
                        }


                    }
                } while (sectorChoice != 0 && portfolio2.getTrades() > 0);

            }
            //List Sectors
            else if (basicMenuChoice == 4)
            {
                do
                {
                    System.out.println("◈◈ List Sectors ◈◈");
                    System.out.println(portfolio2.getSectors());
                    System.out.println("\tEnter 0 to go back.");

                    System.out.print("\n\tEnter the number of the sector you want to list: ");
                    sectorChoice = inputNum.nextInt();


                    //Opens the sector of user choice
                    if (sectorChoice > 5 || sectorChoice < 1)
                    {
                        System.out.println("Please enter one of the available sectors.");
                    }
                    else
                    {
                        //Prints out all the getInstruments() in that sector
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio2.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");
                        System.out.println("\t\t|Stocks List|");
                        if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("technology"))
                        {
                            System.out.println(technologySector.toString());
                        }
                        else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Crypto Currency"))
                        {
                            System.out.println(cryptoCurrencySector.toString());
                        }
                        else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Retail"))
                        {
                            System.out.println(retailSector.toString());
                        }
                        else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Auto"))
                        {
                            System.out.println(autoSector.toString());
                        }
                        else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Aerospace"))
                        {
                            System.out.println(aerospaceSector.toString());
                        }
                        else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Financial"))
                        {
                            System.out.println(financialSector.toString());
                        }
                        else if (portfolio2.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Food"))
                        {
                            System.out.println(foodSector.toString());
                        }
                        System.out.println(" ");
                    }
                } while (sectorChoice != 0);
            }
            //Determine total Capital
            else if (basicMenuChoice == 5)
            {
                System.out.println("◈◈ Total Capital ◈◈");
                System.out.println("\n\t \uD83D\uDCB0\uD83D\uDCB0Total Capital of " + portfolio2.getName() + ": " + moneyFormat.format(portfolio2.getTotalCapital())+ " \uD83D\uDCB0\uD83D\uDCB0\n");
            }
            //View Profit
            else if (basicMenuChoice == 6)
            {
                System.out.println("◈◈ View Profit ◈◈");
                System.out.println("\t◖ " + portfolio2.getName()+" ◗");
                System.out.println("\t\t Total Profit/Loss: " + moneyFormat.format(portfolio2.getTotalProfitLoss()));
                System.out.println("\t\t Daily Profit/Loss: " + moneyFormat.format(portfolio2.getDailyProfit()) +"\n");

            }
            //Check Sector Volatility
            else if (basicMenuChoice == 7)
            {
                do
                {
                    System.out.println("◈◈ Check Sector Volatility ◈◈");
                    System.out.println(portfolio2.getSectors());
                    System.out.println("\tEnter 0 to go back.");
                    System.out.print("\n\tEnter the number of the sector you want to add to: ");
                    sectorChoice = inputNum.nextInt();

                    if (sectorChoice >= 1 && sectorChoice <= 5)
                    {
                        System.out.println("\n\t「"+portfolio2.getChosenDivisions()[sectorChoice - 1].getName()+"」");
                        System.out.println("\t\t The volatility of the sector is: " +
                                portfolio2.getChosenDivisions()[sectorChoice - 1].getSectorVolatality()+"\n");
                    }
                    else
                    {
                        System.out.println("\n\t⚠ Please enter one of the available sectors. ⚠\n");
                    }

                } while (sectorChoice != 0);
            }
            //End Day
            else if (basicMenuChoice == 8)
            {
                endDay();
            }
            else if (basicMenuChoice == 0)
            {
                System.out.println("⬅ Going back.");
            }
            else
            {
                if (portfolio2.getTrades() == 0)
                {
                    System.out.println("⚠⚠ You are out of trades. ⚠⚠");
                }
                System.out.println("⚠ Please enter a correct number. ⚠");
            }

        } while (basicMenuChoice != 0);
    }

    private static void basicMenu3()
    {
        do
        {
            //Update Sector Stock prices
            //Print out Main Menu
            System.out.println("\n-----------------------------------------------------------");
            System.out.println("\uD83D\uDCB0 Main Menu \uD83D\uDCB0");
            System.out.println("-----------------------------------------------------------");
            System.out.println("[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t1. Add Investment");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t2. Take Profit/Loss");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t3. Trade Stock");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t4. List Sectors");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t5. Determine Total Capital");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t6. View Profit");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t7. Check Sector Volatility");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\t8. End day");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");
            System.out.println("     ┎┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┒");
            System.out.println("\t\tEnter 0 to go back.");
            System.out.println("     ┖┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┈┚");

            System.out.println("\t\t\uD83D\uDCB0\uD83D\uDCB0 Current Balance: " + moneyFormat.format(portfolio3.getCashLeftover()) + " \uD83D\uDCB0\uD83D\uDCB0");
            System.out.println("\n[̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅][̲̅$̲̅(̲̅ιοο̲̅)̲̅$̲̅]\n");
            System.out.print("Enter your choice: ");
            basicMenuChoice = inputNum.nextInt();
            System.out.println(" ");

            //Add Investment
            if (basicMenuChoice == 1 && portfolio3.getTrades() > 0)
            {
                do
                {
                    System.out.println("◈◈ Add Investment ◈◈");
                    System.out.println(portfolio3.getSectors());
                    System.out.println("\tEnter 0 to go back.");

                    System.out.print("\n\tEnter the number of the sector you want to add to: ");
                    sectorChoice = inputNum.nextInt();

                    //Opens the sector of user choice
                    if (sectorChoice > 5 || sectorChoice < 1)
                    {
                        System.out.println("\t⚠ Please enter one of the available sectors. ⚠");
                    }
                    else
                    {
                        for (int i = 0; i < portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments().length; i++)
                        {
                            //Prints out stocks if there is an open slot.
                            if (portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] == null)
                            {
                                System.out.println("\t\t|Owned List|");
                                System.out.println(portfolio3.getChosenDivisions()[sectorChoice-1].toString());
                                System.out.println(" ");

                                System.out.println("\t\t|Stocks List|");
                                //Checks which Sector the user is in (example technology or retail) to know which stocks to allow them to buy
                                if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("technology"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in technology sector

                                    System.out.println(technologySector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();

                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (technologyArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = technologyArray[stockChoice - 1];
                                        portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio3.cashLeftover -= 1000;

                                        portfolio3.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in crypto sector
                                else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Crypto Currency"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in crypto sector
                                    System.out.println(cryptoCurrencySector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (cryptoArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = cryptoArray[stockChoice - 1];
                                        portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio3.cashLeftover -= 1000;
                                        portfolio3.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in retail sector
                                else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Retail"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in retail sector
                                    System.out.println(retailSector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (retailArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t:warning: Sorry, you already own this stock choose another one. :warning:\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = retailArray[stockChoice - 1];
                                        portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio3.cashLeftover -= 1000;
                                        portfolio3.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in auto sector
                                else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Auto"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in auto sector
                                    System.out.println(autoSector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (autoArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t:warning: Sorry, you already own this stock choose another one. :warning:\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = autoArray[stockChoice - 1];
                                        portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio3.cashLeftover -= 1000;
                                        portfolio3.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in aerospace sector
                                else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Aerospace"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in aero sector
                                    System.out.println(aerospaceSector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();


                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (aeroArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t:warning: Sorry, you already own this stock choose another one. :warning:\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = aeroArray[stockChoice - 1];
                                        portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio3.cashLeftover -= 1000;
                                        portfolio3.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in financial sector
                                else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Financial"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in financial sector
                                    System.out.println(technologySector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();

                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (financialArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t:warning: Sorry, you already own this stock choose another one. :warning:\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = financialArray[stockChoice - 1];
                                        portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio3.cashLeftover -= 1000;
                                        portfolio3.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                                //Checks if user is in food sector
                                else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Food"))
                                {
                                    taken = false;
                                    //print available stocks for purchase in food sector
                                    System.out.println(technologySector.toString());
                                    System.out.print("\t\tWhich stock would you like to add?\n");
                                    System.out.print("\t\tEnter your choice: ");

                                    stockChoice = inputNum.nextInt();

                                    //Checks to see if user is trying to buy a duplicate stock
                                    for (int u = 0; u < portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                                    {
                                        //Check all non null slots for a duplicate
                                        if (portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                        {
                                            //If duplicate then break loop and say choose another stock
                                            if (foodArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                            {
                                                System.out.println("\t\t:warning: Sorry, you already own this stock choose another one. :warning:\n");
                                                //if stock chosen is a duplicate than ask them to choose another
                                                taken = true;
                                                break;
                                            }
                                        }
                                    }
                                    if(taken)
                                    {
                                        break;
                                    }
                                    //Checks if the stock is taken
                                    if (!taken)
                                    {
                                        portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[i] = foodArray[stockChoice - 1];
                                        portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[i].buyShares();
                                        portfolio3.cashLeftover -= 1000;
                                        portfolio3.updateTrades();
                                        break;
                                    }
                                    taken = false;
                                }
                            }
                            else
                            {
                                if (i==4)
                                    System.out.println("\n\t\t⚠⚠ You cannot add stocks to a full sector. ⚠⚠\n");
                            }
                        }

                    }

                } while (sectorChoice != 0 && portfolio3.getTrades() > 0);

            }
            //Take Profit / Loss
            else if (basicMenuChoice == 2 && portfolio3.getTrades() > 0)
            {
                do
                {
                    //Print out sectors. for the user to choose
                    System.out.println("◈◈ Take Profit/Loss ◈◈");
                    System.out.println(portfolio3.getSectors());
                    System.out.println("\tEnter 0 to go back.");
                    System.out.print("\n\tEnter the number of the sector you want to take profit/loss from: ");
                    sectorChoice = inputNum.nextInt();
                    System.out.println(" ");

                    //Print out stocks within chosen Sector
                    if(sectorChoice<0 || sectorChoice>5)
                        System.out.println("\t⚠ Please enter one of the available sectors. ⚠");
                    else if (sectorChoice == 1)
                    {
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio3.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");

                        System.out.print("\t\tEnter the stock that you want to take profit/loss from: ");
                        sectorChoice = inputNum.nextInt();
                        System.out.println(" ");

                        if ((sectorChoice - 1) < 0 || (sectorChoice - 1) > 4)
                        {
                            System.out.println("\t\t⚠ Please enter one of the available stocks. ⚠\n");
                        }
                        else
                        {
                            if (portfolio3.getChosenDivisions()[0].getInstruments()[sectorChoice - 1] != null)
                            {
                                portfolio3.cashLeftover += portfolio3.getChosenDivisions()[0].getInstruments()[sectorChoice - 1].getTotal();
                                portfolio3.getChosenDivisions()[0].removeStock(sectorChoice - 1);
                                for (int i = 0; i < portfolio3.getChosenDivisions()[0].getInstruments().length; i++)
                                {
                                    portfolio3.getChosenDivisions()[i].toString();
                                }
                                portfolio3.updateTrades();
                            }
                            else
                            {
                                System.out.println("\t\t⚠ This slot is empty. ⚠\n");
                            }
                        }
                    }
                    //Sector 2
                    else if (sectorChoice == 2)
                    {
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio3.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");

                        System.out.print("\t\tEnter the stock that you want to take profit/loss from: ");
                        sectorChoice = inputNum.nextInt();
                        System.out.println(" ");

                        if ((sectorChoice - 1) < 0 || (sectorChoice - 1) > 4)
                        {
                            System.out.println("\t\t⚠ Please enter one of the available stocks. ⚠\n");
                        }
                        else
                        {
                            if (portfolio3.getChosenDivisions()[1].getInstruments()[sectorChoice - 1] != null)
                            {
                                portfolio3.cashLeftover += portfolio3.getChosenDivisions()[1].getInstruments()[sectorChoice - 1].getTotal();
                                portfolio3.getChosenDivisions()[1].removeStock(sectorChoice - 1);
                                for (int i = 0; i < portfolio3.getChosenDivisions()[1].getInstruments().length; i++)
                                {
                                    portfolio3.getChosenDivisions()[i].toString();
                                }
                                portfolio3.updateTrades();
                            }
                            else
                            {
                                System.out.println("\t\t⚠ This slot is empty. ⚠\n");
                            }
                        }
                    }
                    //Sector 3
                    else if (sectorChoice == 3)
                    {
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio3.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");

                        System.out.print("\t\tEnter the stock that you want to take profit/loss from: ");
                        sectorChoice = inputNum.nextInt();
                        System.out.println(" ");

                        if ((sectorChoice - 1) < 0 || (sectorChoice - 1) > 4)
                        {
                            System.out.println("\t\t⚠ Please enter one of the available stocks. ⚠\n");
                        }
                        else
                        {
                            if (portfolio3.getChosenDivisions()[2].getInstruments()[sectorChoice - 1] != null)
                            {
                                portfolio3.cashLeftover += portfolio3.getChosenDivisions()[2].getInstruments()[sectorChoice - 1].getTotal();
                                portfolio3.getChosenDivisions()[2].removeStock(sectorChoice - 1);
                                for (int i = 0; i < portfolio3.getChosenDivisions()[2].getInstruments().length; i++)
                                {
                                    portfolio3.getChosenDivisions()[i].toString();
                                }
                                portfolio3.updateTrades();
                            }
                            else
                            {
                                System.out.println("\t\t⚠ This slot is empty. ⚠\n");
                            }
                        }
                    }
                    //Sector 4
                    else if (sectorChoice == 4)
                    {
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio3.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");

                        System.out.print("\t\tEnter the stock that you want to take profit/loss from: ");
                        sectorChoice = inputNum.nextInt();
                        System.out.println(" ");

                        if ((sectorChoice - 1) < 0 || (sectorChoice - 1) > 4)
                        {
                            System.out.println("\t\t⚠ Please enter one of the available stocks. ⚠\n");
                        }
                        else
                        {
                            if (portfolio3.getChosenDivisions()[3].getInstruments()[sectorChoice - 1] != null)
                            {
                                portfolio3.cashLeftover += portfolio3.getChosenDivisions()[3].getInstruments()[sectorChoice - 1].getTotal();
                                portfolio3.getChosenDivisions()[3].removeStock(sectorChoice - 1);
                                for (int i = 0; i < portfolio3.getChosenDivisions()[3].getInstruments().length; i++)
                                {
                                    portfolio3.getChosenDivisions()[i].toString();
                                }
                                portfolio3.updateTrades();
                            }
                            else
                            {
                                System.out.println("\t\t⚠ This slot is empty. ⚠\n");
                            }
                        }
                    }
                    //Sector 5
                    else if (sectorChoice == 5)
                    {
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio3.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");

                        System.out.print("\t\tEnter the stock that you want to take profit/loss from: ");
                        sectorChoice = inputNum.nextInt();
                        System.out.println(" ");

                        if ((sectorChoice - 1) < 0 || (sectorChoice - 1) > 4)
                        {
                            System.out.println("\t\t⚠ Please enter one of the available stocks. ⚠\n");
                        }
                        else
                        {
                            if (portfolio3.getChosenDivisions()[4].getInstruments()[sectorChoice - 1] != null)
                            {
                                portfolio3.cashLeftover += portfolio3.getChosenDivisions()[4].getInstruments()[sectorChoice - 1].getTotal();
                                portfolio3.getChosenDivisions()[4].removeStock(sectorChoice - 1);
                                for (int i = 0; i < portfolio3.getChosenDivisions()[4].getInstruments().length; i++)
                                {
                                    portfolio3.getChosenDivisions()[i].toString();
                                }
                                portfolio3.updateTrades();
                            }
                            else
                            {
                                System.out.println("\t\t⚠ This slot is empty. ⚠\n");
                            }
                        }
                    }
                } while (sectorChoice != 0 && portfolio3.getTrades() > 0);

            }
            //Trade Stock
            else if (basicMenuChoice == 3 && portfolio3.getTrades() > 0)
            {

                do
                {
                    //Print out portfolio 1 sectors.
                    System.out.println("◈◈ Trade Stocks ◈◈");
                    System.out.println(portfolio3.getSectors());
                    System.out.println("\tEnter 0 to go back.");
                    System.out.print("\n\tEnter the number of the sector you want to access: ");
                    sectorChoice = inputNum.nextInt();

                    //Checks for proper input
                    if (sectorChoice > 5 || sectorChoice < 1)
                    {
                        System.out.println("\t⚠ Please enter one of the available sectors. ⚠");
                    }
                    //Opens the sector of user choice
                    else
                    {
                        do
                        {
                            //Prints out all the getInstruments() in that sector
                            System.out.println("\t\t|Owned List|");
                            System.out.println(portfolio3.getChosenDivisions()[sectorChoice-1].toString());

                            System.out.print("\t\t Enter the stock you would like to trade: ");
                            stockChoice = inputNum.nextInt();
                            //Asks user to choose one of their current stocks to trade with another
                            //Stores the stock of choice into currentStock
                            if (stockChoice == 1 && portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1] != null)
                            {
                                currentStock = portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1];
                                break;
                            }
                            else if (stockChoice == 2 && portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1] != null)
                            {
                                currentStock = portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1];
                                break;
                            }
                            else if (stockChoice == 3 && portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1] != null)
                            {
                                currentStock = portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1];
                                break;
                            }
                            else if (stockChoice == 4 && portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1] != null)
                            {
                                currentStock = portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1];
                                break;
                            }
                            else if (stockChoice == 5 && portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1] != null)
                            {
                                currentStock = portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[stockChoice - 1];
                                break;
                            }
                            else
                            {
                                System.out.println("\n\t⚠ Please enter one of the available stocks. ⚠\n");
                            }
                        } while (true);

                        if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("technology"))
                        {
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in technology sector
                            System.out.println(technologySector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (technologyArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = technologyArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }


                            }
                        }
                        else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Crypto Currency"))
                        {
                            taken = false;
                            //print available stocks for purchase in crypto sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(cryptoCurrencySector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (cryptoArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = cryptoArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }
                            }
                        }
                        else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Retail"))
                        {
                            taken = false;
                            //print available stocks for purchase in retail sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(retailSector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (retailArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = retailArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }

                            }
                        }
                        else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Auto"))
                        {
                            taken = false;
                            //print available stocks for purchase in auto sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(autoSector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (autoArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = autoArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }

                            }
                        }
                        else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Aerospace"))
                        {
                            taken = false;
                            //print available stocks for purchase in aerospace sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(aerospaceSector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (aeroArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = aeroArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }

                            }
                        }
                        else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Financial"))
                        {
                            taken = false;
                            //print available stocks for purchase in financial sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(financialSector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (financialArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = financialArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }


                            }
                        }
                        else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Food"))
                        {
                            taken = false;
                            //print available stocks for purchase in food sector
                            System.out.println("\t\t|Stocks List|");
                            taken = false;
                            //print available stocks for purchase in sector
                            System.out.println(foodSector.toString());
                            System.out.print("\t\tWhich stock would you like to add?\n");
                            System.out.print("\t\tEnter your choice: ");

                            stockChoice = inputNum.nextInt();

                            //Checks to see if user is trying to trade for a duplicate stock
                            for (int u = 0; u < portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments().length; u++)
                            {
                                //Check all non null slots for a duplicate
                                if (portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u] != null)
                                {
                                    //If duplicate then break loop and say choose another stock
                                    if (foodArray[stockChoice - 1].getName().equalsIgnoreCase(portfolio3.getChosenDivisions()[sectorChoice - 1].getInstruments()[u].getName()))
                                    {
                                        System.out.println("\t\t⚠ Sorry, you already own this stock choose another one. ⚠");
                                        //if stock chosen is a duplicate than ask them to choose another
                                        taken = true;
                                        break;
                                    }
                                }
                            }

                            if (!taken)
                            {
                                if (stockChoice == 1)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 2)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 3)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 4)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                    ;
                                }
                                else if (stockChoice == 5)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 6)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 7)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else if (stockChoice == 8)
                                {
                                    newStock = foodArray[stockChoice - 1];
                                    portfolio3.getChosenDivisions()[sectorChoice - 1].tradeStock(newStock, currentStock);
                                    portfolio3.updateTrades();
                                }
                                else
                                {
                                    System.out.println("\t\t ⚠ Please enter a valid stock. ⚠");
                                }
                            }
                        }


                    }
                } while (sectorChoice != 0 && portfolio3.getTrades() > 0);

            }
            //List Sectors
            else if (basicMenuChoice == 4)
            {
                do
                {
                    System.out.println("◈◈ List Sectors ◈◈");
                    System.out.println(portfolio3.getSectors());
                    System.out.println("\tEnter 0 to go back.");

                    System.out.print("\n\tEnter the number of the sector you want to list: ");
                    sectorChoice = inputNum.nextInt();


                    //Opens the sector of user choice
                    if (sectorChoice > 5 || sectorChoice < 1)
                    {
                        System.out.println("Please enter one of the available sectors.");
                    }
                    else
                    {
                        //Prints out all the getInstruments() in that sector
                        System.out.println("\t\t|Owned List|");
                        System.out.println(portfolio3.getChosenDivisions()[sectorChoice-1].toString());
                        System.out.println(" ");
                        System.out.println("\t\t|Stocks List|");
                        if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("technology"))
                        {
                            System.out.println(technologySector.toString());
                        }
                        else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Crypto Currency"))
                        {
                            System.out.println(cryptoCurrencySector.toString());
                        }
                        else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Retail"))
                        {
                            System.out.println(retailSector.toString());
                        }
                        else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Auto"))
                        {
                            System.out.println(autoSector.toString());
                        }
                        else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Aerospace"))
                        {
                            System.out.println(aerospaceSector.toString());
                        }
                        else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Financial"))
                        {
                            System.out.println(financialSector.toString());
                        }
                        else if (portfolio3.getChosenDivisions()[sectorChoice - 1].getName().equalsIgnoreCase("Food"))
                        {
                            System.out.println(foodSector.toString());
                        }
                        System.out.println(" ");
                    }
                } while (sectorChoice != 0);
            }
            //Determine total Capital
            else if (basicMenuChoice == 5)
            {
                System.out.println("◈◈ Total Capital ◈◈");
                System.out.println("\n\t \uD83D\uDCB0\uD83D\uDCB0Total Capital of " + portfolio3.getName() + ": " + moneyFormat.format(portfolio3.getTotalCapital())+ " \uD83D\uDCB0\uD83D\uDCB0\n");
            }
            //View Profit
            else if (basicMenuChoice == 6)
            {
                System.out.println("◈◈ View Profit ◈◈");
                System.out.println("\t◖ " + portfolio3.getName()+" ◗");
                System.out.println("\t\t Total Profit/Loss: " + moneyFormat.format(portfolio3.getTotalProfitLoss()));
                System.out.println("\t\t Daily Profit/Loss: " + moneyFormat.format(portfolio3.getDailyProfit()) +"\n");

            }
            //Check Sector Volatility
            else if (basicMenuChoice == 7)
            {
                do
                {
                    System.out.println("◈◈ Check Sector Volatility ◈◈");
                    System.out.println(portfolio3.getSectors());
                    System.out.println("\tEnter 0 to go back.");
                    System.out.print("\n\tEnter the number of the sector you want to add to: ");
                    sectorChoice = inputNum.nextInt();

                    if (sectorChoice >= 1 && sectorChoice <= 5)
                    {
                        System.out.println("\n\t「"+portfolio3.getChosenDivisions()[sectorChoice - 1].getName()+"」");
                        System.out.println("\t\t The volatility of the sector is: " +
                                portfolio3.getChosenDivisions()[sectorChoice - 1].getSectorVolatality()+"\n");
                    }
                    else
                    {
                        System.out.println("\n\t⚠ Please enter one of the available sectors. ⚠\n");
                    }

                } while (sectorChoice != 0);
            }
            //End Day
            else if (basicMenuChoice == 8)
            {
                endDay();
            }
            else if (basicMenuChoice == 0)
            {
                System.out.println("⬅ Going back.");
            }
            else
            {
                if (portfolio3.getTrades() == 0)
                {
                    System.out.println("⚠⚠ You are out of trades. ⚠⚠");
                }
                System.out.println("⚠ Please enter a correct number. ⚠");
            }

        } while (basicMenuChoice != 0);
    }


    //Updates prepopulated Sectors and Stocks
    private static void updatePrePopulatedSectors()
    {

        technologySector.updateAllSectorStocks();
        cryptoCurrencySector.updateAllSectorStocks();
        retailSector.updateAllSectorStocks();
        autoSector.updateAllSectorStocks();
        aerospaceSector.updateAllSectorStocks();
        financialSector.updateAllSectorStocks();
        foodSector.updateAllSectorStocks();
    }

    //Begins a new day and updates all stocks
    public static void endDay()
    {
        System.out.println("The day has ended, below you will find how much you have made overnight.\n");

        if (numPortfolios == 3)
        {

            portfolio1.updateDaysOpened();
            portfolio2.updateDaysOpened();
            portfolio3.updateDaysOpened();


            portfolio1.resetTrades();
            portfolio2.resetTrades();
            portfolio3.resetTrades();

            portfolio1.updateSectors();
            portfolio2.updateSectors();
            portfolio3.updateSectors();

            updatePrePopulatedSectors();

            portfolio1.activateRegion(false, (gen.nextInt(10) + 1));
            portfolio2.activateRegion(false, (gen.nextInt(10) + 1));
            portfolio3.activateRegion(false, (gen.nextInt(10) + 1));

            activatePreSetRegions(defaultSectors, false, (gen.nextInt(10) + 1));

            System.out.println("◤"+ portfolio1.getName() + "◢\n\t" + "Daily Profit:" + moneyFormat.format(portfolio1.getDailyProfit()) + "\n\tDays Owned: " + portfolio1.getDaysOpened());
            System.out.println("◤"+ portfolio2.getName() + "◢\n\t" + "Daily Profit:" + moneyFormat.format(portfolio2.getDailyProfit()) + "\n\tDays Owned: " + portfolio2.getDaysOpened());
            System.out.println("◤"+ portfolio3.getName() + "◢\n\t" + "Daily Profit:" + moneyFormat.format(portfolio3.getDailyProfit()) + "\n\tDays Owned: " + portfolio3.getDaysOpened());


        }
        else if (numPortfolios == 2)
        {

            portfolio1.updateDaysOpened();
            portfolio2.updateDaysOpened();


            portfolio1.resetTrades();
            portfolio2.resetTrades();

            portfolio1.activateRegion(false, (gen.nextInt(10) + 1));
            portfolio2.activateRegion(false, (gen.nextInt(10) + 1));

            portfolio1.updateSectors();
            portfolio2.updateSectors();

            activatePreSetRegions(defaultSectors, false, (gen.nextInt(10) + 1));

            updatePrePopulatedSectors();

            System.out.println("◤"+ portfolio1.getName() + "◢\n\t" + "Daily Profit:" + moneyFormat.format(portfolio1.getDailyProfit()) + "\n\tDays Owned: " + portfolio1.getDaysOpened());
            System.out.println("◤"+ portfolio2.getName() + "◢\n\t" + "Daily Profit:" + moneyFormat.format(portfolio2.getDailyProfit()) + "\n\tDays Owned: " + portfolio2.getDaysOpened());
        }
        else
        {
            portfolio1.updateDaysOpened();


            portfolio1.resetTrades();

            portfolio1.activateRegion(false, (gen.nextInt(10) + 1));

            portfolio1.updateSectors();

            activatePreSetRegions(defaultSectors, false, (gen.nextInt(10) + 1));

            updatePrePopulatedSectors();

            System.out.println("◤"+ portfolio1.getName() + "◢\n\t" + "Daily Profit:" + moneyFormat.format(portfolio1.getDailyProfit()) + "\n\tDays Owned: " + portfolio1.getDaysOpened());
        }


    }

    public static void activatePreSetRegions(Sector[] chosenDivisions, boolean active, int rnd)
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
                    if (rnd == 1)
                    {
                        if (chosenDivisions[i].getInstruments()[j].getRegion() == 'N')
                        {
                            chosenDivisions[i].getInstruments()[j].setActive(active);
                        }
                    }
                    else if (rnd == 3)
                    {
                        if (chosenDivisions[i].getInstruments()[j].getRegion() == 'E')
                        {
                            chosenDivisions[i].getInstruments()[j].setActive(active);
                        }
                    }
                    else if (rnd == 5)
                    {
                        if (chosenDivisions[i].getInstruments()[j].getRegion() == 'A')
                        {
                            chosenDivisions[i].getInstruments()[j].setActive(active);
                        }
                    }
                    else if (rnd == 7)
                    {
                        if (chosenDivisions[i].getInstruments()[j].getRegion() == 'F')
                        {
                            chosenDivisions[i].getInstruments()[j].setActive(active);
                        }
                    }
                    else if (rnd == 9)
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

}
