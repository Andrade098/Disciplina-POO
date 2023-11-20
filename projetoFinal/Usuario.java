import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class Usuario {
    private int idUsuario;
    private String senha;
    private String estadoLogin;
    private Date dateCadastro;

    public Usuario(int idUsuario, String senha, String estadoLogin, Date dateCadastro) {
        this.idUsuario = idUsuario;
        this.senha = senha;
        this.estadoLogin = estadoLogin;
        this.dateCadastro = dateCadastro;
    }

    // Getters e setters

    public boolean verifLogin(String email, String senha) {
        try (Connection connection = DatabaseManager.getConnection()) {
            String query = "SELECT * FROM usuario WHERE email = ? AND senha = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, email);
                preparedStatement.setString(2, senha);
                try (ResultSet resultSet = preparedStatement.executeQuery()) {
                    return resultSet.next();
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}
