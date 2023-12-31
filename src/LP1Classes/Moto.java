package LP1Classes;

public class Moto {
    private String marca;
    private String cor;
    private int ano;
    private boolean liga = false;

    public Moto(String marca, String cor, int ano){
        this.marca = marca;
        this.cor = cor;
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void ligar(){
        this.liga = true;
        System.out.println("Moto ligado");
    }

    public void desligar(){
        this.liga = false;
        System.out.println(" Moto Desligando");
    }

    public void acelerar(){
        if(this.liga)
            System.out.println("acelerando");
        else {
            System.out.println("Ligar Moto");
        }
    }
}
