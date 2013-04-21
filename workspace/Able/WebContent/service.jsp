<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="able.frame.ServiceBroker;" %>
 
<%

/************************************************************************************************** 
Service Broker Bean 을 호출한다.
굳이 web.xml에 servlet 을 등록하지 않기 위해서 만들었으나, 
속도 측면에서 servlet 과 jsp 를 비교해서 속도 우선으로 선택해야 한다.  

charset은   - tomcat서버의 server.xml에 URIEncoding="UTF-8"을 추가한다.
변경 전 : <Connector connectionTimeout="20000" port="8080" protocol="HTTP/1.1" redirectPort="8443"/> 
변경 후 : <Connector connectionTimeout="20000" port="8080" protocol="HTTP/1.1" redirectPort="8443" URIEncoding="UTF-8"/>
****************************************************************************************************/  

	ServiceBroker broker = new ServiceBroker() ;
	broker.doPost(request, response) ;

%>
