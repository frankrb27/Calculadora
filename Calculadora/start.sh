docker build -f Dockerfile -t calculadora .
docker run -p 8080:8080 -t calculadora
