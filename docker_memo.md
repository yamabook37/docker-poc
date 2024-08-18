# How to use docker command

docker container run hello-world

docker image pull {image name}
  [old] docker pull
docker image ls
  [old] docker images
docker image rm {image name, image ID}
  [old] docker rmi

docker container run {image name}
  [old] docker run
docker container ls
  [old] docker ps
docker container ls -a

docker container stop {CONTAINER ID, NAMES}
docker container restart {CONTAINER ID, NAMES}
docker container logs {CONTAINER ID, NAMES}

docker container rm {CONTAINER ID, NAMES}
  [old] docker rm

## Execute Dockerfile
cd {work dir}
docker image build .
docker image build -t ubuntu-20240818:v1 .

docker container run -it ubuntu:20.04
docker container run -it {image id}

## 
FROM 
RUN {command, better to use -y option if you want to install something; always answer yes}
COPY
CMD <- Set default command, it runs only once

### unix commands
mkfile xxxm {filename} : Make file with xxx[MB]