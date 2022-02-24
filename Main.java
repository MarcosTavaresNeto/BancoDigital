public class Main {
    public static void main(String[] args) {
        /*Cliente cliente = new Cliente();
        cliente.setNome("Marcos Tavares");
        Conta cc = new ContaCorrente(cliente);
        Conta cp = new ContaPoupanca(cliente);
        cc.depositar(100);
        cc.transferir(cp,20);
        cc.imprimirSaldo();
        cp.imprimirSaldo();*/
        BancoDigital banco = new BancoDigital();
        Cliente cliente = new Cliente();
        cliente.setNome("Aldo Martins");
        Conta contaCorrente01 = new ContaCorrente(cliente);
        contaCorrente01.depositar(200);
        cliente.setNome("Birra Dolores");
        Conta contaCorrente02 = new ContaCorrente(cliente);
        contaCorrente02.depositar(100);
        contaCorrente01.transferir(contaCorrente02,12.8);
        cliente.setNome("Charlie Frog");
        Conta contaPoupanca = new ContaPoupanca(cliente);
        contaCorrente01.transferir(contaPoupanca,32.5);
        banco.setNome("Banco Frits");
        banco.insertConta(contaCorrente01);
        banco.insertConta(contaCorrente02);
        banco.insertConta(contaPoupanca);
        banco.imprimeListaSaldos();

    }
}
