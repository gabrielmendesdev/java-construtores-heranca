public class App {
    public static void main(String[] args) {
        Associado associado = new Associado(1, "Farmácia Central", "Rua A", "100", "12345-678", "Centro", "CidadeX",
                "SP", "1234-5678", "123.456.789-00", "Ativo", "A001");
        System.out.println("Associado: " + associado.getNome() + ", Situação: " + associado.getSituacao());

        Colaborador colaborador = new Colaborador(2, "João da Silva", "Rua B", "200", "23456-789", "BairroY", "CidadeY",
                "RJ", "8765-4321", "987.654.321-00", "Farmacêutico");
        System.out.println("Colaborador: " + colaborador.getNome() + ", Cargo: " + colaborador.getCargoOuFuncao());
        
        Fornecedor fornecedor = new Fornecedor(3, "Medicamentos XYZ", "Av. Z", "300", "34567-890", "Industrial",
                "CidadeZ", "MG", "9988-7766", "55.555.555/0001-55", "XYZ Farma", "www.xyzfarma.com.br");
        System.out.println("Fornecedor: " + fornecedor.getNome() + ", Nome Fantasia: " + fornecedor.getNomeFantasia());
    }
}
