package CH01CoreJava.CH12ExceptionHandling;

public class UnionBank {
    private String accountHolderName;
    private double balance;
    public UnionBank(String accountHolderName,double balance){
        this.accountHolderName = accountHolderName;
        this.balance = balance;

    }
    public void deposite(double balance){
        if(balance <= 0){
            throw new InvalidAmountException();
        }
        this.balance = balance;
    }
    public void withdrawal(double balance)throws InsufficientBalanceException {
        if(balance <= 0 ){
            throw new InvalidAmountException();
        }
        else if( balance > this.balance){
            throw new InsufficientBalanceException();
        }
        this.balance = this.balance - balance;
    }
    public double checkBalance(){
        return balance;
    }

}
