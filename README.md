# Booksapp 

This is a sample of a Spring Boot dockerized app. In order to run it, perform the following commands:



```docker build -t <your-namespace>/booksapp .```


```docker run -p 8080:8080 --rm <your-namespace>/booksapp```

Check if it is working by hitting the following endpoint:

```curl http://localhost:8080/books/ ```
