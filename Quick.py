import random
import timeit
def split(arr,low,high): 
    max = arr[high]    
  
    for j in range(low , high): 
  
        if   arr[j] <max: 
          
           low+=1
            arr[low-1],arr[j] = arr[j],arr[low-1] 
  
    arr[low],arr[high] = arr[high],arr[low] 
    return (low) 
def sortArr(arr,low,high): 
    if low < high: 
        k = split(arr,low,high) 
        sortArr(arr, low, k-1) 
        sortArr(arr, k+1, high) 

for i in range (len(arr)):
    arr[i]=random.randint(0,1000000)
start =timeit.default_timer()
sortArr(arr,0,len(arr) -1) 
end=timeit.default_timer()
print("Runtime " ,end-start)