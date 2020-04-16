# Spring Boot Docker MySql Demo
## Description
This is a sample spring boot app which is built using Docker and communicates with MySql db in a separate docker container.
>***Note:** The App builds and runs on Java11.*
## Instructions to run the app
1. Run the below instructions from project root.
2. Compile and build the jar : **mvn clean install -U**
3. Create a docker image : **docker image build -t docker-demo-app:latest .** 
4. Spin up a MySql container : **docker container run -d -p 6033:3306 --rm --name=docker-mysql --env="MYSQL_ROOT_PASSWORD=root" --env="MYSQL_PASSWORD=root" --env="MYSQL_DATABASE=my-db" mysql**
5. Create a db table `user` : **docker exec -i docker-mysql mysql -uroot -proot my-db <user.sql**
6. Verify created table: 
   1. Bash into MySql container : **docker exec -it docker-mysql bash;**
   2. Login to MySql cli : **mysql -uroot -p**
   3. Switch to `my-db` : **use my-db**
   4. Check the tables: **show tables**
7. Run the app container and connect to running MySql container: **docker container run -it --rm --name docker-demo-app -p 5000:9099 --link=docker-mysql docker-demo-app:latest**
8. Acces the app: **http://localhost:5000/users**
