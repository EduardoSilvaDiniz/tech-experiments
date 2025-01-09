# TASK MANAGER

## Run Locally (Docker)
To run with Docker, use the following commands in root folder:

```bash
docker build -t task_manager:latest .
docker run -i -t task_manager:latest
```

The first command you should run only once.

## or makefile
first install build-essential (ubuntu/debian only)
```bash
sudo apt install build-essential
```
and run make
```bash
make
```
