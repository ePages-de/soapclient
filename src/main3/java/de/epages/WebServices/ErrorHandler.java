package de.epages.WebServices;

import java.rmi.RemoteException;

public interface ErrorHandler {

    void handle(Object source, String errorMessage) throws RemoteException;

}
