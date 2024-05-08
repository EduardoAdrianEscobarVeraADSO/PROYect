/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.UsuarioDAO;
import model.UsuarioModel;

/**
 *
 * @author Propietario
 */

@WebServlet("/login/loginSV")
public class LoginServlet extends HttpServlet {
    // Métodos doPost, doGet, u otros según sea necesario
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    // Obtener los parámetros del formulario de inicio de sesión
    String CorreoElectronico = request.getParameter("userEmail");
    String contraseña = request.getParameter("userPassword");
    
    // Implementar la lógica de autenticación
    UsuarioDAO usuarioDAO = new UsuarioDAO(); // Suponiendo que tienes una clase DAO para manejar la interacción con la base de datos
        UsuarioModel usuarioModel = usuarioDAO.buscarUsuario(CorreoElectronico);
    
    if (usuarioModel != null && usuarioModel.getContrasena().equals(contraseña)) {
        // Autenticación exitosa
        HttpSession session = request.getSession();
        session.setAttribute("usuario", usuarioModel); // Guardar el usuario en la sesión
        response.sendRedirect("../index.jsp"); // Redirigir a la página de inicio de sesión exitosa
    } else {
        // Autenticación fallida
        response.sendRedirect("inicio_sesion.jsp"); // Redirigir a la página de error de inicio de sesión
    }
}
}

