package Test;
class a{

}
class b extends a{

}
public class Main {
    public static void main(String[] args) {


        Object ob = new a();
        System.out.println(ob.getClass().getName());
        a h1 = (a)ob;
    }
}
