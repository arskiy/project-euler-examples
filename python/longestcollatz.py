"""
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:
13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?
"""

def next_collatz(n):
    if n % 2 == 0:
        return n / 2
    else:
        return 3 * n + 1

best_start = 0
best_count = 0
for start in range(1, 1000000):
    current = start
    count = 1
    while current != 1:
        current = next_collatz(current)
        count += 1
    if count > best_count:
        best_start = i
        best_count = count

print("----------------")
print(best_n)
print(best_count)
    