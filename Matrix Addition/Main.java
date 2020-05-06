#include<iostream>
using namespace std; 
int main ()
{
    int m, n, p, q, i, j, A[5][5], B[5][5], C[5][5];
  
    cin >> m >> n;
 
	
  
    for (i = 0; i < m; i++)
        for (j = 0; j < n; j++)
            cin >> A[i][j];
	
    for (i = 0; i < m; i++)
        for (j = 0; j < n; j++)
            cin >> B[i][j];		
    for (i = 0; i < m; i++)
        for (j = 0; j < n; j++)
            C[i][j] = A[i][j] + B[i][j];
   
    for (i = 0; i < m; i++)
    {    for (j = 0; j < n; j++)
            cout << C[i][j] << " ";	
        cout << "\n";
    }
    return 0;
}