
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
public class User {

    String id;
    String password;
    
    public User(String id, String password) {
        this.id = id;
        this.password = password;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "\n{ id: " + id + ", password: " + password + "}";
    }
    
    public boolean validateLogin(User login) {
        ArrayList<User> accounts = this.getAccounts();
        System.out.println("accounts: " + accounts);
        System.out.println("login: " + login);
        boolean foundAccount = false;
        
        for (int i = 0; i < accounts.size(); i++) {
            if (accounts.get(i).id.equals(login.id)) {
                System.out.println("id iguais: " + accounts.get(i).id + " = " + login.id);
                
                if (accounts.get(i).password.equals(login.password)) {
                    System.out.println("password iguais: " + accounts.get(i).password + " = " + login.password);
                    foundAccount = true;
                    
                } else {
                    System.out.println("password diferentes: " + accounts.get(i).password + " != " + login.password);
                }
                
            } else {
                System.out.println("id diferentes: " + accounts.get(i).id + " != " + login.id);
                foundAccount = false;
            }
        }
        
        System.out.println(foundAccount);
        return foundAccount;
    }
    
    public ArrayList<User> getAccounts() {
        ArrayList<User> accountsList = new ArrayList<>();
        accountsList.add(new User("teste", "123"));
        accountsList.add(new User("brunoazzi", "12345"));
//        System.out.println("getAccounts: " + accountsList.toString());
        
        return accountsList;
    }

}
