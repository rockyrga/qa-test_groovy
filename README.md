# QA test
The test is for QA role of RGA.

### Introduce
We are using Geb x Spock to simulate users' actions to check whether the application satisfies all user stories.

### Target page for test
You will find our sample web page: [Target Page] (http://ec2-52-48-95-132.eu-west-1.compute.amazonaws.com/property-details). The page provides a form to collect the insured property details.

### Test cases
There are four test cases in PropertyDetailsSpec.groovy:

Case 1: Number of bedrooms should have 7 options
This case is to verify whether the number of bedrooms dropdownlist includes 7 options on the list.

Case 2: Number of bedrooms should include "Please Select", "1", "2", "3", "4", "5" and "over 5" options
This case is to verify whether the number of bedrooms dropdownlist includes the options that are described at the description above on the list.

Case 3: Number of bedrooms options should be in "Please Select", "1", "2", "3", "4", "5" and "over 5" order
This case is to verify whether the options of number of bedrooms dropdownlist are in order as the description above.

Case 4: Should show "Please provide bedroom number" error message when the choose nothing with the number of bedrooms
This case is to verify when user doesn't choose any options from the number of bedrooms dropdownlist, then application should display an error message next to the dropdownlist.

### To do
What we want you to do is to complete cases 2 and 3.

### Reference:
You might find the following instruction to setup environment and run all test cases.

## Installation
### Install FireFox version 41 or later
### Install Java JDK 1.8 or later
### Install Groovy 2.4 or later
### Install Maven 3.3 or later

## Run the test!
Now you can test all flow of the assessment:
```
mvn test
```

## To modify the settings
Config file is placed at `src/test/resources/GebConfig.groovy`

---
* Reference:
    * [http://www.gebish.org/manual/current/](http://www.gebish.org/manual/current/)


Good luck!
