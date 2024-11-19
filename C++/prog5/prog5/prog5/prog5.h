#include <iostream>
using namespace::std;

int age;
float b;
double number;
bool school;
char letter;
string name;



int main() 
{
	cout << "Please enter your name: ";
	cin >> name;

	cout << "Please enter your age: ";
	cin >> age;

	cout << "Please enter your the time like 8.23: ";
	cin >> b;

	cout << "Please enter if you are in school 0 or 1: ";
	cin >> school;

	cout << "Please enter a letter: ";
	cin >> letter;

	cin.ignore();

	cout << "Your name is: " << name << endl;
	cout << "Your age is: " << age << endl;
	cout << "the time is: " << b << endl;
	cout << "You are in school: " << school << endl;
	cout << "Your letter is: " << letter << endl;

	cin.get();
	return 0;
}
