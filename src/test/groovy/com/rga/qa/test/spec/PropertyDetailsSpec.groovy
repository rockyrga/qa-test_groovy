package com.rga.qa.test.spec

import geb.spock.GebReportingSpec

import com.rga.qa.test.page.PropertyDetailsPage

class PropertyDetailsSpec extends GebReportingSpec {

    def "Number of bedrooms should have 7 options"() {

        given: 'I am on the property details page'
        to PropertyDetailsPage

        when: 'I click the number of bedrooms'
        bedroomNumberDropdown.click()

        then: 'I should see 7 options in the number of bedrooms dropdownlist'
        assert bedroomNumberDropdown.find('option').findAll().size() == 7
    }

    def "Number of bedrooms should include 'Please Select', '1', '2', '3', '4', '5', and 'over 5' options"() {
    }

    def "Number of bedrooms options should be in 'Please Select', '1', '2', '3', '4', '5' and 'over 5' order"() {
    }

    def "Should show 'Please provide bedroom number' error message when the choose nothing with the number of bedrooms"() {

        given: 'I am on the property details page'
        to PropertyDetailsPage

        when: 'I click the next button'
        nextButton.click()

        then: 'I should see "Please provide bedroom number" message on the page'
        assert bedroomNumberErrorMessage.text() == 'Please provide bedroom number'
    }
}
