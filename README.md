# camel-beanio-edi
Sample parsing beanio in Camel with testing.

## Development methodology

### Develop the outline. 

1. Use the BeanioDevHarness to iteratively improve the definition of bean parsing in relation to some sample data. 
2. Initial development for a multiline record is to (a) create a bean for a given tag, enter it into the definition, and take in the tag.
3. Use the setting to ignore unrecognized records and fields so that a complete set of definitions is no required up front.
4. Initially use String for all fields to avoid unnecessary exceptions which might occur in the parsing. 
5. Run the Camel Junit test to ensure that the parsing is working correctly in the context of Camel. 

### Develop list segments

1. The outter bean can contain List<xxx.class> that permits storing mutliple beans of a given type (see the line items in the definitions). 
2. Modify the inner and outter classes to correctly work with the lists. 
3. Update the Junit test and verify it runs correctly. 

### Develop the correct types

1. Until now, we've used String for all fields. Now that the parsing has the correct outline and can handle lists of items, begin modifiying the beans and the definitions, if necessary, to convert to the correct types - especially for basic types like Integer, Double, etc. When in doubt if records will always convert/cast well, leave it as a String.
2. Modify the unit test to verify the correct values are found for the given types. 

### Advanced
Not shown in any of the sample are the use of regexes or validation which is a part of the Beanio library. The topic is too broad to cover here and the Beanio documentation is
excellent. 

