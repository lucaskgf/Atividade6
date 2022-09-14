package Programa;

public class EquipeTI {
    private String email;
    private double salario;
    private int codID;
    private String nome;


    public void AumentoDeSalario(double percentual) {
        this.salario += (this.salario * (percentual / 100));
    }

    public int getCodID() {
        return codID;
    }

    public void setCodID(int codID) {
        this.codID = codID;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Double SalarioImposto2() {

        Double SalarioInss2;

        if (this.salario < 1212) {
            SalarioInss2 = this.salario * 0.075;
        } else if (this.salario >= 1212.01 || this.salario <= 2427.35){
            SalarioInss2 = this.salario * 0.090;
        } else if (this.salario >= 2427.36 || this.salario <= 3641.03){
            SalarioInss2 = this.salario * 0.012;
        } else {
            SalarioInss2 = this.salario * 0.014;
        }
        return SalarioInss2;

    }
    public Double SalarioImposto() {

         Double SalarioInss;

        if (this.salario < 1039) {
            SalarioInss = this.salario * 0.075;
        } else if (this.salario >= 1039.01 || this.salario <= 2098.60){
            SalarioInss = this.salario * 0.090;
        } else if (this.salario >= 2098.61 || this.salario <= 3134.40){
            SalarioInss = this.salario * 0.012;
        } else {
            SalarioInss = this.salario * 0.014;
        }
        return this.salario - SalarioInss;

    }
}

