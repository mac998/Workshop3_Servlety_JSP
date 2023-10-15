package pl.coderslab.users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/user/add")
public class UserAdd extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        getServletContext().getRequestDispatcher("/users/add.jsp")
                .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println(request.getParameter("userName"));
        System.out.println(request.getParameter("email"));
        System.out.println(request.getParameter("password"));

        User user = new User(
                null,
                request.getParameter("userName"),
                request.getParameter("email"),
                request.getParameter("password")
        );
        UserDao userDao = new UserDao();
        userDao.create(user);

        request.setAttribute("userCreated", true);

        response.sendRedirect("/user/list");


    }
}