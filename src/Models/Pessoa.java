package Models;

import java.time.LocalDate;

public abstract class Pessoa {
    private String nome;
    private LocalDate dataNascimento;

    public Pessoa(String nome, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                "\nData de nascimento: " +
                dataNascimento.getDayOfMonth() +
                "/" + dataNascimento.getMonthValue() +
                "/" + dataNascimento.getYear();
    }
}
