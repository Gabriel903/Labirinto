
package labirinto;


public class Robo {
    
    public Tabuleiro tabuleiro;
 
    public Robo(Tabuleiro tabuleiro) {
         
        this.tabuleiro = tabuleiro;
    }
    
    public void iniciaRobo() {
        
       tabuleiro.tabuleiro[0][0] = -1;
    }
    
}
