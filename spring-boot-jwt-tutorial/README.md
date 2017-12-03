Đây là project mẫu hướng dẫn sử dụng Spring Boot và Json Web Token.
Chỉ được thiết kết để học.
Không nên áp dụng trên môi trường production.

Để áp dụng trên production cần tìm hiểu để kết hợp với Spring-Security.


Vi du:

curl -X POST http://localhost:8080/login -d '{"email":"javaclass@gmail.com", "password": "1234"}' -H 'Content-type: application/json'

{"token": tokenValue }

curl http://localhost:8080/secure/me -H 'authorization: Bearer tokenValue'

