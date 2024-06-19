package Models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Contador extends Funcionario{
    public Contador(String nome, LocalDate dataAniversario, BigDecimal salario) {
        super(nome, dataAniversario, salario, "Contador");
    }
}