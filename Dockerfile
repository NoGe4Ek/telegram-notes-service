FROM ubuntu
RUN apt-get update && apt-get install -y \
    openjdk-11-jdk-headless \
    git &&\
    apt-get clean
RUN git clone https://github.com/NoGe4Ek/telegram-notes-service
WORKDIR /telegram-notes-service
ENTRYPOINT ["/bin/sh", "gradlew", "run"]