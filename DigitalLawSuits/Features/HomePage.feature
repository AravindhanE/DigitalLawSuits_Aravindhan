Feature: Validation of Recent Lawsuits
 Scenario Outline: Verify Plaintiff and Defendant information on Recent lawsuits
 Given I launch browser
 When I enter "<url>" and search
 Then I navigated to Home Page 
 When I fetch Plaintiff and Defendant information from Recent lawsuits as per "<RecentDate>"
 Then I should verify following details are present with "<Detail1>"  "<Detail2>" "<Detail3>" "<Detail4>"
 And I closed browser 
  
  Examples:
  |url|RecentDate|Detail1|Detail2|Detail3|Detail4|
  |https://www.accessibility.com/digital-lawsuits|Jan 31, 2023|Plaintiff Name|Filing date|State of filing|Defendant Name|
  
  
  
 
 