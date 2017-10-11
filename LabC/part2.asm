addi x5, x0, 0
addi x2, x0, -1

Loop: ecall x1, x0, 5
      beq x1, x2, Exit
      add x5, x5, x1
      beq x0, x0, Loop

Exit: xori x6, x5, -1