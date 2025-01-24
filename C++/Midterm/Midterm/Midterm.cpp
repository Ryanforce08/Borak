#include <iostream>
#include <string>
using namespace::std;

//Ryan Radtke

void midterm() {
	cout << "**************************************\n" << " Midterm Exam\n" << "**************************************" << endl;
}

void printIntArr(int a[], int length)
{
	string s = "[";

	if (length >= 2)
	{
		for (int i = 0; i < length - 1; i++)
			s += to_string(a[i]) + ", ";
		s += to_string(a[length - 1]) + "]";
	}
	else if (length == 1)
	{
		s += to_string(a[0]) + "]";
	}
	else
		s = "[]";

	cout << s << endl;
}
void printStringArr(string a[], int length)
{
	string s = "[";

	if (length >= 2)
	{
		for (int i = 0; i < length - 1; i++)
			s += a[i] + ", ";
		s += a[length - 1] + "]";
	}
	else if (length == 1)
	{
		s += a[0] + "]";
	}
	else
		s = "[]";

	cout << s << endl;
}

int recseq(int n)
{
	if (n == 0)
		return -2;
	else if (n == 1)
		return 4;
	else
		return 3 * recseq(n - 1) - 5 * recseq(n - 2) + 7;
}

int main(){
	string sarr[3];
	int iarr[3];
	string name;
	int age;
	int sarrsize = sizeof(sarr) / sizeof(string);
	int iarrsize = sizeof(iarr) / sizeof(int);

	midterm();

	for (int i = 0; i < iarrsize; i += 1) {
		cout << "Input name: ";
		cin >> name;
		cout << endl;
		cout << "Input age: ";
		cin >> age;
		cin.ignore();
		sarr[i] = name;
		iarr[i] = age;
	}
	cout << "age array" << endl;
	printIntArr(iarr, iarrsize);
	cout << "name array" << endl;
	printStringArr(sarr, sarrsize);

	cout << "Req values" << endl;
	for (int i = 0; i < 6; i += 1) {
		cout << i << ": " << recseq(i) << endl;
	}

	cout << recseq(8) << endl;


	cin.get();
	return 0;
	}