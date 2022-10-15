import java.util.HashMap;
import java.util.Map;

public class AtmOperationImp implements ATMOperationInterface{

    ATM atm = new ATM();
    Map<Double,String> ministmt = new HashMap<>();
    @Override
    public void viewBalance() {
        System.out.println("Available Balance is : " + atm.getBalance());
    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if (withdrawAmount % 500 == 0){
            if (withdrawAmount<=atm.getBalance()){
                ministmt.put(withdrawAmount," Amount Withdrawn");
                System.out.println("Collect Your Cash : " +withdrawAmount );
                atm.setBalance(atm.getBalance()-withdrawAmount);
                viewBalance();
            }else {
                System.err.println("\nInsufficient Balance !!");
            }
        }else {
            System.err.println("Enter Amount Only in Multiple of 500");
        }
    }
    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount," Amount Deposited");
        System.out.println(depositAmount + " Deposited Successfully !!");
        atm.setBalance(atm.getBalance()+depositAmount);
        viewBalance();
    }
    @Override
    public void viewMiniStatement() {
        for (Map.Entry<Double,String> m:ministmt.entrySet()){
            System.out.println(m.getKey() + m.getValue());
        }

    }
}
