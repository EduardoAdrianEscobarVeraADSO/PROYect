/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.exchange.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import java.sql.*;

/**
 *
 * @author Propietario
 */
public class  Registro_usuario  extends HttpServlet {
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String nombreUsuario = request.getParameter("userName");
        String correoElectronico = request.getParameter("userEmail");
        String contraseña = request.getParameter("userPassword");

        // Aquí puedes realizar la validación de los datos del formulario
        
        // Luego, inserta el nuevo usuario en la base de datos
        String url = "jdbc:mysql://localhost:3306/proyect";
        String usuarioBD = "root";
        String contraseñaBD = "";

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, usuarioBD, contraseñaBD);
            PreparedStatement pstmt = conn.prepareStatement("INSERT INTO usuarios (ID_usuario, correo_electronico, contraseña) VALUES (?, ?, ?)");
            pstmt.setString(1, nombreUsuario);
            pstmt.setString(2, correoElectronico);
            pstmt.setString(3, contraseña);
            pstmt.executeUpdate();
            conn.close();
            // Redireccionar a una página de éxito o mostrar un mensaje de éxito
            response.sendRedirect("registro_exitoso.jsp");
        } catch (Exception e) {
            // Manejar cualquier error
            e.printStackTrace();
            // Redireccionar a una página de error o mostrar un mensaje de error
            response.sendRedirect("registro_error.jsp");
        }
    }
}

