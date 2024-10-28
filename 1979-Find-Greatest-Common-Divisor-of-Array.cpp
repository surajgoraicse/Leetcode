#include<bits/stdc++.h>
using namespace std;

int main() {
    int nums[] = { 3, 4, 5, 6, 7, 8, 9, 10 , 12 };
    int min = nums[0], max = nums[0];
    for (int i = 1; i < sizeof(nums) / sizeof(nums[0]); i++) {
        if (min > nums[i]) min = nums[i];
        if (max < nums[i]) max = nums[i];

    }
    int a = min, b = max;
    while (a && b) {
        if (a >= b) a = a % b;
        else b = b % a;
    }
    a > b ? cout << a : cout << b;


    return 0;
}