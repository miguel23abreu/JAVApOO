package javapoo;

public class Empresa {
    public String nome;
    protected String cnpj;
    public String dono;
    protected int Qfuncionario;
    public float valor;
    public String segmento;
    public boolean aberto;
    public void abrir(){
        if(aberto == false){
            System.out.println("Abrindo...");
            this.aberto = true;
        }
        else{
            System.out.println("A loja ja esta aberta");
        }
    }
    public void status(){
        System.out.println("Empresa: " + this.nome);
        System.out.println("CNPJ: " + this.cnpj);
        System.out.println("Dono(a): " + this.dono);
        System.out.println("Quantidade de funcionarios: " + this.Qfuncionario);
        System.out.println("Valor da Empresa: " + this.valor);
        System.out.println("Esta aberto agora? " + this.aberto);
    }
    public void fechar(){
        if(aberto == true){
            System.out.println("fechando...");
            this.aberto = false;
        }
        else{
            System.out.println("ja esta fechado");
        }
    }
}
