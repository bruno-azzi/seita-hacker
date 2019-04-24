
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author bruno.azzi
 */
public class Post {
    
    String userName;
    String date;
    String title;
    String content;

    public Post(String userName, String date, String title, String content) {
        this.userName = userName;
        this.date = date;
        this.title = title;
        this.content = content;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return content;
    }

    public void setText(String content) {
        this.content = content;
    }
    
    @Override
    public String toString() {
        return "\n{ userName: " + userName + ", date: " + date + ", title: " + title + ", content: " + content + "}";
    }
    
    public ArrayList<Post> getPosts() {
        ArrayList<Post> postList = new ArrayList<>();
        postList.add(new Post("Bruno", "28/10/1999", "Ola esse é o titulo do post", "ola esse é o conteudo do post"));
        postList.add(new Post("Lessa", "11/10/1999", "Oladasdas daso do post", "ola dasd eudo do post"));
        postList.add(new Post("Azzi", "04/10/1999", "Ultimo titulo", "ultimo content"));
        
        System.out.println("postList: " + postList.toString());
        return postList;
    }
    
    public void createPost(Post newPost) {
        System.out.println("newPost dentro do post: " + newPost.toString());
        this.updatePostList(newPost);
    }
    
    public void updatePostList(Post newPost) {
        System.out.println("updatePostList: " + this.getPosts());
    }
    
}
