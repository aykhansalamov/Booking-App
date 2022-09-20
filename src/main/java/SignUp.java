import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SignUp {
    static SignIn signIn = new SignIn();
    static Map<String, String> loginMap = new HashMap<>();


    public static void saveUser() throws IOException {
        String fileName = "users.txt";
        File file = new File(fileName);
        BufferedWriter writer = new BufferedWriter(new FileWriter(file));
        writer.write(String.valueOf(loginMap));
        writer.close();





    }

    public static void signUp() throws IOException {
        System.out.println("For registration enter your login and password:");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter login: ");
        String logg = sc.nextLine();
        System.out.print("Enter password: ");
        String pass = sc.nextLine();
        System.out.print("Enter password again: ");
        String passAgain = sc.nextLine();

        if (pass.equals(passAgain)) {
            loginMap.put(logg, pass);
            System.out.println("Registration completed! You can sign in now!");
            saveUser();
            signIn.sign();

        } else {
            System.out.println("Passwords didn't match. Please try again.");
            signUp();
        }


    }


}
