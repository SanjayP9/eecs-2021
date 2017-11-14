addi x1, x0, 128 // Stores memory starting locaiton of the string
ecall x1, x0, 9

upper: 	lbu x2, 0(x1) 		     // Stores the first character of the string
	beq x2, x0, End      // Jumps to end when the null state is found
	addi x2, x2, -32     
	sb x2, 0(x1)         
	addi x1, x1, 1       
	beq x0, x0, upper   

End: 	addi x3, x0, 128     // start address of string
     	ecall x0, x3, 4		    // Outputs the upper case string