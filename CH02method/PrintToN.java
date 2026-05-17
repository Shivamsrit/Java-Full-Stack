package method;

public class PrintToN {
    public static void main(String[] args) {
        PrintToN obj = new PrintToN();
        obj.printToN(10);
    }

    void printToN(int a) {
        if (a <= 0) return;
        printToN(a - 1);
        System.out.println(a);
//        printToN(a-1);

    }
}
