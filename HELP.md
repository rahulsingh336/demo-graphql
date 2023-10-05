# Read Me First
The following was discovered as part of building this project:

* The original package name 'com.example.graphql.demo-graphql' is invalid and this project uses 'com.example.graphql.demographql' instead.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.4/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.4/reference/htmlsingle/index.html#web)
* [Spring for GraphQL](https://docs.spring.io/spring-boot/docs/$3.1.4/reference/htmlsingle/index.html#web.graphql)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Building a GraphQL service](https://spring.io/guides/gs/graphql-server/)

Sample queries
---------------
http://localhost:8886/graphiql?path=/graphql
```
query getActor($input_id: ID!) {
  actorById(id: $input_id) {
    ...actorfields
  }
}

fragment actorfields on Actor {
  id
  name
```
```
{
  "input_id": 1
}
```


```
query getActor($input_id: ID!,$withMovies: Boolean!) {
  actorById(id: $input_id) {
		...actorfields
  }
}

fragment actorfields on Actor {
  id
  name
  movies @include(if: $withMovies) {
    title
    }
}
```
```
{
  "input_id": 1,
  "withMovies" : true
}
```


