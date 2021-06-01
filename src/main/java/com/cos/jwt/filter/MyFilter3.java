package com.cos.jwt.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class MyFilter3 implements Filter {

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        System.out.println("필터3");

        HttpServletRequest req = (HttpServletRequest) request;
        HttpServletResponse res = (HttpServletResponse) response;

        // id,pw가 정상적으로 들어와서 로그인이 완료되면 토큰을 만들어주고 응답
        // 요청할 때마다 header에 Authorization에 value값으로 토큰을 가져오면
        // 이 토큰이 내가 만든 토큰이 맞는지만 검증하면됨 (RSA, HS256)
        if(req.getMethod().equals("POST")){
            String headerAuth = req.getHeader("Authorization");
            System.out.println(headerAuth);

            if(headerAuth.equals("ridiss")){
                chain.doFilter(req,res);
            } else {
                PrintWriter out = res.getWriter();
                out.println("인증안됨");
            }
        }



    }
}
