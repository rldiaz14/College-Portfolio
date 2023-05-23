#pragma once
#include "Dice.h"
#include <vector>
#include <time.h>
#include <iostream>

using namespace std;

class PlayerClass
{
private:
	int chips = 0;
	std::string name;
	void setName(std::string playerName);
	

public:
	int playerChips = 0;

	PlayerClass(std::string name, int chips);
	void askUserName();

	void takeChips( int counts);
	void giveChips(PlayerClass *player);
	void recieveChips(int count);

	std::string getName();
	int getChips();

	bool isStillInGame() const;

	static void gameRules();
	
};

