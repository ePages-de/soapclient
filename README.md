# Demo clients for ePages 6 web services for shops. #

## Project links ##

- Company website: http://www.epages.com/
- Source code: https://github.com/ePages-de/soapclient/
- Issue tracker: https://github.com/ePages-de/soapclient/issues
- Release repository: https://bintray.com/epages/maven/epages-soapclient/

## Requirements ##
- epages 6.11.0+

## Running integration test cases with Gradle ##

1. run "./gradlew check" (Linux) or "gradlew.cmd check" (Windows) in project folder.
2. If epages6 is not installed locally, use the
   gradle property "ep6HostName" to an epages6 installation (-Pep6HostName=somehost)

## Running test cases with Eclipse ##

1. Install "Gradle IDE" Eclipse plugin from Spring.
2. Run "File > Import... > Gradle Project"
3. Select location of soapclient source, and run "Build model"
4. Select soapclient and click Finish
5. In the Package Explorer, right-click on the project
   and select "Run As/JUnit Test".
6. If epages6 is not installed locally, use the 
   gradle property "ep6HostName" in launch configuration to point 
   to an epages6 installation (-Pep6HostName=somehost)

### The test cases use following configuration ###

- shop "DemoShop" with user "admin" with password "admin" and default content
- The feature "Program Interface for Web Services" must be enabled in the shop.
- Web service endpoint: http://<SystemDomainName>/epages/Store.soap
  the SystemDomainName comes from epages/Shared/Config/epages.conf
  but can be overridden either via command-line parameter (-Pep6HostName=somehost)

### Note ###

For backward compatibility this package also contains older versions of some
web service interfaces. New applications should use the latest version of each
web service, i.e. the one with the highest version number.
