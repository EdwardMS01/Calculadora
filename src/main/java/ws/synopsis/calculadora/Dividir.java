package ws.synopsis.calculadora;

public class Dividir extends Operacion{
    double div;
    public Dividir(double n1, double n2) {
        super(n1,n2);
        this.div = n1/n2;
        this.setRes(this.div);
    }
}
