Feature:

As a functional tester I want to check 
whether all the hyperlinks on the url
is returning the expected status code or not.

  @statuscodecheck
  Scenario Outline: Validating all hyperlinks on the webpage to return correct status code
  
    Given User navigates to the given "<url>"
    And User checks for hyperlink on the page
  
    Then Webpage should return 200 or 30x 
   

    Examples: 
      | url																		   | 
      | https://www.mytheresa.com/en-de/men.html | 
      
