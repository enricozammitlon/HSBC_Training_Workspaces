This shall all be changed to inside a Dockerfile + a bash script, for now cba

First time:
* `mkdir /usr/local/tomcat/webapps/myApp`
To run a servlet everytime:
* Open an Integrated terminal in the folder with the structure:
    * src
    * WEB-INF
    * index.html
* `rm -rf /usr/local/tomcat/webapps/myApp/*`
* `cp -r * /usr/local/tomcat/webapps/myApp/`
* `javac -cp .:/usr/local/tomcat/lib/servlet-api.jar -d /usr/local/tomcat/webapps/myApp/WEB-INF/classes/ src/*.java`
* `catalina.sh run`