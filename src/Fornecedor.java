public class Fornecedor extends Pessoa {
    private String nomeFantasia;
    private String website;

    public Fornecedor(int id, String nome, String logradouro, String numero, String cep, String bairro,
                      String cidade, String uf, String telefone, String cpfCnpj,
                      String nomeFantasia, String website) {
        super(id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpfCnpj);
        this.nomeFantasia = nomeFantasia;
        this.website = website;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }
}
