# a=10
# b=20
# a,b=b,a
# print("a:",a)
# print("b:",b)

a=10
b=20
print("Before",a)
a=a+b
print("after",a)

b=a-b
# print("b",b)
a=a-b
print("A",a)
print("B",b)

#i/p PRaThaMEsh
#o/p prAtHAmeSH
def swap_case(s):
    x=""
    for c in s:
        if c.isupper():
            c=c.lower()
        else:
            c=c.upper()
        x+=''.join(c)
        
    return x

if __name__ == '__main__':
    s = input()
    result = swap_case(s)
    print(result)


