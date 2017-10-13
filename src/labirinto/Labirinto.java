package labirinto;

public class Labirinto {

    public static void main(String[] args) {  
        
        int[][] tabuleiro = new int[15][15];
        int[][] obstaculos = new int[3][1];
       
        Tabuleiro iniciaTabuleiro = new Tabuleiro();   
        
        Robo iniciaRobo = new Robo(iniciaTabuleiro);
        
        iniciaTabuleiro.inicializaObstaculos(tabuleiro, obstaculos);
        
        iniciaRobo.iniciaRobo();
        

        iniciaTabuleiro.mostraTabuleiro(tabuleiro);
       
        System.out.println();
        
        }
}
