# Étape 1 : Utiliser une image Maven pour la phase de build
FROM maven:3.8.6-eclipse-temurin-17 AS build

# Définir le répertoire de travail à l'intérieur du conteneur
WORKDIR /app

# Copier le fichier pom.xml et télécharger les dépendances
COPY pom.xml .
RUN mvn dependency:go-offline

# Copier le reste du projet dans le conteneur
COPY . .

# Construire le projet avec Maven
RUN mvn clean package -DskipTests

# Étape 2 : Utiliser une image légère JDK pour exécuter l'application
FROM eclipse-temurin:17-jdk-jammy

# Définir le répertoire de travail à l'intérieur du conteneur
WORKDIR /app

# Copier le fichier JAR construit depuis l'image précédente
COPY --from=build /app/target/*.jar app.jar

# Exposer le port 8082 pour l'application Spring Boot
EXPOSE 8088

# Définir la commande pour exécuter l'application
ENTRYPOINT ["java", "-jar", "/app/app.jar"]
