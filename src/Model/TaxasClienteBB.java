package Model;

public class TaxasClienteBB implements ItaxasCliente{
    @Override
    public double calcularJuros(int diasDeAtraso) {
        if (diasDeAtraso>=10 && diasDeAtraso<30){
            return 0.04;
        } else if (diasDeAtraso>= 30 && diasDeAtraso<60){
            return 0.08;
        }
        return 0;
    }

    @Override
    public double calcularMulta(int diasDeAtraso) {
        if (diasDeAtraso>=10 && diasDeAtraso<30){
            return 0.07;
        } else if (diasDeAtraso>=30 && diasDeAtraso<60){
            return 0.13;
        }
        return 0;
    }
}
