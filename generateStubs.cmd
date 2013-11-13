SET WSDL2JAVA=java -classpath lib/axis.jar;lib/commons-logging-1.0.4.jar;lib/commons-discovery-0.2.jar;lib/jaxrpc.jar;lib/saaj.jar;lib/wsdl4j-1.5.1.jar org.apache.axis.wsdl.WSDL2Java -o src

IF (%1)==() goto ALL
%WSDL2JAVA% -p de.epages.WebServices.%1.Stub -o src/main/java -v ..\wsdl\%1.wsdl
goto END

:ALL
for %%s in (
  AssignmentService
  CatalogService
  CatalogService2
  CatalogService3
  CatalogService4
  CatalogService5
  CatalogService6
  CrossSellingService
  CrossSellingService2
  CustomerGroupService
  CustomerGroupService2
  CustomerService
  CustomerService2
  CustomerService3
  CustomerService4
  OrderDocumentService
  OrderDocumentService2
  OrderDocumentService3
  OrderDocumentService4
  OrderDocumentService5
  OrderDocumentService6
  OrderDocumentService7
  OrderService
  OrderService2
  OrderService3
  OrderService4
  OrderService5
  OrderService6
  OrderService7
  OrderService8
  OrderService9
  PageCacheService
  PriceListAssignmentService
  PriceListService
  PriceListService2
  ProductAttributeService
  ProductAttributeService2
  ProductBundleService
  ProductImageService
  ProductService
  ProductService2
  ProductService3
  ProductService5
  ProductService6
  ProductService7
  ProductService8
  ProductService9
  ProductService10
  ProductService11
  ProductTypeService
  ProductTypeService2
  TaxAreaService
  TaxClassService
  UserService
  UserService
  UserService2
  UserService3
  UserService4
  UserService5
  ShippingMethodService
  PaymentMethodService
) do (
  %WSDL2JAVA% -p de.epages.WebServices.%%s.Stub -v ..\wsdl\%%s.wsdl
)

:END
