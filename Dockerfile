# Usa un'immagine base con OpenJDK
FROM openjdk:17-jdk-slim

# Installa X11 e VNC per la grafica
RUN apt-get update && apt-get install -y \
    xvfb \
    openbox \
    x11vnc \
    && rm -rf /var/lib/apt/lists/*

# Crea una directory per il progetto
COPY . /app
WORKDIR /app

# Compila tutti i file Java
RUN find src -name "*.java" > sources.txt && javac @sources.txt -d out

# Imposta la variabile DISPLAY e avvia il gioco
CMD Xvfb :99 -screen 0 1024x768x24 & \
    x11vnc -display :99 -forever & \
    java -cp out main.Main