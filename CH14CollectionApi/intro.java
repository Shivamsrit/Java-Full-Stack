package CH14CollectionApi;
/*
 * Understanding Collections Framework in Java - Part 1
 * Focus: List, Set, and Queue Interfaces
 */

/*
 * The Java Collections Framework provides a unified architecture for storing
 * and manipulating groups of objects. It consists of interfaces, implementations,
 * and algorithms that work together to provide efficient data structures.
 *
 * Collection Hierarchy:
 * Collection (interface)
 * ├── List (interface) - ordered, allows duplicates
 * │   ├── ArrayList - resizable array, fast random access
 * │   ├── LinkedList - doubly-linked list, fast insertion/deletion
 * │   └── Vector - synchronized ArrayList (legacy)
 * ├── Set (interface) - no duplicates allowed
 * │   ├── HashSet - hash table, no ordering
 * │   ├── LinkedHashSet - maintains insertion order
 * │   └── TreeSet - sorted set, natural or custom ordering
 * └── Queue (interface) - FIFO operations
 *     ├── PriorityQueue - heap-based priority queue
 *     ├── ArrayDeque - resizable array deque
 *     └── LinkedList - also implements Queue
 */

//2. Array
//->To storing data we use variable.
//->for large data it is difficult to store in varaibles.
//->List of information or large data is stored in Array.
//->Array=> Indexed based data structure.
//          Large volume of data
//          single variable
//->Array is indexed based data structure where we can store
//  Large volume of similar data or Homogeneous data.

//=>3. Disadvantages of Array
//->Array cannot store hetrogeneous data.
//->size is fixed
//->it demands Contigous memory locations.
//->we do not have inbuilt methods to perform operations.
//->directly we cannot perform operations.
//->indirectly we can do by using built-in class called Arrays.




//4. Problem faced in storing Large volume of data
//->Java provides in built classes. lack of uniformity is seen
//  in those in built classes.
//->they failed to manage large volume of data.
//->to perform operations on the large volume of data was
// difficult in those days.


//5. Collection API
//->java is open source.
//->joshua->computer scientist
//  he obsevered the problem and contributed the solution.
//->he created one API or entire hierarchy.
//->hierarchy consists of collection of Interfaces and Classes.
//->Each classes have many in-built classes.
//->he proposed this solution to sun micro system team and named
//  it as collection.
//->from Java 1.2 Collection API got added in java.
//->it is an API, hierachy and framework.
//->someone already coded and developer has to use it.

//->Entire hierarchy it is collection major 7 classes
//1. ArrayList ->Inbuilt class
//2. LinkedList
//3. Array Deque
//4. Priority Queue
//5. Treeset
//6. Hashset
//7. LinkedHashset



//->Above classes divided using three interface.
//1. List(I)-  ArrayList, LinkedList
//2. Queue(I)- Array Dequeue, priority
//3. set(I)  - Treeset, Hashset, LinkedHashset

//->Map
//->Legacy classes
//->Concept of Generics

//->Each classes follow it's own data structure to store data.
//->In there own way there store data
//->by this performing operation become easy.
//->to perform operation there are so many in built methods are
//  persent.


//->All above classes are present in util package.
//->Arrays, String  are present in lang package.
//->To use any of the collection classes we need to import.
//eg: import java.util.*;
//->In collection whatever data you add it stores as an object.

import java.util.Set;

Set