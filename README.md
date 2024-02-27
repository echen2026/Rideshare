# Rideshare Project
###### Evan Chen
# 
### Program Description
The way I approached this program was to keep all classes besides `Road` as simple as possible and incorporate all elements together in one primary methods. I also made methods within `Road` to simplify the main `move()` method. 

I used the general approach that kept the `Station`, `Car`, and `Passenger` classes separate, and I accessed each of them with a series of `for` loops within the `Road`.

For example, I used one method that put all the passengers waiting at stations into available cars by looping through each station, each car, and finally each passenger, splitting them by direction up and down within the method itself.

Another method I used was `dropoff(int c)` that took the position of a car in the `ArrayList<Car>` and checked the entire `Car` to see if any passengers were ready to be dropped off and, if so, removed them from the `Car` and added them to the `Station`.

The `toString()` methods (and similarly named methods, i.e. `listPass()`) were just to make the code look better and easier to comprehend when testing/running the program.

### Challenges
The main challenge I faced was the overall incorporation of the methods, especially remembering how I designed each method to interact with the others. I ended up redesigning my entire code to use the approach stated in the program description instead of having more fields in the `Passenger` class. 

I also faced a lot of `IndexOutOfBoundsException` errors in `for` loops that were very difficult to fix, and I just ended up rewriting/reapproaching these methods.

### Results

I saw that