To run
1. Create application-ci.yml in same place with all details

mvn spring-boot:run -Dspring-boot.run.profiles=ci

To build locally 
mvn clean install -Drevision=v1.2.3 -Dspring.profiles.active=ci
