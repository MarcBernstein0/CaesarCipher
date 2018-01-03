# CaesarCipher

Bostonhacks spring 2017

About program:
Program takes in any text, and creates an encrypted message that also gives you a key.
Written in Java.
This is a fork on the full program written by Ryan Li, and two other people who I forget there names.

Inside src/LetterToNumberEncipher, is a Driver.java file that when runned, will run the program that I wrote
that converted each letter to a number, and back. The program istelf is simple, I created 2 arrays, one that 
was all the lower case letters in the alphabet, and the other that has all zeros, but is the size of the 
other array. Can be seen in the file LetterToNumber.java.
char[] letters is an array of characters that has all the characters in the alphabet.
int[] letterValue is an array of ints that has all zeros in the beginning, and then will be filled in
with numbers as the encipher is running. 

The program takes each letter of the text, checks to see its placement in the letters array, then based o that index,
goes the the letterValue array placement of that index, and adds a random value. This keeps happening until the program
reaches the end of the inputed string. Inorder to make the process of searching for the letter in letters array faster, I used  
the binary search method of starting in the middle, and going from there based on if the letter being looked at is less then
or greater then the letter in the array. 

The file Iterator.java is a user friendly iterator so that my partners could work with the code, and add it to
the entire program.

