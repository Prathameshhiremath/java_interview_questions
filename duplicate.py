#repeated element for 2 list 
l2=["ss",1,2,"ss",2,1,1]
d2=[1,2,3,2,1,1]
rep=[]   # it will check like ss==ss and ss is not in rep then insert it ,if ss==j then it go outside loop
l1=l2+d2
for i in range(len(l1)):

    for j in range(i+1,len(l1)):
        if l1[i]==l1[j] and l1[i] not in rep:
            rep.append(l1[i])
            

print("Repeated elements are:",rep)
#repeated elemet for 1 list
l=[1,2,1,2,1,3]
d=[]
for i in range (len(l)):
    for j in range(i+1,len(l)):
        if l[i]==l[j] and l[i] not in d:
            d.append(l[i])

print("repeated elements",d)


#perfect uniq

#uniqenuess which is not repeated
l = ["hjbb",1, 2, 1, 2, 2, 3]
unique_list = []
repeated_list = []

for num in l:
    if num not in unique_list and num not in repeated_list:
        unique_list.append(num)
    elif num in unique_list:
        unique_list.remove(num)
        repeated_list.append(num)

print(unique_list)
print(repeated_list)


#built in method(uniq)
newlist=[]
for i in l:
    if l.count(i)==1:
        newlist.append(i)

print("NL",newlist)

#aaaa,bb,cccc,dd,eeeeee 
# o/p a:4,b:2,c:3,d:2,e:6
list="a,a,a,b,b,c,c,c,c,d,d,e,e,a,e,e,e,e"
mylist=list.split(',')
visit=[]
l2=[]
for char in list:
    if char not in visit:
     l2.append(f"{char}:{mylist.count(char)}")  #count the charactr how many times repated
     visit.append(char)

list2=" ".join(l2)
print(l2)

#o/p   4a2b3c4d
list="a,a,a,a,b,b,c,c,c,c,d,d,e,e,e,e,e,e"

mylist=list.split(',')
visit=[]
l2=[]
for char in list:
    if char not in visit:
     l2.append(f"{mylist.count(char)}{char}")
     visit.append(char)

list2="".join(l2)

print(list2)


# #print("\"python uses *\\n for newline\"")


# print("/\\/\\")

