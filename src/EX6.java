public class EX6 {
    public static void main(String[] args) {

        Retangulo retangulo1 = new Retangulo();
        System.out.println(retangulo1.calcular(5.0, 4.0));

    }
}
class Retangulo{
   private double lado1;
   private double lado2;

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double calcular(double largura, double altura ){
        return largura * altura;
    }
}
