# A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

# Find the largest palindrome made from the product of two 3-digit numbers.


best = 0
for i in range(100, 1000):
    for j in range(100, 1000):
        p = i * j
        if str(p) == str(p)[::-1] and p > best:
            best = p
            print(p)
            
print(best)
