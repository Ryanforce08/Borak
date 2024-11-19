#include <iostream>;

using namespace::std;

int func1()
{
	return 1;
}
float func2()
{
	return 2.5;
}
double func3()
{
	return 3.1;
}
bool func4()
{
	return true;
}
char func5()
{
	return 'F';
}
string func6()
{
	return "String";
}

void funcvoid()
{
	cout << "void" << endl;
}
void funcvoid2()
{
	funcvoid();
}



int main()
{
	cout << "Function 1" << endl;
	cout << func1() << endl;
	cout << "\nFunction 2" << endl;
	cout << func2() << endl;\
	cout << "\nFunction 3" << endl;
	cout << func3() << endl;
	cout << "\nFunction 4" << endl;
	cout << func4() << endl;
	cout << "\nFunction 5" << endl;
	cout << func5() << endl;
	cout << "\nFunction 6" << endl;
	cout << func6() << endl;
	cout << "\nFunction Void" << endl;
	funcvoid2();


	cin.get();
	return 0;
}



