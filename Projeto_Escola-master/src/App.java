import javax.swing.JOptionPane;

import br.com.escolaweb.controller.AlunoController;
import br.com.escolaweb.model.Aluno;
import br.com.escolaweb.model.Funcionario;


public class App {
    public static void main(String[] args) {
        try {
            Aluno aluno = new Aluno();
            Funcionario funcionario = new Funcionario();
            aluno.setNome("Leonardo");
            aluno.setEmail("leosenac@email.com");
            aluno.setSenha("987654");
            AlunoController alunoController = new AlunoController();
            alunoController.cadastrar(aluno);
            JOptionPane.showMessageDialog(null, "Aluno cadastrado!");
        } catch (Exception e) {
            System.err.println("Erro >>> !" + e);
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar!" + e.
            getMessage());
        }
        // Funcionario funcionario = new Funcionario();
    }
}
