f1=open("one.txt",'r')
f2=open("two.txt",'w')
for line in f1:
    f2.write(line)
f1.close()
f2.close()
while True:
     print("\n1. Check ValueError ")
     print("2. Check FileNotFoundError ")
     print("3. Check TypeError ")
     print("4. Check IOError ")
     print("5. Check NameError ")
     print("0. Exit ")
     n=int(input("\n Enter Your Choice : "))
     if n==1:
          try:
            f=open('one.txt','z')
            print("Success")
          except ValueError:
            print("ValueError Found")
     elif n==2:
            try:
              f=open('f5.txt','r')
              print("Success")
            except FileNotFoundError:
              print("File Not Found Error")
     elif n==3:
            try:
              f=open('f1','r','w')
              print("Success")
            except TypeError:
              print("Type Error Found")
     elif n==4:
            try:
              f=open('f1','r')
              f.write("Sample")
              print("Success")
            except IOError:
              print("IO Error Found")
     elif n==5:
            try:
              f=opens('f1','r')
              print("success")
            except NameError:
              print("Name Error Found")
     elif n==0:
            break
     else:
            print("Invalid Input ")
