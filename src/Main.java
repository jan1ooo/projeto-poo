public class Main {
    public static void main(String[] args) {
        Cliente janio = new Cliente("Janio", "jjdsilva@hotmail.com", 232323231);

        Conta cc = new ContaCorrente(janio);
        Conta cp = new ContaPoupanca(janio);

        cc.depositar(150);
        cc.transferir(cp,100);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
