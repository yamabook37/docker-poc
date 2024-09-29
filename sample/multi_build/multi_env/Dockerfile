FROM ubuntu:20.04 AS base
RUN apt update
CMD ["sh", "-c", "echo This is $env env"]

FROM base AS development
ENV env=dev

FROM base AS production
ENV env=prod

