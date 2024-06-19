package Models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Recepcionista extends Funcionario{
    public Recepcionista(String nome, LocalDate dataAniversario, BigDecimal salario) {
        super(nome, dataAniversario, salario, "Recepcionista");
    }
}
