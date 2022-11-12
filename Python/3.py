#while loop
terms= int(input("enter no. of terms for fibonacci:"))
a=0
b=1
i=0
print(a,end=',')
while i < terms:
    c=b+a
    a=b
    b=c
    print(c,end=',')
    i += 1

#for loop
print("\n")
j=0
for j in range(0,9):
    j += 1
    if j == 4:
        continue
    print(j,end=',')

print("\n")

#nested-loop
k=0
m=0
for k in range(0,3):
    for m in range(5,10):
        print(m+k,end=",")
    print("\n")
