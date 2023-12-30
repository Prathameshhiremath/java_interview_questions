# i/p hello hello hi hi hm hm
# o/p hello:3 hi:2 hm:2 aswell as if user no is greter thena ewual to count print that value

str="hello hi hm "
l1=str.split()
user=2
count=dict()
for word in l1:
    if word in count:
        count[word]+=1
    else:
        count[word]=1

# print(count)
# a=[]
# for c in count:
#     if count[c]>=user:
#         a.append(c)
# if len(a)>0:
#     print(a)
# else:
#     print("na")
list1=[2,4,3]
list2=[5,6,4]

l=list1+list2
print(l)

l1=list1[::-1]
l2=list2[::-1]
# a=''.join(l1)
# b=''.join(l2)
# a=''.join(l1)

print(l1)
# print(a)

print(dir())