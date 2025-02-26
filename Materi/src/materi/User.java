package materi;

import java.util.*;

public class User {
    private String fullname;
    private String username;
    private String password;
    private ArrayList<Post> post = new ArrayList<>();

    public User(String fullname, String username, String password) {
        this.fullname = fullname;
        this.username = username;
        this.password = password;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
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

    public void createPost(String title, String detail){
        post.add(new Post(title,detail));
        System.out.println("!! Posted Successfully! !!");
    }

    public void seeAllPost(int index){
        System.out.println(post.get(index).getTitle()+" | "+this.fullname+"("+this.username+")");
    }

    public int getJumlahpost(){
        return post.size();
    }

    public String getTitle(int index){
        return post.get(index).getTitle();
    }

    public String getDetail(int index){
        return post.get(index).getDetail();
    }

    public void menuPost(){

    }

}
