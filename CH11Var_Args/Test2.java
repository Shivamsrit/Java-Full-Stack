package CH11Var_Args;
class Student{
    static {
        System.out.println("Static block executed");
    }
    public Student(){
        System.out.println("constructor Called");
    }
}
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException,InstantiationException,IllegalAccessException{
//        Student ob1 = new Student();

        // take the input of the classname of which object has created at the runtime. (possible).
        String className = args[0];

        // load class file  explicitly
        Class c =Class.forName(className);
        //(it will learn more on JDBC )

        // for the load class object is created using zero para constructor only
        Object object = c.newInstance();


        // perform type casting to get Student object
        Student s = (Student) object;


//        Short Hand

        Object ob1 = Class.forName(args[0]).newInstance();
        System.out.println(ob1.getClass().getName());

        /*
        JVM => required class details known to compiler but not available in jvm then it would be result in
                NoClassDefFounderError.
         new instance => required class detail not available at jvm then it would result Class not Found Exception.
         */
    }

}
/* new => new create a memory on the heap area
    Student => Jvm will search for Student.class file current Working Directory
                if found load .class data into method area.
    During the loading of .class file
    1. static variable will get memory sets with default value
    2.Static block gets executed

    In the heap area , for the required object memory for instance variable given
    jvm will set default value to it
    1. Execute instance block if available
    2.Call the constructor to set the meaningful value to the instance variable.

    JVM will give the address of the object using hashing algorithm which generates the hash code
    for the object and that hashcode will be returned as the reference to the programmer.
 */
