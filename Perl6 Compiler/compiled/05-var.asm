[extern printf]
[section code]
[global main]
main:
	push rbp
	mov rbp, rsp
	sub rsp, 40
	mov rax, generated_string_12
	lea rsi, [rax + 8]
	mov rdi, str_fmt_line
	xor ax, ax
	call printf
	mov rax, generated_string_13
	mov qword [rbp - 8], rax
	mov rax, [rbp - 8]
	lea rsi, [rax + 8]
	mov rdi, str_fmt_line
	xor ax, ax
	call printf
	xor rax, rax
	mov qword [rbp - 16], rax
	mov rax, generated_string_14
	mov qword [rbp - 16], rax
	mov rax, [rbp - 16]
	lea rsi, [rax + 8]
	mov rdi, str_fmt_line
	xor ax, ax
	call printf
	mov rax, 0x3
	mov qword [rbp - 24], rax
	mov rax, generated_string_15
	lea rsi, [rax + 8]
	mov rdi, str_fmt
	xor ax, ax
	call printf
	mov rax, [rbp - 24]
	mov rsi, rax
	mov rdi, num_fmt_line
	xor ax, ax
	call printf
	xor rax, rax
	mov qword [rbp - 32], rax
	mov rax, 0x4
	mov qword [rbp - 32], rax
	mov rax, generated_string_16
	lea rsi, [rax + 8]
	mov rdi, str_fmt
	xor ax, ax
	call printf
	mov rax, [rbp - 32]
	mov rsi, rax
	mov rdi, num_fmt_line
	xor ax, ax
	call printf
	sub rsp, 8
	mov rax, 0x5
	mov qword [rbp - 40], rax
	mov rax, generated_string_17
	lea rsi, [rax + 8]
	mov rdi, str_fmt
	xor ax, ax
	call printf
	mov rax, [rbp - 40]
	mov rsi, rax
	mov rdi, num_fmt_line
	xor ax, ax
	call printf
	add rsp, 8
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
generated_string_17:
	dq 3
	db "ok ", 0
generated_string_16:
	dq 3
	db "ok ", 0
generated_string_15:
	dq 3
	db "ok ", 0
generated_string_14:
	dq 4
	db "ok 2", 0
generated_string_13:
	dq 4
	db "ok 1", 0
generated_string_8:
	dq 3
	db "ok ", 0
generated_string_9:
	dq 3
	db "ok ", 0
generated_string_6:
	dq 4
	db "ok 5", 0
generated_string_7:
	dq 4
	db "1..4", 0
generated_string_0:
	dq 4
	db "1..5", 0
generated_string_12:
	dq 4
	db "1..5", 0
generated_string_1:
	dq 3
	db "ok ", 0
generated_string_11:
	dq 3
	db "ok ", 0
generated_string_10:
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
