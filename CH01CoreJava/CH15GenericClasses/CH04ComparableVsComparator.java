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
        public Interface java.lang.comparable{
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
           
 */


public class CH04ComparableVsComparator {

}
