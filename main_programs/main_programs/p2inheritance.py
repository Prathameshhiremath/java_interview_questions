d={}
class student:
        def read(self):
                self.name=input("Enter student name:")
                self.usn=input("Enter the usn:")
                self.age=int(input("Enter the age:"))
        def display(self):
                print("Name:",self.name)
                print("USN:",self.usn)
                print("Age:",self.age)
class derive1(student):
        def read(self):
                student.read(self)
                self.sem=input("Enter the semester:")
                self.m=[]
                self.total=0
                for i in range(1,6):
                        self.marks=int(input("Enter marks:"))
                        self.m.append(self.marks)
                        self.total+=self.marks
                        self.perc=(self.total/250)*100
                derive1.display(self)
        def display(self):
                student.display(self)
                print("Semester:",self.sem)
                for i in range (5):
                        print(self.m[i])
                print("Percentage:",self.perc)
class derive2(derive1):
        def read(self):
                derive1.read(self)
                d.update({self.name:{
                "name":self.name,
                "usn":self.usn,
                "age":self.age,
                "semester":self.sem,
                "sub":self.m,
                "total":self.total,
                "percent":self.perc
                }})
def printtemp():
        for key in d:
                print(key,d[key])
while True:
        print("1.add\n2.display\n0.exit\n")
        ch=int(input("Enter your choice:"))
        if ch==1:
                der=derive2()
                der.read()
        elif ch==2:
                printtemp()
        elif ch==0:
                break
        else:
                print("Wrong choice\n")
