package com.xyz.cloudplatform.web.base;

import com.xyz.cloudplatform.common.util.DESEncryptUtils;
import com.xyz.cloudplatform.common.util.Md5EncryptUtils;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Administrator on 2017/7/21.
 */
public class BaseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getOutputStream().print(Md5EncryptUtils.encryptMd5("123456"));
        DESEncryptUtils.getDesStr("12121212");
    }
}
