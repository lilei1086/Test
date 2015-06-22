#include <iostream>
using namespace std;

int main(int argc, char* argv[])
{
	double a = 0.1;
	for (int i = 0; i < 9; i++)
	{
		a += 0.1;
	}
	cout << a << endl;
	return 0;
}
