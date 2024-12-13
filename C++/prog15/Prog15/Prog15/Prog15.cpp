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
    int n = 1;



    while (n < 1000) {
        if (isPrime(a) == true) {
            n += 1;
            arr1[n] = a;
        }
        a += 1;
    }
    
    printIntArr(arr1, 1000);

    cin.get();
    return 0;
}

