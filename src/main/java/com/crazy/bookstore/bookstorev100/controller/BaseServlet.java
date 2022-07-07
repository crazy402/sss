package com.crazy.bookstore.bookstorev100.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.lang.reflect.Method;


public class BaseServlet extends ViewBaseServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //获取method请求参数，方法名，反射调用方法
        try {
            //获取客户的请求参数method键
            String method = request.getParameter("method");
            //反射调！ method 获取的请求参数，就是方法名
            Class clazz = this.getClass();
            //获取方法 DeclaredMethod，没继承的方法，有私有
            Method m = clazz.getDeclaredMethod
                    (method, HttpServletRequest.class, HttpServletResponse.class);
            //运行方法
            m.invoke(this, request, response);
        }catch (Exception ex){ex.printStackTrace();}
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doGet(request, response);
    }
}
