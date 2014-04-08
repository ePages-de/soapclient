# Java SOAP Client for ePages6 #

## This web service implementation with Java uses: ##

- JDK 1.7.0 Standard Edition
  See http://java.oracle.com/j2se/

- the Apache Axis Web Service Framework (version 1.4)
  See http://axis.apache.org/axis/

- the JUnit Test Framework (version 4)
  See http://www.junit.org/

- Gradle build tool (version 1.x)
  See http://www.gradle.org/

## Using epages-soapclient as SDK ##

1. Include jCenter to your maven repository resolution (http://jcenter.bintray.com)
   For gradle this could look like:    
```
repositories {
    maven { url 'http://jcenter.bintray.com' }
}
```

2. Add a dependency to epages-soapclient. 
```
dependencies {
    compile 'de.epages:soapclient:1.4.13'
}
```

## Regenerating stub classes ##

1. run "./gradlew java:generate" (Linux) or "gradlew.cmd java:generate" (Windows) in root-project folder.
2. If epages6 is not installed locally, use the
   gradle property "wsdlBaseUrl" to point to a WSDL directory or an epages6 
   installation (-PwsdlBaseUrl=http://somehost/WebRoot/WSDL/)
3. If you only want to regenerate a specific webservice, pass the gradle property 
   onlyThisService (-PonlyThisService=ProductTypeService2)
