# RMI
### Author: Qi Fu
### Modeul: Distributed System
### Github link:[Here](https://github.com/QiFuChina/RMI)

* Purpose： A Web Application that allows clients search words in the indicated file by using Java RMI framework to remote and JSP page to manipulate

Architecture
> Tomcat Server
> Remote Method Invocation



### RMI project
Client
> Client gets messgae from web page and send it to server

Server
> Create locateRegistry to instance DictionaryService

Search 
> A bean class to store words that be searched

DictionaryService
> A interface that contains relative methods

DictionaryServiceImpl
> A class that extends remoteObject and implements interface
* getDictionary: read dictionary and convert it to bytes
* lookup(String s): a method that tests words

dictionary-service.jar --> a jar file packaged from the rmi project.


job-server.war --> a war file packaged from servlet project, which can deployee into tomcat server directly.


# Run
Tool and Environment


* The Tomcat install correctly
* Have installed JDK and JRE packages 

> Using Development Environment likes Eclipes to connect with Tomcat server and run it

> * Also can place war package under webapp folder of Tomcat and start Tomcat
> * Opening cmd and type $ java -cp ./dictionary-service.jar ie.gmit.sw.Server where JAR package locate



