/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Propietario
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    private final Connection conexion;

    public UsuarioDAO() {
        conexion = config.conexion.getConnection(); // Obtener la conexión a la base de datos
        if (conexion == null) {
            System.err.println("Error al conectar a la base de datos");
            // Aquí puedes lanzar una excepción o manejar el error de alguna otra manera
        }
    }

    public boolean insertarUsuario(UsuarioModel empleadoModel) {
        String sql = "INSERT INTO usuarios (nombre, correo, contraseña) VALUES (?, ?, ?)";
        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, empleadoModel.getNombreUsuario());
            ps.setString(2, empleadoModel.getCorreoElectronico());
            ps.setString(3, empleadoModel.getContrasena());
            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    public UsuarioModel buscarUsuario(String nombreUsuario) {
        UsuarioModel usuarioModel = null;
        String sql = "SELECT * FROM usuarios WHERE correo = ?";

        try (PreparedStatement ps = conexion.prepareStatement(sql)) {
            ps.setString(1, nombreUsuario);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    // Se encontró un usuario con el nombre de usuario proporcionado
                    // Crear un objeto Usuario con los datos obtenidos de la base de datos
                    usuarioModel = new UsuarioModel(
                        rs.getString("ID_usuario"),
                        rs.getString("correo"),
                        rs.getString("contraseña")
                        // Agregar otros atributos del usuario según sea necesario
                    );
                }
            }
        } catch (SQLException e) {
            // Manejar cualquier excepción de SQL
            e.printStackTrace();
        }

        return usuarioModel;
    }
}