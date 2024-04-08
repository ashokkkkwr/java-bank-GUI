
/**
 * Write a description of class Bankcard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankCard
{
    //Five attributes of BankCard.
    private String clientName;
    private String issuerBank;
    private String bankAccount;
    private int cardId;
    private int balanceAmount;
    public char[] getCardId;
    
    public BankCard(String issuerBank,String bankAccount,int cardId,int balanceAmount)//constructor eccepts four parameters.
    {//Constructor for BankCard.
       this.clientName="";
       //Assigning attributes with parameter values.
       this.balanceAmount=balanceAmount;
       this.cardId=cardId;
       this.bankAccount=bankAccount;
       this.issuerBank=issuerBank;
       
    }
    //Attributes Accessor/getter methods.
    public String getClientName()
    {
        return clientName;
    }
    public String getIssuerBank()
    {
        return issuerBank;
    }
    public String getBankAccount()
    {
        return bankAccount;
    }
    public int getCardId()
    {
        return cardId;
    }
    public int getBalanceAmount()
    {
        return balanceAmount;
    }
    //Setter method to set values of clientName and balanceAmount.
    public void setClientName(String clientName){
        this.clientName=clientName;    
    }
    public void setBalanceAmount(int balanceAmount)
    {
        this.balanceAmount=balanceAmount;
    }
    public void display()//displaying all the entered details.
    {
        if(clientName.equals("")){//is client name is not entered.
            System.out.println("Please enter clientName");
        }
        else{
        System.out.println("The cardId is:"+cardId);
        System.out.println("The clientName is:"+clientName);
        System.out.println("the issuerBank is:"+issuerBank);
        System.out.println("the bankaccount is:"+bankAccount);
        System.out.println("the BalanceAmount is:"+balanceAmount);
        }
    }
    
    
    
}
