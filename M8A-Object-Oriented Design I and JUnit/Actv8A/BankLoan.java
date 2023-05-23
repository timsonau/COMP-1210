/**
  *Application .
  *Acitvity 8a
  *Heeyoon Son LLB 3
  *03/16/2020
  */
public class BankLoan {
	// constant fields
   private static final int MAX_LOAN_AMOUNT = 100000;

   // instance variables (can be used within the class)
   private String customerName;
   private double balance, interestRate;
   private static int loansCreated = 0; 

/**
  * creates BankLoan Object.
  * @param customerNameIn userinpit
  * @param interestRateIn userinput
  */
  
   public BankLoan(String customerNameIn, double interestRateIn) { 
      customerName = customerNameIn;
      interestRate = interestRateIn;
      balance = 0;
      loansCreated++;
   }

/**
  * returns how much borrowed from bank.
  * @param amount amount borrowing
  * @return wasLoanMade
  */
  
   public boolean borrowFromBank(double amount) {
      
      boolean wasLoanMade = false;
      
      if (balance + amount < MAX_LOAN_AMOUNT) {
         wasLoanMade = true;
         balance += amount;
      }
   
      return wasLoanMade;
   }

/**
  * creates BankLoan Object.
  * @param amountPaid userinpit
  * @return newBalance;
  */
  
   public double payBank(double amountPaid) {
      double newBalance = balance - amountPaid;
      if (newBalance < 0) {
         balance = 0;
         // paid too much, return the overcharge
         return Math.abs(newBalance);
      }
      else {
         balance = newBalance;
         return 0;
      }
   }

/**
  * returns balance.
  * @return balance
  */
     
   public double getBalance() {
      return balance;
   }

/**
  * creates BankLoan Object.
  * @return true or false
  * @param interestRateIn userinput
  */
   
   public boolean setInterestRate(double interestRateIn) {
   
      if (interestRateIn >= 0 && interestRateIn <= 1) {
         interestRate = interestRateIn;
         return true;
      }
      else {
         return false;
      }
   }

/**
  * creates BankLoan Object.
  * @return intrestRate
  */
     
   public double getInterestRate() {
      return interestRate;
   }

/**
  * creates BankLoan Object.
  */
    
   public void chargeInterest() {
      balance = balance * (1 + interestRate);
   }

/**
  * converts result to string.
  * @return outpout
  */
     
   public String toString() {
      String output = "Name: " + customerName + "\r\n" 
         + "Interest rate: " + interestRate + "%\r\n" 
         + "Balance: $" + balance + "\r\n";
      return output;
   }

/**
  * creates BankLoan Object.
  * @param amount user
  * @return true/false;
  */
    
   public static boolean isAmountValid(double amount)
   {
      return amount >= 0;
   }

/**
  * creates BankLoan Object.
  * @param loan bankLoan
  * @return isInDebt
  */
  
   public static boolean isInDebt(BankLoan loan)
   {
      if (loan.getBalance() > 0)
      {
         return true;
      }
      return false;
   }

/**
  * creates BankLoan Object.
  * @return loansCreated
  */
     
   public static int getLoansCreated()
   {
      return loansCreated;
   }

/**
  * creates BankLoan Object.
  */
     
   public static void resetLoansCreated()
   {
      loansCreated = 0;
   }
}
