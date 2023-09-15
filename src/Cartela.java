import java.util.ArrayList;
import java.util.List;

public class Cartela extends Sistema {

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

    public void mostrarCartela(int[][] criarCartela) {
        for (int l = 0; l < 5; l++) {
            for (int c = 0; c < 5; c++) {
                System.out.print("Linha " + l + " [" + criarCartela[l][c] + "] | ");
            }

            System.out.println();
        }

    }

}
