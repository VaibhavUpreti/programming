from faker import Faker
from faker.providers import BaseProvider
import random
import csv
import datetime
import pandas as pd

class GenereProvider(BaseProvider):
    def movie_genre(self):
        return random.choice(['Documentary', 'Thriller', 'Mystery', 'Horror', 'Action', 'Comedy', 'Drama', 'Romance'])
fake = Faker()

fake.add_provider(GenereProvider)

def get_movie_name():
    words = fake.words()
    capitalized_words = list(map(str.capitalize, words))
    return ' '.join(capitalized_words)

def get_movie_date():
    return datetime.datetime.strftime(fake.date_time_this_decade(), "%B %d, %Y")

def get_movie_len():
    return random.randrange(80, 150)

def get_movie_rating():
    return round(random.uniform(1.0, 5.0), 1)

def generate_movie():
    return [get_movie_name(), fake.movie_genre(), get_movie_date(), get_movie_len(), get_movie_rating()]

with open('movie_data.csv', 'w') as csvfile:
    writer = csv.writer(csvfile)
    writer.writerow(['Title', 'Genre', 'Premiere', 'Movie Length', 'IMDB Score'])
    for n in range(1, 20):
        writer.writerow(generate_movie())

df = pd.read_csv('movie_data.csv')
print(df)
