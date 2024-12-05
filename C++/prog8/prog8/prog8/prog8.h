#include <iostream>;
using namespace::std;

void funcvoid(char vvar)
{
	cout << vvar << endl;
}

char funcchar(char cvar)
{
	return cvar;
}
string funcstring(string svar1, string svar2)
{
	return svar1 + svar2;
}

int funcmath(int mvar1, int mvar2)
{
	return mvar1 * mvar2;
}

int main()
{
	cout << "Void func " << endl;
	funcvoid('f');
	cout << "\nChar func" << endl;
	cout << funcchar('c') << endl;
	cout << "\nstring func" << endl;
	cout << funcstring("hello ", "world") << endl;
	cout << "\nmath func" << endl;
	cout << funcmath(2, 5) << endl;

	cin.get();
	return 0;
}