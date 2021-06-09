Outline | Value
--------|-------
Course | SEG-3103
Date | June 10, 2021
Professor | Andrew Forward aforward@uottawa.ca
TA | Nazanin Bayati Chaleshtari nbaya076@uottawa.ca
Team | Vivianne Yee 300118868

# Commit 1: Test failure
I intentionally put the wrong expected value for this test to make sure it was testing the right thing
![Screen Shot 2021-06-08 at 10 40 14 PM](https://user-images.githubusercontent.com/55165979/121284314-a8632f00-c8aa-11eb-928c-63344952c1f8.png)

# Commit 2: Fixed the failing test
After ensuring that the test was testing the right part of the code, I put the correct expected value to make sure the method was working for a 1x1 tictactoe grid

# Comit 3: Adding more tests
I wrote tests that would test nx1, 1xn, and nxm grids. Some of the tests failed 
![Screen Shot 2021-06-08 at 10 43 51 PM](https://user-images.githubusercontent.com/55165979/121284525-0132c780-c8ab-11eb-8bad-23f07a5f8a07.png)

# Commit 4: Fixing the method to support larger grids
After seeing the test failures I fixed the method accordingly so that the method would produce the expected results

# Commit 5+: Adding the remaining tests and refactoring the code
At first, Tic class just contained one method emptyBoard that would take integers for the rows and columns and return a string with the empty board. Once the tests for that method worked I created a constructor for two Tic objects: one that took integers as parameters for the rows and columns and one with no parameters that produced the default 3x3 board. I renamed the emptyBoard() method to toString() and added a size() and showPositions() method. I also added tests for those new methods and updated the toString methods based on the new code structure.
