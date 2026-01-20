/* 1. A function calls itself.
   2. Each call handles a smaller version of the problem.
   3. Every recursion must have:

      a. Base Case
       → When to STOP (otherwise infinite loop)

      b. Recursive Case
       → Call itself on a smaller input

         No base case = crash
         No smaller input = infinite recursion

    Q1. In recursion, what is the base case and why is it needed?
    Answer. Base case is the condition where recursion stops.
            Without a base case, the function keeps calling itself infinitely and causes a stack overflow.


 */