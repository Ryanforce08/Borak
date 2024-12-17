#include <iostream>
#include <stdlib.h>
using namespace::std;

int main() {
	srand(time(NULL));
	int arr[1000];

	for (int i = 0; i <= 1000; ++i) {
		
		arr[i] = rand() % (100 - 200 + 1) + 1;
	}
		

	cin.get();
	return 0;
}