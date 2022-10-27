
# APIProjection

## Task Description

Execute the below API calls by creating a cucumber framework and
validate the
status code and get the values of following fields: latitude ,longitude,
description, pressure, country and name.

Implement the functionality
with logging (Log4j) and Allure report

APIS:

http://samples.openweathermap.org/data/2.5/weather?q=London&appid=b1b15e88fa797225412429c1c50c122a1

http://samples.openweathermap.org/data/2.5/weather?q=London,uk&appid=b1b15e88fa797225412429c1c50c122a1

http://samples.openweathermap.org/data/2.5/weather?id=2172797&appid=b1b15e88fa797225412429c1c50c122a1

http://samples.openweathermap.org/data/2.5/weather?lat=35&lon=139&appid=b1b15e88fa797225412429c1c50c122a1

http://samples.openweathermap.org/data/2.5/weather?zip=94040,us&appid=b1b15e88fa797225412429c1c50c122a1
## Deployment

To execute this project run

"TestRunner.java" class



## Logging

Find Log4j loggs in "logs.log" file
## Reporting

This project generates Allure Report

To see Allure report:
   
    1. Go to root directory of project
    2. Run this command:: allure serve allure-results // It will open report in web browser (http://192.168.0.107:50394/index.html)
## Major Files

Here is location of some major Files

1. Location of feature file: Features/API.feature

2. Location of definition file: src/test/java/stepDefinitions/API.java

3. Location of test runner file: src/test/java/testRunner/TestRunner.java