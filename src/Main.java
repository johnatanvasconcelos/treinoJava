/* Treinando Funções */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        /* Variável para guardar o maior valor que será indicado pela função que por sua vez leu
        * os três números inseridos pelo usuário e identificou o maior*/
        int higher = max(a,b,c);

        /* Função apenas para mostrar o resultado na tela do maior número inserido*/
        showResult(higher);

        sc.close();
    }

    /* A função abaixo recebe como parâmetro 3 valores. Esses que serão inseridos pelo usuário
    * na tela. A lógica da função compara os valores afim de identificar o maior deles e armazenar em
    * uma variável chamada "aux". A função por sua vez retorna o valor de "aux" */
    public static int max(int x, int y, int z) {
        int aux;
        if (x > y && x > z) {
            aux = x;
        } else if (y > z) {
            aux = y;
        } else {
            aux = z;
        }
        return aux;
    }

    public static void showResult (int value) {
        System.out.println("Higher is: " + value);
    }
}