section .data

msg db `salve\n`

section .text

  global _start

_start:
  mov eax, 4
  mov ebx, 1
  mov ecx, msg
  mov edx, 6
  int 0x80

  mov rax, 1
  mov rdi, 1
  mov rsi, msg
  mov rdx, 6
  syscall

_end:
  mov rax, 60
  mov rdi, 0
  syscall
