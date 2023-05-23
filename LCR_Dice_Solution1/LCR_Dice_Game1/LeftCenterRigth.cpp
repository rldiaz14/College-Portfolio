#include "Player.h"
#include "Dice.h"
#include <iostream>
#include <string>
#include <vector>
#include <fstream>
#include <algorithm> // include this for count_if
#include <time.h>

using namespace std;



void gameLoop();
std::vector<PlayerClass> players;

int main() {
    //...

    int numPlayers;
    cout << "Enter the number of players: ";
    cin >> numPlayers;

    // Ensure there are at least 3 players
    while (numPlayers < 3) {
        cout << "There must be at least 3 players. Please enter a valid number: ";
        cin >> numPlayers;
    }

    // Initialize players
    for (int i = 0; i < numPlayers; i++) {
        string playerName;
        cout << "Enter name for player " << (i + 1) << ": ";
        std::cin.ignore();  //ignore the '\n' character left in the buffer by cin
        std::getline(std::cin, playerName);
        players.push_back(PlayerClass(playerName, 3));
    }

    // Display the game rules
    PlayerClass tempPlayer("", 0);
    tempPlayer.gameRules(); 
    //Game Logic
    gameLoop();
}

void gameLoop()
{
        DiceClass dice;
        int centerChips = 0;
        int roundCounter = 0;

        while (true) {
            roundCounter++;
            std::cout << "\nRound: " << roundCounter << std::endl;

            for (auto& player : players) {
                if (!player.isStillInGame()) {
                    continue;
                }

                std::cout << "Player: " << player.getName() << " is rolling.\n";

                int diceRolls = player.getChips() > 3 ? 3 : player.getChips();

                for (int i = 0; i < diceRolls; i++) {
                    DiceOutCome roll = dice.rollDice();

                    switch (roll) {
                    case DiceOutCome::Left:
                        player.giveChips(&players[(&player - &players[0] + 1) % players.size()]);
                        std::cout << player.getName() << " rolled an L. Passing a chip to the left.\n";
                        break;
                    case DiceOutCome::Right:
                        player.giveChips(&players[(&player - &players[0] - 1 + players.size()) % players.size()]);
                        std::cout << player.getName() << " rolled an R. Passing a chip to the right.\n";
                        break;
                    case DiceOutCome::Center:
                        player.takeChips(1);
                        centerChips++;
                        std::cout << player.getName() << " rolled a C. Placing a chip in the center.\n";
                        break;
                    default:
                        std::cout << player.getName() << " rolled a dot. No chips passed.\n";
                        break;
                    }
                }

                std::cout << "End of turn. " << player.getName() << " has " << player.getChips() << " chips left.\n";
            }

            // Check for a winner
            auto activePlayers = std::count_if(players.begin(), players.end(), [](const PlayerClass& player) { return player.isStillInGame(); });

            if (activePlayers == 1) {
                auto winner = std::find_if(players.begin(), players.end(), [](const PlayerClass& player) { return player.isStillInGame(); });
                std::cout << "The winner is " << winner->getName() << " with " << winner->getChips() << " chips!\n";
                break;
            }
        }
    
}
