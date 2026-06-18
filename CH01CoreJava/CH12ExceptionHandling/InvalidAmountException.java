package CH01CoreJava.CH12ExceptionHandling;

public class InvalidAmountException extends RuntimeException{
    public InvalidAmountException(){
        super("Amount must be greater than 0");
    }
    public InvalidAmountException(String message){
        super(message);
    }
}
