public class Colaborador extends Pessoa {
    private String cargoOuFuncao;

    public Colaborador(int id, String nome, String logradouro, String numero, String cep, String bairro,
                       String cidade, String uf, String telefone, String cpfCnpj,
                       String cargoOuFuncao) {
        super(id, nome, logradouro, numero, cep, bairro, cidade, uf, telefone, cpfCnpj);
        this.cargoOuFuncao = cargoOuFuncao;
    }

    public String getCargoOuFuncao() {
        return cargoOuFuncao;
    }

    public void setCargoOuFuncao(String cargoOuFuncao) {
        this.cargoOuFuncao = cargoOuFuncao;
    }
}
