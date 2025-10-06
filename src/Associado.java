public class Associado extends Pessoa {
    private String situacao;
    private String numeroAssociado;

    public Associado(int id, String nome, String logradouro, String numero, String cep, String bairro,
                     String cidade, String uf, String telefone, String cpfCnpj,
                     String situacao, String numeroAssociado) {
        super(id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpfCnpj);
        this.situacao = situacao;
        this.numeroAssociado = numeroAssociado;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getNumeroAssociado() {
        return numeroAssociado;
    }

    public void setNumeroAssociado(String numeroAssociado) {
        this.numeroAssociado = numeroAssociado;
    }
}
