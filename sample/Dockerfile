FROM ubuntu:20.04

RUN apt update
RUN apt install -y curl

COPY ./my_app/hello.txt /app/

CMD ["ls", "-la"]