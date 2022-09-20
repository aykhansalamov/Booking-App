import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SignIn {

//    public static Map<Integer, String> getUsersFromDB() throws IOException {
//        Map<Integer, String> usersFromDB = new HashMap<>();
//        String fileName = "users.txt";
//        File file = new File(fileName);
//        ArrayList<String> fl = new ArrayList<>();
//
//        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
//            String line;
//            String str;
//
//            while ((line = br.readLine()) != null) {
//                str = line.substring(1);
//                fl.add(str);
//            }
//
//            fl.remove(31);
//            String st = fl.get(0).substring(2);
//
//            flightsFromDB.put(1, st);
//            for (int i = 1; i < 9; i++) {
//                String s = fl.get(i).substring(3);
//
//                flightsFromDB.put(i + 1, s);
//            }
//            for (int i = 9; i < fl.toArray().length; i++) {
//                String s1 = fl.get(i).substring(4);
//
//                flightsFromDB.put(i + 1, s1);
//            }
//        }
//        return flightsFromDB;
//    }

    public static void sign() throws IOException {
        SignUp lgn = new SignUp();
        Start str = new Start();

        Map<String, String> loginData = lgn.loginMap; // Map of all logins and passwords in database
        Map<String, String> enteredData = new HashMap<>(); //// Map of entered login and password for sign in

        System.out.println("For continue with your account, please, sign in!");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter login: ");
        String enteredLogin = sc.nextLine();
        System.out.print("Enter password: ");
        String enteredPassword = sc.nextLine();

        enteredData.put(enteredLogin, enteredPassword); // Adding entered sign in data to its map

        if (loginData.containsKey(enteredLogin) && loginData.containsValue(enteredPassword)) { // Ckecking login and password
            str.main();
        } else {
            System.out.println("Login or password didn't match! Please try again!");
            sign();
        }
    }
}
