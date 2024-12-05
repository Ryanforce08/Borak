#include <iostream>
using namespace::std;

int main() {
	string s1 = "Hello, my name is Brian.";
	string s2 = "Hello";
	string s3 = "World";
	string s4 = "a";
	string s5 = "";
	char c1 = 'Q';
	char c2 = 'Z';
	int num1 = 2;
	int num2 = 15;
	int num3 = 7;

	//returns lenth of string
	cout << s2.length() << endl;

	//returns the letter at the num in the string
	cout << s1.at(num1) << endl;

	//return the mumber of chars untill set letter
	cout << s1.find(s4) << endl;

	//returns the second a 
	cout << s1.find(s4, num2) << endl;

	//returns if it is diffrent
	cout << s2.compare(s3) << endl;

	//returns if it is diffrent
	cout << s3.compare(s2) << endl;

	//reurns bool if empty
	cout << s5.empty() << endl;

	//reurns bool if empty
	cout << s1.empty() << endl;

	//returns sting with 2 letters missing
	cout << s1.substr(num1, num2) << endl;

	//retuns string
	cout << s1 << endl;

	//swaps string 2 and 3
	s2.swap(s3);
	cout << s2 << endl;

	cout << s3 << endl;

	//sets first letter as Q
	s1.front() = c1;
	cout << s1 << endl;

	//sets last lttr as Z
	s1.back() = c2;

	cout << s1 << endl;


	cout << s1.erase(num3, num1) << endl;

	cout << "\n\n\n\n";

	string base = "this is a test string.";
	string str2 = "n example";
	string str3 = "sample phrase";
	string str4 = "useful.";

	string str = base;
	cout << str << endl;
	str.replace(9, 5, str2); // 3 parameters
	cout << str << endl;
	str.replace(19, 6, str3, 7, 6); // 5 parameters
	cout << str << endl;
	str.replace(8, 10, "just a"); // 3 parameters
	cout << str << endl;
	str.replace(8, 6, "a shorty", 7); // 4 parameters
	cout << str << endl;

	cin.get();
	return 0;
}