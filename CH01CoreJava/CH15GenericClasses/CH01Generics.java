package CH01CoreJava.CH15GenericClasses;

// Today Topics
/*
        1. Generics
        2. Comparable vs Comparator
        3. Stream Api
        4. Lamda Expression in Collection
        5. Jodha Api (Date&Time)
 */

/*
  Generics:- Generics was introduce in JDK 1.5V to Provide Type-Saftey and to resolve Type Casting Problem
*/

import java.util.ArrayList;

public class CH01Generics {
    public static void main(String[] args) {
        String[] ob = new String[600];
        ob[0] = "Sachin";
        ob[1] = "Dhoni";

        String ob1 = ob[1];  // No need of Type Casting



        // Collection --> type safety and Type Casting is not require.
        ArrayList al = new ArrayList();
        al.add("Sachin");
        al.add("Dhoni");
        al.add(new Integer(10));


        // We assume the element present inside ArrayList is String and We do retrieval
        // use Generics feature available from JDK 1.5V.

        //Collection are Not "Type Safety"
        String s1 = (String)al.get(0);
        String s2 = (String) al.get(1);
//        String s3 = (String) al.get(3);  // RE: ClassCastException

//        String s4 = al.get(0); // Compile Time Error becoz Type Casting is required.


//        Arrar ===> directly deals with data At memory level
//        Generics ===> deals with data Api code (class code).
//        <T>  ==> TypeParameter
    }
}


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

// 2. Custom created Generics class





