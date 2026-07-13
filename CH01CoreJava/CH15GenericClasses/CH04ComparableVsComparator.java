package CH01CoreJava.CH15GenericClasses;

/*
 * Understanding Comparable and Comparator in Java
 */
/*
 public TreeSet()
            |
            | ==> when we use above the constructor , JVM will internally use comparable interface method to sort
                    The object based on default natural sorting order.

  * What is Comparable Interface?
  ==> It is Functional Interface present in java.lang.package.
        this Interface is internally used by TreeSet object During Sorting Process of the object.
        @Functional Interface
        public Interface java.lang.comparable<T>{
                public abstract int compareTo(T);
        }

        eg:- TreeSet ts = new Treeset();
                ts.add("A");
                ts.add("C");
                ts.add("B");
                ts.add(10);  // ClassCastException
                ts.add(null) // nullPointerException
                System.out.println(ts) //["A","B","C"]

   Note:- If we are keeping the data inside TreeSet Object , then data should be
           * Homogenous :- Beacause it uses CompareTo() to sort the object.
           * The object should be compulsory implement Comparable Interface ,
                if we fail to do so it would result in "ClassCastException"
           * All wrapper class and String classes implements Comparable Interface,
                StringBuffer class  has not implemented Comparable Interface , So above program Would result in "ClassCastException".
           * If we  are depending on default natural sorting order compulsorily object should be Homogenous and
                Comparable OtherWise Result in " RuntimeError"
           * An object said to be Comparable if and only if  Corresponding class implements Comparable Interface.


           obj1.compareTo(obj2)
                        | ==> return -ve if obj1 has to come after the obj2
                        | ==> return +ve if obj1 has to come before the obj2
                        | ==> return 0 if and only if both are equal.

   ** Comparator (I):
            |==>If we are not satisfied with default sorting algorithm or if default natural sorting
                    order is not already available then we can define our own sorting by using Comparator object.

           public Java.lang.Comparator<T>{
               public abstract int compare(T,T);
               public abstract boolean equals(java.lang.object);    // optional implements because it is already to oyr class
                                                                            From object class through Inheritance.
           }

           public int compare(obj1,obj2)
                        | ==> return -ve if obj1 has to come after the obj2
                        | ==> return +ve if obj1 has to come before the obj2
                        | ==> return 0 if and only if both are equal.
 */


public class CH04ComparableVsComparator {



}

/*
 * Key Points:
 *  1. Comparable provides natural ordering (single way to sort)
 *  2. Comparator provides custom ordering (multiple ways to sort)
 *  3. Comparable.compareTo() returns: negative (less), zero (equal), positive (greater)
 *  4. Comparator.compare() follows same return value convention
 *  5. Always override equals() when implementing Comparable
 *  6. Use Comparator when you can't modify the class or need multiple sorting orders
 *  7. Lambda expressions make Comparator implementations more concise
 *  8. Comparator provides utility methods: comparing(), thenComparing(), reversed()
 *  9. Method references work well with Comparator.comparing()
 *  10. Null-safe comparators: nullsFirst(), nullsLast()
 *
 * Comparable vs Comparator:
 *  ┌─────────────────┬──────────────────┬───────────────────┐
 *  │     Aspect      │   Comparable     │    Comparator     │
 *  ├─────────────────┼──────────────────┼───────────────────┤
 *  │ Package         │ java.lang        │ java.util         │
 *  │ Method          │ compareTo()      │ compare()         │
 *  │ Sorting logic   │ In same class    │ Separate class    │
 *  │ Modification    │ Modify class     │ No class change   │
 *  │ Multiple sorts  │ Single way       │ Multiple ways     │
 *  │ Collections API │ sort(list)       │ sort(list, comp)  │
 *  └─────────────────┴──────────────────┴───────────────────┘
 *
 * Best Practices:
 *  - Use Comparable for natural/default ordering
 *  - Use Comparator for custom or multiple orderings
 *  - Prefer lambda expressions over anonymous classes
 *  - Chain comparators using thenComparing() for complex sorting
 *  - Handle null values appropriately
 *  - Be consistent with equals() when implementing Comparable
 *  - Use specific comparing methods: comparingInt(), comparingDouble(), etc.
 *  - Consider performance for frequently used comparators
 */
