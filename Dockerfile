FROM java:8

# environment variable that depends on.
# actual value will be provided when running
# docker run --env MONGODB_URL=mongodb://mongo/mydev
ENV MONGODB_URL mongodb://mongo/mydev

RUN mkdir -p /code
WORKDIR /code

COPY . /code
RUN ./gradlew build

EXPOSE 8080
CMD ["./gradlew", "bootRun"]

