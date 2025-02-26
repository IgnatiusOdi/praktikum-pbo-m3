package Tugas;

import java.util.*;

public class Post {
    private String title;
    private String caption;
    private String postedby;
    private ArrayList<String> likes = new ArrayList<>();
    static int jumlah;

    public Post(String title, String caption, String poster) {
        this.title = title;
        this.caption = caption;
        this.postedby = poster;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCaption() {
        return caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public String getPostedby() {
        return postedby;
    }

    public void setPostedby(String postedby) {
        this.postedby = postedby;
    }

    public static int getJumlah() {
        return jumlah;
    }

    public static void setJumlah(int jumlah) {
        Post.jumlah = jumlah;
    }

    public void listPost(String username) {
        System.out.println("Title: "+this.title);
        System.out.println("Caption: "+this.caption);
        boolean ada = false;
        for (String l : likes) {
            if (l.equals(username)) {
                ada = true;
                break;
            }
        }
        if (!ada) {
            System.out.println("Likes: "+this.likes.size()+" Likes");
        } else {
            System.out.println("Likes: "+this.likes.size()+" Likes (Liked)");
        }
        System.out.println("----------------------------");
    }

    public void listAllpost(String username) {
        System.out.println("Title: "+this.title);
        System.out.println("Caption: "+this.caption);
        boolean ada = false;
        for (String l : likes) {
            if (l.equals(username)) {
                ada = true;
                break;
            }
        }
        if (!ada) {
            System.out.println("Likes: "+this.likes.size()+" Likes");
        } else {
            System.out.println("Likes: "+this.likes.size()+" Likes (Liked)");
        }
        System.out.println("Posted by: "+this.postedby);
        System.out.println("----------------------------");
    }

    public void addLiker(String liker) {
        likes.add(liker);
    }

    public void removeLiker(String liker) {
        likes.remove(liker);
    }

    public boolean checkLiker(String liker){
        for (String l : likes) {
            if (l.equals(liker)) {
                return true;
            }
        }
        return false;
    }
}
