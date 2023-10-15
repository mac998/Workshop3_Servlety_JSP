package pl.coderslab.users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/edit")
public class UserEdit extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        String id = request.getParameter("id");

        User user = userDao.read(Integer.parseInt(id));
        request.setAttribute("user", user);

        System.out.println(user);


        getServletContext().getRequestDispatcher("/users/edit.jsp")
                .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        User user = new User(
                null,
                request.getParameter("email"),
                request.getParameter("userName"),
                request.getParameter("password")
        );
        UserDao userDao = new UserDao();

        String id = request.getParameter("id");

        System.out.println(user);

        userDao.update(Integer.parseInt(id), user);

        response.sendRedirect("/user/list");


    }
}

