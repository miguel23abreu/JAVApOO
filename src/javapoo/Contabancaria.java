package javapoo;
/**
 *
 * @author miguel abreu
 */
public class Contabancaria {
    //public, private. protected
	private float saldo;
	protected String agencia;
	protected String conta_corrente;
	public String nome;
        public int idade;
        private String cpf;
        protected String tipo;
        private boolean status;
	public String getAgencia(){
            if(status == true){
                return this.agencia;
            }
            else{
                return null;
            }
	}
	public String getConta_corrente() {
            if(status == true){
                return this.conta_corrente;
            }
            else{
                System.out.println("Conta bancaria inexistente");
                return null;
            }
	}
	public float getsaldo(){
            if(status == true){
                return this.saldo;
            }
            else{
                System.out.println("Conta bancaria inexistente");
                return 0;
            }
	}
	public void depositar(float saldo){
            if(status == true){
                this.saldo += saldo;
            }
            else{
                System.out.println("Conta bancaria inexistente");
            }
	}

        public String getCpf() {
            if(status == true){
                return cpf;
            }
            else{
                System.out.println("Conta bancaria inexistente");
                return null;
            }
        }
        
	public void AbrirConta(String agencia, String conta_corrente, String cpf, 
                int idade, String nome, String tipo){
		this.agencia = agencia;
		this.conta_corrente = conta_corrente;
                this.idade = idade;
                this.cpf = cpf;
                this.nome = nome;
                this.tipo = tipo;
		this.saldo = 0;
                this.status = true;
	}
	public void sacar(int valor){
		int intSaldo = (int) saldo;
		int N1 = 0, N2 = 0, N5 = 0, N10 = 0, N20 = 0, N50 = 0, N100 = 0, N200 = 0;
		if(intSaldo >= valor && valor > 1){
			while(valor > 0){
				if(valor >= 1 && valor < 2){
					valor--;
					intSaldo--;
					N1++;
				}
				else if(valor >= 2 && valor < 5) {
					valor -= 2;
					intSaldo -= 2;
					N2++;
				}
				else if(valor >= 5 && valor < 10) {
					valor -= 5;
					intSaldo -= 5;
					N5++;
				}
				else if(valor >= 10 && valor < 20) {
					valor -= 10;
					intSaldo -= 10;
					N10++;
				}
				else if(valor >= 20 && valor < 50) {
					valor -= 20;
					intSaldo -= 20;
					N20++;
				}
				else if(valor >= 50 && valor < 100) {
					valor -= 50;
					intSaldo -= 50;
					N50++;
				}
				else if(valor >= 100 && valor < 200) {
					valor -= 100;
					intSaldo -= 100;
					N100++;
				}
				else{
					valor -= 200;
					intSaldo -= 200;
					N200++;
				}
			}
			if(N1 >= 1){
				System.out.printf("foi sacado %d notas de R$1,00", N1);
			}
			if(N2 >= 1){
				System.out.printf("foi sacado %d notas de R$2,00", N2);
			}
			if(N5 >= 1){
				System.out.printf("foi sacado %d notas de R$5,00", N5);
			}
			if(N10 >= 1){
				System.out.printf("foi sacado %d notas de R$10,00", N10);
			}
			if(N20 >= 1){
				System.out.printf("foi sacado %d notas de R$20,00", N20);
			}
			if(N50 >= 1){
				System.out.printf("foi sacado %d notas de R$50,00", N50);
			}
			if(N100 >= 1){
				System.out.printf("foi sacado %d notas de R$100,00", N100);
			}
			if(N200 >= 1){
				System.out.printf("foi sacado %d notas de R$200,00", N200);
			}
		}
		else{
			System.out.println("não foi póssivel sacar");
		}
	}
        public void fecharconta(){
            if(this.saldo == 0){
                this.status = false;
            }
            else if(this.saldo > 0){
                System.out.println("Antes de fechar a conta, saque todo o seu dinheiro antes");
            }
            else{
                System.out.println("Sua conta esta em debito");
            }
        }
        public void MostrarDados(){
            if(this.status == true){
                System.out.println("Conta corrente: " + getConta_corrente());
                System.out.println("Agencia: " + getAgencia());
                System.out.println("Nome do proprietario: " + this.nome);
                System.out.println("Idade do proprietario: " + this.idade);
                System.out.println("CPF: " + getCpf());
                System.out.println("Saldo da conta: " + getsaldo());
                System.out.println("Tipo: " + this.tipo);
            }
            else{
                System.out.println("Conta bancaria inexistente");
            }
        }
}
