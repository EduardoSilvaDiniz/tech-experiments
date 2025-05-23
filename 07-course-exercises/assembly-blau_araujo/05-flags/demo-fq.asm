section .text

  global _start

_start:
  pushfq
  pop r8

  xor rax, rax

  push r8
  popfq

  mov rax, 0x246
  push rax
  popfq

_exit:
  mov rax, 60
  mov rdi,  0
  syscall
