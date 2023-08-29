package Main;

import Model.Boleto;
import Model.ItaxasCliente;
import Model.TaxasClienteBB;
import Model.TaxasClienteNu;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Escolha o cartao desejado (NUBANK ou BANCO DO BRASIL):");
            String cliente = scanner.nextLine().trim();  // Usar trim() para remover espaços extras

            ItaxasCliente taxasCliente;
            if (cliente.equalsIgnoreCase("NUBANK") || cliente.equalsIgnoreCase("NU")) {
                taxasCliente = new TaxasClienteNu();
            } else if (cliente.equalsIgnoreCase("BANCO DO BRASIL") || cliente.equalsIgnoreCase("BB")) {
                taxasCliente = new TaxasClienteBB();
            } else {
                System.out.println("Cliente inválido. Tente novamente.");
                continue;  // Retorna ao início do loop
            }

            System.out.print("Digite o valor do boleto: ");
            double valorBoleto = scanner.nextDouble();

            System.out.print("Digite a quantidade de dias de atraso: ");
            int diasAtraso = scanner.nextInt();

            Boleto boleto = new Boleto(valorBoleto, diasAtraso, taxasCliente);

            System.out.println("\nBoleto:");
            boleto.imprimirBoleto();


            break;  // Sai do loop após uma execução bem-sucedida
        }

        scanner.close();
    }
}
