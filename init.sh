#!/usr/bin/env bash

# Author : Babin k
# Contact email : babi4babin@gmail.com


export SERVICE_CONTEXT=dockerized-spring
export API_BASE_PATH=api
export DB_IMAGE_NAME=mydb
export DB_USER=user
export DB_PASSWORD=user
export BUILD_NAME=dockerdemo.0.0.1


echo "running docker build  ------Step(1)"
docker-compose build --no-cache

echo "up all docker containers Step(2)"
docker-compose up -d