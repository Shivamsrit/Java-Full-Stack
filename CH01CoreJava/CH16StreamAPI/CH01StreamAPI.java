package CH16StreamAPI;

/*
        Stream API
        ==========
        * Stream => Channel through which there is a free flow movement of Data.
        * Streams => To process Objects of the collection , In 1.8v Streams concept was Introduced.


 */

public class CH01StreamAPI {
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