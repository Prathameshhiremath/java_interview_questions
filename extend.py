#user
l1=["sds","sfsfs","qweqw23","ssfsfsdfs"]
l2=["dsfdsf","adasd","sdsad"]
for i in l1:
    l2.append(i)
print(l2)

#built
l1.extend(l2)
print(l1)

#dictinory
a={"P":1234,"v":2345,"q":2345}
b=list(a.keys())
print("keys",b)
print(b[-1],a[b[-1]])

#join 
a=['p','r','a','t','h','a','m']
b=''.join(a)
print(b)

