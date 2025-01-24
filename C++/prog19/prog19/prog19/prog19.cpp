#include <iostream>
#include <stdlib.h>
#include <string>
using namespace::std;

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

void bubbleSort(string a[], int n)
{
	for (int i = 0; i < n - 1; i++)
	{
		for (int j = 0; j < n - i - 1; j++)
		{
			if (a[j].compare(a[j + 1]) > 0)
			{
				string swap = a[j];
				a[j] = a[j + 1];
				a[j + 1] = swap;
			}
		}
	}
}
string getString()
{
	string s = "";
	for (int i = 0; i < 8; i++)
	{
		int r = rand() % 26 + 97;
		char c = (char)r;
		string s1 = string() + c;
		s += s1;
	}
	return s;
}



int main() {
	srand(time(NULL));
	string arr[1000];

	double a = 0;
	int size = sizeof(arr) / sizeof(string);

	for (int i = 0; i < size; i++) {

		arr[i] = getString();
	}

	printStringArr(arr, size);
	bubbleSort(arr, size);
	cout << "Bubble Sort" << endl;
	printStringArr(arr, size);


	cin.get();
	return 0;
}