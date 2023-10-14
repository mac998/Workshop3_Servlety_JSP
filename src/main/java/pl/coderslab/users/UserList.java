package pl.coderslab.users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Arrays;

@WebServlet("/user/list")
public class UserList extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        var users = userDao.findAll();

        Arrays.asList(users).forEach(System.out::println);

        request.setAttribute("users", userDao.findAll());

        getServletContext().getRequestDispatcher("/users/list.jsp")
                .forward(request, response);
    }
}
