[extern printf]
[section code]
[global main]
main:
	push rbp
	mov rbp, rsp
	sub rsp, 8
	mov rax, 0x5
	mov qword [rbp - 0], rax
	sub rsp, 8
	mov rax, 0x6
	mov qword [rbp - 8], rax
	mov rax, [rbp - 8]
	mov rsi, rax
	mov rdi, num_fmt_line
	xor ax, ax
	call printf
	add rsp, 8
	mov rax, [rbp - 0]
	mov rsi, rax
	mov rdi, num_fmt_line
	xor ax, ax
	call printf
	mov rsp, rbp
	pop rbp
	xor rax, rax
	ret
[section rodata]
num_fmt_line:
	db "%d", 10, 0
str_fmt_line:
	db "%s", 10, 0
num_fmt:
	db "%d", 0
str_fmt:
	db "%s", 0
