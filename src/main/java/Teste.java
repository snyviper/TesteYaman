import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class Teste {
    private static Carro fusca;
    @BeforeAll
    public static void iniciaTudo(){
        fusca = new Carro("vermelho","fusca",100.0);
    }
    @Test
    public void testCor(){
        Assertions.assertEquals("vermelho",this.fusca.getCor(),"A cor esta incorreta!");
    }
    @Test
    public void testModelo(){
        Assertions.assertEquals("fusca",this.fusca.getModelo(),"O modelo esta incorreto!");
    }
    @Test
    public void testVelocidadeMaxima(){
        Assertions.assertEquals(100.0,this.fusca.getVelocidadeMaxima(),"A velocidade maxima esta incorreta!");
    }
    @Test
    public void testVelocidadeatualEMarcha(){
        Assertions.assertEquals(0.0,this.fusca.getVelocidadeAtual(),"A velocidade inicial esta incorreta!");
        Assertions.assertEquals(0,this.fusca.pegaMarcha(),"A marcha inicial esta incorreta!");
        this.fusca.ligaedesliga();
        Assertions.assertEquals(0.0,this.fusca.getVelocidadeAtual(),"A velocidade apos ligado esta incorreta!");
        Assertions.assertEquals(1,this.fusca.pegaMarcha(),"A marcha apos ligado esta incorreta!");
        this.fusca.acelera(-20.0);
        Assertions.assertEquals(-20.0,this.fusca.getVelocidadeAtual(),"A velocidade -20 esta incorreta!");
        Assertions.assertEquals(-1,this.fusca.pegaMarcha(),"A marcha re esta incorreta!");
        this.fusca.acelera(30.0);
        Assertions.assertEquals(10.0,this.fusca.getVelocidadeAtual(),"A velocidade 40 esta incorreta!");
        Assertions.assertEquals(1,this.fusca.pegaMarcha(),"A marcha 2 esta incorreta!");
        this.fusca.acelera(30.0);
        Assertions.assertEquals(40.0,this.fusca.getVelocidadeAtual(),"A velocidade 40 esta incorreta!");
        Assertions.assertEquals(2,this.fusca.pegaMarcha(),"A marcha 2 esta incorreta!");
        this.fusca.acelera(40.0);
        Assertions.assertEquals(80.0,this.fusca.getVelocidadeAtual(),"A velocidade 80 esta incorreta!");
        Assertions.assertEquals(3,this.fusca.pegaMarcha(),"A marcha 3 esta incorreta!");
        this.fusca.acelera(30.0);
        Assertions.assertEquals(100.0,this.fusca.getVelocidadeAtual(),"A velocidade 100 final esta incorreta!");
        Assertions.assertEquals(3,this.fusca.pegaMarcha(),"A marcha 3 final esta incorreta!");
        this.fusca.ligaedesliga();
        Assertions.assertEquals(0.0,this.fusca.getVelocidadeAtual(),"A velocidade apos desligado esta incorreta!");
        Assertions.assertEquals(0,this.fusca.pegaMarcha(),"A velocidade apos desligado esta incorreta!");
    }
}