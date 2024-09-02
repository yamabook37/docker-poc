FROM ubuntu:20.04

RUN touch file_1.txt
WORKDIR /app/my_dir
RUN touch file_2.txt
WORKDIR ..
RUN touch file_3.txt

CMD ["bash"]