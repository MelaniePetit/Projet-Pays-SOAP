
/**
 * PaysServiceMonExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.7.6  Built on : Jul 30, 2017 (09:08:31 BST)
 */

package ws;

public class PaysServiceMonExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1505985436765L;
    
    private ws.PaysServiceStub.PaysServiceMonException faultMessage;

    
        public PaysServiceMonExceptionException() {
            super("PaysServiceMonExceptionException");
        }

        public PaysServiceMonExceptionException(java.lang.String s) {
           super(s);
        }

        public PaysServiceMonExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public PaysServiceMonExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(ws.PaysServiceStub.PaysServiceMonException msg){
       faultMessage = msg;
    }
    
    public ws.PaysServiceStub.PaysServiceMonException getFaultMessage(){
       return faultMessage;
    }
}
    