package com.java.code.servlet;

import com.java.code.jdbc.StudentHomeWorkJdbc;
import com.java.code.model.Teacher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;


@WebServlet("/addTeacher")
public class AddTeacherServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");//设置编码，以防表单提交的内容乱码

        Teacher teacher = new Teacher();
        teacher.setId(Long.parseLong(req.getParameter("id")));
        teacher.setmima(req.getParameter("mima"));

        boolean result = StudentHomeWorkJdbc.addTeacher(teacher);

        req.setAttribute("isOK", result);  //用来判断是否添加作业成功
        req.setAttribute("type","addStudent");
        req.getRequestDispatcher("result.jsp").forward(req,resp);
    }
}
