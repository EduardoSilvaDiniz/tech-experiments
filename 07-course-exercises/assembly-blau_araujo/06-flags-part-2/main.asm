section .text

msg: db `Salve, simplatia!\n`
end_msg:

section .bss

name: resb  50

section .text

  global _start

print_msg:
  mov rax,  1
  mov rdi,  1
  mov rsi,  msg
  mov rdx,  end_msg - msg ; == len: $ - msg
  syscall
  ret

this_point: ; rotine loop equal in C while(1){printf("Salve, simplatia!\n")}
  call print_msg
  jmp this_point

_start:
  call this_point

_exit:
  mov rax, 60
  mov rdi,  0
  syscall
