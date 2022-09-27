a = 5
b = 7
c = 9

if a > b:
    if a > c:
        print("a is largest")
    else:
        print("c is largest")

elif b > c:
    if b > a:
        print("b is largest")

    else:
        print("c is largest")

else:
    print("c is largest")
