package View;
import java.util.Scanner;
import Controller.OperacoesController;

public class Main {
    public static void main(String[] args) {
    	
		OperacoesController OC = new OperacoesController();
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um número inteiro entre 10 e 999999: ");
        int num = sc.nextInt();
        while(num <10 || num> 999999) {
			System.out.print("Digite um número inteiro entre 10 e 999999: ");
			 num = sc.nextInt();
		}
        System.out.print("Digite um número inteiro entre 0 e 9: ");
        int digito = sc.nextInt();
        while(digito<0 || digito>9) {
            System.out.print("Digite um número inteiro entre 0 e 9: ");
            digito = sc.nextInt();
        }
        sc.close();
        
        int conta = OC.Contagem(num, digito);
        System.out.printf("O número "+digito+" aparece "+conta+" vezes no número "+num);
    }
    
}