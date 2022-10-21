package javapoo;

/**
 *
 * @author miguel abreu
 */
public class Caneta {
    //atributos
    private boolean tampada;
    private String marca;
    private String cor;
    private float ponta; //pelo fato do atributo ser privado, não é possivel alterar o valor diretamente, somente através de uma função dentro da própria classe que seja public ou protected
    private int carga;

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public Caneta(String marca, float ponta, int carga) {
        this.marca = marca;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
    }
    
    
}
