package CH01CoreJava.CH15GenericClasses;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;



// Annotation --> Annotation --> parent of all Annotation.
// Annotation --> Built in
//              --> custome Annotation
/*
 * Understanding Annotations in Java
 */

/*
 * Annotations provide metadata about the program that is not part of the program itself.
 * They have no direct effect on the operation of the code they annotate, but can be
 * processed by annotation processors during compilation or at runtime using reflection.
 *
 * Types of Annotations:
 * 1. Built-in Annotations: @Override, @Deprecated, @SuppressWarnings, etc.
 * 2. Meta-Annotations: @Target, @Retention, @Documented, @Inherited
 * 3. Custom Annotations: User-defined annotations
 *
 * Usage:
 * - Documentation and code generation
 * - Compile-time checking
 * - Runtime processing
 * - Framework configuration (Spring, JPA, etc.)
 */


// Annotation --->
// 1. Class
// 2. Interface
// 3. Methods
// 4. Fields/ Instance var
// 5. Local variable
// 6. Constructor
// 7. Parameter
// 8. Enum
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface CricketPlayer
{
    // @ --> its not interface but its Annotation  being created

//    1. Way
//    String Country() default "VK";
//    int run() default 20000;

    String Country();
    int run();


}

//target:- to specify what the notation can be used ex. ( * ElementType.TYPE.CLASS - can be used for class only.)
//Retention Policy:- unit what the annotation should be active ( * if RetentionPolicy class :- it will go till JVM)


@CricketPlayer(Country = "India",run = 1000)
class  virhatKholi{
    private int Innnings;
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getInnnings() {
        return Innnings;
    }

    public void setInnnings(int innnings) {
        Innnings = innnings;
    }
}




public class CH03Annotation {
    public static void main(String[] args) {

    }
}
