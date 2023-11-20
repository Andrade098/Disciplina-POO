import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Animal {
    private int idAnimal;
    private String nomAnimal;
    private int idade;
    private String cor;
    private double peso;
    private String caracteristicas;

    public Animal(int idAnimal, String nomAnimal, int idade, String cor, double peso, String caracteristicas) {
        this.idAnimal = idAnimal;
        this.nomAnimal = nomAnimal;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
        this.caracteristicas = caracteristicas;
    }

    // Getters e setters

    public void cadastrar() {
        try (Connection connection = DatabaseManager.getConnection()) {
            String query = "INSERT INTO animal (nomAnimal, idade, cor, peso, caracteristicas) VALUES (?, ?, ?, ?, ?)";
            try (PreparedStatement preparedStatement = connection.prepareStatement(query)) {
                preparedStatement.setString(1, nomAnimal);
                preparedStatement.setInt(2, idade);
                preparedStatement.setString(3, cor);
                preparedStatement.setDouble(4, peso);
                preparedStatement.setString(5, caracteristicas);
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void consultar() {
        // Implementação para consultar no banco de dados
    }

    public void atualizarPerfil() {
        // Implementação para atualizar no banco de dados
    }

    public void excluir() {
        // Implementação para excluir no banco de dados
    }
}
