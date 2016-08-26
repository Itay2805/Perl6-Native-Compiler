[extern printf]
[section code]
[global main]
main:
	push rbp
	mov rbp, rsp
	sub rsp, 32
	mov rax, generated_string_22
	lea rsi, [rax + 8]
	mov rdi, str_fmt_line
	xor ax, ax
	call printf
	mov rax, generated_string_23
	mov qword [rbp - 0], rax
	mov rax, [rbp - 0]
	lea rsi, [rax + 8]
	mov rdi, str_fmt_line
	xor ax, ax
	call printf
	xor rax, rax
	mov qword [rbp - 8], rax
	mov rax, generated_string_24
	mov qword [rbp - 8], rax
	mov rax, [rbp - 8]
	lea rsi, [rax + 8]
	mov rdi, str_fmt_line
	xor ax, ax
	call printf
	mov rax, 0x3
	mov qword [rbp - 16], rax
	mov rax, generated_string_25
	lea rsi, [rax + 8]
	mov rdi, str_fmt
	xor ax, ax
	call printf
	mov rax, [rbp - 16]
	mov rsi, rax
	mov rdi, num_fmt_line
	xor ax, ax
	call printf
	xor rax, rax
	mov qword [rbp - 24], rax
	mov rax, 0x4
	mov qword [rbp - 24], rax
	mov rax, generated_string_26
	lea rsi, [rax + 8]
	mov rdi, str_fmt
	xor ax, ax
	call printf
	mov rax, [rbp - 24]
	mov rsi, rax
	mov rdi, num_fmt_line
	xor ax, ax
	call printf
	sub rsp, 8
	mov rax, 0x5
	mov qword [rbp - 32], rax
	mov rax, generated_string_27
	lea rsi, [rax + 8]
	mov rdi, str_fmt
	xor ax, ax
	call printf
	mov rax, [rbp - 32]
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
generated_string_19:
	dq 3
	db "ok ", 0
generated_string_18:
	dq 3
	db "ok ", 0
generated_string_17:
	dq 4
	db "1..4", 0
generated_string_16:
	dq 3
	db "ok ", 0
generated_string_15:
	dq 3
	db "ok ", 0
generated_string_14:
	dq 3
	db "ok ", 0
generated_string_13:
	dq 3
	db "ok ", 0
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
	dq 3
	db "ok ", 0
generated_string_0:
	dq 5
	db "1..17", 0
generated_string_23:
	dq 4
	db "ok 1", 0
generated_string_1:
	dq 3
	db "ok ", 0
generated_string_22:
	dq 4
	db "1..5", 0
generated_string_21:
	dq 3
	db "ok ", 0
generated_string_20:
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
generated_string_27:
	dq 3
	db "ok ", 0
generated_string_26:
	dq 3
	db "ok ", 0
generated_string_25:
	dq 3
	db "ok ", 0
generated_string_24:
	dq 4
	db "ok 2", 0
generated_string_12:
	dq 3
	db "ok ", 0
generated_string_11:
	dq 3
	db "ok ", 0
generated_string_10:
	dq 3
	db "ok ", 0
