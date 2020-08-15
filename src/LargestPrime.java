public class LargestPrime {

    public static int getLargestPrime(int number) {          // . Creating the method getLargestPrime, this method will retrive the largest prime of the number in input.

        if(number <= 1 ){                                    // . Creating an if-statement to check if the number is lower or equal than 1, because two is the first prime number, so the input needs to be at least 2.

            return -1;                                       // . if the value is less than 2 return -1.

        }else{

            for(int i = 2; i < number; i++){                 // . Creating a for-loop that divides the number in input by the index i (it start from 2 because 2 is the first prime number.)

                if((number % i) == 0){                       // . If the reminder of nuber by is equal to zero means we find a prime number

                    number /= i;                             // . Decrease the number in input by the prime number found
                    i--;                                     // . Decrease the index i by 1

                }                                            // . The loop is going to repeat until the index i is going to reach the number.   ( 45 /2  - no - i++  |  45 / 3 - yes - 15 - i--  |  15 / 2 - no - i++  |  15 / 3 - yes - 5 - i--  |  5 / 2 - no - i++  |  5/ 3 - no- i++ | 5/4 -no-i++ |  5/5 -yes- 1 exit loop|
            }
        }
        return number;                                       // . Return the number value (that after all the cycles will have the largest prime number of the input).

    }

}
