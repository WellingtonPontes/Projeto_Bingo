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
            System.out.println(numero);
        }
    }

    public int[][] criarCartela() {
        int[][] numeros_tabela = new int[5][5];
        List<Integer> numeros_usados = new ArrayList<>();

        System.out.println("fazendo cartelas");

        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                int numero;
                do {
                    numero = gerador.nextInt(76);
                } while (numeros_usados.contains(numero));
                numeros_tabela[l][c] = numero;
                numeros_usados.add(numero);
            }
        }
        return numeros_tabela;
    }

    public void mostrarTabela(int[][] criarCartela) {

        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("Linha " + l + " [" + criarCartela[l][c] + "] | ");
            }

            System.out.println();
        }

    }

    public void validarVencedor() {
        int[][] cartela = criarCartela();

        for (int l = 0; l < 5; l++) {
            if (linhaCompleta(cartela, l)) {
                System.out.println("parabens voce venceu por uma linha completa");
            }
        }
        for (int c = 0; c < 5; c++) {
            if (colunaCompleta(cartela, c)) {
                System.out.println("parabens voce venceu por uma coluna completa");
            }
        }
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
