#include <iostream>
#include <string>
using namespace std;

bool isPrime(int n) {
    if (n <= 1)
        return false;

    for (int i = 2; i < n; i += 1) {
        if (n % i == 0)
            return false;
    }
    return true;
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

int main() {
    int arr1[1000];
    int a = 0;
    int n = 0;
    int arrlength = sizeof(arr1) / sizeof(int);



    while (n < 1000) {
        if (isPrime(a) == true) {
            arr1[n] = a;
            n += 1;
        }
        a += 1;
    }
    
    printIntArr(arr1, arrlength);
    cout << "250th: " << arr1[249] << "\n500th: " << arr1[499] << "\n750th: " << arr1[749] << "\n1000th: " << arr1[999] << endl;

    cin.get();
    return 0;
}

