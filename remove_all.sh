#cd ./contact_service
#mvn clean install
#cd ../user_service
#mvn clean install

#docker ps -a

docker stop contactapp
docker stop userapp
docker stop springpsql
docker rm contactapp
docker rm userapp
docker rm springpsql
docker rmi micro_service_postgres_contact_service
docker rmi micro_service_postgres_user_service
