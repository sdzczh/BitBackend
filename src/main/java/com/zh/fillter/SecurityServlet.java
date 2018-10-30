package com.zh.fillter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.zh.util.StrUtils;

public class SecurityServlet extends HttpServlet implements Filter{
	 private static final long serialVersionUID = 1L;
	 private String excludedPages;
	 private String[] excludedPageArray;

	 
	    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
			HttpServletRequest req = (HttpServletRequest) request;
			HttpServletResponse res = (HttpServletResponse) response;
			HttpSession session = req.getSession();
			String name = String.valueOf(session.getAttribute("adminName"));

			boolean isExcludedPage = false;
			for (String page : excludedPageArray) {
				if (((HttpServletRequest) req).getServletPath().equals(page)) {
					isExcludedPage = true;
					chain.doFilter(req, res);
					return;
				}
			}
			if (isExcludedPage){
				chain.doFilter(req, res);
			}else{
					String url=req.getRequestURI();   
					boolean flg = true;
					if(url.indexOf("login")<0){
						if(name.equals("admin")){
							flg = false;
						}
						if(flg){
							res.sendRedirect(req.getContextPath()+"/user/exit.action");
						}else{
							chain.doFilter(req, res);
						}
					}else{
						chain.doFilter(req, res);
					}
			}			

	    }


		public void init(FilterConfig fConfig) throws ServletException {
			excludedPages = fConfig.getInitParameter("excludedPages");
			if (!StrUtils.isBlank(excludedPages)) {
				excludedPageArray = excludedPages.split(",");
			}
		}

}
