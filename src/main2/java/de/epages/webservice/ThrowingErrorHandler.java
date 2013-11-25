package de.epages.webservice;

import javax.xml.ws.WebServiceException;

public class ThrowingErrorHandler implements ErrorHandler {

    @Override
    public void handle(Object source, String errorMessage) {
        throw new WebServiceException("Webservice threw error message: " + errorMessage); 
    }

}
