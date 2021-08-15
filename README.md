# sauceDemo
QA Engineer Coding Test
Given the user story example below, create an automated test that verifies the two given
scenarios. Attach the following to an email when you are done:
1. Your automation code. Code is in this git repository.
2. Your test results, either as a screenshot or file with the information.
3. A write-up of any bugs you find.
a. The last step of the second scenario has an incorrect error message; ""Sorry, this user has been banned.". It should be "Sorry, this user has been locked out." I ran the test 
with correct version.
b. I'm not positive this is a bug, but the last line of the first scenario says "And I verify the App Logo exists." The app logo is actually a .svg file set as the backgroud 
of the app-logo div by a CSS property. In general, selenium is best at finding and reporting the status of elements of the webpage DOM. However I was able to confirm with selenium 
that the CSS values of the app-logo div background contained the filename of the logo image that I expected, so I tested with that.

NOTE: The browser to test with and the OS were not specified as part of the test. I choose to test with google chrome and Windows 10 as the OS. Since different drivers for the 
same browser are used with different OSs, I just put the Windows chromedriver in a folder on my path, therefor the chromedriver location is not specified in the code.  

NOTE: Code was created in Intellij and ran from the command line with "mvn clean test".  

Also, the project instructions were "I just want to see the tests run" so I didn't create a @before hook to create a webdriver or an @after hook to close the webpage when the test finished, but for an actual project I normally would.
