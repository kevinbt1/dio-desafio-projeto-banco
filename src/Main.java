
public class Main {

    public static void main(String[] args) {
        Cliente kevin = new Cliente();
        kevin.setNome("Kevin");

        Conta cc = new ContaCorrente(kevin);
        Conta poupanca = new ContaPoupanca(kevin);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

    }

}



