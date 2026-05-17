package LambdaExpression;

public class Main {
    public static void main(String[] args) {
        Say ob1 = (name) -> name;
        System.out.println(ob1.print("Hello Bhaiya"));
    }
}
