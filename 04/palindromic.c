#include <stdio.h>
#include <stdlib.h>

int checkPalindrome (int number) {
        int remainder = 0, reversedNumber = 0, numberCopy = number;
        while (number != 0) {
                remainder = number % 10;
                reversedNumber = reversedNumber * 10 + remainder;
                number = number / 10;
        }
        if (reversedNumber == numberCopy) {
                return 1;
        }
        return 0;
}

int main() {

	int largestPalindrome = -1000000;
	int i, j, upperLimit = 1000, result;

	for (i = 100; i < upperLimit; i++){
		for (j = 100; j < upperLimit; j++) {
			result = i * j;
			if (checkPalindrome(result)) {
				if (largestPalindrome < result){
					largestPalindrome = result;
				}
			}
		}
	}
	printf ("Largest palindrome: %d\n", largestPalindrome);
	return 0;
}
