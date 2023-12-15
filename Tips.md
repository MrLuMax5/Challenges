## How To Approach The Interview

- Confirm the problem statement, e.g. by going through some inputs and outputs of the function.
- Say "I have to think about that for 30 seconds", than explain the thought process
- Lay out the solution, maybe even using comments.



## Topics

### Recursion

- Different types (linear vs non-linear). Linear: Base case + recursive call.
  - Indirect (two functions call each other)
  - tree-like: multiple different, case-based recursive calls
  - nested: Recursive function itself is being passed as an argument (Ackerman)
- Endrekursion (tail-recursion): Similar to iterative processes: often by carrying an accumulator that gets returned as soon as the terminal condition is reached.

### HashTable

- By chaining (linked lists), high probability of short list sizes with universal hashing
- Don't do linear probing! Else, you will get clusters and lose O(1) to O(lgn).
  - Instead: Double hashing, with relevant parts being relatively prime.
  - But experiments show: Linear probing is good (Eric Demaine), O(lgn)-wise independence.



## Java

new ArrayList<Integer>(num) will create list with size, not with that initial element.

List.copyOf(Collection)

String.length(), List.size(), array.length

Queue: linkedList. queue.poll()

Collections.sort(list)

int[] to List<Integer>: Arrays.stream(array).boxed().toList();

Arrays.sort()

Arrays.stream().sum();

Comparator<Map<String, Integer>> *mapComparator* = Comparator.*comparing*(m -> m.get("payment")); // .reversed() for highest -> lowest

int\[row][column]

divide (positive int) by 2: \>>> 1