from pmagic import*
obj1=ope()
obj2=ope()
obj1.accept()
obj2.accept()
while True:
        print("1.addition\n 2.subtraction\n 3.multiplication\n 4.floordivision\n 5.power")
        ch=int(input("Enter your choice"))
        if ch==1:
           obj1+obj2
        elif ch==2:
           obj1-obj2
        elif ch==3:
           obj1*obj2
        elif ch==4:
           obj1//obj2
        elif ch==5:
           obj1**obj1
        else:
           break
