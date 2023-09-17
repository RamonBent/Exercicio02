import java.util.Calendar;

public class ContaBancaria {
    Calendar cal = Calendar.getInstance();
    int horaAtual = cal.get(Calendar.HOUR_OF_DAY);
    private int saldo;

    public ContaBancaria(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {

        return saldo;
    }

    public void setSaldo(int saldo) {

        this.saldo = saldo;
    }

    public void depositar(int valor) {
        this.saldo += valor;
    }

    public void sacar(int valor) {
        if (valor > 0 && valor < saldo && horaAtual <= 16 && horaAtual > 6) {

            this.saldo -= valor;

        } else {
            System.out.println("Valor invalido para saque");
        }
    }

    public void verificarSaldo() {

        System.out.println("Seu saldo é: " + getSaldo());
    }


}