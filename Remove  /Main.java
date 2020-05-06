#include <bits/stdc++.h> 
using namespace std; 
  
string removeWord(string str, string word)  
{ 
    // Check if the word is present in string 
    // If found, remove it using removeAll() 
    if (str.find(word) != string::npos) 
    { 
        size_t p = -1; 
  
        // To cover the case 
        // if the word is at the 
        // beginning of the string 
        // or anywhere in the middle 
        string tempWord = word + " "; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
  
        // To cover the edge case 
        // if the word is at the 
        // end of the string 
        tempWord = " " + word; 
        while ((p = str.find(word)) != string::npos) 
            str.replace(p, tempWord.length(), ""); 
    } 
  
    // Return the resultant string 
    return str; 
} 
  
// Driver Code 
int main(int argc, char const *argv[])  
{ 
    // Test Case 1: 
    // If the word is in the middle 
    string string1 = "remove the occurrence of the word from entered string"; 
    string word1 = "the"; 
  
    
  
    // Test case 1 
    cout  
         << removeWord(string1, word1) << endl; 
  
    
    return 0; 
} 