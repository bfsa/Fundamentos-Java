package assessment.exercicio08;

public class Main {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Gerente INFNET da Silva", 100000.0);
        Estagiario estagiario = new Estagiario("Estagiario INFNET de Souza", 10000.0);

        System.out.println("\n---- Funcionários INFNET ----");
        System.out.println("Funcionário: " + gerente.getNome());
        System.out.println("Cargo: Gerente");
        System.out.println("Salário Base: R$" + String.format("%.2f", gerente.getSalarioBase()));
        System.out.println("Salário Final: R$" + String.format("%.2f", gerente.calcularSalario()));

        System.out.println("\nFuncionário: " + estagiario.getNome());
        System.out.println("Cargo: Estagiário");
        System.out.println("Salário Base: R$" + String.format("%.2f", estagiario.getSalarioBase()));
        System.out.println("Salário Final: R$" + String.format("%.2f", estagiario.calcularSalario()));
    }
}
