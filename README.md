# personal-website-backend

This serves as an endpoint for my personal website to fetch its blog content.  
Basic Spring Boot implementation with a mongoDB database to store the blogs.

It has this endpoint *only*:

- `/api/blogEntries` returns a list of all blog entires (can be of length 0) and a status of `200 OK`

A blog entry is structured like this:
```json
{
  "id": "5f2a7542c865c8063e558b61",
  "blogName": "title of blog",
  "timestamp": "yyyy-MM-ddTHH:mm:ss.SSS",
  "writtenBy": "author of blog",
  "content": "content of blog"
}
```

**Note**: `id: String` and `timestamp: LocalDateTime` (can be parsed as a string with Typescript in a (eg. ReactJS) frontend)

Hosted on Heroku and accessible via [https://janetschel-website-backend.herokuapp.com/api/blogEntries](https://janetschel-website-backend.herokuapp.com/api/blogEntries)
