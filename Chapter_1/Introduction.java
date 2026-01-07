// We understand the basic elements of algorithms, the importance of algorithm analysis.

// 1.1 Variables.
/* Before getting in to the definition of Variables, let us relate them to an old mathematical equation.
   Many of us would have solved many mathematical equations since childhood. As an example, consider the
   equation below:
                                  x^2 + 2y - 2 = 1

   The important thing that we need to understand is that the equation has names (x and y) which hold values
   (data). That means the name (x and y) are placeholders for representing data. Similarly, in computer
   science programming we need something for holding data, and variables in the way to do that.
 */

//-------------------------------------------------------------------------------------------------------------

// 1.2 Data Types.
/* Data type is the name used in computer science programming for this purpose. A data type in a programming
   language is a set of data with predefined values. Examples of data types are: integer, floating point, unit
   numbers, character, string, etc.

   There are two types of Data types:-
   a. System-defined data types(also called Primitive data types).
      Data types that are defined by system are called primitive data types. The primitive data types provided
      by many programming languages are: int, float, char,double, bool, etc. The numbers of bits allocated for
      each primitive data type depends on the programming languages, the compiler and the operating system.

   b. User-defined data types.
      Most programming languages allow the users to define their own data types, called - defined data types.
      For example:- classes in Java.
 */

//-------------------------------------------------------------------------------------------------------------

// 1.3 Data Structure
/* Data Structure is a particular way of storing and organizing data in a computer so that it can be used efficiently.
   A data structure is special format for organizing and storing data. General data structure types include arrays,
   files, linked lists, stacks, queues, trees, graphs and so on.

   Depending on the organization of the elements, data structures are classified into teo types :-
   a. Linear data structures:- Elements are accessed in a sequential order but it is not compulsory to store all
      elements sequentially (say Linked Lists). Examples: Linked Lists, Stacks and Queues.
   b. Non-Linear data Structures:- Elements of this data structure are stored/accessed in a non-linear order.
      Examples: tress and graphs.
 */

//-------------------------------------------------------------------------------------------------------------

// 1.4 Abstract Data Types (ADTs)
/* The process of solving problems, we combine the data structures with their operations and we call this Abstract
   Data Types (ADTs). An ADT consists of two parts:
   1. Declaration of Data
   2. Declaration of operations

   Commonly used ADTs includes: Linked Lists, Stacks, Queues, Priority Queues, Binary Trees, Dictionaries, Disjoint
   Sets(Union and find), hash tables, Graphs, and many others. for example, stack uses a LIFO (Last-In-First-Out)
   mechanism while storing the data in data structures. The last element inserted into the stack is the first element
   that gets deleted.
   Common operations are: creating the stack, push an element onto the stack, pop an element from the stack, finding
   the current top of the stack, finding the number of elements in the stack, etc.
 */

//-------------------------------------------------------------------------------------------------------------

// 1.5 What is an Algorithm?
/* An algorithm is the step-by-step unambiguous instructions to solve a given problem.
   In the traditional study of algorithms, there are two main criteria for judging the merits of algorithms:
   correctness(does the algorithm give solution to the problem iin a finite number of steps?) and efficiency(how much
   resources in terms of memory and time) does it rake to execute it.

   NOTE:- we do not have to prove each step of the algorithm.
 */

//-------------------------------------------------------------------------------------------------------------

// 1.6 Why the analysis of Algorithms
/* Algorithm analysis helps us to determine which algorithm is most efficient in terms of time and space consumed.
 */

//-------------------------------------------------------------------------------------------------------------

// 1.7 What is Running Time Analysis?
/* It is the process of determining how processing time increases as the size of the problem (input size) increases.
   Input size is the number of elements in the input, and depending on the problem type, the input be of different types.
   1. Size of an array.
   2. Polynomial degree.
   3. Number of elements in a matrix.
   4. Number of bits in the binary representation of the input.
   5. Vertices and edges in a graph.
 */

//-------------------------------------------------------------------------------------------------------------

// 1.8 How to Compare Algorithms
/* We express the running time of a given algorithm as a function of the input size n (i.e, f(n)) and compare these
   different functions corresponding to running times. This kind of comparison is independent of machine time, programming style, etc.
 */

//-------------------------------------------------------------------------------------------------------------

// 1.9 What is Rate of Growth?
/* The rate at which the running time increases as a function of input is called rate of growth. Let us assume that you go
   to a shop to buy a car and a bicycle. If your friend sees you there and asks what you are buying, then in general you say
   buying a car. This is because the cost of the car is high compared to the cost of the bicycle (approximating the cost of
   the bicycle to the cost of the car).
             Total Cost = cost_of_car + cost_of_bicycle
             Total Cost approximation = cost_of_car
 */

//-------------------------------------------------------------------------------------------------------------

