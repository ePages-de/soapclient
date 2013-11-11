/**
 * Port_ProductImage_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.ProductImageService.Stub;

public interface Port_ProductImage_PortType extends java.rmi.Remote {

    /**
     * check if a product image exists.
     */
    public boolean exists(java.lang.String TObjectPath, java.lang.String TFileName) throws java.rmi.RemoteException;

    /**
     * delete a list of productimages.
     */
    public de.epages.WebServices.ProductImageService.Stub.TDelete_Return[] delete(java.lang.String TObjectPath, java.lang.String[] TListOfFileNames) throws java.rmi.RemoteException;

    /**
     * upload a lot of productimages.
     */
    public de.epages.WebServices.ProductImageService.Stub.TUpload_Return[] upload(java.lang.String TObjectPath, de.epages.WebServices.ProductImageService.Stub.TUpload_Input imageData) throws java.rmi.RemoteException;

    /**
     * upload a lot of productimages and scale the uploaded images.
     */
    public de.epages.WebServices.ProductImageService.Stub.TUploadScale_Return[] uploadscale(java.lang.String TObjectPath, de.epages.WebServices.ProductImageService.Stub.TUploadScale_Input imageData, de.epages.WebServices.ProductImageService.Stub.TScaleParams scaleParams) throws java.rmi.RemoteException;
}
