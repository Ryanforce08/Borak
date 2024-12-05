#include <iostream>
using namespace::std;

void star(int count) 
{
    int i = 0;
    while (i < count) {
        cout << "*";  
        i += 1;
    }
}

int main() {
    int num;
    int a = 1;
 

    cout << "Please enter a number: ";
    cin >> num; 
    cin.ignore();

    while (a <= num) {
        star(a);  
        a += 1;
        cout << endl;
    }
    if (a - 1 == num)
    {
        star(num);
        cout << endl;
    }


    while (num-1>=1) {
        star(num-1); 
        cout << endl; 
        num -= 1;
    }

    cin.get();
    return 0;
}
