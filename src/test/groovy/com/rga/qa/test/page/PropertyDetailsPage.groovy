package com.rga.qa.test.page

import geb.Page

class PropertyDetailsPage extends Page {

    static url = '/property-details'
    static at = { url == '/property-details' }
    static content = {
        bedroomNumberDropdown(wait: true) { $("select[name=bedroomNumber]") }
        bedroomNumberErrorMessage(wait: true) { bedroomNumberDropdown.next() }
        nextButton(wait: true) { $("button[type=submit]") }
    }
}
