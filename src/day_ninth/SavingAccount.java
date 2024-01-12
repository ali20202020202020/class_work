package day_ninth;

public class SavingAccount {

        /*
        1. Create a  SavingsAccount class.  Use a   static data member annualInterestRate
        to store the annual interest rate for each of the savers.
        Each member of the class contains a private data member savingsBalance indicating
        the amount the saver currently has on deposit.
        Provide member function calculateMonthlyInterest that calculates the monthlyinterest
        by multiplying the balance by annualInterestRate divided by  12;
        this interest should be added to savingsBalance.     Provide a   static member function
        modifyInterestRate that sets the static annualInterestRate to a new value.
        Write a driver program to test the class  SavingsAccount.   nstantiate two different objects of classSavingsAccount,

         saver1, and   saver2,   with balances of   $2000.00   and   $3000.00, respectively.   Set the annualInterestRate to   3   percent.

         Then calculate the monthlyinterest and print the new balances for each of the savers.   Then set the theannualInterestRate to 4 percent,
         calculate the next month's interest, and print the new balances for each of the savers.

        2. Create a class named Pizza that stores information about a single pizza. It should contain the following:

        Private instance variables to store the size of the pizza  (either small,  medium, or large), the number of cheese toppings,
        the number of pepperoni toppings, and the number of ham toppings.
        Constructor(s) that set all of the instance variables.
        Public methods to get and set the instance variables.
        A public method named calcCost( ) thatnreturns a double that is the cost of the pizza. Pizza cost is determined by:
        Small: $10 + $2 per topping Medium: $12 + $2 per topping Large: $14 + $2 per topping
        public method named getDescription( ) that returns a String containing the pizza size, quantity of each topping.
        Write test code to create several pizzas and output their descriptions. For example, a large pizza with one cheese,
        one pepperoni, and two ham toppings should cost a total of$22. Now Create a PizzaOrder class that allows up to three pizzas to be saved in order.
        Each pizza saved should be a Pizza object. Create a method calcTotal() that returns the cost of the order. In the runner order two pizzas and return the total cost.
         */
         public static double annualInterestRate;
         private double savingBalance;
         void calculateMonthlyInterest(){

            double monthlyInterest = (this.savingBalance * annualInterestRate)/12;
            this.savingBalance = savingBalance + monthlyInterest;


         }

         public static void modifyInterestRate(double newInterest){
             annualInterestRate = newInterest;
         }

         void setSavingBalance(double balance){
             this.savingBalance = balance;
         }

         double getSavingBalance (){
             return this.savingBalance;
         }

    }

