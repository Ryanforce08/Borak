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
void findMode(int arr[], int length) {
	int count = 1;
	int maxCount = 1;

	for (int i = 0; i < length - 1; i++) {
		if (arr[i] == arr[i + 1]) {
			count++;
			if (count > maxCount) {
				maxCount = count;
			}
		}
		else {
			count = 1;
		}
	}

	count = 1;

	for (int i = 0; i < length - 1; i++) {
		if (arr[i] == arr[i + 1]) {
			count++;
		}
		else {
			count = 1;
		}

		if (count == maxCount) {
			cout << arr[i] << " ";
		}
	}

	cout << endl;
}


int main() {
	srand(time(NULL));
	int arr[15];

	double a = 0;
	int size = sizeof(arr) / sizeof(int);

	for (int i = 0; i <= 14; ++i) {

		arr[i] = rand() % 10 + 1;
	}
	for (int i = 0; i < 14; ++i) {
		a += arr[i];
	}

	bubbleSort(arr, sizeof(arr) / sizeof(int));
	printIntArr(arr, sizeof(arr) / sizeof(int));

	cout << "mode: ";
	findMode(arr, sizeof(arr) / sizeof(int));

	cin.get();
	return 0;
}