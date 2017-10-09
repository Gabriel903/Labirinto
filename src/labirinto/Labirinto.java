package labirinto;

public class Labirinto {

    public static void main(String[] args) {  
        
        int[][] tabuleiro = new int[15][15];
        int[][] obstaculos = new int[3][1];
       
        Tabuleiro iniciaTabuleiro = new Tabuleiro();       
        
        iniciaTabuleiro.inicializaObstaculos(tabuleiro, obstaculos);
        
        iniciaTabuleiro.mostraTabuleiro(tabuleiro);
        
         
         
        System.out.println();
        
        }
}
