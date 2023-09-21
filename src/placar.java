public class placar extends Sistema {
    private int placar;

    public int getPlacar() {
        return placar;
    }

    public void setPlacar(int placar) {
        this.placar = placar;
    }

    public void validarPlacar(int[][] cartela) {
        boolean vencendor = validarVencedor(cartela);
        int score = getPlacar();

        if(vencendor){
            score += 100;
            setPlacar(score);
        }else{
            score -= 100;
            setPlacar(score);
        }
    }
}
