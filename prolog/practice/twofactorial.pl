
twofactorial(0,F,F).


twofactorial(N,A,F) :-
	N>0,
	A1 is N*A,
	N1 is N-1,
	twofactorial(N1,A1,F).


