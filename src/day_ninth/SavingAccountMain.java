package day_ninth;

public class SavingAccountMain {
    public static void main(String[] args) {
//        Instantiation of 2 Obj
        SavingAccount saver1 = new SavingAccount();
        SavingAccount saver2 = new SavingAccount();

//        sets the balance
        SavingAccount.modifyInterestRate(0.03);
        saver1.setSavingBalance(2000.00);
        saver2.setSavingBalance(3000.00);
        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();

//        determines the interest rate

        System.out.println("Saver1 new balance is : "+ saver1.getSavingBalance());
        System.out.println("Saver1 new balance is : "+ saver2.getSavingBalance());

        saver1.calculateMonthlyInterest();
        saver2.calculateMonthlyInterest();
        SavingAccount.modifyInterestRate(0.04);
        System.out.println("Saver1 new balance is : "+ saver1.getSavingBalance());
        System.out.println("Saver1 new balance is : "+ saver2.getSavingBalance());


    }
}
