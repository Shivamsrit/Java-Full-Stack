package CH12ExceptionHandling;

public class InsufficientBalanceException extends Exception{
    public InsufficientBalanceException(){
        super(" Insufficient Balance! ");
    }
    public InsufficientBalanceException(String message){
        super(message);
    }
}
