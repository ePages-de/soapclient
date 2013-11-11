This web service implementation with Java uses:
- JDK 1.6.0 Standard Edition
  See http://java.sun.com/j2se/1.6.0/download.jsp

- the Apache AXIS Web Service Framework (version 1.3)
  See http://ws.apache.org/axis/java/releases.html

- the JUnit Test Framework (version 4.1)
  See http://www.junit.org/ for more information.
  
Running test cases with Eclipse version 3.x (http://www.eclipse.org/)
1. In the Package Explorer, right-click and select "New/Project...".
2. Select "Java Project", click "Next".
3. Enter the project name "WebServiceExamples",
   choose "Create project from existing source" and select the directory 
   "WS_DemoClients/java" and click "Finish" to create the project.
4. In the Package Explorer, right-click on the project name "WebServiceExamples"
   and select "Run As/JUnit Test".


The command script generateStubs.cmd is used once to create stub classes
from WSDL files.