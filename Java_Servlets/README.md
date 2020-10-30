To run a servlet everytime:
* Open an Integrated terminal in the folder with the structure:
    * src
    * WEB-INF
    * index.html
* `rm -rf /usr/local/tomcat/webapps/myApp/*`
* `cp -r * /usr/local/tomcat/webapps/myApp/`
* `javac -cp .:/usr/local/tomcat/lib/servlet-api.jar -d /usr/local/tomcat/webapps/myApp/WEB-INF/classes/ src/*.java`
* `catalina.sh run`