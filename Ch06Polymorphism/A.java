package Ch01Polymorphism;

public class A extends B{
    String s1 = "hello boss";

    @Override // Annotation provides extra information about the class , methood , variable etc
    public void get(){
        System.out.println("A Class");
    }
}

