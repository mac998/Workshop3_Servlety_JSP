package pl.coderslab.users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/user/delete")
public class UserDelete extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        getServletContext().getRequestDispatcher("/users/delete.jsp")
//                .forward(request, response);
        UserDao userDao = new UserDao();
        userDao.delete(Integer.parseInt(request.getParameter("id")));

        response.sendRedirect("/user/list");


    }
}