package challenges.dio_poo.heranca_polimorfismo.ingressos_cinema;

import java.math.BigDecimal;

public class Ingresso {

BigDecimal valorInicial = BigDecimal.ZERO;
String nomeFilme;
TipoAudio tipoAudio;

    public Ingresso(BigDecimal valorInicial, String nomeFilme, TipoAudio tipoAudio) {
        this.valorInicial = valorInicial;
        this.nomeFilme = nomeFilme;
        this.tipoAudio = tipoAudio;
    }


    public BigDecimal valorReal(BigDecimal valorInicial) {
        valorInicial = this.valorInicial;
        return valorInicial;
}
}
