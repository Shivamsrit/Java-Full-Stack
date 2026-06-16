package CH19Serizable_Deserizable;

/*
 * ============================================================
 *  SERIALIZATION & DE-SERIALIZATION - Binary Type of Data
 *  (java.io.* - InputStream / OutputStream)
 * ============================================================
 *
 *  SERIALIZATION (RAM --> HDD)
 *  ---------------------------
 *
 *   RAM (Volatile Memory)          N/W           HDD (File)
 *                               (binary fmt)
 *   +------------------+        +-------+      +------------+
 *   |   std (Object)   | -----> | N / W | ---> |  abc.ser   |
 *   |                  |        +-------+      |            |
 *   |  sid    = 10     |    java.io.*           | byte codes |
 *   |  sname  = sachin |    binaryformat        |            |
 *   |  saddr  = MI     |                        +------------+
 *   +------------------+
 *   Student (implements Serializable)  <-- MarkerInterface
 *
 * ============================================================
 *
 *  DE-SERIALIZATION (HDD --> RAM)
 *  --------------------------------
 *
 *   HDD (File)                                  RAM
 *
 *   +------------+                      +------------------+
 *   |  abc.ser   |                      |   std (Object)   |
 *   |            |  java.io.*           |                  |
 *   | byte codes | -------------------> |  sid    = 10     |
 *   |            |  binaryformat        |  sname  = sachin |
 *   +------------+                      |  saddr  = MI     |
 *                                       +------------------+
 *                     Student (implements Serializable) <-- MarkerInterface
 *
 * ============================================================
 *  KEY POINTS:
 *  1. Object should have the facility of Transportation
 *     (transported over Network).
 *  2. Object should be supported to store inside
 *     File System (Using Streams).
 *
 *  NOTE: Serializable is a MarkerInterface (no methods)
 *        present in java.io package.
 * ============================================================
 */

public class Intro {
}
