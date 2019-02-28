package junit;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

import org.apache.catalina.core.ApplicationContext;
import org.apache.catalina.core.StandardContext;
import org.junit.Test;

import test.App;

public class DoPostTest {
   
@Test
  public final void callDoPost() {
   App app = new App();
   ServletRequest rqst = null;
   ServletResponse resp = null;
   HttpServletRequestWrapper rqstWrapper = new HttpServletRequestWrapper((HttpServletRequest) rqst);
   HttpServletResponseWrapper respWrapper = new HttpServletResponseWrapper((HttpServletResponse) resp);

   
   
   try {
      app.service(rqstWrapper, respWrapper);
   } catch (ServletException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
   } catch (IOException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
   }
     
  }

}
