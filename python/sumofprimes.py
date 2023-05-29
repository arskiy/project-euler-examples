"""
The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.

Find the sum of all the primes below two million.
"""

primes = set()

def eratosthenes(n):
    multiples = set()
    for i in range(2, n+1):
        if i not in multiples:
            primes.add(i)
            for j in range(i*i, n+1, i):
                multiples.add(j)

eratosthenes(2000000)

print(sum(primes))
