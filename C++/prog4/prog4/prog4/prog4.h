#include <iostream>

using namespace::std;

int a = 1;
float b = 2.0;
double c = 3;
char d = 'd';
bool e = false;
string f = "string";
string g = "This is a ";

int main()
{
	cout << "int a=" << a << endl;
	cout << "float b=" << b << endl;
	cout << "double c=" << c << endl;
	cout << "char d=" << d << endl;
	cout << "bool e=" << e << endl;
	cout << "string f=" << f << endl;
	cout <<"int " << 1 << " + " << 1 << " = " << a + a << endl;
	cout << "float " << 2.0 << " + " << 2.0 << " = " << b + b << endl;
	cout << "double " << 3 << " + " << 3 << " = " << c + c << endl;
	cout << "string " << g + f << endl;
	cin.get();
	return 0;
}
