import java.util.ArrayList;
import java.util.List;

public class BancoDigital {
    private String nome;
    private final List<Conta> contas = new ArrayList<>();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void insertConta(Conta conta) {
        this.contas.add(conta);
    }
    public void imprimeListaSaldos(){
        for (Conta conta : contas) {
            System.out.println("Banco - " + this.nome);
            conta.imprimirSaldo();
            System.out.println("-------------------------FIM DE SALDO ---------");
        }
    }

}
