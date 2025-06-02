section .data

msg: db "Salve, simplatia!",10

len: equ $ - msg

section .text

  global _start

_start:
  mov rax,  1
  mov rdi,  1
  mov rsi,  msg
  mov rdx,  len
  syscall

_end:
  mov rax, 60
  mov rdi, 0
  syscall
