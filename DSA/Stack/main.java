package Stack;

public class main {
    public static void main(String[] args) {
       Stack stack = new Stack();
       stack.push(40);
        stack.print();
        stack.pop();
        stack.pop();
        System.out.println(stack.size());
    }
}
