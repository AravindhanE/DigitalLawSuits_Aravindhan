$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/HomePage.feature");
formatter.feature({
  "name": "Validation of Recent Lawsuits",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Verify Plaintiff and Defendant information on Recent lawsuits",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I launch browser",
  "keyword": "Given "
});
formatter.step({
  "name": "I enter \"\u003curl\u003e\" and search",
  "keyword": "When "
});
formatter.step({
  "name": "I navigated to Home Page",
  "keyword": "Then "
});
formatter.step({
  "name": "I fetch Plaintiff and Defendant information from Recent lawsuits as per \"\u003cRecentDate\u003e\"",
  "keyword": "When "
});
formatter.step({
  "name": "I should verify following details are present with \"\u003cDetail1\u003e\"  \"\u003cDetail2\u003e\" \"\u003cDetail3\u003e\" \"\u003cDetail4\u003e\"",
  "keyword": "Then "
});
formatter.step({
  "name": "I closed browser",
  "keyword": "And "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "url",
        "RecentDate",
        "Detail1",
        "Detail2",
        "Detail3",
        "Detail4"
      ]
    },
    {
      "cells": [
        "https://www.accessibility.com/digital-lawsuits",
        "Jan 31, 2023",
        "Plaintiff Name",
        "Filing date",
        "State of filing",
        "Defendant Name"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Verify Plaintiff and Defendant information on Recent lawsuits",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "I launch browser",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitions.RecentLawSuits.i_launch_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I enter \"https://www.accessibility.com/digital-lawsuits\" and search",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.RecentLawSuits.i_enter_and_search(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I navigated to Home Page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.RecentLawSuits.i_navigated_to_Home_Page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I fetch Plaintiff and Defendant information from Recent lawsuits as per \"Jan 31, 2023\"",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitions.RecentLawSuits.i_fetch_Plaintiff_and_Defendant_information_from_Recent_lawsuits_as_per(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I should verify following details are present with \"Plaintiff Name\"  \"Filing date\" \"State of filing\" \"Defendant Name\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitions.RecentLawSuits.i_should_verify_following_details_are_present_with(java.lang.String,java.lang.String,java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I closed browser",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitions.RecentLawSuits.i_closed_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});