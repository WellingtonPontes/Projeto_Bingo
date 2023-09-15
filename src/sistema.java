import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Sistema {
    
    Random gerador = new Random();

    private List<Integer> numeros_sorteados = new ArrayList<>();


    public void sortearNumeros() {   
        int numero;
        do{
            numero = gerador.nextInt(76);
        }while(numeros_sorteados.contains(numero)); // Verifica se o número já foi sorteado
        numeros_sorteados.add(numero);
    }

    public void mostrarNumerosSortiados(){
        for(int numero : numeros_sorteados){
            System.out.println(numero);
        }
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
