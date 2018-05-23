# CustomerService

CustomerService 

 What is it?
 ===========

 This project is built using Java EE 7 touching on JSF 2.2, DI 1.0, CDI 1.1,
 EJB 3.2, Bean Validation 1.1, Unified Expression Language 3.0, JAX-RS 2.0, JTA 1.2,
 JAX-WS and JPA 2.1 that can run on a certified application server (Complete
 or Web Profile). A persistence unit is defined and most of the database datasource
 for this project is defined in the tomee.xml residing in the conf folder of a Tomee server. 

 NB: Make sure you have MySQL database installed on your machine or whichever database of your choice and the relevant drivers
 see http://tomee.apache.org/containers-and-resources.htm
 Database configuration that needs to be copied into the ${CATALINA_HOME}/conf/tomee.xml 
 ===================

    <Resource id="customerApp" type="DataSource">
    JdbcDriver          com.mysql.jdbc.Driver
    JdbcUrl             jdbc:mysql://127.0.0.1:3306/customer
    UserName            user
    Password            password
    JtaManaged          true
    DefaultAutoCommit   false
    </Resource>
    
 System requirements
 ===================

 All you need to run this project is Java 5.0 (Java SDK 1.5) or greater and
 Maven 2.0.10 or greater. This application is setup to be run on a Java EE 7
 certified application server. It has been tested with Tomee plus 7.0.0 M1

 To deploy the application to a standalone Servlet Container, then
 you will need to set one up. 


 Deploying the application
 =========================


 Start Tomee. The application will be running at the following URL:

 http://localhost:8080/customer

 
TODO : Take out server specific configuration so anyone can use and configure for standalone server
====

 Resources
 =========
https://www.jdev.it/encrypting-passwords-in-tomcat/

Tomcat Password Encryption(For encrypting your password so it is not clear plain text for your datasource)
Let's always follow good practice ;)
