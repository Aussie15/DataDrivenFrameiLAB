# DataDrivenFrameiLAB
Description of the automation test are as follows:

===Java Folder====
1.The main test is in the java folder, in there you can find my testBase folder which has the chromeDriver as well as my functions I created.
2.You will also be able to see the testcases of multiple tests that I have practiced on but the main one at hand is "ILabAssessment", any questions on the test you are free to contact me at any time.
3.NOTE: when running the test in chrome you will get something like this appear a few times "[1589809856.197][SEVERE]: Timed out receiving message from renderer: 0.100" reason for that is I inserted log4j properties and in that property folder there are rolling appenders which has that appear multiple times, not to worry test still runs as per usual. It is used to give me an accurate output reading.
4.In the utilities folder you will find a screenshot method as well as reading an excel sheet with data in them.


===Resource Folder===
1.In the resource folder you will find the excel sheet, logs properties, runners etc. As spoken before in the above mentioned Log4j properties which is initially suppose to go in the properties file, will get to that at a later stage. In the logs folder you will find something called the Application log, this contains the output of the log4j appenders.
2.In the Properties folder you will find config and OR(Object Repository) properties. In the config file you can change the browser to chrome or Firefox and it will kick off the run in the certain browser mentioned. In the OR properties file you will find all the Xpaths.
3.The runner folder is the run classes of the tests created such as the ILabAuto class.


===Pom.xml====
The pom file contains all the dependencies installed

===Extent Report====
To access the screenshots and error messages you can go to the Target folder -> Surefire-reports -> html -> extent.html

