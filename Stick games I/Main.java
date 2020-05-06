#include <bits/stdc++.h>


#define fl(n) for(int i = 0; i < n; i++)


#define ll long long
#define nl endl
#define init -9999
#define INF 1e9
#define u unsigned

using namespace std;


int main()
{
    /*

    Ideal 0 moves game:
    0 0 0
    0 0 0
    Turn 1 move -auto-
    1 1 1
    1 0 0
    Turn 2 move -auto-
    1 1 1
    1 1 1
    Turn 1 has no moves
    Turn 2 player wins.
    */

    int n,m;
    cin >> n >> m;

    int sticks = n+m;
    int rem = sticks;
    int win;
    int turn = 1;

    if(n == 1) {cout << "Arun Gupta"; return 0;}
    if(sticks > n*m) {cout << "Akshat"; return 0;}


    for(int i = 0; i < sticks; i++)
    {
        if(turn == 1)
        {
            rem -= 2;
            //cout << rem << endl;
            if(rem <= 1) { win = 1; break; }
            turn = 2;
        }
        else if(turn == 2)
        {
            rem -= 2;
            //cout << rem << endl;
            if(rem <= 1) { win = 2; break; }
            turn = 1;
        }
    }
    if(win == 1) cout << "Mani Iyer";
    else if(win == 2) cout << "Mani Iyer";

    return 0;
}