"""
A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
a2 + b2 = c2

For example, 32 + 42 = 9 + 16 = 25 = 52.

There exists exactly one Pythagorean triplet for which a + b + c = 1000.
Find the product abc.
"""

import math
def is_square(n):
    root = math.isqrt(n)
    return n == root * root

for a in range(1000):
    for b in range(1000):
        c = a ** 2 + b ** 2
        if is_square(c) and a + b + math.isqrt(c) == 1000:
            print(a * b * math.isqrt(c))
            break
