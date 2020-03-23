import random
import timeit
def countingSort(arr, numAm): 
    end = [0] * (len(arr)) 
    begin = [0] * (10)
    for i in range(0, len(arr)): 
        num=(arr[i]//numAm)
        begin[(num)%10 ] += 1
    for i in range(1,10): 
        begin[i] += begin[i-1] 
    i = len(arr)-1
    while i>=0: 
        num= (arr[i]//numAm)
        end[begin[(num)%10 ] - 1] = arr[i] 
        begin[ (num)%10 ] -= 1
        i -= 1
    i = 0
    for i in range(0,len(arr)): 
        arr[i] = end[i] 

def radixSort(arr): 
    max1 = max(arr) 
    i = 1
    while max1/i > 0: 
        countingSort(arr,i) 
        i *= 10
arr=[0]*(1000000)
for i in range (1000000):
    arr[i]=random.randint(0,1000000)
start =timeit.default_timer()
radixSort(arr) 
end=timeit.default_timer()
print("Runtime " ,end-start)
  
