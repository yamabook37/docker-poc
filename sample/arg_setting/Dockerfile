FROM ubuntu:20.04

ARG message_arg="Message ARG"
ENV message_env="Message ENV"

RUN echo $message_arg > message_arg.txt
RUN echo $message_env > message_env.txt

CMD ["bash"]