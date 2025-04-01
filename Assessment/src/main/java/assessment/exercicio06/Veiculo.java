package assessment.exercicio06;

public class Veiculo {
    private String placa;
    private String modelo;
    private int anoFabricacao;
    private double quilometragem;

    public Veiculo(String placa, String modelo, int anoFabricacao, double quilometragem) {
        this.placa = placa;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.quilometragem = quilometragem;
    }

    public void exibirDetalhes() {
        System.out.println("---- Infos do Veiculo ----");
        System.out.println("Placa: " + placa);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano de Fabricação: " + anoFabricacao);
        System.out.println("Quilometragem: " + String.format("%.1f", quilometragem) + " km");
        System.out.println("---------------------------");
    }

    public void registrarViagem(double km) {
        if (km > 0) {
            this.quilometragem += km;
            System.out.println("Viagem de " + String.format("%.1f", km) + " km registrada com sucesso!");
            System.out.println("Quilometragem atual: " + String.format("%.1f", this.quilometragem) + " km");
        } else {
            System.out.println("Erro: A quilometragem da viagem deve ser maior que zero.");
        }
    }

    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("ABC1234", "Chevrolet Onix", 2020, 15000.0);
        Veiculo veiculo2 = new Veiculo("XYZ5678", "Chevrolet Montana", 2022, 8500.0);

        System.out.println("Info inicial dos veículos:");
        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();

        System.out.println("\nRegistrando viagens para o veículo 1:");
        veiculo1.registrarViagem(350.5);
        veiculo1.registrarViagem(120.8);

        System.out.println("\nRegistrando viagens para o veículo 2:");
        veiculo2.registrarViagem(285.3);
        veiculo2.registrarViagem(-50.0);

        System.out.println("\nInfo final dos veículos após as viagens:");
        veiculo1.exibirDetalhes();
        veiculo2.exibirDetalhes();
    }
}