package kr.co.fastcampus.web;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Slf4j
//web.xml이 아닌 annotation으로만 설정하여 실행가능.
@WebServlet(
        name = "simple",
        urlPatterns = "simple"
)
public class SimpleServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        PrintWriter writer = resp.getWriter();
        writer.println("Yahoo~~~");
    }
}
