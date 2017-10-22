docker pull frankrb27/Calculadora
mvn clean package
docker run -d --name SerCalculadora -p 8080:8080 frankrb27/Calculadora
