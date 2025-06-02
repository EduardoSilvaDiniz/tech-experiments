;section .data

msg: 
  db "Salve, simplatia!",10
outra_msg:
  db "qual é a sua graça ?",10
end_msg:

;len: equ $ - msg

section .bss

name: resb  50

section .text

  global _start

_start:
  mov byte [name], "E"
  mov rax,  1
  mov rdi,  1
  mov rsi,  msg
  mov rdx,  end_msg - msg
  syscall

_end:
  mov rax, 60
  mov rdi, 0
  syscall
