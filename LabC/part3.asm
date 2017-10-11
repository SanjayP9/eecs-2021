ORG 0
DD 1, 2, 3, 4, 5, 6, 7, 8, 9, 10

addi x1, x0, 0
addi x2, x0, 6
addi x3, x0, 80

Loop: ld x4, 0(x1)
      bge x4, x2, Add
      addi x1, x1, 8
      beq x1, x3, Exit
      beq x0, x0, Loop

Add: addi x5, x5, 1
     addi x1, x1, 8
     beq x1, x3, Exit
     beq x0, x0, Loop

Exit: ecall x0, x5, 0