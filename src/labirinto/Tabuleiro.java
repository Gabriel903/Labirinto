/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labirinto;

public class Tabuleiro {

    int tabuleiro[][] = new int[15][15];

    public static void inicializaTabuleiro(int[][] tabuleiro) {
        for (int linha = 0; linha < 15; linha++) {
            for (int coluna = 0; coluna < 15; coluna++) {
                tabuleiro[linha][coluna] = -1;
            }
        }
    }

    public void mostraTabuleiro(int[][] tabuleiro) {
        System.out.println("\t1 \t2 \t3 \t4 \t5\t6 \t7 \t8 \t9 \t10\t11 \t22 \t13 \t14 \t15");
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

}
