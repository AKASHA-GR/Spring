package com.xworkz.servlet;

import com.xworkz.dto.RegisterDTO;
import com.xworkz.service.RegisterService;
import com.xworkz.service.impl.RegisterServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/ToRegister")
public class RegisterServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doGet in RegisterServlet");
        RequestDispatcher requestDispatcher = req.getRequestDispatcher("register.jsp");
        requestDispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("doPost in RegisterServlet");
        RegisterDTO registerDTO = new RegisterDTO();
        registerDTO.setName(req.getParameter("name"));
        registerDTO.setEmail(req.getParameter("email"));
        registerDTO.setPassword(req.getParameter("password"));
        registerDTO.setConfirmPassword(req.getParameter("confirmPassword"));
        registerDTO.setPhoneNumber(Long.parseLong(req.getParameter("phoneNumber")));
        registerDTO.setAccountNumber(Long.parseLong(req.getParameter("accountNumber")));

        System.out.println(registerDTO);

        RegisterService registerService = new RegisterServiceImpl();
        Boolean result = registerService.validateAndSave(registerDTO);

        if(result == true){
            System.out.println("Register is saved successfully");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("register.jsp");
            requestDispatcher.forward(req,resp);
        }else {
            System.out.println("RegisterDTO is not saved");
            RequestDispatcher requestDispatcher = req.getRequestDispatcher("index.jsp");
            requestDispatcher.forward(req,resp);
        }

    }
}
