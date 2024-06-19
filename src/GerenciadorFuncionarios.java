import Models.Funcionario;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class GerenciadorFuncionarios {
    private List<Funcionario> funcionarios;
    private Descritor descritor;

    public GerenciadorFuncionarios(List<Funcionario> funcionarios){
        this.funcionarios = funcionarios;
        descritor = new Descritor(funcionarios, new HashMap<String, List<Funcionario>>());
    }

    public Descritor getDescritor() {
        return descritor;
    }

    public void inserirFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
    }

    public void removerFuncionario(String nome){
        funcionarios.removeIf(funcionario -> funcionario.getNome().equals(nome));
    }

    public void modificarSalario(double modificador){
        for(Funcionario funcionario: funcionarios){
            funcionario.setSalario(funcionario.getSalario().multiply(new BigDecimal(modificador)));
        }
    }

    public void agruparPorFuncao(){
        Map<String, List<Funcionario>> map = new HashMap<String, List<Funcionario>>();
        for(Funcionario funcionario: funcionarios){
            String funcao = funcionario.getFuncao();
            try{
                map.get(funcao).add(funcionario);
            }catch(Exception e) {
                List<Funcionario> valor = new ArrayList<Funcionario>();
                valor.add(funcionario);
                map.put(funcao, valor);
            }
        }
        descritor.setAgrupamento(map);
    }
}
