/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyClasses;

import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

/**
 *
 * @author User
 */
public class HttpSessionListenerTest implements HttpSessionListener {
static int count;
    @Override
    public void sessionCreated(HttpSessionEvent se) {
     count++;    
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
  if(count>0)
  {
      count--;
  }
    }
    public static int getCount()
    {
        return count;
    }
    
}
