# TASK MANAGER

## Run Locally (Docker)

To run with Docker, use the following commands in root folder:

```bash
docker build -t task_manager:latest .
docker run -i -t task_manager:latest
```

The first command you should run only once.

## or makefile

first install GCC and make

```bash
## ubuntu/debian
sudo apt install build-essential

## Fedora
sudo dnf install gcc make

## Arch linux
sudo pacman -S gcc make
```

and run make

```bash
make
```
