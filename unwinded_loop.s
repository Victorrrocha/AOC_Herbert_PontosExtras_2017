#for(i=0;i!=100;i+2){
#	sum[i] = sum[i] + 10;
#	sum[i+1] = sum[i+1] +10;}


# sum = $s0
# i = $r1;

.globl main

main:
	li $r5, 100
	li $r1, 0
	li $r3, 10
	
loop:
	lw $s0,0($r1)
	add $s0, $s0, $r3
	sw $r2,0($r1)
	lw $s0,4($r1)
	add $s0, $s0, $r3
	sw $s0,4($r1)
	addi $r1,$r1,8
	bne $r1,$r5,loop
exit:
