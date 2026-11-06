package challenges.dio_poo.heranca_polimorfismo.ingressos_cinema;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IngressoMeia extends  Ingresso {
    public IngressoMeia(BigDecimal valorInicial, String nomeFilme, TipoAudio tipoAudio) {
        super(valorInicial, nomeFilme, tipoAudio);
    }

    //Meia-entrada: estudantes e beneficiários pagam apenas metade do preço do ingresso.

    public BigDecimal valorReal(BigDecimal valorInicial) {
        double descontoAliquota = 0.5;
        BigDecimal desconto = valorInicial.multiply(BigDecimal.valueOf(descontoAliquota));
        return (valorInicial.subtract(desconto).setScale(2, RoundingMode.HALF_DOWN));
    }


}
