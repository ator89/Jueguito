
package jueguito;

import java.util.ArrayList;

/**
 *
 * @author Angel Torres
 */
public class adminUser {
    
    private ArrayList<User> listaUsuarios = new ArrayList();
    
    public String getListUsuarios(){
        String s = "";
        for (User u : listaUsuarios) {
            s+=u.getUser()+"\n";
        }
        return s;
    }
    
    public void agregarUsuario(User u){
        this.listaUsuarios.add(u);
    }
    
    public int existeUsuario(String u){
        for (User usuario : listaUsuarios) {
            if(usuario.getUser().equals(u)){
                return 1;
            }
        }
        return 0;
    }
    
    public int validar(String user, String pass){
        for (User usuario : listaUsuarios) {
            if(usuario.getUser().equals(user) && usuario.getPassword().equals(pass)){
                return 1;
            }
        }
        return 0;
    }
    
    public int posicionUsuario(String n){
        int p = listaUsuarios.size();
        for (int i = 0; i < p; i++) {
            if(listaUsuarios.get(i).getUser().equals(n)){
                return i;
            }
        }
        return 0;
    }
    
    
    
}
