# docker-network-avengers
Understanding Communication in Docker Container using Bridge network   

This is multiple module SpringBoot Maven REST API project. This project explores how containers in same network communicate with each other.   

**iron-fist** is using API Endpoint **/iron-fist/calling-buddy** to make call to red-hood API  
**red-hood** is using API EndPOint **/red-hood/calling-buddy** to make call to iron-fist API  

Docker Network useful Command
-------------------------------------  
docker network --help						To get help for all docker command  
docker network create <<network-name/id>>	  
docker network ls							To Display all the available network  
docker network rm <<network-name/id>>		Remove one or more networks  
docker network prune						To remove all unused network  
docker network inspect <network-name/id>>	To inspect the network  

Docker Build and Push Command
------------------------  
docker build -t ./iron-fist/cupofjavatec/iron-fist:v1 .
docker build -t ./red-hood/cupofjavatec/red-hood:v1 .

./docker-compsoe  
----------------------------  
Contains docker file for running containers  

Application URL :   
--------------------------  
http://localhost:8081/iron-fist  
http://localhost:8081/iron-fist/calling-buddy  
http://localhost:8082/red-hood  
http://localhost:8082/red-hood/calling-buddy  

Kubernetes - k8s - Service and Deployment files
----------------------------
kubectl apply -f ./k8s/k8s-deployment.yaml
kubectl apply -f ./k8s/k8s-iron-firt.yaml
kubectl apply -f ./k8s/k8s-red-hood.yaml

