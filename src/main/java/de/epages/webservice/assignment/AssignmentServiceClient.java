package de.epages.webservice.assignment;

import de.epages.webservice.assignment.model.TAssignProductToCatalog_Input;
import de.epages.webservice.assignment.model.TAssignProductToCatalog_Return;
import de.epages.webservice.assignment.model.TGetCatalogsAssignedToProduct_Return;
import de.epages.webservice.assignment.model.TGetProductsAssignedToCatalog_Return;
import de.epages.webservice.assignment.model.TIsProductAssignedToCatalog_Input;
import de.epages.webservice.assignment.model.TIsProductAssignedToCatalog_Return;
import de.epages.webservice.assignment.model.TRemoveProductFromCatalog_Input;
import de.epages.webservice.assignment.model.TRemoveProductFromCatalog_Return;
import de.epages.webservice.assignment.stub.Port_Assignment;

public interface AssignmentServiceClient extends Port_Assignment {

    /**
     * assign products to catalogs
     */
    TAssignProductToCatalog_Return[] assignProductToCatalog(TAssignProductToCatalog_Input[] assignments);

    /**
     * unassign a product from a catalog
     */
    TRemoveProductFromCatalog_Return[] removeProductFromCatalog(TRemoveProductFromCatalog_Input[] assignments);

    /**
     * check if a product is assigned to a catalog
     */
    TIsProductAssignedToCatalog_Return[] isProductAssignedToCatalog(TIsProductAssignedToCatalog_Input[] assignments);

    /**
     * get products assigned to a catalog
     */
    TGetProductsAssignedToCatalog_Return[] getProductsAssignedToCatalog(String[] catalogs);

    /**
     * get catalogs the product is assigned to
     */
    TGetCatalogsAssignedToProduct_Return[] getCatalogsAssignedToProduct(String[] products);

}
