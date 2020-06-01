#!/bin/bash

set -e -u -x

./mvnw package -Dmaven.repo.local=.m2
