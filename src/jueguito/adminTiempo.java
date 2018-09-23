
package jueguito;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author Angel
 */
public class adminTiempo extends Thread{
    
    private JLabel tiempo;
    private boolean avanzar;
    private boolean vive;

    public adminTiempo(JLabel tiempo) {
        this.tiempo = tiempo;
        this.avanzar = true;
        this.vive = true;
    }

    public JLabel getTiempo() {
        return tiempo;
    }

    public void setTiempo(JLabel tiempo) {
        this.tiempo = tiempo;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isVive() {
        return vive;
    }

    public void setVive(boolean vive) {
        this.vive = vive;
    }
    
    @Override
    public void run(){
        while(vive){
            
            Date h = new Date();
            DateFormat f = new SimpleDateFormat("hh:mm:ss") ;
            tiempo.setText(f.format(h));
            
            try{
                
                Thread.sleep(50);
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    
    
    
}
