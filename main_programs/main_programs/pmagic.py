class ope:
        def __init__(self):
                self.l1=[]
        def accept(self):
          n=int(input("Enter number of elements:"))
          for i in range(0,n):
              e=int(input("Enter element:"))
              self.l1.append(e)
              print(self.l1)
        def __add__(self,other):
                new_list=[]
                for i in range (0,len(self.l1)):
                        new_list.append(self.l1[i]+other.l1[i])
                print(new_list)
        def __sub__(self,other):
                new_list=[]
                for i in range (0,len(self.l1)):
                        new_list.append(self.l1[i]-other.l1[i])
                print(new_list)
        def __mul__(self,other):
                new_list=[]
                for i in range (0,len(self.l1)):
                        new_list.append(self.l1[i]*other.l1[i])
                print(new_list)
        def __floordiv__(self,other):
                new_list=[]
                for i in range (0,len(self.l1)):
                        new_list.append(self.l1[i]//other.l1[i])
                print(new_list)
        def __pow__(self,other):
                new_list=[]
                for i in range (0,len(self.l1)):
                        new_list.append(self.l1[i]**other.l1[i])
                print(new_list)
