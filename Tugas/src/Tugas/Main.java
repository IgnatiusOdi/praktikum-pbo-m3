package Tugas;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Scanner scanint = new Scanner(System.in);
        Display display = new Display();
        ArrayList<User> user = new ArrayList<>();

        do {
            // START MENU
            display.startMenu();
            int input = scanint.nextInt();

            if (input == 1) {
                // LOGIN
                System.out.println("-------Instogram-------");
                System.out.print("Username: ");
                String username = scan.nextLine();
                System.out.print("Password: ");
                String password = scan.nextLine();

                //CHECK
                boolean userada = false;
                boolean passcheck = false;
                boolean login = false;
                int idx = 0;
                for (User u : user) {
                    if (u.getUsername().equals(username)) {
                        userada = true;
                        if (u.getPassword().equals(password)) {
                            passcheck = true;
                        }
                        idx = user.indexOf(u);
                        break;
                    }
                }
                if (userada && passcheck) {
                    login = true;
                    System.out.println("User berhasil login!");
                } else if (!userada) {
                    System.out.println("User tidak terdaftar");
                } else {
                    System.out.println("Password Salah");
                }
                while (login) {
                    // MAIN MENU
                    System.out.println("-------Instogram Menu-------");
                    System.out.println("Hi! "+user.get(idx).getName());
                    display.mainMenu();
                    System.out.print(
                            "1. Create a Post\n" +
                                    "2. Search User\n" +
                                    "3. Send a Message\n" +
                                    "4. Follower List\n" +
                                    "5. Following List\n" +
                                    "6. List all Post\n" +
                                    "7. List all User\n" +
                                    "8. Notification ("+user.get(idx).notificationCounter()+")\n" +
                                    "9. Logout\n" +
                                    ">> "
                    );
                    int menu = scanint.nextInt();

                    if (menu == 1) {
                        // CREATE A POST
                        System.out.println("-------Instogram Post-------");
                        System.out.print("Input Title: ");
                        String title = scan.nextLine();
                        System.out.print("Input Caption: ");
                        String caption = scan.nextLine();
                        user.get(idx).addPost(title,caption);
                    } else if (menu == 2) {
                        // SEARCH
                        System.out.println("-------Instogram Search-------");
                        boolean ada = false;
                        int idxsearch = 0;
                        System.out.print("Input a Username : ");
                        String usernameinput = scan.nextLine();
                        for (User u : user) {
                            if (u.getUsername().equals(usernameinput) && !(user.indexOf(u) == idx)) {
                                ada = true;
                                idxsearch = user.indexOf(u);
                                break;
                            }
                        }
                        if (!ada){
                            System.out.println("User not found!");
                        } else {
                            System.out.println("User Found!");
                        }

                        while (ada) {
                            // SEARCHED USER
                            System.out.println("-------Instogram Profile-------");
                            System.out.println("Name: "+user.get(idxsearch).getName());
                            System.out.println("Username: "+user.get(idxsearch).getUsername());
                            System.out.println("Followers: "+user.get(idxsearch).followerSize());
                            System.out.println("Following: "+user.get(idxsearch).followingSize());
                            System.out.println("-------------------------------");
                            System.out.println("Menu Profile");
                            System.out.println("1. Follow User");
                            System.out.println("2. List Post");
                            System.out.println("3. Like a Post");
                            System.out.println("4. Back to Main Menu");
                            System.out.print(">> ");
                            int menu2 = scanint.nextInt();

                            String penglihat = user.get(idx).getUsername();
                            if (menu2 == 1) {
                                // FOLLOW USER
                                user.get(idx).setFollowing(user.get(idxsearch).getUsername());
                                user.get(idxsearch).setFollower(user.get(idx).getName(), user.get(idx).getUsername());
                            } else if (menu2 == 2) {
                                // LIST POST
                                for (int i = 0; i < user.get(idxsearch).postSize(); i++) {
                                    user.get(idxsearch).listPost(penglihat);
                                }
                            } else if (menu2 == 3) {
                                for (int i = 0; i < user.get(idxsearch).postSize(); i++) {
                                    user.get(idxsearch).likeListpost(penglihat);
                                }
                                System.out.println("0. Back to Main Menu");
                                System.out.print(">> ");
                                int pilih = scanint.nextInt();

                                if (pilih == 0) {
                                    // BACK TO MAIN MENU
                                    break;
                                } else if (pilih <= user.get(idxsearch).postSize()){
                                    // LIKE POST
                                    pilih--;
                                    System.out.println("Are you sure you want to like \""+user.get(idxsearch).getTitlepost(pilih)+"\" (y/n)?");
                                    System.out.print(">> ");
                                    String pilihstring = scan.nextLine();
                                    if (pilihstring.equals("y")) {
                                        String likerfullname = user.get(idx).getName();
                                        String liker = user.get(idx).getUsername();
                                        user.get(idxsearch).likedPost(pilih,likerfullname,liker);
                                    }
                                }
                            } else if (menu2 == 4) {
                                ada = false;
                            }
                        }
                    } else if (menu == 3) {
                        // SEND A MESSAGE
                        System.out.println("-------Instogram Message-------");
                        boolean ada = false;
                        int idxkirim = 0;
                        System.out.print("Input a Username : ");
                        String usernameinput = scan.nextLine();
                        for (User u : user) {
                            if (u.getUsername().equals(usernameinput) && !(user.indexOf(u) == idx)) {
                                ada = true;
                                idxkirim = user.indexOf(u);
                                break;
                            }
                        }
                        if (!ada){
                            System.out.println("User not found!");
                        } else {
                            System.out.println("User Found!");
                            System.out.print("Message: ");
                            String message = scan.nextLine();
                            System.out.println("Send Message(y/n)");
                            System.out.print(">> ");
                            String sendmessage = scan.nextLine();
                            if (sendmessage.equals("y")) {
                                String pengirimname = user.get(idx).getName();
                                String pengirimusername = user.get(idx).getUsername();
                                user.get(idxkirim).sendMessage(pengirimname, pengirimusername, message);
                                System.out.println("Message sent!");
                            } else {
                                System.out.println("Message not sent!");
                            }
                        }
                    } else if (menu == 4) {
                        // FOLLOWER LIST
                        System.out.println("-------Instogram Follower-------");
                        user.get(idx).seeFollower();
                    } else if (menu == 5) {
                        // FOLLOWING LIST
                        System.out.println("-------Instogram Following-------");
                        user.get(idx).seeFollowing();
                    } else if (menu == 6) {
                        // LIST ALL POST
                        System.out.println("-------Instogram Posts-------");
                        for (User u : user) {
                            u.listAllpost(user.get(idx).getUsername());
                        }
                    } else if (menu == 7) {
                        // LIST ALL USER
                        System.out.println("-------Instogram Users-------");
                        for (User u : user) {
                            if (user.indexOf(u) == idx) {
                                System.out.println("Name: " + u.getName() + " (You)");
                            } else {
                                System.out.println("Name: " + u.getName());
                            }
                            u.listAlluser();
                        }
                    } else if (menu == 8) {
                        // NOTIFICATION
                        System.out.println("-------Instogram Notification-------");
                        user.get(idx).seeNotification();
                    } else if (menu == 9) {
                        login = false;
                    }
                }
            } else if (input == 2) {
                // REGISTER
                System.out.println("-------Instogram-------");
                System.out.print("Name: ");
                String name = scan.nextLine();
                System.out.print("Username: ");
                String username = scan.nextLine();
                System.out.print("Password: ");
                String password = scan.nextLine();
                System.out.print("Confirm Password: ");
                String confirm = scan.nextLine();

                // CHECK
                boolean useralready = false;
                boolean falseconfirm = false;
                for (User u : user) {
                    if (u.getUsername().equals(username)) {
                        useralready = true;
                        break;
                    }
                }
                if (!password.equals(confirm)) {
                    falseconfirm = true;
                }

                if (!useralready && !falseconfirm){
                    user.add(new User(name,username,password));
                    System.out.println("User berhasil didaftarkan!");
                } else {
                    if (useralready) {
                        System.out.println("Username is already used!");
                    }
                    if (falseconfirm) {
                        System.out.println("Password dan confirm password tidak sesuai");
                    }
                }
            } else if (input == 3) {
                // EXIT
                break;
            }
        } while (true);
    }
}
