package edu.nf.wlc.contorller;

import com.google.gson.Gson;
import edu.nf.wlc.dao.UserDao;
import edu.nf.wlc.dao.impl.UserDaoImpl;
import edu.nf.wlc.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
@WebServlet("/list")
public class list extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserDao dao = new UserDaoImpl();
        List<Users> list = dao.list();
        String json = new Gson().toJson(list);
        resp.setContentType("application/json;charset=utf-8");
        resp.getWriter().println(json);
    }
}
