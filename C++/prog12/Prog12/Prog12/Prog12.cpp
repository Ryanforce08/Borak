#include <iostream>
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

int main() {
    int n = 0;
    int a = 0;

    while (n < 100) {
        if (isPrime(a) == true) {
            n += 1;
            cout << n << ": " << a << endl;
        }
        a += 1;
    }

    cin.get();
    return 0;
}

