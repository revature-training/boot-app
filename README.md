# boot-appjkasdfdas
I've changed this

### Build JAR

```
cd app/
mvn package
```

### Build Docker image

```
docker build -t boot-app .
```

### Run Docker container

```
docker run -d -p 8080:8080 boot-app
```

### Make sure container is running

```
curl localhost:8080
```
