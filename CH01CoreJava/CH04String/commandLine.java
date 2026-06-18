
public class commandLine {
    public static void main(String[] args) {
        String user = "admin";
        String pass = "Root@123";
        if (args.length == 2 && args[0].equals(user) && args[1].equals(pass)) {
            System.out.println("login successfull");
        } else {
            System.out.println("invalid input ! program band");
        }
    }
}
