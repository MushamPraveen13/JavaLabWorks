import prettytable as pt
#Creating a prettytable object.
table = pt.PrettyTable()
table.add_column("Name",['Praveen','Omair','Yethishwar','Manoj','Prushotham'])
table.add_column('Marks',[94,90,97,99,100])
table.align = 'l' #Alligned data to the left
print(table)
