# XmlGenerator
Project made for generate java classes from xsd file

# Author
Oscar Montalvo

# Instructions
For generating a java files from a xsd file consider the following:
- add your xsd file to src/main/xsd
- modifiy pom.xml in order to change the packageName atttibute.

once you have preconfigured, run in a command line the following: *mvn jaxb2:xjc* or *mvn clean install*. 
Finally review in the target folder the generated resources.

## Links
- https://www.mojohaus.org/jaxb2-maven-plugin/Documentation/v3.0.0/index.html
- https://www.baeldung.com/jaxb
