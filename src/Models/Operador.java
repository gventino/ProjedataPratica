package Models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Operador extends Funcionario{
    public Operador(String nome, LocalDate dataNascimento, BigDecimal salario) {
        super(nome, dataNascimento, salario, "Operador");
    }
}
