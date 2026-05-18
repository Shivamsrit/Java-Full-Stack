package CH10LambdaExpression;

interface p{
    void print();
    void print1();
    void print2();

}
abstract class demo implements p{
    public abstract void set();

}

public class test extends demo {
    @Override
    public void set() {
        System.out.println("hello");
    }
}
