import Models.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        GerenciadorFuncionarios gerenciador = new GerenciadorFuncionarios(new ArrayList<Funcionario>());

        // Inserindo todos os funcionários, na mesma ordem e informações da tabela proposta
        gerenciador.inserirFuncionario(new Operador("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44")));
        gerenciador.inserirFuncionario(new Operador("João", LocalDate.of(1990, 5, 12), new BigDecimal("2284.38")));
        gerenciador.inserirFuncionario(new Coordenador("Caio", LocalDate.of(1961, 5, 2), new BigDecimal("9836.14")));
        gerenciador.inserirFuncionario(new Diretor("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88")));
        gerenciador.inserirFuncionario(new Recepcionista("Alice", LocalDate.of(1995, 1, 5), new BigDecimal("2234.68")));
        gerenciador.inserirFuncionario(new Operador("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72")));
        gerenciador.inserirFuncionario(new Contador("Arthur", LocalDate.of(1993, 3, 31), new BigDecimal("4071.84")));
        gerenciador.inserirFuncionario(new Gerente("Laura", LocalDate.of(1994, 7, 8), new BigDecimal("3017.45")));
        gerenciador.inserirFuncionario(new Eletricista("Heloísa", LocalDate.of(2003, 5, 24), new BigDecimal("1606.85")));
        gerenciador.inserirFuncionario(new Gerente("Helena", LocalDate.of(1996, 9, 2), new BigDecimal("2799.93")));

        // Removendo funcionario João da lista
        gerenciador.removerFuncionario("João");

        // Imprimindo todos os funcionários com todas suas informações:
        // Infelizmente nãos sei fazer a formatação: (estou disposto a aprender)
        // * informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula
        gerenciador.getDescritor().imprimirFuncionarios();

        // Atualizando a lista de funcionários com novo valor, aumento de 10%
        gerenciador.modificarSalario(1.1);

        // Agrupando os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”
        gerenciador.agruparPorFuncao();

        // Imprimindo os funcionários, agrupados por função.
        gerenciador.getDescritor().imprimirAgrupamento();

        // Imprimindo os funcionários que fazem aniversário no mês 10 e 12
        gerenciador.getDescritor().imprimirFuncionariosMesAniversario(10);
        gerenciador.getDescritor().imprimirFuncionariosMesAniversario(12);

        // Imprimindo o funcionário com a maior idade:
        gerenciador.getDescritor().imprimirFuncionarioMaisVelho();

        // Imprimir a lista de funcionários por ordem alfabética:
        gerenciador.getDescritor().imprimirOrdemAlfabetica();

        // Imprimindo quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212.00
        gerenciador.getDescritor().imprimirQuantidadeSalariosMinimos(new BigDecimal("1212.00"));

        /*
        Considerações: Por se tratar de um exemplo toy, fiz todos os salvamentos em memória, isto é, sem uso de disco,
        mas caso fosse uma implementação real, a ideia é que teria de fazer um mapeamento relacional ORM, a fim de mapear
        nossos modelos para um banco de dados relacional (JPA ajuda muito nessas horas). Tentei manter as classes bem
        dividas e com responsabilidades únicas. Evitei deixar uma classe massiva também, que seria responsavel por executar
        todas as operações requeridas pelo enunciado. E por fim, tentei manter as coisas expansíveis e modulares sem necessidade
        de mudança, entretanto num exemplo toy com casos bem definidos e específicos como este, que não tem perspectiva de crescimento, isto
        acaba sendo um pouco difícil, enfim, acho que é isto, obrigado pela atenção, espero poder trabalhar com vocês logo :D
         */
    }
}
