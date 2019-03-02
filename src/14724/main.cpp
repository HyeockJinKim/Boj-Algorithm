//
//  14724.cpp
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
    int n;
    std::vector<int> v;
    cin >> n;
    v.reserve(n*7);
    int max = 0, maxIndex = 0, temp;
    for (int i = 0; i < 9; ++i) {
        for (int j = 0; j < n; ++j) {
            cin >> temp;
            if (max < temp) {
                max = temp;
                maxIndex = i;
            }
        }
    }
    
    switch (maxIndex) {
        case 0:
            cout << "PROBRAIN";
            break;
        case 1:
            cout << "GROW";
            break;
        case 2:
            cout << "ARGOS";
            break;
        case 3:
            cout << "ADMIN";
            break;
        case 4:
            cout << "ANT";
            break;
        case 5:
            cout << "MOTION";
            break;
        case 6:
            cout << "SPG";
            break;
        case 7:
            cout << "COMON";
            break;
        default:
            cout << "ALMIGHTY";
            break;
    }
}
