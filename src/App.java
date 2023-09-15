
public class App {
    public static void main(String[] args) throws Exception {
        Sistema teste = new Sistema();
        Jogador novo = new Jogador("teste");

        novo.mostrarCartela(novo.getCartela());

        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.mostrarNumerosSortiados();

        boolean status = teste.validarVencedor(novo.getCartela());

        if (status) {
            System.out.println("parabens voce ganhou");
        } else {
            System.out.println("ainda não foi dessa vez");
        }

        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.mostrarNumerosSortiados();

        teste.mostrarNumerosSortiados();

        status = teste.validarVencedor(novo.getCartela());

        if (status) {
            System.out.println("parabens voce ganhou");
        } else {
            System.out.println("ainda não foi dessa vez");
        }

        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();
        teste.sortearNumeros();

        teste.mostrarNumerosSortiados();

        status = teste.validarVencedor(novo.getCartela());

        if (status) {
            System.out.println("parabens voce ganhou");
        } else {
            System.out.println("ainda não foi dessa vez");
        }

    }
}
