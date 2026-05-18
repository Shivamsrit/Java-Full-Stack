package CH05Constructor;

public class Constructor {
    int a ;
    String s = "Babuwa";
    static int i;
   public Constructor(){   //  deafault constructor

       System.out.println(s);
    }
    public Constructor(String s) {// parameterized constructor
        s = s;                          // shadowing Problem to resolve using this keyword
        this.s = s;
    }
    public Constructor(Constructor e){      // copy constructor
       this.s = e.s;
    }
    static {// it runs only once when class load in jvm.(Static Block)
        System.out.println("moh maya hai sab");
    }
    {                                        // instance Block
        System.out.println("Boss");
    }
    {
        System.out.println("sanam teri kasam");
    }
}
