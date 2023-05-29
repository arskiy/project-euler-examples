"""
Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:

1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...

By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
"""

def fib(n):
    
    if n <= 1:
        return n
    return fib(n - 1) + fib(n - 2)

i = 1
count = 0
while True:
    x = fib(i)
    if x >= 4000000:
        break
    if x % 2 == 0:
        count += x
    i += 1

print(count)
