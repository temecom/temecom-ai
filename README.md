# temecom-ai
AI Services using SpringBoot and DL4j
# Introduction
This repo combines Deep Learning for Java (DL4J) with a modern UI Interface based on EmberJS/Boostrap, a REST middleware service based on SpringBoot and a NoSql database, based on MongoDb. This combination results in a enterprise ready-to-roll, robust AI platform for cloud deployment. 
# Prerequisites
* MongoDb
* Java JDK 1.8
* Maven 3+
* Spring Tools Suite (optional) 
# Installation
* Clone this repo
git clone 
* cd temecom-ai
* mvn clean install -DskipTests
* cd temecom-ai-service
* mvn spring-boot:run
* cd ../temecom-ai-ui
* ember serve --proxy=http://localhost:8510
* open a broswer to: 
** http:localhost:4200
