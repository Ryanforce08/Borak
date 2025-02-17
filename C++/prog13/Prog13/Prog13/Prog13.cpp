#include <iostream>
using namespace::std;

int main() {
	string s1 = "Hello, my name is Brian.";
	string s2 = "Hello";
	string s3 = "World";
	string s4 = "a";
	string s5 = "";
	string s6 = "cat";
	string s7 = "apple";
	string s8 = "banana";
	char c1 = 'Q';
	char c2 = 'Z';
	int num1 = 2;
	int num2 = 15;
	int num3 = 7;

	// Returns the number of characters stored in the string
	//return type is int
	cout << "length;";
	cout << s2.length() << endl;
	

	//returns the chars at the num in the string
	//return type is char
	cout << "at;";
	cout << s1.at(num1) << endl;

	//return the number of chars until set char
	//return type is int
	cout << "find;";
	cout << s1.find(s4) << endl;

	//Searches for the first occurrence of substring s4 (a) in string s1 starting from num2 (15) 
	//return type is int
	cout << "find;";
	cout << s1.find(s4, num2) << endl;

	//Compares the strings starting char to the alpabet for example if s7 starts with 'a' it will be greater than s8 which begins with 'b' so it will return a negitive int:
	//it returns 0 if they are equal place in the alphabet, a negative value if its being compared to a lower place, or a positive value if its in a higher place. 
	//return type is int
	cout << "\n\ncompare;";
	cout << "string s6 = cat string s7 = apple string s8 = banana" << endl;
	cout << "s6" << endl;
	cout << s6.compare(s7) << endl;

	cout << s6.compare(s8) << endl;
	cout << "s7" << endl;
	cout << s7.compare(s6) << endl;

	cout << s7.compare(s8) << endl;
	cout << "s8" << endl;
	cout << s8.compare(s6) << endl;

	cout << s8.compare(s7) << endl;

	cout << s8.compare(s8) << endl;

	//Checks if there is something in the sring then returns true if there is nothing and false if there is something 
	//return type is bool
	cout << "\n\nempty;";
	cout << s5.empty() << endl;

	cout << s1.empty() << endl;

	//returns the substrin starting at num one with num 2 being the amount of chars
	//return type is string
	cout << "substr;";
	cout << s1.substr(num1, num2) << endl;

	cout << s1 << endl;

	//swaps string 2 and 3
	//return type is void
	cout << "swap;";
	s2.swap(s3);
	cout << s2 << endl;

	cout << s3 << endl;

	//sets first char as the var c1 for example 
	//return type is char
	cout << "front;";
	s1.front() = c1;
	cout << s1 << endl;

	//sets last char as c2 for example 
	//return type is char
	cout << "back;";
	s1.back() = c2;

	cout << s1 << endl;

	//removes chars in between the 2 nums
	//return type is string
	cout << "erase;";
	cout << s1.erase(num3, num1) << endl;

	cout << "\n\n\n\n";

	string base = "this is a test string.";
	string str2 = "n example";
	string str3 = "sample phrase";
	string str4 = "useful.";

	string str = base;
	cout << str << endl;
	cout << "replace;";
	//replacs the chars in betwee the nums with the set new string
	//return type is string
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