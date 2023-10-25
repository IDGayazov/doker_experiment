# Используйте базовый образ с Java
FROM openjdk:18-alpine

# Устанавливаем рабочую директорию внутри контейнера
WORKDIR /app

# Копируем JAR-файл приложения в контейнер
COPY target/app1-0.0.1-SNAPSHOT.jar app.jar
#RUN cp -a target/app1-0.0.1-SNAPSHOT.jar app.jar

# Запускаем приложение
CMD ["java", "-jar", "app.jar"]
