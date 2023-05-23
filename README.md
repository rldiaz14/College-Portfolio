# School-Projects
LCR Dice Game
Description
This project is an implementation of the Left Center Right (LCR) Dice Game. This classic, multiplayer dice game is programmed in C++, with a minimum requirement of three players, but no upper limit on the number of participants. The objective of the game is to win all of the chips.

Features
Player Management: Supports a dynamic number of players, all of whom can be named by the users.
Gameplay Mechanics: Accurately replicates the rules and conditions of the LCR Dice Game. This includes the specific dice outcomes (Left, Right, Center, and Dot), and how these affect the distribution of chips.
Round Display: Shows a round-by-round summary of the game, with details of each player's dice roll and its consequences.
End-Game Scenario: The game identifies and announces the last player with chips as the winner.
How To Play
Each player starts with three chips. On their turn, players roll three dice, each marked with L, C, R, and dots.
For each 'L' or 'R' rolled, players pass one chip to the player on their left or right respectively. For each 'C', they put one chip in the center. Dots have no effect.
If a player has fewer than three chips, they roll only as many dice as they have chips.
Players who have no chips are not out, they may receive chips from others. The game continues until only one player has chips left.
Installation
To play the game, clone the repository, compile the source code using a C++ compiler, and then run the resulting executable.

Future Improvements
Some possible future improvements could include:

Adding a GUI for a more interactive experience
Supporting a 'saved game' feature to allow games to be paused and resumed later
Adding difficulty levels or varying rulesets
Contribution
Feel free to fork this project and improve in any way, and submit a pull request with your changes. Any contribution you make will be greatly appreciated.

Rescue Animal System
This project is a rescue animal system built using Java. The system provides functionality for the management of rescue animals, particularly dogs and monkeys.

System Overview
RescueAnimal.java: This is the base class for representing a rescue animal. It includes several attributes: name, animal type, gender, age, weight, acquisition date and country, reservation status, training status, and the country where the animal is in service.

Dog.java: This class is an extension of the RescueAnimal class, representing a rescue dog. It introduces an additional attribute - breed.

Monkey.java: Similar to Dog.java, this class extends RescueAnimal and represents a rescue monkey. It includes extra attributes such as tail length, species, height, and body length.

Driver.java: This class hosts the main() method which runs the entire program. It provides a user interface that allows interaction with the rescue animal system. It includes methods for displaying the menu, initializing lists of dogs and monkeys, intake new dog or monkey, reserving an animal, and printing lists of animals.

Features To Be Implemented
intakeNewDog(): A method for adding a new dog to the system.
intakeNewMonkey(): A method for adding a new monkey to the system.
reserveAnimal(): A method for reserving an animal in the system.
printAnimals(): A method for printing lists of animals, which supports three different outputs based on the listType parameter: dog, monkey, or available.
Please feel free to contribute and make suggestions!
