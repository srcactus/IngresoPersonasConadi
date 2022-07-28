/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author Cactus
 */
public class User {
    
    private int idUser;
    private String user;
    private String pass;

    public User() {
    }

    public User(int idUser, String user, String pass) {
        this.setIdUser(idUser);
        this.setUser(user);
        this.setPass(pass);
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String toString() {
        return "User{" + "idUser=" + idUser + ", user=" + user + ", pass=" + pass + '}';
    }
    
    
    
}
