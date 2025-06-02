#!/usr/bin/env bash

ip=$(docker inspect $1 | grep -oP '(?<="IPAddress": ")[^"]+' | head -n 1)
echo $ip
