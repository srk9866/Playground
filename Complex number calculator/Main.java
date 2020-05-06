# include <iostream>
using namespace std;
int main()
{
    int o,a,b,c,d;
    cin >> o;
    cin >>a>>b>>c>>d;
  if(o==1)
  {
     cout << a+c<<"-"<<b+d<<"i";
  }
  else if(o==2)
  {
     cout << a-c<<"+"<<b-d<<"i";
  }
  else if(o==3)
  {
     cout << a*c-b*d<<a*d+b*c<<"i";
  }
  else
  {
     cout << "Invalid choice";
  }

    return 0;
}