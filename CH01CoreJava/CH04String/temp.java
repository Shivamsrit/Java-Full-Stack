package CH01CoreJava.CH04String;
class temp {
    static int value = 0;
    int temp=0;

    public static void main(String[] args){
        temp obj1 = new temp();
        temp obj2 = new temp();

        obj1.print();
        obj2.print();
        obj1.show();
        obj2.show();
    }

    static void print(){
        value++;
        System.out.println("static variable: "+value);

    }
    void show(){
        temp++;
        System.out.println("non-static variable: "+temp);

    }

}
