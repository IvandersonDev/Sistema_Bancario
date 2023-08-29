package Model;

public class TaxasClienteNu implements ItaxasCliente{


    @Override
    public double calcularJuros(int diasDeAtraso) {
        if (diasDeAtraso>=10 && diasDeAtraso<30){
            return 0.02;
        } else if (diasDeAtraso>=30 &&diasDeAtraso<60){
            return 0.05;
        }
        return 0;
    }

    @Override
    public double calcularMulta(int diasDeAtraso) {
        if (diasDeAtraso>=10 && diasDeAtraso <30){
            return 0.05;
        } else if (diasDeAtraso>=30 && diasDeAtraso<60){
            return 0.01;
        }
        return 0;
    }
}
