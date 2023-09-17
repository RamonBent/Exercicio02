import java.util.Scanner;
import java.util.Calendar;

public class ContaBancariaPrincipal {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args){
        Calendar cal = Calendar.getInstance();
        int horaAtual = cal.get(Calendar.HOUR_OF_DAY);


        ContaBancaria conta1 = new ContaBancaria(20);
        conta1.depositar(30);
        conta1.verificarSaldo();
        conta1.sacar(30);
        conta1.verificarSaldo();

        if (horaAtual < 12) {
            System.out.println("Bom dia!");
        } else if (horaAtual < 18) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }
}
