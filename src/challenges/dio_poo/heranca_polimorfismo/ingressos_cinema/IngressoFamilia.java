package challenges.dio_poo.heranca_polimorfismo.ingressos_cinema;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class IngressoFamilia extends Ingresso {
    private Integer quantidadePessoas;
    public IngressoFamilia(BigDecimal valorInicial, String nomeFilme, TipoAudio tipoAudio, Integer quantidadePessoas) {
        super(valorInicial, nomeFilme, tipoAudio);
        this.quantidadePessoas = quantidadePessoas;
    }

    //Ingresso Família: pacotes para grupos onde o valor final depende da quantidade de pessoas, oferecendo 5% de desconto quando o grupo for maior que 3 pessoas.
    public BigDecimal valorReal(BigDecimal valorInicial, Integer quantidadePessoas) {
        if (quantidadePessoas > 3) {
            double descontoAliquota = 0.05;
            BigDecimal desconto = valorInicial.multiply(BigDecimal.valueOf(descontoAliquota));
            return (valorInicial.subtract(desconto).setScale(2, RoundingMode.HALF_DOWN));
        }
        return super.valorReal(valorInicial);
    }

}
