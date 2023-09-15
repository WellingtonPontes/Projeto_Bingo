import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class Sistema {

    Random gerador = new Random();

    private List<Integer> numeros_sorteados = new ArrayList<>();

    public void sortearNumeros() {
        int numero;
        do {
            numero = gerador.nextInt(76);
        } while (numeros_sorteados.contains(numero)); // Verifica se o número já foi sorteado
        numeros_sorteados.add(numero);
    }

    public void mostrarNumerosSortiados() {
        for (int numero : numeros_sorteados) {
            System.out.print(numero + " - ");
        }
        System.out.println();
    }

    public boolean validarVencedor(int[][] cartela) {
        // int[][] cartela = criarCartela();

        for (int l = 0; l < 5; l++) {
            if (linhaCompleta(cartela, l)) {
                System.out.println("na linha " + l);
                return true;
            }
        }

        for (int c = 0; c < 5; c++) {
            if (colunaCompleta(cartela, c)) {
                System.out.println("na coluna " + c);
                return true;
            }
        }

        return false;
    }

    private boolean linhaCompleta(int[][] cartela, int linha) {
        for (int c = 0; c < 5; c++) {
            int numeroNaCartela = cartela[linha][c];
            if (!numeros_sorteados.contains(numeroNaCartela)) {
                return false;
            }
        }
        return true;
    }

    private boolean colunaCompleta(int[][] cartela, int coluna) {
        for (int l = 0; l < 5; l++) {
            int numeroNaCartela = cartela[l][coluna];
            if (!numeros_sorteados.contains(numeroNaCartela)) {
                return false;
            }
        }
        return true;
    }

}
