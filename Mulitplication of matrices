#include <stdio.h>
#include <stdlib.h>

#define R1 2 
#define C1 2 
#define R2 2
#define C2 2 

void mulMat(int m1[][C1], int m2[][C2], int rslt[][C2]) {
    if (C1 != R2) {
       printf("Invalid Input");
       return;
    }  
  
    for (int i = 0; i < R1; i++) {
        for (int j = 0; j < C2; j++) {
            rslt[i][j] = 0;

        
            for (int k = 0; k < C1; k++) { 
                rslt[i][j] += m1[i][k] * m2[k][j];
            }
        }
    }
}

int main() {
    int m1[R1][C1] = { { 1, 1 },
                       { 2, 2 } };

    int m2[R2][C2] = { { 1, 1 },
                       { 2, 2 } };

    int rslt[R1][C2];
  
    
    mulMat(m1, m2, rslt);

    
    printf("Result matrix is:\n");
    for (int i = 0; i < R1; i++) {
        for (int j = 0; j < C2; j++) {
            printf("%d\t", rslt[i][j]);
        }
        printf("\n");
    }

    return 0;
}
