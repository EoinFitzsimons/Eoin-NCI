import numpy as np
import time

randoms1 = np.random.randint(1000, size=100)
randoms2 = np.sort(randoms1)
randoms3 = randoms2 + randoms1
randoms4 = np.sort(randoms3)

print (randoms4)

def linear(data,query):
    index = 0
    found = False
    for item in data:
        if (item == query):
            print('Found at: ',index)
            found = True

        index+=1
    if(found==False):
        print('Not in System')

linear(randoms4, 500)

def binary(data, query):

    lower = 0
    upper = len(data)
    
    notFound = True
    foundIndex = -1

    while(notFound and lower <= upper):
        mid = (upper - lower)//2 + lower
        if(data[mid] == query):
            notFound = False
            foundIndex = mid
        elif(data[mid] > query):
            upper = mid - 1
        else:
            lower = mid + 1
    print ('Value Index: ', foundIndex)

myRandoms = np.random.randint(10000000, size=1000000)
myRandoms[50] = 500

sortRandoms = np.sort(myRandoms)

print(sortRandoms)

timeBefore = time.time_ns()
binary(sortRandoms, 500)
timeAfter = time.time_ns()

print(timeBefore)
print(timeAfter)