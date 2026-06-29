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

import java.io.*;

/*
 * ============================================================
 *  AGENDA - Serialization & De-Serialization (Java I/O)
 * ============================================================
 *  1.  Serialization
 *  2.  De-Serialization
 *  3.  transient keyword
 *  4.  static vs transient
 *  5.  transient vs final
 *  6.  Object graph in Serialization
 *  7.  Customized Serialization
 *  8.  Serialization with respect to Inheritance
 *  9.  Externalization
 *  10. Difference between Serialization & Externalization
 *  11. SerialVersionUID
 * ============================================================
 *
 *  1. SERIALIZATION (v1.1)
 *  ------------------------
 *  => The process of saving (or) writing state of an object
 *     to a file is called Serialization.
 *     Strictly speaking, it is the process of converting an
 *     object from Java supported form to either:
 *       - Network supported form  (OR)
 *       - File supported form.
 *
 *  => By using FileOutputStream and ObjectOutputStream
 *     classes we can achieve the Serialization process.
 *       |=> writeObject(Object obj)
 *
 *  Ex: big balloon
 *      (Object inflate in RAM --> deflate --> transfer --> re-inflate)
 *
 * ============================================================
 *
 *  2. DE-SERIALIZATION
 *  --------------------
 *  => The process of reading state of an object from a file
 *     is called De-Serialization.
 *     It converts network/file supported form back to
 *     Java supported form.
 *
 *  => By using FileInputStream and ObjectInputStream
 *     classes we can achieve the De-Serialization process.
 *       |=> readObject()  --> returns Object (needs casting)
 *
 * ============================================================
 */
class dog implements Serializable {
//    static {
//        System.out.println("dog static block");
//    }
//
//    dog() {
//        System.out.println("dog constructor");
//    }
// transient -->  variable not participate in serializable.
//    final and transient --> final means variable won,t come into picture it is directly the value.
//    static and transient --> variable which is static not a part of object , so it is not  a part of seralization.
    transient int  i = 10; //
    int j = 20;

}

class cat implements Serializable {
    static {
        System.out.println("cat static block");
    }

    cat() {
        System.out.println("cat constructor");
    }

    int i = 30;
    int j = 40;
}

public class CH01Intro {
    public static void main(String[] args) throws IOException, ClassNotFoundException {


        dog d = new dog();
        cat cat = new cat();
        System.out.println("Serrization Started.........");
        String Filename = "C:\\Java Full stack\\abc.ser";
        FileOutputStream fos = new FileOutputStream(Filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d);
        oos.writeObject(cat);
        System.out.println("Serrization referenced " + d);
        System.out.println("Serrization referenced " + cat);
        System.out.println("Serrization Finished.........");
        System.in.read();


        System.out.println("De-Serrization Started.........");

        FileInputStream fis = new FileInputStream(Filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = (dog) ois.readObject();
        Object c = (cat) ois.readObject();
        cat c1 = (cat) c;
        dog d2 = (dog) obj;
        System.out.println("De-Serrization referenced " + d2);
        System.out.println("De-Serrization referenced " + c1);
        System.out.println("De-Serrization Finished.........");
    }
}
