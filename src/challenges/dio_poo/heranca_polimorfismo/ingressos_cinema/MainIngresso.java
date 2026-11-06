package challenges.dio_poo.heranca_polimorfismo.ingressos_cinema;

import java.math.BigDecimal;
import java.util.Scanner;

public class MainIngresso {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ingresso ingresso = new Ingresso(BigDecimal.valueOf(50), "Batman", TipoAudio.DUBLADO);
        IngressoFamilia ingressoFamilia = new IngressoFamilia(BigDecimal.valueOf(65), "Superman", TipoAudio.LEGENDADO, 4);
        IngressoMeia ingressoMeia = new IngressoMeia(BigDecimal.valueOf(22.50), "Coringa", TipoAudio.DUBLADO);

        System.out.println(ingresso.valorInicial + " " + ingresso.nomeFilme + " " + ingresso.tipoAudio);
        System.out.println(ingressoFamilia.valorReal(BigDecimal.valueOf(65), 4) + " " + ingressoFamilia.nomeFilme + " " + ingressoFamilia.tipoAudio);
        System.out.println(ingressoMeia.valorReal(BigDecimal.valueOf(22.50)) + " " + ingressoMeia.nomeFilme + " " + ingressoMeia.tipoAudio);

    }
}
