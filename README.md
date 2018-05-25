# spybean_demo
Minimal example of my ignorance

# Problem

```$ ./gradlew test

> Task :test 

com.example.demo.DemoControllerTests > info_get FAILED
    org.springframework.web.util.NestedServletException at DemoControllerTests.java:34
        Caused by: org.springframework.http.converter.HttpMessageNotWritableException at DemoControllerTests.java:34
            Caused by: com.fasterxml.jackson.databind.JsonMappingException
                Caused by: java.lang.StackOverflowError
2018-05-25 15:50:53.436  INFO 97553 --- [       Thread-7] o.s.w.c.s.GenericWebApplicationContext   : Closing org.springframework.web.context.support.GenericWebApplicationContext@61ee5c3d: startup date [Fri May 25 15:50:52 CDT 2018]; root of context hierarchy
2018-05-25 15:50:53.436  INFO 97553 --- [       Thread-5] o.s.w.c.s.GenericWebApplicationContext   : Closing org.springframework.web.context.support.GenericWebApplicationContext@2e471cbe: startup date [Fri May 25 15:50:51 CDT 2018]; root of context hierarchy

2 tests completed, 1 failed```
