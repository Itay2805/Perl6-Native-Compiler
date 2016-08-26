[extern printf]
[section code]
[global main]
main:
	push rbp
	mov rbp, rsp
	sub rsp, 0
	mov rax, generated_string_17
	lea rsi, [rax + 8]
	mov rdi, str_fmt_line
	xor ax, ax
	call printf
	mov rax, generated_string_18
	lea rsi, [rax + 8]
	mov rdi, str_fmt
	xor ax, ax
	call printf
	mov rax, 0x1
	mov rbx, rax
	push rbx
	mov rax, 0x0
	pop rbx
	add rax, rbx
	mov rsi, rax
	mov rdi, num_fmt_line
	xor ax, ax
	call printf
	mov rax, generated_string_19
	lea rsi, [rax + 8]
	mov rdi, str_fmt
	xor ax, ax
	call printf
	mov rax, 0x1
	mov rbx, rax
	push rbx
	mov rax, 0x1
	pop rbx
	add rax, rbx
	mov rsi, rax
	mov rdi, num_fmt_line
	xor ax, ax
	call printf
	mov rax, generated_string_20
	lea rsi, [rax + 8]
	mov rdi, str_fmt
	xor ax, ax
	call printf
	mov rax, 0x1
	mov rbx, rax
	push rbx
	mov rax, 0x4
	pop rbx
	sub rax, rbx
	mov rsi, rax
	mov rdi, num_fmt_line
	xor ax, ax
	call printf
	mov rax, generated_string_21
	lea rsi, [rax + 8]
	mov rdi, str_fmt
	xor ax, ax
	call printf
	mov rax, 0x2
	mov rbx, rax
	push rbx
	mov rax, 0x2
	pop rbx
	imul rax, rbx
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
generated_string_12:
	dq 3
	db "ok ", 0
generated_string_1:
	dq 3
	db "ok ", 0
generated_string_11:
	dq 3
	db "ok ", 0
generated_string_10:
	dq 3
	db "ok ", 0
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
