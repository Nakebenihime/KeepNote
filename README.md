# KEEPNOTE - SPRINGBOOT REST API + ANGULAR 10 UI

This repository contains a project that shows how to build a web application using **ANGULAR** as frontend and **SPRING BOOT** RESTful API as backend:
- frontend generated using Angular CLI (https://cli.angular.io)
- backend generated using Spring IO (https://start.spring.io)

This web application allows users to take notes using post-it type windows

## TECHNOLOGY STACK
COMPONENT                           | TECHNOLOGY              | FOR MORE INFORMATION
---                                 | ---                     |---
Languages & Frameworks              |`spring boot` `angular`  | https://spring.io/projects/spring-boot & https://angular.io/
JavaScript Framework Components     |`angular CLI` `npm`      | https://cli.angular.io/ & https://www.npmjs.com/package/npm
Databases                           |`mongoDB`                | https://www.mongodb.com/
Documentation as a Service & Tools  |`swagger UI`             | https://swagger.io/
Java Tools                          |`lombok` `maven`         | https://projectlombok.org/ & https://maven.apache.org/
Testing Frameworks                  |`archunit`               | https://www.archunit.org/
Security                            |`spring security`        | https://spring.io/projects/spring-security 

## PREREQUISITES
These instructions will allow you to get a copy of the project on your **windows** machine, you must have the following software correctly installed in order to build the project.

### INSTALL BACKEND COMPONENTS
- JAVA 8+
- MAVEN 3.3+
#### INSTALL JAVA
Spring Boot 2.3.3.RELEASE requires JAVA 8 and is compatible up to JAVA 14. Spring Boot can be used with “classic” Java development tools or installed as a command line tool. Either way, you need Java SDK v1.8 or higher.

1. visit [oracle.com](https://www.oracle.com/java/technologies/javase-jdk14-downloads.html) official website
2. select the windows x64 installer
3. run the installer and follow the steps

Set a new "JAVA_HOME" variable under "advanced system settings" > "environment variables" and click "new system variable": 
```
variable name: JAVA_HOME
variable value: C:\Program Files\Java\jdk-14.0.2
```
In system variables, find PATH, click edit... button and add:
```
%JAVA_HOME%\bin
```
Open a command prompt window to verify the installation with the following command:
```
C:\Windows\System32> echo %JAVA_HOME%
C:\Program Files\Java\jdk-14.0.2

C:\Windows\System32> java -version
java version "14.0.2" 2020-07-14
Java(TM) SE Runtime Environment (build 14.0.2+12-46)
Java HotSpot(TM) 64-Bit Server VM (build 14.0.2+12-46, mixed mode, sharing)
```

####  INSTALL MAVEN
Maven is a build automation tool used primarily for JAVA projects.

1.	visit [maven.apache.org](https://maven.apache.org/download.cgi/) official website
2.	select the binary zip archive and extract it to you favorite location

Set two new variables under "advanced system settings" > "environment variables" and click "new system variable":
- first variable:
```
variable name: M2_HOME
variable value: C:\Program Files\apache-maven-3.6.3
```
- second variable:
```
variable name: MAVEN_HOME
variable value: C:\Program Files\apache-maven-3.6.3
```
In system variables, find PATH, click edit... button and add:
- first variable:
```
%M2_HOME%\bin
```
- second variable:
```
%MAVEN_HOME%\bin
```
open a command prompt window to verify maven installation with the following command:
```
C:\Windows\System32> mvn -v
Apache Maven 3.6.3 (cecedd343002696d0abb50b32b541b8a6ba2883f)
Maven home: C:\Program Files\apache-maven-3.6.3\bin\..
Java version: 14.0.2, vendor: Oracle Corporation, runtime: C:\Program Files\Java\jdk-14.0.2
Default locale: fr_FR, platform encoding: Cp1252
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows
```
For more instructions, visit [maven.apache.org](https://maven.apache.org/) official website.

### INSTALL FRONTEND COMPONENTS
#### INSTALL NODEJS
NodeJS is the runtime environment for executing JavaScript code from the command-line. By using NodeJS, you can create any type of application using JavaScript including server-side / backend applications.

1.	visit [nodejs.org](https://nodejs.org/en/download/current/) official website
2.	select the window's installer (.msi) for your system (32-bit or 64-bit)
3.	run the installer and follow the steps
4.	open a command prompt window to verify the node installation with the following command:
```
C:\Windows\System32> node --version
```
If the installation is successful, you will see the version number:
```
C:\Windows\System32> node --version
v14.9.0
```
The installation also includes npm (Node Package Manager) open a command prompt window to verify the npm installation with the following command:
```
C:\Windows\System32> npm --version
```
If the installation is successful, you will see the version number:
```
C:\Windows\System32> npm --version
6.14.8
```

#### INSTALL ANGULAR CLI
The Angular CLI is a command-line interface tool that you use to initialize, develop, scaffold, and maintain Angular applications directly from a command shell.

Install the angular CLI using the npm package manager with the following command:
```
C:\Windows\System32> npm --version
6.14.8
```
Verify the angular CLI installation with the following command:
```
C:\Windows\System32> ng version
```
If the installation is successful, you will see the version number and further information:
```
     _                      _                 ____ _     ___
    / \   _ __   __ _ _   _| | __ _ _ __     / ___| |   |_ _|
   / △ \ | '_ \ / _` | | | | |/ _` | '__|   | |   | |    | |
  / ___ \| | | | (_| | |_| | | (_| | |      | |___| |___ | |
 /_/   \_\_| |_|\__, |\__,_|_|\__,_|_|       \____|_____|___|
                |___/


Angular CLI: 10.1.0
Node: 14.9.0
OS: win32 x64

Angular:
...
Ivy Workspace:

Package                      Version
------------------------------------------------------
@angular-devkit/architect    0.1001.0
@angular-devkit/core         10.1.0
@angular-devkit/schematics   10.1.0
@schematics/angular          10.1.0
@schematics/update           0.1001.0
rxjs                         6.6.2
```

## PROJECT STRUCTURE
```
angular-springboot-project
  |
  +---angular-springboot-backend
  |   |
  |   +--api-requests (contains queries with which you can test your web service - only for the ultimate version of IntelliJ IDEA)
  |   +--common (maven module - contains all "shared" components such as models, viewmodels, repositories...)
  |   |   +---src
  |   |       +---main
  |   |       |   +---java
  |   |       |   |   +---org
  |   |       |   |       +---backend
  |   |       |   |           +---mapper (contains methods to convert domain models to viewmodels and viewmodels to models)
  |   |       |   |           +---model (contains domain models - related to how your data is stored)
  |   |       |   |           +---repository (contains @repository interfaces)
  |   |       |   |           +---seeder (contains a database seeder - inserts data into tables after their creation)
  |   |       |   |           +---service (contains a service interface)
  |   |       |   |           +---viewmodel (similar to model classes - related to how your data is presented to the user)
  |   |       |   +---resources
  |   |       +---test
  |   |           +---java
  |   *---email (maven module - contains the business layer to send e-mails)
  |   |   +---src
  |   |       +---main
  |   |       |   +---java
  |   |       |   |   +---org
  |   |       |   |       +---backend
  |   |       |   |           +---configuration (contains @configuration classes such as swagger & web configuration)
  |   |       |   |           +---controller (contains @controller classes - converts payload and dispatches to the right service)
  |   |       |   |           +---service (contains @service classes - business logic operations)
  |   |       |   +---resources (contains YAML configuration files - application properties)
  |   |       +---test
  |   |           +---java
  |   *---note (maven module - contains the business layer to manage notes and notebooks)
  |   |   +---src
  |   |       +---main
  |   |       |   +---java
  |   |       |   |   +---org
  |   |       |   |       +---backend
  |   |       |   |           +---configuration (contains @configuration classes such as swagger & web configuration)
  |   |       |   |           +---controller (contains @controller classes - converts payload and dispatches to the right service)
  |   |       |   |           +---service (contains @service classes - business logic operations)
  |   |       |   +---resources (contains YAML configuration files - application properties)
  |   |       +---test
  |   |           +---java
  |   *---swagger-aggregator (maven module - aggregates/consolidates all the microservices swagger definitions into a single swagger interface)
  |       +---src
  |           +---main
  |           |   +---java
  |           |   |   +---org
  |           |   |       +---backend
  |           |   |           +---configuration configuration (contains @configuration classes such as swagger & web configuration)
  |           |   +---resources (contains YAML configuration files - application properties)
  |           +---test
  |               +---java
  +---angular-springboot-frontend
      |
      +---e2e (refers to end-to-end testing of the application - contains scripts that we can use to simulate end-user actions and behaviours)
      +---node_modules (all the librairies and dependencies that you install using the command: npm install)
      +---src
      |    +---app (default application module - contains all our modules and components)
      |    |   +---feedback
      |    |        +---model
      |    |        +--- *.css|html|spec.ts|ts
      |    |   +---navigation
      |    |        +--- *.css|html|spec.ts|ts
      |    |    +---notes
      |    |        +--- *.css|html|spec.ts|ts
      |    |    +---not-found
      |    |        +--- *.css|html|spec.ts|ts
      |    |    +---shared
      |    |        +--- *.css|html|spec.ts|ts
      |    |    +---app.module.ts
      |    +---assets (contains all our images, fonts, styles...)
      +---angular.json (contains the configuration for the CLI workspace)
      +---package.json (contains all the npm dependencies of our application, each time we add a new dependency, we must reference with --save)
```



## GETTING STARTED
clone the application, run the following command:
```
git clone https://github.com/Nakebenihime/KeepNote.git
```
### BACKEND
1. move into **angular-springboot-backend** folder
2. for each maven module, configure the application.yml files
    - add database properties to **common** and **note** modules
```
   database:
     persistance: false <-- false = data does not persist | true = data persist
    spring:
      data:
        mongodb:
          host:         <-- address or domain name
          port:         <-- listening port
          database:     <-- database name
```
- sign-up [mailtrap](https://mailtrap.io/register/signup?ref=header) and add your inbox properties to the **email** application.yml
```
    mail:
      host: smtp.mailtrap.io 
      password:                 <-- inbox password
      port:                     <-- inbox port
      username:                 <-- inbox username
    mailtrap:
      inbox:                    <-- inbox address from mailtrap.io
```
Run the following command:
```
    mvn clean package
```
For each module (email, note & swagger-aggregator) run the following command:
```
    java -jar [module_name]/target/[module_name]-0.0.1-SNAPSHOT.jar
```
### FRONTEND
1. move into **angular-springboot-frontend** folder
2. install the dependencies with the following command:
```
    npm install
```
3. start the server with the following command:
```
    npm start
```
## DOCKER
Install docker on your local machine. You can find the installation steps on this link! [docker.com](https://docs.docker.com/install/)
Compose is a tool for defining and running multi-container Docker applications. With Compose, you use a YAML file to configure your application’s services. Then, with a single command, you create and start all the services from your configuration.

1. navigate to the project root folder ()
2. build and run the images with docker-compose:
```
    docker-compose up --build
```
Verify docker container status to make sure everything is okay:
```
    docker ps
   
    CONTAINER ID        IMAGE                                   COMMAND                  CREATED             STATUS              PORTS                              NAMES
    f3802c71539a        backend-swagger-aggregator              "java -Djava.securit…"   52 seconds ago      Up 51 seconds       0.0.0.0:8282->8282/tcp             backend-swagger-aggregator
    afd711241b46        angular-springboot-project_angular-ui   "/docker-entrypoint.…"   52 seconds ago      Up 51 seconds       0.0.0.0:80->80/tcp                 frontend-angular-ui
    864a357c0650        backend-note                            "java -Djava.securit…"   53 seconds ago      Up 52 seconds       0.0.0.0:8080->8080/tcp, 8282/tcp   backend-note
    db694fc79c69        mongo                                   "docker-entrypoint.s…"   53 seconds ago      Up 53 seconds       0.0.0.0:27000->27017/tcp           mongodb
    4586bbabe174        backend-email                           "java -Djava.securit…"   53 seconds ago      Up 53 seconds       0.0.0.0:8181->8181/tcp, 8282/tcp   backend-email
```
Browse http://localhost:80 to explore the application
## EXPLORE REST APIs
You can test them using swagger-ui or any other rest client, swagger2 UI is available at http://localhost:8282/swagger-ui.html.

METHOD | PATH                   | DESCRIPTION                               |
-------|------------------------|-------------------------------------------|
GET    | /api/v1/notes          | retrieve all the notes                    |
GET    | /api/v1/notes/{id}     | retrieve one note by its ID               |
POST   | /api/v1/notes          | create or update a new note               |
DELETE | /api/v1/notes/{id}     | remove a note by its ID                   |

METHOD | PATH                   | DESCRIPTION                               |
-------|------------------------|-------------------------------------------|
GET    | /api/v1/notebooks      | retrieve all the notebooks                |
GET    | /api/v1/notebooks/{id} | retrieve one notebook by its ID           |
POST   | /api/v1/notebooks      | create or update a new notebook           |
DELETE | /api/v1/notebooks/{id} | remove a notebook by its ID               |
DELETE | /api/v1/notes/{id}     | retrieve all the notes by notebook's ID   |

METHOD | PATH                   | DESCRIPTION                               |
-------|------------------------|-------------------------------------------|
POST   | /api/v1/feedback       | send a feedback mail                      |