package com.study;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author zhangpba
 * @description TODO HttpServlet的doPost和doGet测试： 只要用了HttpServlet这个类，将其打包，放在tomcat容器中启动，就可以直接访问这个类中的get\post\put\delet等方法了
 * @date 2022/10/9
 * <p>
 * Servlet API 详解——HttpServlet
 *      https://blog.csdn.net/qq_56884023/article/details/125684506
 * IDEA部署servlet项目
 *      https://blog.csdn.net/TYJ20170916/article/details/126255764
 *
 * 用tomcat插件启动项目：
 * 1、加依赖
 *             <groupId>javax.servlet</groupId>
 *                  <artifactId>javax.servlet-api</artifactId>
 *             <version>4.0.1</version>
 * 2、修改build
 * 3、写测试代码 （this class）
 * 4、在idea右侧找到【tomcat7 --> tomcat7:run --> 右键 --> debug|run 】启动测试
 * 5、在postman中分别用GET、POST、PUT、DELETE进行请求：   http://127.0.0.1:80/method
 * 注意：tomcat中要加上解压的项目路径：http://127.0.0.1:8080/study-servlet-1.0-SNAPSHOT/method
 *
 * 遗留问题：
 *  1、手写spring
 *  2、HttpServlet的使用
 */
@WebServlet("/method")
public class MyHttpServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
//        super.doGet(req, resp);
        resp.setCharacterEncoding("UTF-8"); // 响应设置编码格式
        System.out.println("GET 响应");
        resp.getWriter().write("GET 响应");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPost(req, resp);
        resp.setCharacterEncoding("UTF-8"); // 响应设置编码格式
        resp.getWriter().write("POST 响应");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doPut(req, resp);
        resp.setCharacterEncoding("UTF-8"); // 响应设置编码格式
        resp.getWriter().write("PUT 响应");
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doDelete(req, resp);
        resp.setCharacterEncoding("UTF-8"); // 响应设置编码格式
        resp.getWriter().write("DELETE 响应");
    }
}
