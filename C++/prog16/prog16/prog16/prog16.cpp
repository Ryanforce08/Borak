#include <iostream>
using namespace::std;

int main() {

	int arr2D[9][9];

	for (int i = 0; i < sizeof(arr2D) / sizeof(arr2D[i]); i++) {
		for (int j = 0; j < sizeof(arr2D[i]) / sizeof(int); j++) {
			arr2D[i][j] = i * j;
		}
	}

	

	for (int i = 0; i < sizeof(arr2D) / sizeof(arr2D[i]); i++)
	{
		for (int j = 0; j < sizeof(arr2D[i]) / sizeof(int); j++)
			cout << j << "x" << i << "=" << arr2D[i][j] << "\t";
		cout << endl;
	}

	cin.get();
	return 0;
}