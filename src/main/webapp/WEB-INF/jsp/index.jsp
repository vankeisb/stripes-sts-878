<%@taglib prefix="ss" uri="http://stripes.sourceforge.net/stripes.tld"%>
<ss:form action="/index.action">
    <p>Upon entering a comma separated list, we can convert to a collection 
	using the OneToManyTypeConverter.  We should also be able to use the 
	Formatters to convert back.  What actually happens, is the first value 
	out of the list is used.
    </p>
    <ss:label for="vals">Enter comma separated list: </ss:label>&nbsp;
    <ss:text name="vals" size="100"/><br>
    <ss:submit name="display" value="Save"/>
</ss:form>
