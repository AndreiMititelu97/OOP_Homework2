# Tree Structure Java Application

This repository contains a Java application simulating different types of trees. The project demonstrates class structure, inheritance, encapsulation, and random generation techniques in Java.

## Project Structure

Place all files in the directory `X:\oop2\homework2`. The project contains the following Java classes:

### Files (Classes)

1. **Tree.java**
    - **Package**: `oop.test2.formal`
    - **Description**: Represents a generic tree with age.
    - **Constructor**: Initializes with an integer for the tree's age.
    - **Data Members**:
        - `int age` - The tree’s age, inaccessible from outside the class.
    - **Methods**:
        - `compareWith(Tree tree)`: Method prototype only. Compares the current tree with another and returns an integer difference.
        - `display()`: Method prototype only. Displays information about the tree.

2. **Leaf.java**
    - **Package**: `oop2.test2.formal`
    - **Description**: Represents a leaf with a defined shape.
    - **Constructor**: Accepts a character for the leaf shape.
    - **Data Members**:
        - `char form` - Leaf shape, accessible only within the package.
    - **Methods**:
        - `getForm()`: Returns the leaf's shape.

3. **Pine.java**
    - **Package**: `oop.test2`
    - **Description**: Extends `Tree` to represent a pine tree.
    - **Constructor**: Accepts crown height and tree age as parameters.
    - **Data Members**:
        - `String trunk` - Represents the tree trunk, made of three "X" characters.
        - `int crownHeight` - Crown height.
    - **Methods**:
        - `toString()`: Overrides `Object.toString()`, returns the tree's height, age, and leaf count.
        - `display()`: Displays the pine tree shape, including the crown and trunk.
        - `compareWith(Pine pine)`: Compares the current pine instance with another, returning the difference in leaf count.

4. **Tests.java**
    - **Package**: Default
    - **Purpose**: Contains the `main` method for running tests.
    - **Functionality**:
        - Creates an array of `Tree` objects (size specified by a command-line argument; for tests, use 6).
        - Populates the array with `Pine` objects with randomly generated crown heights and ages.
        - Prints the index, leaf count, age, and crown height for each tree.
        - Displays the tree with the highest leaf count.
        - Outputs the leaf count difference between the richest tree and the second richest.
        - Displays details of the richest tree (index, leaf count, age, and crown height).

### Tree Display Specifications

- **Crown**: Displayed as an isosceles triangle made up of randomly generated leaf shapes (`*`, `#`, `$`, `@`).
- **Trunk**: Represented by three "X" characters, always with a height of 3.
```
                  +               *
                  |             $ * *
     Crown        |           * * # * $            Tree crown (in this example, crown height is 6)
     height       |         @ * * * # * *          
                  |       * $ $ * * * * * #         
                  +     # * * * * * @ * * * *
                                  X
                                  X                Tree trunk (always with a height of 3)
                                  X                 
```

## Example output
```
index: 0, CrownHeight: 6, Age: 170, Number of leaves: 36
index: 1, CrownHeight: 5, Age: 32, Number of leaves: 25
index: 2, CrownHeight: 4, Age: 165, Number of leaves: 16
index: 3, CrownHeight: 3, Age: 67, Number of leaves: 9
index: 4, CrownHeight: 2, Age: 64, Number of leaves: 4
index: 5, CrownHeight: 4, Age: 171, Number of leaves: 16
          # 
        $ $ # 
      # $ $ # * 
    * * # $ # # # 
  * * * * # * # * $ 
* # * # # $ $ $ $ $ * 
          X
          X
          X
Difference between biggest and second biggest tree: 11
Biggest tree info: Index: 5, CrownHeight: 6, Age: 170, Number of leaves: 36
```


