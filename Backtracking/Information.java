/* Backtracking
   1.Choose a path
   2.Walk forward
   3.If you hit a dead end
   4.You come back and try another path

👉 This try → fail → undo → try again
👉 is Backtracking

Question1:- How is this different from normal recursion?
            Recursion:
            “Solve smaller problem.”

            Backtracking:
            “Try one choice,
             go deeper,
             if it fails → undo the choice,
             then try the next choice.”

📌 Undoing is the key difference.

     Every backtracking problem follows this:
     1.Choose (make a decision)
     2.Explore (recursive call)
     3.Un-choose (undo the decision)
 */