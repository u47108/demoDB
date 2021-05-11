# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Gradle documentation](https://docs.gradle.org)
* [Spring Boot Gradle Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/2.5.0-SNAPSHOT/gradle-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/2.5.0-SNAPSHOT/gradle-plugin/reference/html/#build-image)
* [Spring Data JDBC](https://docs.spring.io/spring-data/jdbc/docs/current/reference/html/)

### Guides
The following guides illustrate how to use some features concretely:

* [Using Spring Data JDBC](https://github.com/spring-projects/spring-data-examples/tree/master/jdbc/basics)

### Additional Links
These additional references should also help you:

* [Gradle Build Scans – insights for your project's build](https://scans.gradle.com#gradle)

### Install

>  sudo docker-compose up -d

>
```
CREATE TABLE public.profile (
	id serial NOT NULL,
	"name" varchar NULL
);

```

### comprobacion si esta corriendo la imagen docker
> sudo docker ps -a

> sudo docker start %ID%

- ejecute SpringBoot Application:

> $PATH_PROYECT  ./gradlew clean build bootRun

