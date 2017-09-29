ORG 8
DD 15, 6, -5
addi x1, x0, 8
ld x5, 0(x1)
ld x6, 8(x1)
ld x7, 16(x1)
add x8, x5, x6
sub x9, x5, x7
sub x4, x8, x9
sd x4, 64(x0)
