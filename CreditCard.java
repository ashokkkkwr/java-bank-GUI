
/**
 * Write a description of class CreditClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CreditCard extends BankCard
{
    //  Attributes of the CreditCard Class.
    private int cvcNumber;
    private double creditLimit;
    private double interestRate;
    private String expirationDate;
    private int gracePeriod;
    private boolean isGranted;
    //constructor for CreditCard class.
    public CreditCard(String issuerBank,String bankAccount,int cardId,int balanceAmount,String clientName,int cvcNumber,double interestRate,String expirationDate)
    {
      super(issuerBank,bankAccount,cardId,balanceAmount);//calls the Constructor of bankcard.
      super.setClientName(clientName);
      this.cvcNumber=cvcNumber;
      this.interestRate=interestRate;
      this.expirationDate=expirationDate;
      this.isGranted=false;
    }
//Accessor method to get private values of Creditcard class Private Attributes.
public int getCvcNumber()
{
    return cvcNumber;
}
public int getGracePeriod()
{
    return gracePeriod;
}
public double getInterestRate()
{
    return interestRate;
}
public double getCreditLimit()
{
    return creditLimit;
}
public boolean getIsGranted()
{
    return isGranted;
}
public String getExpirationDate()
{
    return expirationDate;
}
//setter method to set the values.
public void setCreditLimit(double newcreditLimit,int newgracePeriod)
{   
    if(isGranted==false)
        if(creditLimit<=2.5*super.getBalanceAmount())//checks if creditLimit is less than 2.5 times of  balanceAmount.
        {
        this.creditLimit=newcreditLimit;
        this.gracePeriod=newgracePeriod;
        this.isGranted=true;
        System.out.println("the creditLimit of "+this.creditLimit+"is granted to the client"+super.getClientName());
        
        }
        else{
            System.out.println("credit cannot be granted,insufficient balance");
        }
}
// cancelCreditCard method to cancel creditCard input valuess
public void cancelCreditCard()
{
    this.cvcNumber=0;
    this.creditLimit=0;
    this.gracePeriod=0;
    this.isGranted=false;
    
}
//method to display all the enter inputs.
public void display()
{
    System.out.println("interest rate:-"+this.interestRate);
    System.out.println("Expiration Date:-"+this.expirationDate);
    if(isGranted==true)
    super.display();
    System.out.println("cvc number:-"+this.cvcNumber);
    System.out.println("credit limit:-"+this.creditLimit);
    System.out.println("Grace peroid:-"+this.gracePeriod);
    
}


}