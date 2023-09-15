
public class App {
    public static void main(String[] args) throws Exception {
     Sistema teste = new Sistema();


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
    teste.sortearNumeros();
    teste.sortearNumeros();
    teste.sortearNumeros();
    teste.sortearNumeros();
    teste.sortearNumeros();
    teste.mostrarNumerosSortiados(); 
    int [][] cartela = teste.criarCartela();
    teste.mostrarTabela(cartela);
    boolean status = teste.validarVencedor(cartela);

    if(status){
        System.out.println("parabens voce ganhou");
    }else{
        System.out.println("ainda não foi dessa vez");
    }


    }
}
