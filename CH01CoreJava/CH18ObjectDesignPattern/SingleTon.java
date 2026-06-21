package CH18ObjectDesignPattern;

class DatabaseConnection {

    private static DatabaseConnection instance;

    private DatabaseConnection() {
        // private constructor
        // bahar se new nahi kar sakte
    }

    public static DatabaseConnection getInstance() {
        if (instance == null) {
            instance = new DatabaseConnection();
        }
        return instance; // same object har baar
    }
}

public class SingleTon {
    public static void main(String[] args) {
        // Usage:
        DatabaseConnection db1 = DatabaseConnection.getInstance();
        DatabaseConnection db2 = DatabaseConnection.getInstance();
        // db1 == db2  → TRUE (same reference)
        System.out.println(db1.hashCode());
        System.out.println(db2.hashCode());
    }
}
