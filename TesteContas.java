
public class TesteContas {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		ContaPoupanca cp = new ContaPoupanca(222, 222);
		
		cc.deposita(100.0);
		cp.deposita(200.);
		
		cc.transfere(10.0, cp);
		
		System.out.println("O saldo da conta corrente é: " + cc.getSaldo());
		System.out.println("O saldo da conta poupança é: " + cp.getSaldo());
	}

}
