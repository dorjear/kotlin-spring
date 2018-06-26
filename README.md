# kotlin-spring

Exploring the Rest APIs
1. POST /api/articles - Create an Article
curl -i -H "Content-Type: application/json" -H"Authorization: Basic eGl1bGFiYTpkaXVsYW1h" -X POST -d '{"title": "This is a title", "content": "bilibala bilibala"}'  http://localhost:8080/kotlinspring-api/api/articles

2. GET /api/articles - Get all Articles
curl -i -H 'Accept: application/json' -H"Authorization: Basic eGl1bGFiYTpkaXVsYW1h" http://localhost:8080/kotlinspring-api/api/articles

3. Get /api/articles/{id} - Get an Article by id
curl -i -H 'Accept: application/json' -H"Authorization: Basic eGl1bGFiYTpkaXVsYW1h" http://localhost:8080/kotlinspring-api/api/articles/1

4. PUT /api/articles/{id} - Update an Article
curl -i -H "Content-Type: application/json" -H"Authorization: Basic eGl1bGFiYTpkaXVsYW1h" -X PUT -d '{"title": "This is a title2", "content": "bilibala2 bilibala2"}' http://localhost:8080/kotlinspring-api/api/articles/1

5. DELETE /api/articles/{id} - Delete an Article
curl -i -X DELETE http://localhost:8080/kotlinspring-api/api/articles/1 -H"Authorization: Basic eGl1bGFiYTpkaXVsYW1h"
