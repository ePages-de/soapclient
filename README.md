# Demo clients for ePages 6 web services for shops. #

## Project links ##

- Company website: http://www.epages.com/
- Source code: https://github.com/ePages-de/soapclient/
- Issue tracker: https://github.com/ePages-de/soapclient/issues
- Release repository: https://bintray.com/epages/maven/epages-soapclient/


## Requirements ##
- epages 6.11.0+

### The test cases use following configuration ###

- shop "DemoShop" with user "admin" with password "admin" and default content
- The feature "Program Interface for Web Services" must be enabled in the shop.
- Web service endpoint: http://<SystemDomainName>/epages/Store.soap
  the SystemDomainName comes from epages/Shared/Config/epages.conf
  but can be overridden either via command-line parameters, or via config
  files. See README.md for the subprojects.


  perl\WebServiceConfiguration.pm
  java\src\de\epages\WebServices\WebServiceConfiguration.java
  .net\EpagesWebServices\WebServiceConfiguration.cs

### Note ###

For backward compatibility this package also contains older versions of some
web service interfaces. New applications should use the latest version of each
web service, i.e. the one with the highest version number.
