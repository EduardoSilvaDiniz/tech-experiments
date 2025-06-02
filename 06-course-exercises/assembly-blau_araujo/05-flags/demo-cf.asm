section .text

  global _start

_start:
  mov rax, 255
  add rax,  1

_exit:
  mov rax, 60
  mov rdi,  0
  syscall
