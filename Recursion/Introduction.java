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

    Recursion versus Iteration
    While discussing recursion,the basic question that comes to mind is: which is better?- iteration or recursion?
    The answer to this question depends on what we are trying to do. A recursion approach mirrors the problem that we are
    trying to solve. A recursive approach makes it simpler to solve a problem that may not have the most obvious of answers.
    But, recursion adds overhead foe each recursion call(need space on the stack frame).

    Recursion.
    1. Terminates when a base case is reached.
    2. Each recursive call requires extra space on the stack frame (memory).
    3. If we get infinite recursion, the program may run out of memory and result in stack overflow.
    4. Solutions to some problems are easier ti formulate recursively.

    Iteration
    1. Terminate when a condition is proven to be false.
    2. Each iteration does not require any extra space.
    3. An infinite loop could loop forever since there is no extra memory being created.
    4. Iterative solutions to a problem may not always be as obvious as a recursive solution.

    Notes on Recursion
    1.Recursive algorithms have two types of cases, recursive cases and base cases.
    2.Every recursive function case must terminate at a base case.
    3.Generally, iterative solutions are more efficient than recursive solutions (due to the overhead of function calls).
    4.A recursive algorithm can be implemented without recursive function calls using a stack, but it's usually more trouble
      than its worth. That means any problem that can be solved recursively can also be solved iteratively.
    5.For some problems, there are no obvious iterative algorithms.
    6.Some problems are best suited for recursive solutions while others are not.
 */