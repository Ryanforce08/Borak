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
	
	double sum = 0;
	int size = sizeof(arr) / sizeof(int);

	for (int i = 0; i < size; ++i) {
		
		arr[i] = rand() % 101 + 100;
	}
	for (int i = 0; i < size; ++i) {
		sum += arr[i];
	}
	
	printIntArr(arr, size);
	
	cout << "mean: " << sum << "/" << size << "=" << sum / size << endl;
	cin.get();
	return 0;
}