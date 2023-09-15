public class Jogador extends Cartela {

    private String name;
    private int[][] cartela;

    public int[][] getCartela() {
        return cartela;
    }

    public void setCartela(int[][] cartela) {
        this.cartela = cartela;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Jogador(String name) {
        this.name = name;
        Cartela cartela = new Cartela();
        setCartela(cartela.criarCartela());
    }

}
