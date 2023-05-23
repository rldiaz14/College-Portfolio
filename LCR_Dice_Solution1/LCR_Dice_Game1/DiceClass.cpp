#include "Dice.h"
#include "Player.h"
#include <time.h>
#include <iostream>

DiceClass::DiceClass()
{

}

int DiceClass::rollDice()
{
	int diceOutcome;

	diceOutcome = (rand() % 6) + 1;

	return diceOutcome;
	
}

