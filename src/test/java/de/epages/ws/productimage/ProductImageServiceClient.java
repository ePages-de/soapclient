/**
 * Port_Basket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package de.epages.ws.productimage;

import de.epages.ws.productimage.model.TDelete_Return;
import de.epages.ws.productimage.model.TScaleParams;
import de.epages.ws.productimage.model.TUploadScale_Input;
import de.epages.ws.productimage.model.TUploadScale_Return;
import de.epages.ws.productimage.model.TUpload_Input;
import de.epages.ws.productimage.model.TUpload_Return;
import de.epages.ws.productimage.stub.Port_ProductImage;

public interface ProductImageServiceClient extends Port_ProductImage {

    /**
     * check if a product image exists.
     */
    public boolean exists(String TObjectPath, String TFileName);

    /**
     * delete a list of productimages.
     */
    TDelete_Return[] delete(String TObjectPath, String[] TListOfFileNames);

    /**
     * upload a lot of productimages.
     */
    TUpload_Return[] upload(String TObjectPath, TUpload_Input imageData);

    /**
     * upload a lot of productimages and scale the uploaded images.
     */
    TUploadScale_Return[] uploadscale(String TObjectPath, TUploadScale_Input imageData, TScaleParams scaleParams);

}
