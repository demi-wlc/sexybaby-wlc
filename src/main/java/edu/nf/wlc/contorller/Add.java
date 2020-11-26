package edu.nf.wlc.contorller;

import edu.nf.wlc.dao.UserDao;
import edu.nf.wlc.dao.impl.UserDaoImpl;
import edu.nf.wlc.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/add")
public class Add extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        Users users = new Users();
        users.setStuname(name);
        UserDao dao = new UserDaoImpl();
        dao.add(users);
        resp.getWriter().println("成功");
    }
}
