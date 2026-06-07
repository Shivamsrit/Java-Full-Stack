package CH15GenericClasses;

/* to demonstrate the usage of for Each() to print the element of ArrayList
=============================================================================
 */
import java.util.ArrayList;
import java.util.function.Consumer;

// public void for each (java,util,function.Consumer<? Super E> );
// public abstract void accept( T t);
class MyConsumer implements Consumer<String> {
    @Override
    public void accept(String s) {
        System.out.println("MyConsumer called " );
        System.out.println(s);
    }

}
public class ExMethodReference {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Shivam");
        list.add("Goli");
        list.add("Abhishek");
        list.add("Saransh");


        //Traditional Apporach
        MyConsumer c = new MyConsumer();
        list.forEach(c);
        System.out.println();

        // Lambda Expression
        list.forEach(lists-> System.out.println(lists));
        System.out.println();

        // Method Reference
        list.forEach(System.out::println);
        System.out.println();


    }
}
