
/**
 * Write a description of class Debitclass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DebitCard extends BankCard
{
    //attributes of debitclass class.
    private int pinNumber;
    private int withdrawalAmount;
    private String dateOfWithdrawal;
    private boolean hasWithdrawn;
    
    //constructor of debitclass class.
    public DebitCard(String issuerBank,String bankAccount,int cardId,int balanceAmount,String clientName,int pinNumber)
    {
        super(issuerBank,bankAccount,cardId,balanceAmount);//constructor of parentclass.
        super.setClientName(clientName);//calling setclientname from parentclass.
        this.pinNumber=pinNumber;
        this.hasWithdrawn=false;
    }
    //Accessor method of private attributes
    public int getPinNumber()
    {
        return pinNumber;
    }
    public int getWithDrawalAmount()
    {
        return withdrawalAmount;
    }
    public String getDateOfWithdrawal()
    {
        return dateOfWithdrawal;
    }
    public boolean getHasWithdrawn(){
        return hasWithdrawn;
    }
    //modular method
    public void setWithdrawalAmount(int withdrawalAmount)
    {
        this.withdrawalAmount=withdrawalAmount;
    }
    //withdraw method.
    public void withdraw(int withdrawalAmount,String dateOfWithdrawal,int pinNumber)
    {   
        if(getPinNumber()==pinNumber)//checks if entered pinNumber matched.
        {
            if(getBalanceAmount()>=withdrawalAmount)//checks if Balance is greater than withdrawal Amount.
            {
            this.withdrawalAmount=withdrawalAmount;
            this.hasWithdrawn=true;
            this.dateOfWithdrawal=dateOfWithdrawal;
            int remainingBalance=getBalanceAmount()-this.withdrawalAmount;
            System.out.println(this.withdrawalAmount+ " has been withdrawan" + "and the remaining balance:-"+remainingBalance);
            super.setBalanceAmount(remainingBalance);
            }
        else//if balanceAmount is less than withdrawal amount
        {
            System.out.println("current balance is Insufficient please enter sufficient balance");
            
            
        }
        }
        else
        {
            System.out.println("Please enter correct pin number");
        }
    
    
        
    }
    //to display th details
    public void display()
    {
            super.display();//calls the display method from bankCard.
            if(hasWithdrawn==true)
            {
               System.out.println("withdrawn has been successfull"); 
               System.out.println("your pin number is :-"+this.pinNumber);
               System.out.println("The withdrawal Amount is:-"+this.withdrawalAmount);
               System.out.println("the Date of withdrawal is:-"+this.dateOfWithdrawal);
            }
            else
            {
                System.out.println("your transaction is incomplete");
                System.out.println("your balance is :"+super.getBalanceAmount());
            }
            
    }
    
    
}
