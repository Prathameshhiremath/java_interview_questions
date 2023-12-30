# Iterator-Iterator in which it travels throgh each sequence of iterable objects that us called itertors

l=[1,2,3,4]
a=iter(l)
print(next(a)) #1
print(next(a)) #2
# print(next(a))
# print(next(a))
for ele in a:
    print(ele)  # 3 4