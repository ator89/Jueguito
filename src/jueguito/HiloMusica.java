
package jueguito;

import org.jfugue.player.Player;

/**
 *
 * @author Angel Torres
 */
public class HiloMusica implements Runnable{

    boolean activar = true;
    
    @Override
    public void run() {
        
        try{
            while(activar){
                Player player = new Player();
                player.play("V0 I[Piano] Eq Ch. | Eq Ch. | Dq Eq Dq Cq   V1 I[Flute] Rw | Rw | GmajQQQ CmajQ");
                System.out.println("Funciono!!");
            }
            
        }catch(IllegalThreadStateException e){
            
        }
    }
    
}
