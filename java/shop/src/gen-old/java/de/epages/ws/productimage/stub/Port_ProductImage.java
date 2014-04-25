/**
 * Port_ProductImage.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.productimage.stub;

public interface Port_ProductImage extends java.rmi.Remote {

    /**
     * check if a product image exists.
     */
    public boolean exists(java.lang.String TObjectPath, java.lang.String TFileName) throws java.rmi.RemoteException;

    /**
     * delete a list of productimages.
     */
    public de.epages.ws.productimage.model.TDelete_Return[] delete(java.lang.String TObjectPath, java.lang.String[] TListOfFileNames) throws java.rmi.RemoteException;

    /**
     * upload a lot of productimages.
     */
    public de.epages.ws.productimage.model.TUpload_Return[] upload(java.lang.String TObjectPath, de.epages.ws.productimage.model.TUpload_Input imageData) throws java.rmi.RemoteException;

    /**
     * upload a lot of productimages and scale the uploaded images.
     */
    public de.epages.ws.productimage.model.TUploadScale_Return[] uploadscale(java.lang.String TObjectPath, de.epages.ws.productimage.model.TUploadScale_Input imageData, de.epages.ws.productimage.model.TScaleParams scaleParams) throws java.rmi.RemoteException;
}
