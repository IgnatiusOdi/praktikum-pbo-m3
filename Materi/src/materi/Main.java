package materi;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanint = new Scanner(System.in);
        ArrayList<User> user = new ArrayList<>();
        ArrayList<Post> post = new ArrayList<>();

        do{
            System.out.println("'''Welcome to StuckOverflow! '''");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print(">>> ");
            int input = scanint.nextInt();
            if (input == 1) {
                System.out.println("== Register ==");
                System.out.print("Full name : ");
                String fullname = scan.nextLine();
                System.out.print("Username : ");
                String username = scan.nextLine();
                System.out.print("Password : ");
                String password = scan.nextLine();

                boolean ada = false;
                for (int i = 0; i < user.size(); i++) {
                    if (username.equals(user.get(i).getUsername())){
                        ada = true;
                        break;
                    }
                }
                if (ada) {
                    System.out.println("Username sudah digunakan");
                } else {
                    user.add(new User(fullname,username,password));
                    System.out.println("Account created!");
                }
            } else if (input == 2) {
                System.out.println("== Login ==");
                System.out.print("Username : ");
                String username = scan.nextLine();
                System.out.print("Password : ");
                String password = scan.nextLine();

                boolean ada = false;
                boolean login = false;
                int idx = 0;
                for (int i = 0; i < user.size(); i++) {
                    if (username.equals(user.get(i).getUsername())){
                        ada = true;
                        idx = i;
                        break;
                    }
                }
                if (ada) {
                    if (password.equals(user.get(idx).getPassword())) {
                        login = true;
                    } else {
                        System.out.println("Password salah");
                    }
                } else {
                    System.out.println("Username tidak terdaftar");
                }

                while (login) {
                    System.out.println("Welcome back, "+user.get(idx).getFullname());
                    System.out.println("1. Create a post");
                    System.out.println("2. See all post");
                    System.out.println("3. Logout");
                    System.out.print(">>> ");
                    int menu = scanint.nextInt();
                    if (menu == 1) {
                        System.out.print("Title : ");
                        String title = scan.next();
                        System.out.print("Detail : ");
                        String detail = scan.next();
                        user.get(idx).createPost(title,detail);
                    } else if (menu == 2) {
                        do{
                            System.out.println("--- All Posts ---");
                            int ctr = 1;
                            for (int i = 0; i < user.size(); i++) {
                                for (int j = 0; j < user.get(i).getJumlahpost(); j++) {
                                    System.out.print(ctr+". ");
                                    ctr++;
                                    user.get(i).seeAllPost(j);
                                }
                            }
                            System.out.println("0. Back");
                            int menu2 = scanint.nextInt();
                            if (menu2 == 0){
                                break;
                            } else {
                                int indexuser = menu2 - 1;
                                int indexpost = 0;
                                for (int i = 0; i < user.size(); i++) {
                                    for (int j = 0; j < user.get(i).getJumlahpost(); j++) {
                                        if (indexuser > user.get(i).getJumlahpost()){
                                            indexuser -= user.get(i).getJumlahpost();
                                        } else {
                                            indexuser = i;
                                        }
                                    }
                                }
                            }
                        }while(true);
                    } else if (menu == 3) {
                        break;
                    }
                }
            } else if (input == 3) {
                break;
            }
        }while(true);
    }
}
