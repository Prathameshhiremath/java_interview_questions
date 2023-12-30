# str="Prathamesh"
# count=1
# if count<=10:            # it will print only 1 time see output
#     print(str)
#     count+=1

#without using for loop
count=1
def printer(name):
    global count
    if count<=10:
        print(name)
        count+=1
        printer(name)
printer("Prathamesh")


#list recurssion
lst=[12,34,12,34,56,78]
start=1
end=4
def iterator(lst,start,end):
    if start<0 or start>=end:
        return print("o hello ")
    print(lst[start])
    iterator(lst,start+1,end)

iterator(lst,start,end)

#factorial using recurrsion
n=8

def fact(n):
    if n==0:
        return 1
    else:
        return n*fact(n-1)

result=fact(n)
print(result)
