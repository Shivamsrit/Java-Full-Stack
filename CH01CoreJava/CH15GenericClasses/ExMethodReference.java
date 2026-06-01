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