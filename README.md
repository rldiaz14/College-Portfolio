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

License
This project is licensed under the terms of the MIT license.
