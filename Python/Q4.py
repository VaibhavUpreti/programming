import random
import statistics

z = int(input("enter the number of values: "))
p = int(input("enter the start of range: "))
y = int(input("enter the end of range: "))

frequency = {}
my_list = []
new_list=[]

for i in range(1, z + 1):
    x = random.randint(p, y)
    my_list.append(x)

print("List is", my_list)
print("Maximum No. is", max(my_list))
print("Minimum No. is", min(my_list))
print("Mode is ",statistics.mode(my_list))
print("Mean is ",statistics.mean(my_list))
print("Median is ",statistics.median(my_list))
for item in my_list:
    if item in frequency:
        frequency[item] += 1
    else:
        frequency[item] = 1
print(frequency)
for i in range(0,len(my_list)-1):
   if my_list[i+1]>=my_list[i]:
    new_list.append(my_list[i])
   else:
    new_list.append(my_list[i])
    print(new_list)
    new_list=[]
