package com.niit.backendc3s4mc.filter;

import io.jsonwebtoken.Jwts;
import org.springframework.web.filter.GenericFilterBean;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class JwTockenFilter extends GenericFilterBean {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest httpServletRequest = (HttpServletRequest) servletRequest;
        HttpServletResponse httpServletResponse = (HttpServletResponse) servletResponse;
        ServletOutputStream sos = httpServletResponse.getOutputStream();
        String authHeader = httpServletResponse.getHeader("Authorization");
        if(authHeader == null || !authHeader.startsWith("Bearer")){
            httpServletResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            sos.print("User Logged in Successfully");
            sos.close();
        }else{
            String jwTocken = authHeader.substring(7);
            String username = Jwts.parser().setSigningKey("securityKey").parseClaimsJws(jwTocken).getBody().getSubject();
            httpServletRequest.setAttribute("userName",username);
             filterChain.doFilter(servletRequest, servletResponse);
        }

    }
}
