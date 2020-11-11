Implementation EXPLANATION:

Input:  Stream of numbers = 3, 5, 2, 8, 1, 2, 9, 1.5, 7.5, 5.5 ....
        Average Size = 4

Output:  Moving Average of the Given Array of Average size 4:
         Average calculated after processing each number,
         0.75, 2.0, 2.5, 4.5, 4.0, 3.25, 5.0, 3.375, 5.0, 5.875

Explanation:
        Stream: 3   (SplitData Size = 4)
        find Average ->
            sum = 3
            Average = 3/4 = 0.75

        Stream: 3, 5    (Average Size = 4)
        find Average ->
            sum = 3 + 5     Average = 8/4 = 2.0

        Stream: 3, 5, 2    (Average Size = 4)
        find Average ->
            sum = 3 + 5 + 2     Average = 10/4 = 2.5

        Stream: 3, 5, 2, 8    (Average Size = 4)
        find Average ->
            sum = 3 + 5 + 2 + 8     Average = 18/4 = 4.5

        Stream: 5, 2, 8, 1    (Average Size = 4)
        find Average ->
            sum = 5 + 2 + 8 + 1     Average = 16/4 = 4
            Note: this time 3 is removed from window of size 4 because that was the oldest in the window and new
            element 1 got added in its place, in fact adding any element from this point will remove oldest
            element in the window as the window is full.

        Stream: 2, 8, 1,  2    (Average Size = 4)
        find Average ->
            sum = 2 + 8 + 1 + 2     Average = 13/4 = 3.25
