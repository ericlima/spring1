CREATE DATABASE meu_banco;
CREATE USER 'meu_usuario'@'%' IDENTIFIED BY 'minha_senha';
GRANT ALL PRIVILEGES ON meu_banco.* TO 'meu_usuario'@'%';
FLUSH PRIVILEGES;


para testar

curl -X POST http://localhost:8080/users \
-H "Content-Type: application/json" \
-d '{"name": "Maria", "email": "maria@email.com"}'


curl -X GET http://localhost:8080/users
