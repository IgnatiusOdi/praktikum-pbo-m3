package Tugas;

import java.util.*;

public class User {
    private String name;
    private String username;
    private String password;
    private ArrayList<Post> post = new ArrayList<>();
    private ArrayList<String> follower = new ArrayList<>();
    private ArrayList<String> following = new ArrayList<>();
    private ArrayList<String> notification = new ArrayList<>();
    private int notificationcounter;

    public User(String name, String username, String password) {
        this.name = name;
        this.username = username;
        this.password = password;
        this.notificationcounter = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void seeFollowing() {
        for (String f : following) {
            System.out.println((following.indexOf(f)+1)+". "+f);
        }
    }

    public int followingSize() {
        return following.size();
    }

    public void setFollowing(String following) {
        boolean ada = false;
        for (String s : this.following) {
            if (s.equals(following)) {
                ada = true;
                break;
            }
        }
        if (!ada) {
            this.following.add(following);
            System.out.println("You have successfully followed "+following);
        } else {
            System.out.println("User has been followed");
        }
    }

    public void seeFollower() {
        for (String f : follower) {
            System.out.println((follower.indexOf(f)+1)+". "+f);
        }
    }

    public int followerSize() {
        return follower.size();
    }

    public void setFollower(String followername, String followerusername) {
        boolean ada = false;
        for (String s : this.follower) {
            if (s.equals(followerusername)) {
                ada = true;
                break;
            }
        }
        if (!ada) {
            this.follower.add(followerusername);
            notification.add(followername+" ("+followerusername+") has followed you");
            notificationcounter++;
        }
    }

    public void sendMessage(String pengirimname, String pengirimusername, String message) {
        notification.add(pengirimname+" ("+pengirimusername+") just sent you a message \""+message+"\"");
        notificationcounter++;
    }

    public void seeNotification() {
        notificationcounter = 0;
        for (String n : notification) {
            System.out.println((notification.indexOf(n)+1)+". "+n);
        }
    }

    public int notificationCounter() {
        return notificationcounter;
    }

    public void addPost(String title, String caption) {
        post.add(new Post(title,caption,this.username));
        System.out.println("Post has been added");
    }

    public int postSize() {
        return post.size();
    }

    public void listPost(String penglihat) {
        System.out.println("-------Instogram Post-------");
        System.out.println("Username: "+this.username);
        System.out.println("-----------Posts------------");
        for (Post p : post) {
            p.listPost(penglihat);
        }
    }

    public void likeListpost(String username) {
        listPost(username);
        for (Post p : post) {
            System.out.println((post.indexOf(p)+1)+". "+p.getTitle());
        }
    }

    public void likedPost(int index, String likerfullname, String liker) {
        if (post.get(index).checkLiker(liker)) {
            post.get(index).removeLiker(liker);
            System.out.println("\""+getTitlepost(index)+"\" has been unliked");
        } else {
            post.get(index).addLiker(liker);
            System.out.println("\""+getTitlepost(index)+"\" has been liked");
            notification.add(likerfullname+" ("+liker+") has liked your post \""+getTitlepost(index)+"\"");
            notificationcounter++;
        }
    }

    public String getTitlepost(int index) {
        return post.get(index).getTitle();
    }

    public void listAllpost(String username) {
        for (Post p : post) {
            p.listAllpost(username);
        }
    }

    public void listAlluser() {
        System.out.println("Username: "+this.username);
        System.out.println("Followers: "+followerSize()+" followers");
        System.out.println("Following: "+followingSize()+" following");
        System.out.println("-----------------------------");
    }

}
