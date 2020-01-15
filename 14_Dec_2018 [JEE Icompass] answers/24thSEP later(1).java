unsolved question: 30(suyesh),37(optional not in syllabus)53(syush),74(angular),86,(angular)

2. a
QA/QC is the combination of quality assurance, the process or set of processes 
used to measure and assure the quality of a product, and quality control, the process
 of ensuring products and services meet consumer expectations.
 
3. a

4. a

5. a
In requirements engineering, requirements elicitation is the practice of researching and 
discovering the requirements of a system from users, customers, and other stakeholders. The practice 
is also sometimes referred to as "requirement gathering"

7. c

8. a

9. d 

10. b

11. c
every time new object will be created and value is same as i value,
it will not take value from array

12. c
<%@include file="config.jsp"%>
<%@page import="com.banking.bean.Customer"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	
13. b
for printing expression tag is required.

14. d

15. b
Generally a (scriptlet) can contain any java code that are valid inside a normal java method.
 This will become the part of generated servlet's service method.
                        The (declaration) must be valid in the scripting language used in the JSP file.
                        This will be included in the declaration section of the generated servlet
(Expressions) are act as place holders for language expression, expression is evaluated each time the page is accessed.
This will be included in the service method of the generated servlet.

16. d

17. d

18. a
The scope attribute has the semantics defined in the JSP specification, and takes the same values as the ones allowed in
 the <jsp:useBean> action; i.e. page , request , session , application . If no value is specified for scope ,
 page scope is the default unless otherwise specified.
 
19. d

20. c

21. b
If the scope is set to prototype, the Spring IoC container creates a new bean instance of the object every time a request
 for that specific bean is made. As a rule, use the prototype scope for all state-full beans and the singleton scope for stateless beans.
 
22. a
@AfterThrowing − Mark a function as an advice to be executed before method(s) covered by PointCut, if the method throws an exception.

23. a

24. d

25. b 

26. b

27. a

28. d *

29. c

@Path("/library")
public class Library {

   @GET
   @Path("/book/{isbn}")
   public String getBook(@PathParm("isbn") String id) {
      // search my database and get a string representation and return it
   }
}

31. d 
To trigger validation of a @Controller input, simply annotate the input argument as @Valid:

@Controller
public class MyController {

    @RequestMapping("/foo", method=RequestMethod.POST)
    public void processFoo(@Valid Foo foo) { /* ... */ }
	
32. d	
	
33. b
Spring Web Flow builds on Spring MVC and allows implementing the "flows" of a web application. 

34. c

35. b

36. a

39. a 
If you are accessing one type of database, such as Oracle, Sybase, or IBM, the preferred driver type is 4.

If your Java application is accessing multiple types of databases at the same time, type 3 is the preferred driver.

Type 2 drivers are useful in situations, where a type 3 or type 4 driver is not available yet for your database.

The type 1 driver is not considered a deployment-level driver, and is typically used for development and testing purposes only.

40. b
we are generating exception we have to use throws keyword to propagate.
if we generate unchecked exception then it will not show complietime error.

41. a
Prepare the callable statement by using Connection.prepareCall() . ...
Set the input parameters (if any exist) ...
Register the output parameters (if any exist) ...
Execute the CallableStatement , and retrieve any result sets or output parameters.

42. d

43. d

44. a

45. b

46. c

47. b

48. a

49. size will be 3 (option not given)

50. a

51. no option is correct(ans will be 11 Aug 2015)

52. e
Hashset will automatically delete the duplicate. 
By default ascending order will be printed depending on asci value;

53. c *

54. c

55. first three options

56. a

57. b

58. c
public static int MIN_PRIORITY: This is minimum priority that a thread can have. Value for this is 1.
public static int NORM_PRIORITY: This is default priority of a thread if do not explicitly define it. Value for this is 5.
public static int MAX_PRIORITY: This is maximum priority of a thread. Value for this is 10.

Get and Set Thread Priority:

public final int getPriority(): java.lang.Thread.getPriority() method returns priority of given thread.
public final void setPriority(int newPriority): java.lang.Thread.setPriority() method changes the priority of 
thread to the value newPriority.
This method throws IllegalArgumentException if value of parameter newPriority goes beyond minimum(1) and maximum(10) limit.

59. b

60. c
if we do upcasting , overridden method will be executed

61. d

62. b

63. a

64. c

65. a

66. b

67. a

68. a
response.setHeader("Refresh", "10; URL=http:\\ www.javaranch.com"); 
response.seIntHeader("Refresh", "10; URL=http:\\ www.javaranch.com"); 

69. a

70. b

71. a
This approach generally is used when the control needs to be forwarded outside the web application. For example we need to forward the control to google.com . It does not mean that we cannot use redirect within same web application , but this approach is ideally used to redirect control to different domain.

This transfer of control task is delegated to the browser by the container. That is, the redirect sends a header back to the browser / client.

Since it is a new request, the old request and response object is lost.

To redirect a request, sendRedirect(“url”) API needs to be called from response.

response.sendRedirect(“url”);

72. d
Maximum number of cookies accepted 50

73. d

75. a *

76. a

77. c

78. b

79. b

80. a

81. c

82. d

83. a

84. d

85. c

86. b
a well fromed xml does not need DTD.
According to JavaCommerce.com XML tutorial, "Well formed XML documents simply markup pages with descriptive tags. 
You don't need to describe or explain what these tags mean. In other words a well formed XML document does not need a DTD, but it must conform to the XML syntax rules.

87. a 
The getElementById() method returns the element that has the ID attribute with the specified value.

88. b
text-shadow: h-shadow v-shadow blur-radius color|none|initial|inherit;

89. b

90. a
type="1"	The list items will be numbered with numbers (default)
type="A"	The list items will be numbered with uppercase letters
type="a"	The list items will be numbered with lowercase letters
type="I"	The list items will be numbered with uppercase roman numbers
type="i"	The list items will be numbered with lowercase roman numbers

91. b 

92.c

93.a

94. c
Trace is of the lowest priority and Fatal is having highest priority.
 Below is the log4j logging level order.

95. b

96.

97. b
Disadvantages of tightly coupled systems•A change in one module usually forces a ripple effect of changes in other modules
•Assembly of modules might require more effort and/or time due to the increased inter-module dependency
•A particular module might be harder to reuse and/or test because dependent modules must be included


98. a

100. c 