package com.java.code.servlet;

import com.java.code.jdbc.StudentHomeWorkJdbc;
import com.java.code.model.Teacher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/tlogin")
public class tloginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建输入的老师对象
        Teacher teacher = new Teacher();
        teacher.setId(Long.parseLong(req.getParameter("id")));
        teacher.setmima(req.getParameter("mima"));
        //从数据库读取所有老师
        boolean result = StudentHomeWorkJdbc.showTeacher(teacher.getId(),teacher.getmima());

        req.setAttribute("isOK", result);
        req.setAttribute("type","loginTeacher");
        req.getRequestDispatcher("result.jsp").forward(req,resp);
    }
}
