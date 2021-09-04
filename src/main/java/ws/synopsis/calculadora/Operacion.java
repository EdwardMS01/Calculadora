package ws.synopsis.calculadora;

public class Operacion {
    private double n1;
    private double n2;
    private double res;

    public Operacion(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public Operacion() {

    }

    public void mostrarresultado() {
        System.out.println(this.n1+ " " +this.n2+ " = "+this.res);
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getRes() {
        return res;
    }

    public void setRes(double res) {
        this.res = res;
    }
}
