package CH01CoreJava.CH04String;

public class CodeSnippet {
    public static void main(String[] args) {
        test ob1 = new test();
        ob1.get();

    }
}

class test {
    String javaWorld = "javaWorld"; // SCP
    String java = "java"; // SCP
    String world = "world"; //SCP

    public void get() {
        java += world; // JVM => HEAP MEMORY
        System.out.println(java == javaWorld);

    }
}
