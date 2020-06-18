package com.java.code.servlet;

import com.java.code.jdbc.StudentHomeWorkJdbc;
import com.java.code.model.Student;
import com.java.code.model.Teacher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;


@WebServlet("/login")
public class loginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建输入的学生对象
        Student student = new Student();
       student.setId(Long.parseLong(req.getParameter("id")));
        student.setmima(req.getParameter("mima"));
        //从数据库读取所有学生
        boolean result = StudentHomeWorkJdbc.showStudent(student.getId(),student.getmima());

        req.setAttribute("isOK", result);
        req.setAttribute("type","loginStudent");
        req.getRequestDispatcher("result.jsp").forward(req,resp);
    }
}
