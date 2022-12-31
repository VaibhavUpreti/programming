from faker import Faker

#'hi_IN' changed the language
fake = Faker('hi_IN')	

for i in range(0, 10):
	print('Name->', fake.name(),
		'Country->', fake.country())
fake = Faker()
  
fake.seed(1)
print(fake.name())
print(fake.address())
print(fake.email())





with open('students.json', 'w') as fp: 
    json.dump(student_data, fp)
