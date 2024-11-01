/*
Given an integer x, return true if x is a palindrome, and false otherwise.

Example 1:

Input: x = 121
Output: true
Explanation: 121 reads as 121 from left to right and from right to left.
Example 2:

Input: x = -121
Output: false
Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.
Example 3:

Input: x = 10
Output: false
Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

*/

#include <iostream>
using namespace std;
bool palindrome(int);
bool palindrome(int num)
{
    int temp = num;
    int digit, rev = 0;
    if(num < 0){
        return 0;
    }

    while (temp)
    {
        digit = temp % 10;
        rev = rev * 10 + digit;
        temp /= 10;
    }
    if (num == rev)
    {
        return 1;
    }
    else
    {
        return 0;
    }
}
int main()
{
    int n;
    cout << "enter a number" << endl;
    cin >> n;
    if (n < 0)
    {
        cout << "it is not a palindrome number" << endl;
        return 0;
    }
    bool ans = palindrome(n);
    if (ans == 1)
    {
        cout << "it is a palindrome number" << endl;
    }
    else
    {
        cout << "it is not a palindrome number" << endl;
    }

    return 0;
}
