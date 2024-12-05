#include <iostream>
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
	int arr[] = { 4, 3, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9, 3, 2, 1, 5, 6, 9, 3, 1, -3, 2, 6, 8, 2, 3, 6, 1, 7 };
	int arr2[] = { true, false, true, true, true, false, false, true, false, true, true, false, false, true, true, true, false };
	int arr3[] = { 1.3, 2.1, -7.3, 8.4, 10.1, -8.2 };
	string arr4[] = { "apple", "banana", "cat", "dog", "evergreen", "function", "giraffe", "hogwash", "igloo", "jump", "kite", "llama", "mushroom", "nested", "opaque", "push", "quarry", "roadrunner", "staple", "tenant", "under", "vertigo", "walker", "xylophone", "yellow", "zebra" };
	
	//int length = sizeof(arr4) / sizeof(int);
	//cout << length << endl;

	cout << "print" << endl;
	for (int i = 0; i < sizeof(arr) / sizeof(int); i++)
		cout << arr[i] << ", ";
	cout << "\n";

	for (int i = 0; i < sizeof(arr2) / sizeof(int); i++)
		cout << arr2[i] << ", ";
	cout << "\n";

	for (int i = 0; i < sizeof(arr3) / sizeof(int); i++)
		cout << arr3[i] << "\n";
	cout << "\n";

	for (int i = 0; i < sizeof(arr4) / sizeof(string); i++)
		cout << arr4[i] << ", ";
	cout << "\n";

	cout << "algorithm" << endl;
	printIntArr(arr, 37);
	printIntArr(arr2, 17);
	printIntArr(arr3, 6);
	for (int i = 0; i < sizeof(arr4) / sizeof(string); i++)
		cout << arr4[i] << ", ";
	cout << "\n" << endl;
	



	cin.get();
	return 0;
}