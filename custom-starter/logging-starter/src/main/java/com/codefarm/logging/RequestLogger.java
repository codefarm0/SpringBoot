package com.codefarm.logging;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component
@WebFilter("/*")
public class RequestLogger implements Filter {

    private final Logger logger = LoggerFactory.getLogger(RequestLogger.class);
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest)servletRequest;

        logger.info("Requested endpoint - {} {}", request.getMethod(), request.getRequestURI());

        filterChain.doFilter(request, servletResponse);
    }
}
