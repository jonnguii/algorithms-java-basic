package challenges.dio_poo.abstracao_encapsulamento;

import java.math.BigDecimal;

public class ContaBancaria {
    private BigDecimal saldo;
    private BigDecimal chequeEspecial;
    private BigDecimal chequeEspecialTotal;

    public ContaBancaria(BigDecimal saldo) {
        this.saldo = saldo;
        BigDecimal limiteComparacao = new BigDecimal("500");

        if (saldo.compareTo(limiteComparacao) <= 0) {
            this.chequeEspecial = BigDecimal.valueOf(50);
        } else {
            this.chequeEspecial = saldo.multiply(BigDecimal.valueOf(0.5));
        }
        this.chequeEspecialTotal = this.chequeEspecial;
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
        if (valor.compareTo(this.saldo) >= 0 || valor == null) {
            throw new IllegalArgumentException("O valor do saque deve ser maior que zero");
        }
        this.saldo = saldo.subtract(valor);
    }


    public Boolean isUsingChequeEspecial() {
        BigDecimal limiteDisponivel = this.chequeEspecial;
        if (limiteDisponivel.compareTo(this.chequeEspecialTotal) < 0) {
            return true;
        }
        return false;
    }

    public void pagarBoleto (BigDecimal valor) {
        if (this.saldo.compareTo(valor) < 0) {
            throw new IllegalArgumentException("O valor em conta deve ser maior que o valor do boleto");
        } else {
            sacar(valor);
        }

    }

//    - Pagar um boleto.

}
