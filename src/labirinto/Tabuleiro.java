/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labirinto;

import java.util.Random;
import java.util.Scanner;

public class Tabuleiro {

    int tabuleiro[][] = new int[15][15];
    int obstaculos[][] = new int[3][1];
    

    public static void inicializaTabuleiro(int[][] tabuleiro) {
        for (int linha = 0; linha < 15; linha++) {
            for (int coluna = 0; coluna < 15; coluna++) {
                tabuleiro[linha][coluna] = -1;
            }
        }
    }
 
    public void inicializaObstaculos(int[][] tabuleiro, int obstaculos[][]) {
                // lembrando que ele anda -1 sembres
       tabuleiro[1][3] = 1;
       tabuleiro[2][3] = 1;
       tabuleiro[3][3] = 1;
       
       tabuleiro[6][8] = 1;
       tabuleiro[7][8] = 1;
       tabuleiro[8][8] = 1;
       
       tabuleiro[2][13] = 1;
       tabuleiro[3][13] = 1;
       tabuleiro[4][13] = 1;
       
       tabuleiro[11][14] = 1;
       tabuleiro[12][14] = 1;
       tabuleiro[13][14] = 1;
       
       tabuleiro[5][10] = 1;
       tabuleiro[6][10] = 1;
       tabuleiro[7][10] = 1;
 
       tabuleiro[1][12] = 1;
       tabuleiro[2][12] = 1;
       tabuleiro[3][12] = 1;
       
       tabuleiro[6][6] = 1;
       tabuleiro[7][6] = 1;
       tabuleiro[8][6] = 1;
 
 
    }
    
    public void mostraTabuleiro(int[][] tabuleiro) {
        System.out.println("\t1 \t2 \t3 \t4 \t5\t6 \t7 \t8 \t9 \t10\t11 \t12 \t13 \t14 \t15");
        System.out.println();
        try { 
            for (int linha = 0; linha < tabuleiro.length; linha++) {
                System.out.print((linha + 1) + "");
                for (int coluna = 0; coluna < tabuleiro[linha].length; coluna++) {
                    if (tabuleiro[linha][coluna] == -1) {
                        System.out.print("\t" + "~");
                    } else if (tabuleiro[linha][coluna] == 0) {
                        System.out.print("\t" + "*");
                    } else if (tabuleiro[linha][coluna] == 1) {
                        System.out.print("\t" + "X");
                    }
                }
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }   
    }
    
    public void Obstaculos() { 
        for(int obstaculo = 0; obstaculo < 7; obstaculo++) {
           obstaculo = obstaculos[3][1];
           
        }
    }

}

  /*   Random sorteio = new Random();
        
            for(int barreira = 0; barreira < 7; barreira++) {
                obstaculo[barreira][0] = sorteio.nextInt(5);
                obstaculo[barreira][1] = sorteio.nextInt(5);
            
            for(int anterior=0 ; anterior < barreira ; anterior++) {
                if((obstaculo[barreira][0] == obstaculo[anterior][0]) && (obstaculo[barreira][1] == obstaculo[anterior][1])) {
                    do {
                         obstaculo[barreira][0] = sorteio.nextInt(5);
                          obstaculo[barreira][1] = sorteio.nextInt(5);
                    } while((obstaculo[barreira][0] == obstaculo[anterior][0]) && (obstaculo[barreira][1] == obstaculo[anterior][1]));            
                }    
            }
        }
    } */

/*     public void Obstaculos(int[][] tabuleiro) {
         Scanner scanf = new Scanner(System.in);

         for(int obstaculo = 0; obstaculo < 7; obstaculo++) {
             for(int linha = 0; linha < 3; linha++){
                   System.out.println("Escolha a posição da sua linha : ");
                     int tamanhoLinha = scanf.nextInt();
             }
             for(int coluna = 0; coluna < 3; coluna++){
                  System.out.println("Escolha a posição da sua coluna : ");
                     int tamanhoColuna = scanf.nextInt();
             } 
        }       
    }
*/