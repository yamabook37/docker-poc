FROM ubuntu:20.04

RUN apt update && \
    apt install -y curl\
                    vim

COPY ./my_app/hello.txt /app/

CMD ["bash"]