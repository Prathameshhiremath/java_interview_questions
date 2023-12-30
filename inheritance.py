# #single
# class Sum:
#     def sum(self,a,b):
#         self.a=a
#         self.b=b
    
#     def result(self):
#         result=self.a+self.b
#         print(result)

# class taking(Sum):
#     def add(self):
#         num1=int(input())
#         num2=int(input())
#         self.sum(num1,num2)
#         result=self.result()
#         return result
    
# a=taking()
# a.add()

#multiple
class A:
    def num1(self,a):
        self.a=a
    
class B:
    def num2(self,b):
        self.b=b

class C(A,B):
    def result(self):
        return self.a+self.b

a=C()
a.num1(1)
a.num2(2)
c=a.result()
print(c)
    