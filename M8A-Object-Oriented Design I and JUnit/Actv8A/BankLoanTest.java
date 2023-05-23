import org.junit.Assert;
import org.junit.Test;
  /**
  *Application that tests BankLoan class methods.
  *Activity 8a
  *Heeyoon Son LLB 3
  *03/16/2020
  */  

public class BankLoanTest {

/**
  * method that tests instance of object BankLoan.
  */
  
   @Test public void defaultTest() 
   {
      BankLoan loan1 = new BankLoan("Jane", .10);
      loan1.borrowFromBank(1000.00);
      loan1.chargeInterest();
      Assert.assertEquals(" ", 1100, loan1.getBalance(), .000001);
   }
}
