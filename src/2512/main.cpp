#include <iostream>
#include <algorithm>
#include <malloc.h>
#include <vector>
#include <functional>

using std::cin;
using std::cout;
using std::vector;
int main() {
    std::ios_base::sync_with_stdio(false);
    int n, m;

    cin >> n;
    vector<int> v;
    for (int i = 0; i < n; ++i) {
        int t;
        cin >> t;
        v.push_back(t);
    }
    sort(v.begin(), v.end());
    cin >> m;
    int start = 0, remain = n;
    int i;
    for (i =0; i < n; ++i) {
        if (start + v[i] * remain > m) {
            break;
        }
        start += v[i];
        --remain;
    }
    if (i == n)
        cout << v[n-1];
    else if (i != 0)
        cout << (m-start- v[i-1]*remain)/remain + v[i-1];

    else
        cout << m/n;
	return 0;
}
