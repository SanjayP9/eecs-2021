ecall x3, x0, 5
ecall x4, x0, 5

blt x4, x3, Else
slli x4, x4, 3
beq x0, x0, Exit

Else: slli x3, x3, 3
      beq x0, x0, Exit

Exit: