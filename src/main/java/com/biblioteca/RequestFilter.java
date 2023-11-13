package com.biblioteca;

import java.io.IOException;

import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class RequestFilter implements Filter {

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain){
		HttpServletResponse response = (HttpServletResponse)req;
		HttpServletRequest reques = (HttpServletRequest)resp;
		
		response.setHeader("Access-Control-Allow-Origin","http://localhost:4200");
		response.setHeader("Access-Control-Allow-Methods","POST, PUT, GET, OPTIONS, DELETE");
		response.setHeader("Access-Control-Allow-Headers","x-requested-with");
		response.setHeader("Access-Control-Max-Age","3600");
		response.setHeader("Access-Control-Allow-Credentials", "true");
		
		if(!(reques.getMethod().equalsIgnoreCase("OPTIONS"))) {
			try {
				chain.doFilter(reques, response);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}else {
			System.out.println("Pre-flight");
			response.setHeader("Access-Control-Allow-Methods", "POST,GET,DELETE");
			response.setHeader("Access-Control-Allow-Headers", "authorization , content-type," +
			"access-control-request-headers,acess-control-request-method,accept,origin,authorization,x-requested-with");
			response.setStatus(HttpServletResponse.SC_OK);
		}
	
	}
	

}
