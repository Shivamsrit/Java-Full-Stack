package CH01CoreJava.CH07Encapsulation;

public class Bank {
    private Integer amount ;
    private String Holder;
    private Integer Number;
     public  Bank(String Holder,Integer Number){
         this.Holder = Holder;
         this.Number = Number;
         amount = 0;
     }
     public void credit(Integer amount){
         this.amount += amount;
         System.out.println("Amount balance :" + this.amount);
     }
     public Integer debit(Integer amount){
         if(amount > this.amount && amount > 0){
             System.out.println("Not Sufficient Balance");
             return -1;
         }
         this.amount = this.amount - amount;
         return  this.amount;
     }



}
