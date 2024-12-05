#include <iostream>;
using namespace::std;

int main()
{
	int age;
	int num;
	int grad;

	cout << "Enter age: ";
	cin >> age;
	cout << "Enter your fav number: ";
	cin >> num;
	cout << "Enter your grad year: ";
	cin >> grad;

	cin.ignore();

	if (age > 0)
		cout << "You are alive" << endl;
	if (num == 7)
		cout << "good choice" << endl;
	else
		cout << "bad choice" << endl;
	if (grad > 2027)
		cout << "i will graduate before you" << endl;
	else if (grad < 2027)
		cout << "you will graduate before me";
	else
		cout << "we graduate the same year";


	cin.get();
	return 0;
}