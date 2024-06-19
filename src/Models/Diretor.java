package Models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Diretor extends Funcionario{
    public Diretor(String nome, LocalDate dataAniversario, BigDecimal salario) {
        super(nome, dataAniversario, salario, "Diretor");
    }
}
