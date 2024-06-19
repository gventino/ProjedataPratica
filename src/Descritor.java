import Models.Funcionario;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.Map;

public class Descritor implements FuncionalidadesRequeridas{
    List<Funcionario> funcionarios;
    Map<String, List<Funcionario>> agrupamento;

    public Descritor(List<Funcionario> funcionarios, Map<String, List<Funcionario>> agrupamento) {
        this.funcionarios = funcionarios;
        this.agrupamento = agrupamento;
    }

    public void setAgrupamento(Map<String, List<Funcionario>> agrupamento) {
        this.agrupamento = agrupamento;
    }

    public void imprimirFuncionarios(){
        for(Funcionario funcionario: funcionarios){
            System.out.println(funcionario);
        }
    }

    public void imprimirOrdemAlfabetica(){
        funcionarios.sort((f1, f2) -> f1.getNome().compareTo(f2.getNome()));
        imprimirFuncionarios();
    }

    public void imprimirFuncionariosMesAniversario(int mes){
        for(Funcionario funcionario: funcionarios){
            if(funcionario.getDataNascimento().getMonth().getValue() == mes)
                System.out.println(funcionario);
        }
    }

    public void imprimirFuncionarioMaisVelho(){
        long maiorIdade = 0;
        long diferenca = 0;
        Funcionario maisVelho = null;

        for(Funcionario funcionario: funcionarios){
            diferenca = ChronoUnit.DAYS.between(funcionario.getDataNascimento(), LocalDate.now());
            if(diferenca > maiorIdade){
                maiorIdade = diferenca;
                maisVelho = funcionario;
            }
        }

        System.out.println(maisVelho);
    }

    public void imprimirQuantidadeSalariosMinimos(BigDecimal salarioMinimo){
        BigDecimal quantidade = null;
        for(Funcionario funcionario: funcionarios){
            quantidade = funcionario.getSalario().divideToIntegralValue(salarioMinimo);
            System.out.print(funcionario);
            System.out.println("Quantidade de Salarios Minimos recebida: " + quantidade.setScale(2, RoundingMode.HALF_UP) + "\n");
        }
    }

    public void imprimirAgrupamento(){
        for(Map.Entry<String, List<Funcionario>> entry: agrupamento.entrySet()){
            System.out.println("\n" + entry.getKey() + ":");
            for(Funcionario funcionario: entry.getValue()){
                System.out.println(funcionario);
            }
        }
    }
}
