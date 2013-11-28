package de.epages.WebServices;

import java.rmi.RemoteException;

public class ThrowingErrorHandler implements ErrorHandler {

    @Override
    public void handle(Object source, String errorMessage) throws RemoteException {
        throw new RemoteException("Webservice threw error message: " + errorMessage); 
    }

}
