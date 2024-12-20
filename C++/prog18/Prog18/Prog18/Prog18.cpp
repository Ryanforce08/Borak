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
void bubbleSort(int a[], int n)
{
	for (int i = 0; i < n - 1; i++)
	{
		for (int j = 0; j < n - i - 1; j++)
		{
			if (a[j] > a[j + 1])
			{
				int swap = a[j];
				a[j] = a[j + 1];
				a[j + 1] = swap;
			}
		}
	}
}


int main() {
	srand(time(NULL));
	int arr[1000];

	double a = 0;
	int size = sizeof(arr) / sizeof(int);

	for (int i = 0; i <= 999; ++i) {

		arr[i] = rand() % 1001 + 1000;
	}
	for (int i = 0; i < 999; ++i) {
		a += arr[i];
	}
	bubbleSort(arr, size);
	printIntArr(arr, size);

	cout << "Mean: " << a << " / " << size << " = " << a / size << endl;
	cout << "Range: " << arr[size - 1] - arr[0] << endl;
	cout << "Median: " << arr[size/2] << " + " << arr[(size/2) - 1] << " = " << (arr[size/2] + arr[(size/2) - 1])/2;
	cin.get();
	return 0;
}