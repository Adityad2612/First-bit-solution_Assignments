#include<iostream>
using namespace std;

int main()
{
	int total_marks,eng, mar, hindi, maths, sci, obtain_marks;
	float percent;
	cout << "Enter marks for english\n";
	cin >> eng;
	
	cout << "Enter marks for Marathi\n";
	cin >> mar;
	
	cout << "Enter marks for Hindi\n";
	cin >> hindi;
	
	cout << "Enter marks for Maths\n";
	cin >> maths;
	
	cout << "Enter marks for Science\n";
	cin >> sci;
	total_marks = 500; 
	obtain_marks = eng + mar + hindi + maths + sci;
	percent = ((float)obtain_marks/total_marks)*100;
	cout<< "Student has obtained " << obtain_marks << " out of " << total_marks << " marks";
	cout << "\nPercentage of student is " << percent;

}
