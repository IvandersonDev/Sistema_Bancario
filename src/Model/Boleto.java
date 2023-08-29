package Model;

public class Boleto {
    private final ItaxasCliente taxasCliente;
    private double valor;
    private int diasAtraso;

    public Boleto(double valor, int diasAtraso, ItaxasCliente taxasCliente) {
        this.valor = valor;
        this.diasAtraso = diasAtraso;
        this.taxasCliente = taxasCliente;
    }

    public double calcularJuros() {
        return valor * taxasCliente.calcularJuros(diasAtraso);
    }

    public double calcularMulta() {
        return valor * taxasCliente.calcularMulta(diasAtraso);
    }

    public double calcularTotal() {
        return valor + calcularJuros() + calcularMulta();
    }

    public void imprimirBoleto() {
        System.out.println("Valor original: R$" + valor);
        System.out.println("Dias de atraso: " + diasAtraso);
        System.out.println("Juros: R$" + calcularJuros());
        System.out.println("Multa: R$" + calcularMulta());
        System.out.println("Total a pagar: R$" + calcularTotal());
    }
}
