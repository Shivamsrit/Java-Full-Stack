package CH01CoreJava.CH15GenericClasses;

/*
 * Understanding Enums in Java
 */
/*
    * Every enums Contains .class file
 */

/*
 * Enums (Enumerations) are a special data type that represents a fixed set of constants.
 * They are type-safe and provide better readability compared to using constant integers.
 * Enums are implicitly final and extend java.lang.Enum class.
 *
 * Benefits:
 * - Type safety: Cannot assign invalid values
 * - Namespace: Constants are grouped together
 * - Readability: More meaningful than magic numbers
 * - Switch support: Can be used in switch statements
 * - Built-in methods: values(), valueOf(), ordinal(), name()
 */
// 1. Basic Enum
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;     // By defult Static, Final
    // SUNDAY --> public static final Day Sunday = new Day();

    Day(){
        System.out.println("Constructor is called");
    }
}

public class CH02Enum {
    public static void main(String[] args) {
        Day ob1 = Day.SUNDAY;
        System.out.println(ob1);
    }
}


/*
 * Key Points:
 * 1. Enums are type-safe constants that extend java.lang.Enum
 * 2. Cannot be instantiated using new keyword
 * 3. Can have constructors, methods, and fields
 * 4. Can implement interfaces but cannot extend classes
 * 5. Each enum constant is a singleton instance
 * 6. Comparison using == is safe and efficient
 * 7. Built-in methods: values(), valueOf(), ordinal(), name(), compareTo()
 * 8. Can be used in switch statements
 * 9. Can have abstract methods that constants must implement
 * 10. Ordinal values start from 0 and follow declaration order
 *
 * Best Practices:
 * - Use enums instead of constants for fixed sets of values
 * - Add methods to enums to encapsulate behavior
 * - Use enum constructor for associated data
 * - Consider using EnumSet and EnumMap for collections
 */
