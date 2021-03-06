package com.gdut.ds.utils;

import java.net.InetAddress;
import java.net.UnknownHostException;

import javax.servlet.http.HttpServletRequest;

public class IPOperations {

	
	
	/*
	 * 获取客户端真正的IP地址
	 */
	public static String getClientIP(HttpServletRequest httpservletrequest) {  
	    if (httpservletrequest == null)  
	        return null;  
	    String s = httpservletrequest.getHeader("X-Forwarded-For");  
	    if (s == null || s.length() == 0 || "unknown".equalsIgnoreCase(s))  
	        s = httpservletrequest.getHeader("Proxy-Client-IP");  
	    if (s == null || s.length() == 0 || "unknown".equalsIgnoreCase(s))  
	        s = httpservletrequest.getHeader("WL-Proxy-Client-IP");  
	    if (s == null || s.length() == 0 || "unknown".equalsIgnoreCase(s))  
	        s = httpservletrequest.getHeader("HTTP_CLIENT_IP");  
	    if (s == null || s.length() == 0 || "unknown".equalsIgnoreCase(s))  
	        s = httpservletrequest.getHeader("HTTP_X_FORWARDED_FOR");  
	    if (s == null || s.length() == 0 || "unknown".equalsIgnoreCase(s))  
	        s = httpservletrequest.getRemoteAddr();  
	    if ("127.0.0.1".equals(s) || "0:0:0:0:0:0:0:1".equals(s))  
	        try {  
	            s = InetAddress.getLocalHost().getHostAddress();  
	        }  
	        catch (UnknownHostException unknownhostexception) {  
	        }  
	    return s;  
	}  
	
}
