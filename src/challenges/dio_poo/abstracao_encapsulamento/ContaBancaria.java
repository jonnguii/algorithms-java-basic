package challenges.dio_poo.abstracao_encapsulamento;

import java.math.BigDecimal;

public class ContaBancaria {
    private BigDecimal saldo;
    private BigDecimal chequeEspecial;

    public ContaBancaria(BigDecimal saldo) {
        this.saldo = saldo;
        BigDecimal limiteComparacao = new BigDecimal("500");
        if (saldo.compareTo(limiteComparacao) <= 0) {
            this.chequeEspecial = BigDecimal.valueOf(50);
        } else {
            this.chequeEspecial = saldo.multiply(BigDecimal.valueOf(0.5));
        }
    }

    public BigDecimal getSaldo() {
        return saldo;
    }

    public BigDecimal getChequeEspecial() {
        return chequeEspecial;
    }

    public void depositar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0 || valor == null) {
            throw new IllegalArgumentException("O valor do depósito deve ser maior que zero");
        }
        this.saldo = this.saldo.add(valor);
    }

    public void sacar(BigDecimal valor) {
        if (valor.compareTo(BigDecimal.ZERO) <= 0 || valor == null) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero");
        }
        this.saldo = saldo.subtract(valor);
    }


    public Boolean isUsingChequeEspecial() {
        if (chequeEspecial.compareTo(BigDecimal.ZERO) > 0) {
            return true;
        }
        return false;
    }

//    - Pagar um boleto.

}
