package CH16StreamAPI;
import java.util.*;
import java.util.stream.*;

/*
        Stream API
        ==========
        * Stream => Channel through which there is a free flow movement of Data.
        * Streams => To process Objects of the collection , In 1.8v Streams concept was Introduced.


 */

import java.util.ArrayList;

public class CH01StreamAPI {
    public static void main(String[] args) {
        ArrayList<Integer> arraylist = new ArrayList<Integer>();
        arraylist.add(0);
        arraylist.add(5);
        arraylist.add(10);
        arraylist.add(15);
        arraylist.add(20);
        arraylist.add(30);

        System.out.println(arraylist);

        //   in java 1.7V
        ArrayList<Integer> even = new ArrayList<>();
        for(Integer i : arraylist)
            if(i % 2 == 0)
                even.add(i);
        System.out.println(even);

        // In java 1.8V we use Streams
        // 1. Configuration     al.stream()
        // 2. Processing        filter(lambda expression ex i-> i%2==0).collect(
        // if want to fillter the object into a collection use fillter.
        List<Integer> evenList = arraylist.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        evenList.forEach(System.out::println);

        // In jdk 1.8V we use Streams
        // Map :- for every object if a new object has to be converted then go for map.
        // public abstract <R> java.util.stream.Stream<R> map(java.util.function.Function<? super T, ? extends R>);
        List<Integer> arr = arraylist.stream().map(obj->obj*2).collect(Collectors.toList());
        arr.forEach(System.out::println);
        

    }
}


/*
   * Difference between java.util.Streams and java.io.Streams
   => java.util.Streams meant for processing objects from the Collection. That is it represents a
   *  Stream of Objects From the Collection. But Java.io.Streams meant for Processing binary and
   * Character data with respect to file that is it represents Stream of Binary data or Character
   * data from file , hence both java.io.Streams and Java.util.Streams both are different.


 * ============================================================
 * JAVA STREAMS — TWO COMPLETELY DIFFERENT THINGS
 * ============================================================
 *
 * 1. java.util.Stream  →  Data Processing Pipeline
 *    - Works on in-memory collections (List, Set, Array)
 *    - Assembly line: Source → filter/map/sorted → collect
 *    - Lazy: nothing runs until terminal operation
 *    - No need to close
 *    - Example:
 *        volunteers.stream()
 *                  .filter(v -> v.isActive())
 *                  .map(Volunteer::getName)
 *                  .collect(Collectors.toList());
 *
 * 2. java.io streams  →  Byte / Character I/O Pipe
 *    - Works with external sources: files, network, keyboard
 *    - Water pipe: data flows from source to destination
 *    - MUST be closed (use try-with-resources)
 *    - Types:
 *        Byte   → InputStream / OutputStream  (images, binary)
 *        Char   → Reader / Writer             (text, CSV)
 *    - Example:
 *        try (BufferedReader reader =
 *                 new BufferedReader(new FileReader("food_posts.txt"))) {  // try with Resources
 *            String line;
 *            while ((line = reader.readLine()) != null) {
 *                System.out.println(line);
 *            }
 *        }
 *
 * KEY DIFFERENCE (1 line):
 *   util.Stream  = processes data already in memory
 *   io streams   = moves data between memory and outside world
 *
 * NOTE: Same word "Stream", completely different problem solved.
 * ============================================================
 *
 *
 *      Difference Between Collection and Stream?
 *      => If we want to represent a group of individual object as a single entity then we should go for collection.
 *       * If we want to process a group of Objects from the collection Then we should go for Streams.
 *       * We Can create a stream of object to the Collection by using Stream () Method of Collection interface Stream()
 *          method is a default method added to the collection in 1.8V.
 *
 *
 */
