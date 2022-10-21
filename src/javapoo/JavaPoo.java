package javapoo;

public class JavaPoo {
    
    public static void main(String[] args) {
        Caneta c1 = new Caneta("bic", 0.5f, 90);
        //c1.status();
        Caneta c2 = new Caneta("model", 0.7f, 80);
        
        Contabancaria conta1 = new Contabancaria();
        conta1.AbrirConta("00000", "11111", "02674029293", 21, "Miguel Abreu", "corrente");
        conta1.depositar(58.5f);
        conta1.sacar(50);
        conta1.MostrarDados();
        conta1.depositar(152f);
        conta1.MostrarDados();
        //c2.status();
        /*c1.cor = "azul";
        c1.marca = "bic";
        c1.tampada = true;
        //c1.ponta = 0.8f;
        c1.setponta(0.7f);
        c1.carga = 90;
        c1.destampar();
        c1.escrever();
        c1.tampar();
        c1.status();*/
        
        /*System.out.print("\n\n");
        Empresa agronorte = new Empresa();
        agronorte.cnpj = "xxxxxxxxxxxxxxxxxx";
        agronorte.nome = "Agronorte sementes";
        agronorte.dono = "Selma Maria Amanajas de Abreu";
        agronorte.valor = 500000f;
        agronorte.segmento = "agropecuario";
        agronorte.Qfuncionario = 2;
        agronorte.aberto = false;
        agronorte.abrir();
        agronorte.fechar();
        agronorte.status();*/
        
    }
}
