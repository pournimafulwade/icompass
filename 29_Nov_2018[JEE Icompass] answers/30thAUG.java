1.b 
Quality Assurance is the activity of providing evidence needed to establish confidence among all concerned, that the quality-related activities are being performed effectively

2)b
										   											   
3)a

5)b

6)b

7)b
After throwing advice : Advice to be executed if a method exits by throwing an exception. To use this advice, use @AfterThrowing annotation.
After advice : Advice to be executed regardless of the means by which a join point exits (normal or exceptional return). To use this advice, use @After annotation.

8)c

9)b

10)a

11)a
BeanNameViewResolver is a ViewResolver implementation that resolves the view name returned from the controller as a bean name registered in the application context.
he XmlViewResolver is used to resolve the view names using view beans defined in xml file.		

12)d
singleton,scope,global scope,request,session

13)c  	   

14)a

15)c
@Repository--When you annotate a class @Repository, spring container understands it's a DAO class and translates all unchecked exceptions (thrown from DAO methods) into Spring DataAccessException. 

16)b
ModelAndView(String viewName, String modelName, Object modelObject)
Convenient constructor to take a single model object

17)d

18)b

19)c
his example shows use of @PersistenceContext to have an EntityManager with an EXTENDED persistence context injected into a @Stateful bean. A JPA @Entity bean is used with the EntityManager to create, persist and merge data to a database.

20)d
bean factory,application context

21)d

22)b
The Spring Expression Language (SpEL for short) is a powerful expression language that supports querying and manipulating an object graph at runtime. The language syntax is similar to Unified EL but offers additional features, most notably method invocation and basic string templating functionality.

23)c

24)a

25)c

26)d
1) context:component-scan**

This element has been introduced in Spring configuration from version 2.5. If you have worked with the previous versions of Spring, all the beans has to be manually configured in the XML files.

There are no annotations supported in the Java beans. This will result in lot of XML code in the configuration files and every time developer has to update the XML file for configuring the new beans.

* **context:component-scan** element in the spring configuration file would eliminate the need for declaring all the beans in the XML files.

**Below declaration in your spring configuration file:**
The following are the annotations scanned by this element:

* @Component
* @Repository
* @Service
* @Controller

27)a

28)d

29)d

30)d

31)b

32)d

33)c

34)a

35)a

36)c

37)c

38)b

39)d

40)a
transient is a Java keyword which marks a member variable not to be serialized when it is persisted to streams of bytes. When an object is transferred through the network, the object needs to be 'serialized'.

41)a

42)d

43)c

44)a

45)b

46)a,c,e

47)c

48)a

49)e

50)c
@path(/country) is similar to @requestmapping in sprin rest -can be above pojo classes
@path{ }  @pathparam is similar to @pathvariable  
@Path("/message")
public class MessageReceiveService {
 
    @GET
    @Path("{custMessage}")
    public Response printCustomMessage(@PathParam("custMessage") String message){
         
        return Response.status(200).entity(message).build();
    }
}

51)c

52)b
while translation from JSP to servlet, the java code is copied from scriptlet to _jspService() method.

53)b

54)c

56)c

57)c
JSP Scriptlets When the scripting language is set to java, a scriptlet is transformed into a Java programming language statement fragment and is inserted into the service method of the JSP page's servlet. A programming language variable created within a scriptlet is accessible from anywhere within the JSP page.

59)a
Syntax of jsp:useBean action tag scope: represents the scope of the bean. It may be page, request, session or application. The default scope is page. page: specifies that you can use this bean within the JSP page.

60)c

61)d
Difference between jsp include directive and include action
JSP include directive	                                           JSP include action
includes resource at translation time.	       includes resource at request time.
better for static pages.	                                           better for dynamic pages.
includes the original content in the generated servlet.	calls the include method.


62)b

63)a

64)a

65)a
.setHeader 0r .SetIntHeader (refresh,"3"---sec

66)a
req.getHeader

67)b
max age of cookie in milliseconds
persistant--even aftr closin browser cookie will live

68)b
4Kb 
max cookie we can store is 50

69)d

70)a

71)b

72)c

73)d

74)d

75)a
prototype.methodName=function()  and this. we have use 

76)a

77)a

78)b

79)a

80)d
clothing

81)d

82)a

83)c

84)

85)b

86)a

87)c

88)b

89)d
jsp:useBean	creates or locates bean object.
jsp:setProperty	sets the value of property in bean object.
jsp:getProperty	prints the value of property of the bean.


91)a

93. a
If you want to generate your logging information in a particular format based on a pattern, then you can use org.apache.log4j.PatternLayout to format your logging information.

94) 

95)c

96)a

99)d

100)a
The @PathParam annotation is a type of parameter that you can extract for use in your resource class. URI path parameters are extracted from the request URI, and the parameter names correspond to the URI path template variable names specified in the @Path class-level annotation.




