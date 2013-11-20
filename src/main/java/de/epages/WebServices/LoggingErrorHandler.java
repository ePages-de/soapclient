package de.epages.WebServices;

import java.rmi.RemoteException;

import org.slf4j.Logger;

public class LoggingErrorHandler implements ErrorHandler {

    private final Logger log;

    public LoggingErrorHandler(Logger log) {
        this.log = log;
    }

    @Override
    public void handle(Object source, String errorMessage) throws RemoteException {
        log.error("Webservice threw an error: " + errorMessage);
    }

}
