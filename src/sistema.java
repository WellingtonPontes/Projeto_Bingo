import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.io.*;
import java.lang.*;
import java.util.*;
public class Sistema {
    
    Random gerador = new Random();

    int[] numeros_sortiados;
    
    
    public int[] sortear(){
        int numero = gerador.nextInt(76);
        while(numero == 0){
            numero = gerador.nextInt(76);
        }

        return numeros_sortiados = add(numeros_sortiados, numero);
    }


    private int [][] criarCartela(){
        int [][] numeros_tabela = new int [5][5];
        
        System.out.println("fazendo cartelas");

        for(int l = 0; l < 5; l++){
            for(int c = 0; c < 5; c++){
                numeros_tabela[l][c] = gerador.nextInt(76);
            }
            System.out.println();
        }
        return numeros_tabela;
    }

    public void mostrarTabela(){
            int [][] cartela = criarCartela();
            for(int l = 0; l < 5; l++){
            for(int c = 0; c < 5; c++){
                System.out.print("Linha "+ l + " ["+cartela[l][c]+"] | ");
            }

            System.out.println();
        }

    }
   public void validarVencedor(){
    int [][] cartela = criarCartela();
    for(int l = 0; l < 5; l++){
            for(int c = 0; c < 5; c++){

               
            }
        }     
   }

 


}
