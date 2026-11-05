package challenges.dio_poo.heranca_polimorfismo;

public enum TipoAudio {

    DUBLADO("Dublado", "Dublado"),
    LEGENDADO("Legendado", "Legendado");

    private String nome;
    private String descricao;

    TipoAudio(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public String getDescricao() {
        return descricao;
    }

}
