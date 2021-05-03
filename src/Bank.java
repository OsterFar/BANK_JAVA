

public class Bank {
    
    //Declaring the Public var
    public float account_Number = 0 ;
    public String acc_HolderName = "" ;
    public float balance = 0 ;
    // Constructor 

    public Bank(float account_Numb ,String acc_Holder ,float bal) {
        account_Number = account_Numb ;
        acc_HolderName = acc_Holder ;
        balance = bal ;
        

    }
 
    //Credit Function 
    public void Credit(float credit){
        //Here i am assuming that credit function will add the credit in the account 
        
        balance += credit ;

    }
    //print
    public void print() {
        System.out.println("acc_HolderName");
        System.out.println(acc_HolderName);
        System.out.println("account_Number");
        System.out.println(account_Number);
        System.out.println("balance") ;
        System.out.println(balance);
    }
}
