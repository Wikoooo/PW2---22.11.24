//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Conta conta = new Conta();

        conta.cliente = "Bia e wiko";
        conta.saldo = 10000;

        Conta destino = new Conta();
        destino.cliente = "Jubs e Carola";
        destino.saldo = 10;

        conta.transferirPara(destino, 5000);

        destino.exibirSaldo();
    }
}