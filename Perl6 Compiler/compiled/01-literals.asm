[extern printf]
[section code]
[global main]
main:
	push rbp
	mov rbp, rsp
	sub rsp, 8
	mov rax, generated_string_0
	lea rsi, [rax + 8]
	mov rdi, str_fmt_line
	xor ax, ax
	call printf
	mov rax, generated_string_1
	lea rsi, [rax + 8]
	mov rdi, str_fmt
	xor ax, ax
	call printf
	mov rax, 0x1
	mov rsi, rax
	mov rdi, num_fmt
	xor ax, ax
	call printf
	mov rax, generated_string_2
	lea rsi, [rax + 8]
	mov rdi, str_fmt
	xor ax, ax
	call printf
	mov rax, generated_string_3
	lea rsi, [rax + 8]
	mov rdi, str_fmt
	xor ax, ax
	call printf
	mov rax, 0x2
	mov rsi, rax
	mov rdi, num_fmt_line
	xor ax, ax
	call printf
	mov rax, generated_string_4
	lea rsi, [rax + 8]
	mov rdi, str_fmt
	xor ax, ax
	call printf
	mov rax, generated_string_5
	lea rsi, [rax + 8]
	mov rdi, str_fmt_line
	xor ax, ax
	call printf
	mov rax, generated_string_6
	lea rsi, [rax + 8]
	mov rdi, str_fmt_line
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
generated_string_6:
	dq 4
	db "ok 5", 0
generated_string_0:
	dq 4
	db "1..5", 0
generated_string_1:
	dq 3
	db "ok ", 0
generated_string_4:
	dq 6
	db "ok 3", 10, "", 0
generated_string_5:
	dq 4
	db "ok 4", 0
generated_string_2:
	dq 2
	db "", 10, "", 0
generated_string_3:
	dq 3
	db "ok ", 0
