package Models;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Coordenador extends Funcionario{
    public Coordenador(String nome, LocalDate dataAniversario, BigDecimal salario) {
        super(nome, dataAniversario, salario, "Coordenador");
    }
}
