package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UsuarioModel;
import model.UsuarioDAO;

@WebServlet("/login/registro")
public class RegistroServlet extends HttpServlet {

    /**
     *
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Obtener los datos del formulario
        String nombreUsuario = request.getParameter("userName");
        String correoElectronico = request.getParameter("userEmail");
        String contrasena = request.getParameter("userPassword");
       
        System.out.println(nombreUsuario);
        System.out.println(correoElectronico);
        System.out.println(contrasena);
       
        // Crear un objeto Usuario con los datos del formulario
        UsuarioModel usuarioModel = new UsuarioModel(nombreUsuario, correoElectronico, contrasena);
       
        // Insertar el usuario en la base de datos
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        boolean registroExitoso = usuarioDAO.insertarUsuario(usuarioModel);
       
        // Redireccionar a una página de confirmación o mostrar un mensaje de error
        if (registroExitoso) {
            response.sendRedirect("../index.jsp");
        } else {
            response.sendRedirect("inicio_sesion.jsp");
        }
    }
}