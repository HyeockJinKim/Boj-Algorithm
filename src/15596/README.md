# 정수 N개의 합
#### 시간 제한
> 0.1 초
#### 메모리 제한
> 512 MB
### 문제 내용

정수 n개가 주어졌을 때, n개의 합을 구하는 함수를 작성하시오.
작성해야 하는 함수는 다음과 같다.

C, C11, C (Clang), C11 (Clang): long long sum(int *a, int n);

a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
n: 합을 구해야 하는 정수의 개수
리턴값: a에 포함되어 있는 정수 n개의 합


C++, C++11, C++14, C++17, C++ (Clang), C++11 (Clang), C++14 (Clang), C++17 (Clang): long long sum(std::vector<int> &a);

a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
리턴값: a에 포함되어 있는 정수 n개의 합


Python 2, Python 3, PyPy, PyPy3: def solve(a: list) -> int

a: 합을 구해야 하는 정수 n개가 저장되어 있는 리스트 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
리턴값: a에 포함되어 있는 정수 n개의 합 (정수)


Java: long sum(int[] a); (클래스 이름: Test)
	
a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
리턴값: a에 포함되어 있는 정수 n개의 합


Go: sum(a []int) int

a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
리턴값: a에 포함되어 있는 정수 n개의 합




### 입력
None
### 출력
None
### 분류
미분류
> This problem is in [Boj 15596 problem](https://www.acmicpc.net/problem/15596)

## Solution
### [C-language Solution](./main.c)
#### 걸린 시간
> 8 ms
#### 사용한 메모리
> 12836 KB
#### 코드 Byte
> 127 B
### [Java-language Solution](./main.java)
#### 걸린 시간
> 28 ms
#### 사용한 메모리
> 387332 KB
#### 코드 Byte
> 209 B
