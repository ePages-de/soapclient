#!/bin/bash
#
# Generate JAVA stubs.
#
# $Id: generateStubs.sh,v 1.6 2013/01/22 22:53:04 ttester Exp $


export CLASSPATH=lib/axis.jar:lib/commons-logging-1.0.4.jar:lib/commons-discovery-0.2.jar:lib/jaxrpc.jar:lib/saaj.jar:lib/wsdl4j-1.5.1.jar
WSDL2JAVA='java org.apache.axis.wsdl.WSDL2Java -o src/main/java'
echo $WSDL2JAVA


for WEBSERVICE in \
AssignmentService \
CatalogService \
CatalogService2 \
CatalogService3 \
CrossSellingService \
CrossSellingService2 \
CustomerGroupService \
CustomerService \
CustomerService2 \
CustomerService3 \
OrderDocumentService \
OrderDocumentService2 \
OrderDocumentService3 \
OrderDocumentService4 \
OrderDocumentService5 \
OrderService \
OrderService2 \
OrderService3 \
OrderService4 \
OrderService5 \
OrderService6 \
OrderService7 \
PageCacheService \
PriceListAssignmentService \
PriceListService \
PriceListService2 \
ProductAttributeService \
ProductAttributeService2 \
ProductBundleService \
ProductImageService \
ProductService \
ProductService2 \
ProductService3 \
ProductService5 \
ProductService6 \
ProductService7 \
ProductService8 \
ProductService9 \
ProductService10 \
ProductService11 \
ProductTypeService \
ProductTypeService2 \
TaxAreaService \
TaxClassService \
UserService \
UserService \
UserService2 \
UserService3 \
ShippingMethodService \
PaymentMethodService \
 ; do
   echo $WEBSERVICE
   $WSDL2JAVA -p de.epages.WebServices.$WEBSERVICE.Stub -v ../wsdl/$WEBSERVICE.wsdl
done