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

    private static Scanner inputStr = new Scanner(System.in);
    private static Scanner inputNum = new Scanner(System.in);


    //All Technology Sector Stocks
    private static Stock intelStock = new Stock("Intel", 'A', 59.41, 8.8, true);
    private static Stock appleStock = new Stock("Apple", 'A', 59.41, 8.8, true);
    private static Stock alphabetStock = new Stock("Alphabet", 'A', 59.41, 8.8, true);
    private static Stock samsungStock = new Stock("Samsung", 'A', 59.41, 8.8, true);
    private static Stock microsoftStock = new Stock("Microsoft", 'A', 59.41, 8.8, true);
    private static Stock nvidiaStock = new Stock("Nvidia", 'A', 59.41, 8.8, true);
    private static Stock nintendoStock = new Stock("Nintendo", 'A', 59.41, 8.8, true);
    private static Stock amdStock = new Stock("AMD", 'A', 59.41, 8.8, true);

    //Array of all technology stocks
    private static Stock[] technologyArray = {intelStock, appleStock, alphabetStock, samsungStock, microsoftStock, nvidiaStock, nintendoStock, amdStock};

    //Technology Sector
    private static Sector technologySector = new Sector("Technology", technologyArray);

    //All Crypto Currency Stocks
    private static Stock bitcoinStock = new Stock("Bitcoin", 'A', 59.41, 8.8, true);
    private static Stock doge_CoinStock = new Stock("Doge Coin", 'A', 59.41, 8.8, true);
    private static Stock litecoinStock = new Stock("Litecoin", 'A', 59.41, 8.8, true);
    private static Stock zCashStock = new Stock("zCash", 'A', 59.41, 8.8, true);
    private static Stock ethereumStock = new Stock("Ethereum", 'A', 59.41, 8.8, true);
    private static Stock zuccBuccStock = new Stock("ZuccBucc", 'A', 59.41, 8.8, true);
    private static Stock rippleStock = new Stock("Ripple", 'A', 59.41, 8.8, true);
    private static Stock dashStock = new Stock("Dash", 'A', 59.41, 8.8, true);

    //Array of crypto currency stocks
    private static Stock[] cryptoArray = {bitcoinStock, doge_CoinStock, litecoinStock, zCashStock, ethereumStock, zuccBuccStock, rippleStock, dashStock};

    //Crypto Currency Sector
    private static Sector cryptoCurrencySector = new Sector("Crypto Currency", cryptoArray);

    //All Retail Stocks
    private static Stock amazonStock = new Stock("Amazon", 'A', 59.41, 8.8, true);
    private static Stock alibabaStock = new Stock("Alibaba", 'A', 59.41, 8.8, true);
    private static Stock bestBuyStock = new Stock("BestBuy", 'A', 59.41, 8.8, true);
    private static Stock costcoStock = new Stock("Costco", 'A', 59.41, 8.8, true);
    private static Stock rexallStock = new Stock("Rexall", 'A', 59.41, 8.8, true);
    private static Stock wishStock = new Stock("Wish", 'A', 59.41, 8.8, true);
    private static Stock freshCoStock = new Stock("FreshCo", 'A', 59.41, 8.8, true);
    private static Stock ebayStock = new Stock("Ebay", 'A', 59.41, 8.8, true);

    //Array of retail stocks
    private static Stock[] retailArray = {amazonStock, alibabaStock, bestBuyStock, costcoStock, rexallStock, wishStock, freshCoStock, ebayStock};

    //Retail Sector
    private static Sector retailSector = new Sector("Retail", retailArray);

    //All auto Stocks
    private static Stock fordStock = new Stock("Ford", 'A', 59.41, 8.8, true);
    private static Stock volkswagenStock = new Stock("Volkswagen", 'A', 59.41, 8.8, true);
    private static Stock hondaStock = new Stock("Honda", 'A', 59.41, 8.8, true);
    private static Stock toyotaStock = new Stock("Toyota", 'A', 59.41, 8.8, true);
    private static Stock teslaStock = new Stock("Tesla", 'A', 59.41, 8.8, true);
    private static Stock volvoStock = new Stock("Volvo", 'A', 59.41, 8.8, true);
    private static Stock nissanStock = new Stock("Nissan", 'A', 59.41, 8.8, true);
    private static Stock ferrariStock = new Stock("Ferrari", 'A', 59.41, 8.8, true);

    //Array of auto Stocks
    private static Stock[] autoArray = {fordStock, volkswagenStock, hondaStock, toyotaStock, teslaStock, volvoStock, nissanStock, ferrariStock};

    //Auto Sector
    private static Sector autoSector = new Sector("Auto", autoArray);

    //All Aerospace and Defense Stocks
    private static Stock bombardierStock = new Stock("Bombardier", 'A', 59.41, 8.8, true);
    private static Stock generalElectricStock = new Stock("General Electric", 'A', 59.41, 8.8, true);
    private static Stock boeingStock = new Stock("Boeing", 'A', 59.41, 8.8, true);
    private static Stock unitedTechnologiesStock = new Stock("United Technologies", 'A', 59.41, 8.8, true);
    private static Stock airbusStock = new Stock("Airbus", 'A', 59.41, 8.8, true);
    private static Stock honeywellStock = new Stock("Honeywell", 'A', 59.41, 8.8, true);
    private static Stock spaceXStock = new Stock("SpaceX", 'A', 59.41, 8.8, true);
    private static Stock safronStock = new Stock("Safron", 'A', 59.41, 8.8, true);

    //Array of Aerospace and defence stocks
    private static Stock[] aeroArray = {bombardierStock, generalElectricStock, boeingStock, unitedTechnologiesStock, airbusStock, honeywellStock, spaceXStock, safronStock};

    //Aerospace Sector
    private static Sector aerospaceSector = new Sector("Aerospace", aeroArray);

    //All Financial / banks stocks
    private static Stock scotiaBankStock = new Stock("ScotiaBank", 'A', 59.41, 8.8, true);
    private static Stock cibcStock = new Stock("CIBC", 'A', 59.41, 8.8, true);
    private static Stock bankOfAmericaStock = new Stock("Bank of America", 'A', 59.41, 8.8, true);
    private static Stock bmoStock = new Stock("BMO", 'A', 59.41, 8.8, true);
    private static Stock hAndRBlockStock = new Stock("H and R Block", 'A', 59.41, 8.8, true);
    private static Stock tdStock = new Stock("TD", 'A', 59.41, 8.8, true);
    private static Stock rbcStock = new Stock("RBC", 'A', 59.41, 8.8, true);
    private static Stock tangerineStock = new Stock("Tangerine", 'A', 59.41, 8.8, true);

    //Array of Financial stocks
    private static Stock[] financialArray = {scotiaBankStock, cibcStock, bankOfAmericaStock, bmoStock, hAndRBlockStock, tdStock, rbcStock, tangerineStock};

    //Financial Sector
    private static Sector financialSector = new Sector("Financial", financialArray);

    //All food Stocks
    private static Stock mcDonaldsStock = new Stock("McDonalds", 'A', 59.41, 8.8, true);
    private static Stock wendysStock = new Stock("Wendys", 'A', 59.41, 8.8, true);
    private static Stock chipotleStock = new Stock("Chipotle", 'A', 59.41, 8.8, true);
    private static Stock dominoesStock = new Stock("Dominoes", 'A', 59.41, 8.8, true);
    private static Stock beyondMeatStock = new Stock("BeyondMeat", 'A', 59.41, 8.8, true);
    private static Stock pepsiCoStock = new Stock("PepsiCo", 'A', 59.41, 8.8, true);
    private static Stock heinekenStock = new Stock("Heineken", 'A', 59.41, 8.8, true);
    private static Stock henneseyStock = new Stock("Hennesey", 'A', 59.41, 8.8, true);

    //Array of food Stocks
    private static Stock[] foodArray = {mcDonaldsStock, wendysStock, chipotleStock, dominoesStock, beyondMeatStock, pepsiCoStock, heinekenStock, henneseyStock};

    //Food Sector
    private static Sector foodSector = new Sector("Food", foodArray);


    private static Portfolio portfolio1 = new Portfolio();
    //Initialize user Sectors for portfolio 1
    private static Sector userTechnology1 = new Sector("Technology");
    private static Sector userCrypto1 = new Sector("Crypto Currency");
    private static Sector userRetail1 = new Sector("Retail");
    private static Sector userAuto1 = new Sector("Auto");
    private static Sector userAerospace1 = new Sector("Aerospace");
    private static Sector userFinancial1 = new Sector("Financial");
    private static Sector userFood1 = new Sector("Food");

    private static Sector[] userSectors1 = new Sector[5];

    //Initialize Stock arrays for portfolio one and each sector within
    private static Stock[] userPortfolio1Sector1Stocks = new Stock[5];
    private static Stock[] userPortfolio1Sector2Stocks = new Stock[5];
    private static Stock[] userPortfolio1Sector3Stocks = new Stock[5];
    private static Stock[] userPortfolio1Sector4Stocks = new Stock[5];
    private static Stock[] userPortfolio1Sector5Stocks = new Stock[5];


    private static Portfolio portfolio2 = new Portfolio();
    //Initialize user Sectors for portfolio 2
    private static Sector userTechnology2 = new Sector("Technology");
    private static Sector userCrypto2 = new Sector("Crypto Currency");
    private static Sector userRetail2 = new Sector("Retail");
    private static Sector userAuto2 = new Sector("Auto");
    private static Sector userAerospace2 = new Sector("Aerospace");
    private static Sector userFinancial2 = new Sector("Financial");
    private static Sector userFood2 = new Sector("Food");

    private static Sector[] userSectors2 = new Sector[5];

    //Initialize Stock arrays for portfolio two and each sector within
    private static Stock[] userPortfolio2Sector1Stocks = new Stock[5];
    private static Stock[] userPortfolio2Sector2Stocks = new Stock[5];
    private static Stock[] userPortfolio2Sector3Stocks = new Stock[5];
    private static Stock[] userPortfolio2Sector4Stocks = new Stock[5];
    private static Stock[] userPortfolio2Sector5Stocks = new Stock[5];


    private static Portfolio portfolio3 = new Portfolio();
    //Initialize user Sectors for portfolio 3
    private static Sector userTechnology3 = new Sector("Technology");
    private static Sector userCrypto3 = new Sector("Crypto Currency");
    private static Sector userRetail3 = new Sector("Retail");
    private static Sector userAuto3 = new Sector("Auto");
    private static Sector userAerospace3 = new Sector("Aerospace");
    private static Sector userFinancial3 = new Sector("Financial");
    private static Sector userFood3 = new Sector("Food");

    private static Sector[] userSectors3 = new Sector[5];

    //Initialize Stock arrays for portfolio three and each sector within
    private static Stock[] userPortfolio3Sector1Stocks = new Stock[5];
    private static Stock[] userPortfolio3Sector2Stocks = new Stock[5];
    private static Stock[] userPortfolio3Sector3Stocks = new Stock[5];
    private static Stock[] userPortfolio3Sector4Stocks = new Stock[5];
    private static Stock[] userPortfolio3Sector5Stocks = new Stock[5];

    private static Portfolio[] portfolios = {portfolio1, portfolio2, portfolio3};

    private static int numPortfolios = 0;


    public static void main(String[]args){


        /**
         * WHEN YOU END THE DAY, DO THE FOLLOWING:
         * 1. clear dailyProfit.
         * 2. change price with volatility.
         * 3. update new price;
         * 4. set beginDayPrice.
         */

        int choice, gameChoice;




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

                        System.out.println("Which portfolio would you like to access");

                    }

                }while(gameChoice != 0);

            }
            else if(choice == 2){
                System.out.println("test 2");
            }


        }while(choice != 0);




    }

    private static void createPortfolio(){

        int choice;

        //Prevents user from adding the same sector twice
        Boolean[] chosen = {true, true, true, true, true, true, true};

        if(numPortfolios == 1){

            System.out.print("Enter the name of your first portfolio: ");
            portfolio1.setName(inputStr.nextLine());

            for (int i = 0; i < userSectors1.length; i++){

                do{
                    System.out.println("Please choose what sectors you want in your portfolio");
                    System.out.println("Choose carefully you will not be able to change them later!");
                    System.out.print("1. Technology, 2. Crypto Currency, 3. Retail, 4. Auto, 5. Aerospace and Defence, 6. Financial, 7. Food: ");
                    choice = inputNum.nextInt();

                    if (choice == 1 && chosen[0]) {
                        userSectors1[i] = userTechnology1;
                        //Prevents user from adding the same sector twice
                        chosen[0] = false;
                        break;
                    }
                    else if (choice == 2 && chosen[1]) {
                        userSectors1[i] = userCrypto1;
                        chosen[1] = false;
                        break;
                    }
                    else if (choice == 3 && chosen[2]) {
                        userSectors1[i] = userRetail1;
                        chosen[2] = false;
                        break;
                    }
                    else if (choice == 4 && chosen[3]) {
                        userSectors1[i] = userAuto1;
                        chosen[3] = false;
                        break;
                    }
                    else if (choice == 5 && chosen[4]) {
                        userSectors1[i] = userAerospace1;
                        chosen[4] = false;
                        break;
                    }
                    else if (choice == 6 && chosen[5]) {
                        userSectors1[i] = userFinancial1;
                        chosen[5] = false;
                        break;
                    }
                    else if (choice == 7 && chosen[6]) {
                        userSectors1[i] = userFood1;
                        chosen[6] = false;
                        break;
                    }
                    else {
                        System.out.println("Please enter a number from 1-7");
                    }
                }while(userSectors1[i] == null);
            }

            //Add the sectors to the current portfolio
            portfolio1.setSectors(userSectors1);

            for (int i = 0; i < userSectors1.length; i++){

                for(int j = 0; j < userPortfolio1Sector1Stocks.length; j++){

                    do
                    {
                        System.out.println("Please choose or create the stocks you want in your " + userSectors1[0].getName() + " Sector");
                        System.out.println("1. Create Stock");
                        System.out.println("2. Choose Stock");
                        choice = inputNum.nextInt();

                        //Create Stock
                        if (choice == 1)
                        {



                        //Choose stock
                        } else if (choice == 2) {

                            //List stocks and info for the current sector using toString
                            System.out.println("Your options are: ");
                            System.out.println(technologySector.toString());




                        } else {
                            System.out.println("Please enter a valid number");
                        }
                    }while(userPortfolio1Sector1Stocks == null);


                }
            }

        }
        else if(numPortfolios == 2){



        }
        else if(numPortfolios == 3){



        }
    }

}
