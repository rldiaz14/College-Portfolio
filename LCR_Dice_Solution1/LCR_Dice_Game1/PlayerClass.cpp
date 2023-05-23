#include "Dice.h"
#include "Player.h"
#include <string>
#include <fstream>
#include <iostream>


using namespace std;

void PlayerClass::takeChips(int count)
{
	if (chips >= count)
		chips -= count;
}

void PlayerClass::giveChips(PlayerClass* player)
{
	if (chips > 0)
	{
		chips -= 1;
		player->recieveChips(1);
	}

}

void PlayerClass::recieveChips(int count)
{
	chips += count;
}

std::string PlayerClass::getName()
{
	return name;
}

void PlayerClass::setName(std::string name)
{
	this->name = name;
}

bool PlayerClass::isStillInGame() const
{
	return chips > 0;
}

int PlayerClass::getChips()
{
	return chips;
}

PlayerClass::PlayerClass(std::string name, int chips)
{
	this->name = name;
	this->chips = chips;
}


void PlayerClass::askUserName()
{
	std::cout << "Enter player name: ";
	std::getline(std::cin,name);
}

void PlayerClass::gameRules()
{
	ifstream openfile("LCRGameRules.txt");
	if (!openfile) {
		cerr << "Failed to open LCRGameRules.txt\n";
	}
	else {
		string getcontent;
		while (getline(openfile, getcontent)) {
			cout << getcontent << endl;
		}
	}
}
