#include <iostream>
#include <stdlib.h>
#include <string>
using namespace::std;

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

int main() {
	srand(time(NULL));
	int arr[1000];

	for (int i = 0; i <= 1000; ++i) {
		
		arr[i] = rand() % (100 - 200 + 1) + 1;
	}
	printIntArr(arr, sizeof(arr) / sizeof(int));
	cin.get();
	return 0;
}