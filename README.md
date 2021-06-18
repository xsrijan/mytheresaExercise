
# Solutions

**Required Tools**

*Docker Environment*
&nbsp; 1. Docker Engine

*Local Environment*
&nbsp; 1. Java
&nbsp; 2. Maven

**Build and Test**

1. Build docker image and run the container:
    - `docker-compose up `
2. Enter inside docker container to run feature file:
    - `docker-compose exec test sh`
3. Run feature files using tags: 
    - `mvn test -Dcucumber.options="--tags @statuscodecheck"`
    - `mvn test -Dcucumber.options="--tags @javascriptErrorCheck"`
    - `mvn test -Dcucumber.options="--tags @validateUserLogin"`
4. To run against different environments(local, test, staging):

    - Go to [loginMytheresa.feature](https://github.com/xsrijan/mythresaDemo/blob/main/src/test/resources/features/VerifyLogin.feature)  <br />
    &nbsp;  all the url's are currently commented, "webBrowserName" is the name of browser to run(Chrome or Firefox)  "environment -local" (running on local machine) and "environment -sauce" (running on the sauce lab)<br />
      
    - Follow stesps 1 to 3 again. 
5. To run [JavaScript error test case](https://github.com/xsrijan/mythresaDemo/blob/main/src/test/resources/features/jserror.feature) using Saucelab:

    - Edit following variables in [ConfigUtils.java](https://github.com/xsrijan/mythresaDemo/blob/main/src/test/java/com/utils/ConfigUtils.java) file with your saucelab credentials. <br />
        &nbsp; &nbsp; SAUCE_USER= `YOUR SAUCE USER NAME`<br />
        &nbsp; &nbsp; SAUCE_KEY= `YOUR SAUCE KEY NAME`
        
6. To run on local machine: 
  - Run: `mvn install`
  - Run commands from step 3. 
   
         

