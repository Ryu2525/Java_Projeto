
package model;

/**
 *
 * @author Julian
 */
public class Investidor extends Pessoa{
    private Carteira carteira;

    public Investidor() {
    }

    public Investidor(String nome, String cpf, String senha, Carteira carteira) {
        super(nome, cpf, senha);
        this.carteira = carteira;
    }

    public Carteira getCarteira() {
        return carteira;
    }

    public void setCarteira(Carteira carteira) {
        this.carteira = carteira;
    }

    @Override
    public String toString() {
        return "Investidor{" + "carteira=" + carteira + '}';
    }
}
