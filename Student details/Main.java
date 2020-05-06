#include<iostream>
#include<string.h>
using namespace std;
struct student
{
    char name[50],depart[50];
    int year;
    float gpa;
} s[10];
void sortname(student x[],int n)
{
for (int i=0;i<n-1;i++)
for (int j=i+1;j<n;j++)
if (strcmp(x[i].name,x[j].name)>0)
swap(x[i],x[j]);
}
int main()
{
  int i,n;
  cout<<"Enter the number of students";
  cin>>n;
  for(int i = 0; i < n; ++i)
    {
    cout<<"\nEnter the details of student "<<i+1;
    cout<<"\nEnter name";
    cin>>s[i].name;
    cout<<"\nEnter department";
    cin>>s[i].depart;
    cout<<"\nEnter year of study";
    cin>>s[i].year;
    cout<<"\nEnter cgpa";
    cin>>s[i].gpa;
    }
  sortname(s,n);
  cout<<"\nDetails of students";
    for(int i = 0; i < n; ++i)
    {
        cout << "\nStudent " << i+1 ;
        cout << "\nName:" << s[i].name ;
        cout << "\nDepartment:" << s[i].depart ;
        cout<<"\nYear of study:"<<s[i].year;
        cout<<"\nCGPA:"<<s[i].gpa;
    }
    return 0;
}