//
//  main.cpp
//  AlgorithmCpp
//
//  Created by 김혁진 on 18/11/2018.
//  Copyright © 2018 김혁진. All rights reserved.
//

#include <iostream>
#include <vector>

using namespace std;
int main(int argc, const char * argv[]) {
    // insert code here...
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    std::vector<int> v;
    int n;
    cin >> n;
    v.reserve(n);
    for (int i = 0; i < n; ++i) {
        int input;
        cin >> input;
        v.push_back(input);
    }
    int cur = 2, count = 0;
    for (int i = 0; i < n; ++i) {
        if (cur == 2 && v[i] == 0) {
            cur = 0;
            ++count;
        } else if (cur == 0 && v[i] == 1) {
            cur = 1;
            ++count;
        } else if (cur == 1 && v[i] == 2) {
            cur = 2;
            ++count;
        }
    }
    cout << count;
    return 0;
}
