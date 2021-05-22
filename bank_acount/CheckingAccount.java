package bank_acount;

public class CheckingAccount extends Account{

    private static double FEE=2.5;
    public CheckingAccount() {
        super();
    }

    public CheckingAccount(int accountNumber,double fee){

        super(accountNumber);
        FEE=fee;
    }




    @Override
    public void deposit(double amount) {

        if(amount>0){
            balance+=amount;
            System.out.printf("Balance updated : %.2f deposited%n",amount);
            balance-=FEE;
            System.out.printf("Fee updated : %.2f Applied%n",FEE);

            System.out.printf("Current Balance : %.2f%n",balance);

        }else{
            System.out.println("negative  amount");
        }
    }

    @Override
    public void withdraw(double amount) {
        // Same check
        if(amount > 0) {
            // Check sufficient balance
            if((amount+FEE) <= balance) {

                System.out.printf("Amount of %.2f withdrawn from Account%n", amount);
                balance -= amount;
                balance -= FEE;
                System.out.printf("Fee of %.2f applied%n", FEE);
                System.out.printf("Current Balance is: %.2f%n", balance);
            }
        } else {
            System.out.println("Negative amount cannot be withdrawn!");
        }
    }



}
