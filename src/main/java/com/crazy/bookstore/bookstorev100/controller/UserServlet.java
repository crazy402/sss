package com.crazy.bookstore.bookstorev100.controller;

import com.crazy.bookstore.bookstorev100.pojo.User;
import com.crazy.bookstore.bookstorev100.utils.MD5Util;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet(name = "user", value = "/user")
public class UserServlet extends BaseServlet {

    protected void toLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processTemplate("user/user", request, response);
    }

    protected void doLogin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Map<String, String[]> map = request.getParameterMap();

        User user = new User();

        try {
            BeanUtils.populate(user, map);

            user.setPassword(MD5Util.encode(user.getPassword()));

            HttpSession session = request.getSession();

            session.setAttribute("user", user);

            processTemplate("user/login_success", request, response);

        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }



}
