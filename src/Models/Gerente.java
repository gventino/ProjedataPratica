package Models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Gerente extends Funcionario{
    public Gerente(String nome, LocalDate dataAniversario, BigDecimal salario) {
        super(nome, dataAniversario, salario, "Gerente");
    }
}
