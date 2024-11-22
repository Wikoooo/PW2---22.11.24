public class Conta {
    public String cliente;
    public double saldo;

    void exibirSaldo(){
       System.out.println(cliente + " seu saldo atual é de R$ " + saldo);
    }
    public void depositar(double valor){
        saldo += valor;
    }

    public void sacar(double valor){
        if (saldo < valor){
            System.out.println("Não foi possivel realizar essa operação! Saldo insuficiente!");
        }else {
            saldo -= valor;
        }
    }

    public void transferirPara(Conta destino, double valor){
        this.sacar(valor);
        destino.depositar(valor);
        System.out.println("");
        System.out.println("------------------------------------------------------");
        System.out.println(this.cliente + " transferencia de R$" + valor + "\nPara " + destino.cliente);
        System.out.println("------------------------------------------------------");
    }
}
