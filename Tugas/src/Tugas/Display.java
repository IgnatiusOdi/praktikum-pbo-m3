package Tugas;

public class Display {

    public void startMenu() {
        System.out.println("-------Instogram-------");
        System.out.println("1. Login");
        System.out.println("2. Register");
        System.out.println("3. Exit");
        System.out.print(">>> ");
    }

    public void mainMenu() {
        System.out.println(
                """
                /--------------------\\
                |                    |
                |                    |
                |                    |
                |     Welcome to     |
                |      Instogram     |
                |                    |
                |                    |
                |     Powered by     |
                |       ISTTS        |
                |____________________|
                \\__________o_________/
                """
        );
    }
}
