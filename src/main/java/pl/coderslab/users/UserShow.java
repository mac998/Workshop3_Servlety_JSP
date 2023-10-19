package pl.coderslab.users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/show")
public class UserShow extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao userDao = new UserDao();
        String id = request.getParameter("id");

        User user = userDao.read(Integer.parseInt(id));
        request.setAttribute("user", user);

        getServletContext().getRequestDispatcher("/users/show.jsp")
                .forward(request, response);

//        response.sendRedirect("/user/list");
    }
}







