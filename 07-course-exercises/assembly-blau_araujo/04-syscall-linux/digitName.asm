section .data

msg1 db "Digite o seu nome: "
len1 equ $-msg1

msg2 db "muito prazer, "
len2 equ $-msg2

msg3 db `!\n`
len3 equ $-msg3

section .bss

name resb 50

section .text

  global _start

_print_str:
  mov rax, 1
  mov rdi, rax
  syscall
  ret

_read_line:
  mov rax, 0
  mov rdi, 0
  syscall
  ret

_start:
  mov rsi, msg1
  mov rdx, len1
  call _print_str

  mov rsi, name
  mov rdx, 50
  call _read_line

  mov rsi, msg2
  mov rdx, len2
  call _print_str

  mov rsi, name
  mov rdx, 50
  call _print_str

  mov rsi, msg3
  mov rdx, len3
  call _print_str

_end:
  mov rax, 60
  mov rdi, 0
  syscall
