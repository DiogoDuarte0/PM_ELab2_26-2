import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class AnalistaTest {
    @Test 
    public void verificarHorasExtrasCorretamente(){
        Analista ana1= new Analista("ana","200.300.400-06");

        double horas = ana1.addHorasExtras(30);
        

        assertEquals(30d,horas, 0.001);

    }

 @Test 
    public void verificarPagamentoCorretamente(){
        Analista ana1= new Analista("ana","200.300.400-06");

        ana1.addHorasExtras(0);
        double pagamento = ana1.registrarPagamento();
        

        assertEquals(4836d,pagamento,0.001);

    }
}

