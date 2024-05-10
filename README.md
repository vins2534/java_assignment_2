# Java_Assignment_2

main(String[] args): The main method of the program where instances of `Input` and `Parts` classes are created. It takes an array of integers as input using the `Input` class, then performs three different parts of the assignment using methods from the `Parts` class. It prints the results of each part, including the output of part1, the index value from part2, and the array list from part3.

inputData(): This method in the `Input` class prompts the user to enter the size of an array and then takes input for each element in the array, returning an array of integers filled with the user-input values.

part1(int[] data): This method in the `Parts` class takes an array of integers as input, separates even and odd numbers into two arrays, and then prints the original array, even numbers, and odd numbers.

part2(int[] data): Takes an array of integers as input, calculates the differences between consecutive elements, finds the index of the first number whose difference to the next neighbor is the smallest (excluding zero), and returns that index value.

part3(): Takes user input for the number of elements, prompts the user to enter data, and returns an `ArrayList<Integer>` containing the entered elements.
