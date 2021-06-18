Feature:
As a functional tester when I visit the Mytheresa homepage
via a url then there should not be any JavaScripts error
on the webpage and it should be rendered properly.
Note: Environment define the run to be scheduled if environment ="local" 
it would run in the local system if environment ='Sauce' it will run on saucelabs


  @javascriptErrorCheck
  Scenario Outline: Login to mytheresa webpage
  
  	Given User opens the browser "<webBrowserName>" with environment "<environment>"
    Given User navigates to the given  "<url>"
    When User checks for basic UI rendering
    Then No Java Script error should be generated on the webpage
    And browser should be closed automatically

    Examples: 
      | url																		   | webBrowserName|environment|
      | https://www.mytheresa.com/en-de/men.html | chrome				 |local			 |
      # | https://www.mytheresa.com/en-de/men.html | chrome				 |sauce			 |
      
