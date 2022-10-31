friends(ram,shyam).
friends(shyam,ram).

likes(ram,shyam) :- 
	friends(ram,shyam).

rises(sun,east).

truth(sun,east) :- 
	rises(sun,east).

heal(patient,medicine).

curve(patient,medicine) :-
	heal(patient,medicine).
codes(programmer,app).

creates(programmer,app) :- 
	codes(programmer,app).


