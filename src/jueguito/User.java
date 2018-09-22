
package jueguito;

/**
 *
 * @author Angel
 */
public class User {
    
    private String user, password;

    public User() {
    }

    public String getUser() {
        return user;
    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }
    
    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return user;
    }
    
}
