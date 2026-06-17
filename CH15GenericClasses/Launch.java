package CH15GenericClasses;

/*  Step by step samjho:
                javaArrayList<String> list = new ArrayList<String>();
                list.add("Hello");
                String s = list.get(0);


        Compile-time pe (source code level):

                1.Compiler check karta hai ki tum sirf String type hi add kar sakte ho
                2.Agar tum list.add(123); likho, toh compile-time error aayega
                     Ye type safety hai jo generics provide karta hai

           ** Compile hone ke baad (bytecode/class level):

            1. Bytecode mein ArrayList<String> ka koi trace nahi rehta
            2. Compiler ye bytecode generate karta hai:

            javaArrayList list = new ArrayList();          // <String> erased
            list.add("Hello");
            String s = (String) list.get(0);            // compiler khud cast add karta hai


           ** Yani bytecode level pe raw ArrayList jaisa hi behave karta hai,
            lekin compiler tumhare liye automatically casting insert kar deta hai,
            taaki tumhe manually (String) likhne ki zarurat na pade.

 */

public class Launch {


}
