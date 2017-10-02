package labirinto;

public class Labirinto {

    public static void main(String[] args) {  
        
        int[][] tabuleiro = new int[15][15];
        int[][] obstaculos = new int[1][3];
       
        Tabuleiro iniciaTabuleiro = new Tabuleiro();       
        Obstaculos obstaculo = new Obstaculos();
        
         iniciaTabuleiro.mostraTabuleiro(tabuleiro);
         obstaculo.iniciaObstaculos();
        
        System.out.println();
        
        }
}
