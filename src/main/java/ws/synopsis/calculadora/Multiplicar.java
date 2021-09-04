package ws.synopsis.calculadora;

public class Multiplicar extends Operacion{
    double mult;
    public Multiplicar(double n1, double n2) {
        super(n1,n2);
        this.mult = n1*n2;
        this.setRes(this.mult);
    }
}
