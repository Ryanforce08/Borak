#include <iostream>
using namespace::std;

void star(int count)
{
    for (int i = 0; i < count; i += 1) {
        cout << "*";
    }
}

int main() {
    int num;

    cout << "Please enter a number: ";
    cin >> num;
    cin.ignore();

    for (int a = 1; a <= num; a += 1) {
        star(a);
        cout << endl;
    }

    for (int b = num; b >= 1; b -= 1) {
        star(b);
        cout << endl;
    }

    cin.get();
    return 0;
}
