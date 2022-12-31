# Transpose a matrix
import numpy as np
matrix = np.matrix( [ [ 1, 2, 3 ],
                      [ 4, 5, 6 ],
                      [ 7, 8, 9 ] ] )

print("Matrix =\n",matrix)
print("\nWith ndarray.transpose() method")
print(matrix.transpose())

x = np.array([[1, 2], [4, 5]])
y = np.array([[7, 8], [9, 10]])
 
print("\nMatrix x =\n",x)
print("Matrix y =\n",y)
# using add() to add matrices
print ("\nThe element wise addition of matrix is : ")
print (np.add(x,y))
 
# using subtract() to subtract matrices
print ("\nThe element wise subtraction of matrix is : ")
print (np.subtract(x,y))
 
# using dot() to multiply matrices
print ("\nusing dot() to multiply matrices:")
print (np.dot(x,y))

# sum with axis params 
print ("\nThe summation of elements=")
print (np.sum(matrix))

print ("\nThe column wise summation=")
print (np.sum(matrix,axis=0))

print ("\nThe row wise summation=")
print (np.sum(matrix,axis=1))
