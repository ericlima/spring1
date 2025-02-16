# Usar imagem do OpenJDK 17
FROM openjdk:23-jdk-slim AS build

# Definir diretório de trabalho
WORKDIR /app

# Copiar os arquivos do projeto para dentro do contêiner
COPY . .

# Compilar o projeto usando Maven
RUN ./mvnw clean package -DskipTests

# Criar a imagem final para rodar o app
FROM openjdk:23-jdk-slim
WORKDIR /app

# Copiar o JAR compilado da fase anterior
COPY --from=build /app/target/*.jar app.jar

# Expor a porta da aplicação
EXPOSE 8080

# Definir o comando de entrada
ENTRYPOINT ["java", "-jar", "app.jar"]
