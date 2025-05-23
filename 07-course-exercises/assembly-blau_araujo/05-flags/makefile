NAME=demo-fq

all: $(NAME).o
	ld -o $(NAME) $(NAME).o
	@rm *.o
	./$(NAME)

%.o: %.asm
	nasm -g -f elf64 $<
