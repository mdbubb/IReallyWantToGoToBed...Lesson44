import java.text.NumberFormat;
import java.util.*;
/**
 * Created by mdb17 on 2/15/2017.
 */
public class sortingBankAccount {
    public static void main(String [] args){
        NumberFormat formatter = NumberFormat.getNumberInstance();
        formatter.setMinimumFractionDigits(2);
        formatter.setMaximumFractionDigits(2);
        String name;
        int j;
        bankAccount ba[] = new bankAccount[5];
        for( j =0; j<ba.length; j++){
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the name to whom the account belongs");
            name = input.nextLine();
            System.out.println("Please enter the amount of the deposit");
            double amount = input.nextDouble();
            System.out.println(" ");
            ba[j] = new bankAccount(name,amount);
        }
        Comparator comp = new Compare();
        Arrays.sort(ba,comp);
        for (int i=0; i<ba.length; i++){
            System.out.println(ba[i].name + ">>>" + ba[i].balance);
        }
    }
}
