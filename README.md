# Rideshare Project
###### Evan Chen
# 
### Program Description
The way I approached this program was to keep all classes besides `Road` as simple as possible and incorporate all elements together in one primary methods. I also made methods within `Road` to simplify the main `move()` method. 

I used the general approach that kept the `Station`, `Car`, and `Passenger` classes separate, and I accessed each of them with a series of `for` loops within the `Road`.

For example, I used one method that put all the passengers waiting at stations into available cars by looping through each station, each car, and finally each passenger, splitting them by direction up and down within the method itself.

Another method I used was `dropoff(int c)` that took the position of a car in the `ArrayList<Car>` and checked the entire `Car` to see if any passengers were ready to be dropped off and, if so, removed them from the `Car` and added them to the `Station`.

The `toString()` methods (and similarly named methods, i.e. `listPass()`) were just to make the code look better and easier to comprehend when testing/running the program.

### Notes Regarding Running the Program

The tester program `RideshareTester.java` contains two main sections of code within the `main` method: one ready to run, and one in a comment block.

The block of code that is already active when running the tester program shows a simplified revenue per car view by running 100 simulations at a time and averaging it. By default, the program is set to 10 cars and 40 passengers. This can be edited on line 31 to change it to 20 cars and 50 passengers to run the second scenario.

You can also run the first set of code that you need to delete the comment block to run. This shows an expanded view of the scenario using a `toString()` method. It displays the whole station with any passengers waiting as well as all cars with any passengers traveling. The program will run until all cars have reached their destination.

> The program will list passengers arrived at their destination as "waiting" at the station, but they will not be able to board a car going either direction.

### Challenges
The main challenge I faced was the overall incorporation of the methods, especially remembering how I designed each method to interact with the others. I ended up redesigning my entire code to use the approach stated in the program description instead of having more fields in the `Passenger` class. 

I also faced a lot of `IndexOutOfBoundsException` errors in `for` loops that were very difficult to fix, and I just ended up rewriting/reapproaching these methods.

### Results

By calculating the average of 100 road simulations at a time, I found that the revenue of the cars for **10 cars, 40 passengers** was in between **$24-$27** 95% of the time. 

Using the same method, I found that the revenue of the cars for **20 cars, 50 passengers** was in between **$22-$24** 95% of the time.

We can conclude that **10 cars, 40 passengers** is the scenario that produces a higher revenue per car.