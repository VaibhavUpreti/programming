print("Understading loops in Python")

import random as rd
# for loop
for i in range(0, 11):
    print(i, sep="", end="#")
    i += 1
# while (True):
#     print('-_-')


x = "hi"
try:
    print(x)
except:
    print("Something went wrong")
finally:
    print("The 'try except' is finished")


tup1 = [(1,6),(2,3),(431,21),(32,12),(91,312)]

for a,b in tup1:
    print(a, " + ", b," =", a+b)

for i in range(3, 16, 3):
    print(i)



# multiplication table
# fibonaci 
# random number guess

print("Random number Guess- Enter number:")

a = int(input("Guess number between 1 and 20 :  "))
rand_int = rd.randrange(1 , 20)


if a == rand_int:
    print("Correct Guess... the number was", rand_int)

elif a != rand_int:
    print("Better luck next time... the number was", rand_int)






def fibonacci(m):
    for i in range(1,m):

        print(i)



def reverseFibonacci(n):
    a = [0] * n
    a[0] = 0
    a[1] = 1
    for i in range(2, n): 
        a[i] = a[i - 2] + a[i - 1]
    for i in range(n - 1, -1 , -1): 
        print(a[i],end=" ")
      
n = 25
m = 25
reverseFibonacci(n)
fibonacci(m)


fib = lambda n: n if n < 20 else fib(n-1) + fib(n-2)

for i in (1,20):
    print(fib)
