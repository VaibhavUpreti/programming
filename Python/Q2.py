#

import random as rd

x = int(input("Enter no. of inputs: "))
l = []
# r = rd.randint(0,100)
for i in range(0, x):
    r = rd.randint(0, 100)
    if r in range(1, 6):
        l.append(r)
    elif r in range(6, 31):
        l.append(r**2)
    else:
        continue
print(l)
