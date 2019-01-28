@ECHO OFF
SET projectPath=C:\Users\Shusain\Desktop\JS\Selenium\MFSAutomate
cd\
cd %projectPath%
SET classPath=%projectPath%\bin;%projectPath%\lib2\*;
java org.testng.TestNG testng.xml 
pause