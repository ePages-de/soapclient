h1. Java SOAP Client for ePages6

h2. This web service implementation with Java uses:

- JDK 1.7.0 Standard Edition
  See http://java.oracle.com/j2se/

- the Apache Axis Web Service Framework (version 1.4)
  See http://axis.apache.org/axis/

- the JUnit Test Framework (version 4)
  See http://www.junit.org/

- Gradle build tool (version 1.x)
  See http://www.gradle.org/

h2. Running test cases with Gradle (http://www.gradle.org/)

1. run "./gradlew test" (Linux) or "gradlew.cmd test" (Windows) in project folder.
2. If epages6 is not installed locally, use the
   system property "ep6HostName" to an epages6 installation (-Dep6HostName=somehost)

h2. Running test cases with Eclipse (http://www.eclipse.org/)

1. Install "Gradle IDE" Eclipse plugin from Spring.
2. Run "File > Import... > Gradle Project"
3. Select location of soapclient source, and run "Build model"
4. Select soapclient and click Finish
5. In the Package Explorer, right-click on the project
   and select "Run As/JUnit Test".
6. If epages6 is not installed locally, use the 
   system property "ep6HostName" in launch configuration to point 
   to an epages6 installation (-Dep6HostName=somehost)

h2. Regenerating stub classes

1. run "./gradlew axisGen" (Linux) or "gradlew.cmd axisGen" (Windows) in project folder.
2. If epages6 is not installed locally, use the
   system property "ep6HostName" to an epages6 installation (-Dep6HostName=somehost)
