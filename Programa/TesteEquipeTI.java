package Programa;

public class TesteEquipeTI {
    public static void main(String[] args) {
        EquipeTI EquipeA = new EquipeTI();
        EquipeA.setCodID(1234);
        System.out.println("O codigo ID: " + EquipeA.getCodID());
        EquipeA.setNome("Lucas");
        System.out.println("Nome do funcionario com o ID " + EquipeA.getCodID() + " é " + EquipeA.getNome());
        EquipeA.setEmail("luquinhaskgf@gmail.com");
        System.out.println("O email do usuario: " + EquipeA.getNome() + " com o ID " + EquipeA.getCodID() + " é " + EquipeA.getEmail());
        EquipeA.setSalario(35555);
        System.out.println("O salario de " + EquipeA.getNome() + " é de " + EquipeA.getSalario());

        EquipeA.AumentoDeSalario(6.5);

        System.out.println("Com o aumento do salario de " + EquipeA.getNome() + " seu salario foi para " + EquipeA.getSalario());

        System.out.println("O imposto foi de " + EquipeA.SalarioImposto2());

        System.out.println(("Com o imposto seu salario é de: " + EquipeA.SalarioImposto()));

    }
}
