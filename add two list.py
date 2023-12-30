# Input: l1 = [2,4,3], l2 = [5,6,4]
# Output: [7,0,8]
# Explanation: 342 + 465 = 807

list1=[2,4,3]
list2=[5,6,4]

l=list1+list2
print(l)

l1=list1[::-1]
l2=list2[::-1]
a=''.join(str(e) for e in l1)
b=''.join(str(e)for e in l2)


print(l1)
print(a)
print(int(a)+int(b))