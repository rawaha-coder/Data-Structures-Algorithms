# Performance analysis

Performance for the operations that add values to a linked list and a method to find a node at a particular.
index.
|                 	| push           	| append         	| insert              	| nodeAt                            	|
|-----------------	|----------------	|----------------	|---------------------	|-----------------------------------	|
| Behaviour       	| insert at head 	| insert at tail 	| insert after a node 	| returns a node at given index     	|
| Time Complexity 	| O(1)           	| O(1)           	| O(1)                	| O(i), where i  is the given index 	|


Performance for the operations that remove values from a linked list.
index.
|                 	| pop           	| removeLast      	| removeAfter                       |
|-----------------	|----------------	|----------------	|---------------------------------  |
| Behaviour       	| remove at head 	| remove at tail 	| remove the immediate next node  	|
| Time Complexity 	| O(1)           	| O(n)           	| O(1)                		        |
