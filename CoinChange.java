function coinChange(amount) 
{
	var quarter = 0;
	var dime = 0;
	var nickel = 0;
	for (var i = 0, i < amount; i++)
	{
		if (i % 25 == 0)
		{
			quarter+=1;
		}
	}
	amount = amount - (quarter * 25);
	for (var i = 0, i < amount; i++)
	{
		if (i % 10 == 0)
		{
			dime+=1;
		}
	}
	amount = amount - (dime * 10);
	for (var i = 0, i < amount; i++)
	{
		if (i % 5 == 0)
		{
			nickel+=1;
		}
	}
	amount = amount - (nickel * 5);
	for (var i = 0, i < amount; i++)
	{
		dollars+=1;
	}
	amount = amount - dollars;
	amount = amount * 100;
	var pennies = amount;
	var str = "quarters:" + quarters + ", nickels:" + nickels + ", dollars:" + dollars + ", dimes:" + dimes + ", pennies:" + pennies;
	return str;
} 
