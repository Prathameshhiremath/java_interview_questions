d=dict()
class emp:
	def add(self):
	   self.name=input("Enter your name:")
	   self.addr=input("Enter your address:")
	   self.basic_salary=int(input("Enter your basic salary:"))
	   self.h=float(input("Enter your hra%:")) 
	   self.d=float(input("Enter your da%:"))
	   self.l=float(input("Enter your lic amount:"))
	   self.n=float(input("Enter your loan amount:"))
	   self.hra=(self.h/100)*self.basic_salary
	   self.da=(self.d/100)*self.basic_salary
	   self.gross_salary=self.basic_salary+self.hra+self.da
	   self.tds=0.10*self.basic_salary
	   self.deduction=1800+self.l+self.n+self.tds
	   self.net_salary=self.gross_salary-self.deduction
	   self.update()
	def update(self):
	   d.update({self.name:{"name":self.name,"address":self.addr,"basic salary":self.basic_salary,"hra":self.hra,"da":self.da,"gross salary":self.gross_salary,"deduction":self.deduction,"net_pay":self.net_salary}}) 
	def display(self):
	   print(d)
	def search(self,name):
	   for keys in d:
	    if keys == name:
	      print(d[name])
	    else:
	      print("emp not found")
obj=emp()
while True:
     print("1.add emp\n 2.display\n 3.search\n 4.exit\n")
     ch=int(input("Enter your choice"))
     if ch==1:
        obj.add()
     elif ch==2:
        obj.display()
     elif ch==3:
        name=input("Enter the name of emp")
        obj.search(name)
     elif ch==4:
        break
     else:
          print("enter correct value")
