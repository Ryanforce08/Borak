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

void printDoubleArr(double a[], int length)
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

void printBoolArr(bool a[], int length)
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




int main() {
	int arr[] = { 4, 3, 2, 1, 2, 3, 4, 5, 6, 7, 8, 9, 2, 3, 4, 5, 6, 7, 8, 9, 3, 2, 1, 5, 6, 9, 3, 1, -3, 2, 6, 8, 2, 3, 6, 1, 7 };
	bool arr2[] = { true, false, true, true, true, false, false, true, false, true, true, false, false, true, true, true, false };
	double arr3[6];
	arr3[0] = 1.3;
	arr3[1] =  2.1 ;
	arr3[2] = -7.3 ;
	arr3[3] =  8.4 ;
	arr3[4] =  10.1 ;
	arr3[5] =  -8.2 ;
	string arr4[] = { "apple", "banana", "cat", "dog", "evergreen", "function", "giraffe", "hogwash", "igloo", "jump", "kite", "llama", "mushroom", 
					  "nested", "opaque", "push", "quarry", "roadrunner", "staple", "tenant", "under", "vertigo", "walker", "xylophone", "yellow", "zebra" };
	
	int arrlength = sizeof(arr) / sizeof(int);
	int arr2length = sizeof(arr2) / sizeof(bool);
	int arr3length = sizeof(arr3) / sizeof(double);
	int arr4length = sizeof(arr4) / sizeof(string);


	for (int i = 0; i < sizeof(arr) / sizeof(int); i++)
		cout << arr[i] << " ";
	cout << "\n";
	printIntArr(arr, arrlength); 
	cout << "\n";

	
	for (int i = 0; i < sizeof(arr2) / sizeof(bool); i++)
		cout << arr2[i] << ", ";
	cout << "\n";
	printBoolArr(arr2, arr2length);
	cout << "\n";

	cout << arr3[2] << "\n";
	printDoubleArr(arr3, arr3length);
	cout << "\n";


	for (int i = 0; i < sizeof(arr4) / sizeof(string); i++)
		cout << arr4[i] << ", ";
	cout << "\n";
	printStringArr(arr4,arr4length);
	cout << "\n";
	

	cin.get();
	return 0;
}