import lombok.Data;
import daoPattern.service.FlightService;

import java.io.IOException;
import java.util.Scanner;

@Data
public class Start {
    static FlightService fService = new FlightService();
    static SignIn sn = new SignIn();
    static SignUp su = new SignUp();

public void userInput () throws IOException {
    System.out.println("==BOOKING APP==");
    System.out.println("Choose the number of action below for continue app:");
    System.out.println("1 - SIGN UP");
    System.out.println("2 - SIGN IN");
    System.out.println("3 - CONTINUE AS GUEST");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    if (a == 1) {
        su.signUp();
    } else if (a == 2) {
        sn.sign();
    } else if (a == 3){
        main();
    }
    else {
        System.out.println("Please input correct number!");
        userInput();
    }

}
    public static void main() throws IOException {


        System.out.println("==BOOKING APP==");
        menu();
        select();
    }

    //Showing menu method
    public static void menu() {
        System.out.println("Choose the action from the menu with number");
        System.out.println("1. Online-board. \n" + "2. Show the flight info. \n" + "3. Search and book a flight.\n" + "4. Cancel the booking.\n" + "5. My flights.\n" + "6. Exit.");
    }

    //Choosing action from menu method
    public static void select() throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number to continue:");
        int selectedMenu = input.nextInt();

        switch (selectedMenu) {
            case 1:
             //   fService.printFlightList();
                menu();
                select();
                break;
//            case 2:
//                sn.sign();
//                break;
//            case 3:
//                sn.sign();
//                break;
        }


        //  lg.login();
    }


}
