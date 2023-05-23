#include "Dice.h"
#include <cstdlib> // for rand()

DiceOutCome DiceClass::rollDice() {
	int roll = std::rand() % 6 + 1; // this generates a number between 1 and 6
	switch (roll) {
	case 1:
	case 2:
	case 3:
		return DiceOutCome::Nothing;
	case 4:
		return DiceOutCome::Left;
	case 5:
		return DiceOutCome::Center;
	case 6:
		return DiceOutCome::Right;
	default:
		return DiceOutCome::Nothing; // to silence any potential warnings
	}
}

