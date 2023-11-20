import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Date;

public class Servico {
    private String tipoServico;
    private int idServico;
    private int idCliente;
    private int idAnimal;
    private Date dataHora;

    public Servico(String tipoServico, int idServico, int idCliente, int idAnimal, Date dataHora) {
        this.tipoServico = tipoServico;
        this.idServico = idServico;
        this.idCliente = idCliente;
        this.idAnimal = idAnimal;
        this.dataHora = dataHora;
    }

    // Getters e setters

    public void finalizarServico() {
        try (Connection connection = DatabaseManager.getConnection()) {
            String query = "UPDATE servico SET estado = 'Finalizado' WHERE idServico = ?";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setInt(1, idServico);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
