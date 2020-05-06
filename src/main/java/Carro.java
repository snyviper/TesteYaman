public class Carro {

    private String cor;
    private String modelo;
    private Double velocidadeAtual;
    private final Double velocidadeMaxima;

    public Boolean ligado = false;

    public String getCor(){
        return this.cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getModelo(){
        return this.modelo;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public Double getVelocidadeAtual(){
        return this.velocidadeAtual;
    }

    public Double getVelocidadeMaxima(){
        return this.velocidadeMaxima;
    }

    public Boolean getLigado(){
        return this.ligado;
    }

    public Carro(String cor, String modelo, Double velocidadeMaxima){
        velocidadeAtual = 0.0;
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeMaxima = velocidadeMaxima;
    }


    //liga o carro
    public Boolean ligaedesliga() {
        if (!this.ligado){
            this.ligado = true;
            System.out.println("O carro foi ligado");
        } else {
            this.ligado = false;
            this.velocidadeAtual = 0.0;
            System.out.println("O carro foi desligado");
        }
        return this.ligado;
    }
    //acelera uma certa quantidade
    public void acelera(Double quantidade) {
        if(this.getLigado()){
            Double velocidadeNova = this.velocidadeAtual + quantidade;
            if (velocidadeNova < this.velocidadeMaxima){
                this.velocidadeAtual = velocidadeNova;
            }
            else{
                this.velocidadeAtual = this.velocidadeMaxima;
            }
        }
    }
    //devolve a marcha do carro
    public Integer pegaMarcha() {
        if(getLigado()){
            if (this.velocidadeAtual < 0.0) {
                return -1;
            }
            if (this.velocidadeAtual >= 0.0 && this.velocidadeAtual < 40) {
                return 1;
            }
            if (this.velocidadeAtual >= 40 && this.velocidadeAtual < 80) {
                return 2;
            }
            return 3;
        }
        else{
            return 0;
        }
    }
}