// 1.9 Commonly Used Rates of Growth
/*   Time Complexity        Name                      Description
          1               Constant     Whatever is the input size n, thses functions take a constant amount of time.
        log n            Logarithmic   These are slower growing than even linear functions.
          n               Linear       These functions growing linearly with the input size n.
      n log n       Linear Logarithmic Faster growing than linear but slower than quadratic.
         n^2             Quadratic     These functions grow faster than the linear logarithmic functions.
         n^3              Cubic        Faster growing than quadratic but slower than exponential.
         2^n            Exponential    Faster than all the functions mentioned here except the factorial functions.
         n!              Factorial     Faster growing than all these functions mentioned here.

    2^2n > n! > 4^n > 2^n > n^2 > n log n > log(n!) > n > 2^logn > log^2 n > square root of log n > log log n > 1
 */

//-------------------------------------------------------------------------------------------------------------

// 1.10 Types of Analysis
/* To analyze the given algorithm, we need to know with which inputs the algorithm takes less time (performing well) and with
   which inputs the algorithm takes a long time. We have already seen that an algorithm can be represented in the form of an
   expression. That means we represent the algorithm with multiple expressions: one for the case where it takes less time and
   another for the case where it takes more time.

   The first case is called the best case and the second case is called the worst case for the algorithm. To analyze an algorithm
   we need some kind of syntax, and that forms the base for asymptotic analysis/notation. There are three types of analysis:

   a. Worst case
    * Defines the input for which the algorithm takes a long time (slowest time to complete).
    * Input is the one for which the algorithm runs the slowest.

   b. Best case
    * Defines the input for which the algorithm takes the least time (faster time ti complete).
    * Input is the one for which the algorithm runs the fastest.

   c. Average case
    * Provides a prediction about the running time of the algorithm.
    * Run the algorithm many times, using many different inputs that come from some distribution that generates these inputs,
      compute the total running time (by adding the individual times), and divide by the number of trials.
    * Assumes that the input is random.

                                 Lower Bound <= Average Time <= Upper Bound

 */

//-------------------------------------------------------------------------------------------------------------

// 1.11 Big-O Notation
/* This notation gives the tight upper bound of the given function. Generally, it is represented as f(n) = O(g(n)).
   That means, at larger values of n, the upper bound of f(n) is g(n). For example, if f(n)=n^4 + 100n^2 + 10n + 50
   is the given algorithm, then n^4 is g(n). That means g(n) gives the maximum rate of growth for f(n) at larger values of n.

   a. Ignore the coefficient and largest constant.
   b. Just focus on function n

   Big O Notation --> The maximum numbers of step the algorithm might take, no matter what input is given.
   Worst Case --> The actual input that causes the algorithm to take the longest possible time.
 */

//-------------------------------------------------------------------------------------------------------------

// 1.12 Omega Notation [Lower Bounding Function]
/* Similar to the O discussion, this notation gives the tight lower bound of the given algorithm and we represent as f(n) = Omega(g(n)).
   That means at largest values of n , the tighter lower of f(n) is g(n). For example if f(n) = 100n^2 + 10n +50, g(n) is omega(n^2).
 */

//-------------------------------------------------------------------------------------------------------------

// 1.13 Theta Notation
/* This notation decides where the upper and lower bound of a given function(algorithm) are same. The average running time of an
   algorithm is always between the lower bound and the upper bound. If the upper and lower bound given the same result than the
   theta notion will also have the same rate of growth. As an example, let us assume that f(n) = 1.n+n is the expression. Then
   its tight upper bound g(n) is O(n). The rate of growth in the best case is g(n) = O(n).
 */

//-------------------------------------------------------------------------------------------------------------

// 1.14 Important Notes
/* For the analysis (best case,worst case and average), we try to give the upper bound (O)and lower bound(omega) and average running
   time (Theta). From the above examples, it should also be clear that, for a given function (algorithm), getting the upper bound(O)
   and lower bound (omega) and average time (theta) may not always be possible. For example, if we are discussing the best case
   of an algorithm we try to give the upper bound (O) and lower bound (omega) and average time(theta).

   In the remaining chapter we generally focus on the upper bound (O) because knowing the lower bound (Omega) of an algorithm is of
   no practical importance, and we use the theta notation if the upper bound(O) abd lower bound(omega) are the same.
 */

//-------------------------------------------------------------------------------------------------------------

// 1.15 Wht is it called Asymptotic Analysis?
/* From the discussion above (for all three notations: worst case, best case and average case), we can easily understand that in
   every case for a given function f(n) we are trying to find another function g(n) which approximates f(n) at higher values of n.
   That means g(n) is also a curve which approximates f(n) at higher values of n.

   In mathematics we call such a curves an asymptotic curves. In order terms, g(n) is the asymptotic curve for f(n). For this reason
   we call algorithm analysis asymptotic analysis.
 */

//-------------------------------------------------------------------------------------------------------------