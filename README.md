# WEB-AUTOMATION-TASK

WEB-AUTOMATION-TASK project is a BDD Cucumber framework written using Page Object Model to automate GUI scenario. It is written in Java language using Maven build tool with cucumber reporting along with Junit runner. BDD features are written in Gherkin language.

## Tools Used:
 
[Selenium Web-Driver](https://www.selenium.dev/documentation/en/webdriver/)  
[Cucumber](https://cucumber.io/docs/bdd/) 
[Gherkin](https://cucumber.io/docs/gherkin/reference/)  
[Maven](https://mvnrepository.com/)  
[Java](https://choosealicense.com/licenses/mit/)  
[JUnit](https://junit.org/junit5/)  
[POM](https://www.selenium.dev/documentation/en/guidelines_and_recommendations/page_object_models/)  


## Reports & screenshots:

```text
Report Json - /webAutomationTask/reports/Cucumber.json
Report Index File - /webAutomationTask/reports/cucumber-reports
```

## Installation and Execution

Clone the github repository and import it as a maven project in IDE 
```bash
git clone git@github.com:komalchauhan88/webAutomationTask.git
```
Update the maven project to download/update the maven dependencies.
```bash
mvn clean compile install
```
Navigate to RunCuke and right click, select 
```bash
Run As ->  Run Configuration  
```

Add the RunCuke path and select the project and JUnit for execution. Click on apply.  

Right click on RunCuke, select Run As -> JUnit, it should start running the cucumber BDD scripts.

## BDD Execution Report Run

![Alt text](CucumerReportScreenshot.png?raw=true "Cucumber Report")
