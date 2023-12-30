#-------HIERARCHIAL inheritance---------
class student:
        def __init__(self):
           self.name=input("Enter the name:")
           self.addr=input("Enter the address:")
           self.age=input("Enter the age:")
        def display(self):
           print("name:",self.name)
           print("address",self.addr)
           print("age:",self.age)
class ugstudent(student):
        def __init__(self):
           student.__init__(self)
           self.sem=input("Enter the sem:")
           self.fee=int(input("Enter the fee:"))
           self.stipend=int(input("Enter the still pending:"))
           ugstudent.display(self)
        def display(self):
           student.display(self)
           print("SEMESTER:",self.sem)
           print("FEES:",self.fee)
           print("STILL PENDING:",self.stipend)
class pgstudent(student):
        def __init__(self):
           student.__init__(self)
           self.sem=input("Enter the sem:")
           self.fee=int(input("Enter the fee:"))
           self.stipend=int(input("Enter the still pending:"))
           pgstudent.display(self)
        def display(self):
           student.display(self)
           print("SEMESTER:",self.sem)
           print("FEES:",self.fee)
           print("STILL PENDING:",self.stipend)
while True:
       # ch=int(input("Enter your choice:"))
        print("1.ugstudent/n 2.pgstudent/n 3.exit")
        ch=int(input("Enter your choice:"))
        if ch==1:
             ug=ugstudent()
        elif ch==2:
             pg=pgstudent()
        else:
             break
