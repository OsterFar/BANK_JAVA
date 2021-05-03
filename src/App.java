//import package.Bank;
import java.util.Scanner;
public class App {

 
    // }
    public static void main(String[] args) throws Exception {
        Scanner myObj = new Scanner(System.in);
        //-----------student No 1-----------------
        Bank std1 = new Bank(12,"ali",5000);
        float x = myObj.nextFloat();
        std1.Credit(x);
        std1.print();
        
        //-----------student No 2-----------------
        Bank std2 = new Bank(12,"faraz",123);
        x = myObj.nextFloat();
        std2.Credit(x);
        std2.print();

        
        //-----------student No 3-----------------
        Bank std3 = new Bank(12,"Aun",2435);
        x = myObj.nextFloat();
        std3.Credit(x);
        std3.print();
    }
}

