import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Cliente extends Usuario {
    private String nomeCliente;
    private int cpf;
    private String endereco;
    private String email;
    private String infoCartaoCred;

    public Cliente(int idUsuario, String senha, String estadoLogin, Date dateCadastro,
                   String nomeCliente, int cpf, String endereco, String email, String infoCartaoCred) {
        super(idUsuario, senha, estadoLogin, dateCadastro);
        this.nomeCliente = nomeCliente;
        this.cpf = cpf;
        this.endereco = endereco;
        this.email = email;
        this.infoCartaoCred = infoCartaoCred;
    }

    // Getters e setters

    @Override
    public void cadastrar() {
        try (Connection connection = DatabaseManager.getConnection()) {
            String query = "INSERT INTO cliente (idUsuario, nomeCliente, cpf, endereco, email, infoCartaoCred) VALUES (?, ?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, getIdUsuario());
                preparedStatement.setString(2, nomeCliente);
                preparedStatement.setInt(3, cpf);
                preparedStatement.setString(4, endereco);
                preparedStatement.setString(5, email);
                preparedStatement.setString(6, infoCartaoCred);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Implementar as demais operações (consultar, atualizarPerfil, excluir) semelhantemente
}
