package Models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Eletricista extends Funcionario{
    public Eletricista(String nome, LocalDate dataAniversario, BigDecimal salario) {
        super(nome, dataAniversario, salario, "Eletricista");
    }
}
