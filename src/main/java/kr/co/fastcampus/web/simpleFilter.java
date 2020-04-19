package kr.co.fastcampus.web;

import lombok.extern.slf4j.Slf4j;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;


@Slf4j
@WebFilter(
        filterName = "simplefileter",
        urlPatterns = "simple"
)
public class simpleFilter implements Filter {
    public void doFilter(ServletRequest servletRequest,
                         ServletResponse servletResponse,
                         FilterChain chain) throws IOException, ServletException {
        
//        log.  info("fiter-start");
        HttpSession session = ((HttpServletRequest)servletRequest).getSession();

        String userName = (String)session.getAttribute("username");

        chain.doFilter(servletRequest,servletResponse);
        PrintWriter writer = servletResponse.getWriter();
        writer.println("filter-helloWorld");

    }
}
