# http-header-parser

### Overview
This Spring boot web application provides a mechanism to parse the JSON object present in HTTP header. We have used a header `pagination` and passed twp values in following format- `{page-index}/{page-size}` E.g. `pagination:3/50` mean 3rd page with size of 50 touples.

The REST get call with this header will return the pagination object in follwing JSON format-
```javascript
{
    "pageIndex":3,
    "size":50
}
```

### Build
Run following command to run the spring boot application. The application will listen on port 8080. The port can be changed by adding `resources\application.properties` file.  

```
$ mvn spring-boot:run
```

### Test
Once the application is started, run following command from new command shell-

```
$ curl localhost:8080 --header "pagination: 2/500"
```

This should return-
```javascript
{
    "pageIndex":2,
    "size":505
}
```
Done!!!
