# River Crossing Problem 

Некаде близу Редмонд, Вашингтон, има брод кој го користат Linux хакерите (hackers) и вработените во Microsoft (serfs), за премин на реката за да стигнат на работното место. Бродот се дивижи од едната на другата страна на реката ако и само ако на него се качат точно четворица патници.  Поради големото ривалство на вработените од двете компании, не е дозволено на бродот да има еден вработен од едната и тројца вработени од другата компанија. Сите други комбинации се дозволени. Од таа причина, ве изнајмуваат вас да направете софтвер кој ќе го регулира преминот на реката.

Во почетниот код кој е даден, дефинирани се класите Hacker и SerfОд секоја од класите паралелно се активни повеќе инстанци кои на бродот може да се качат само еднаш.

Во имплементацијата мора да ги искористите следните методи од веќе дефинираната променлива state:
	

##  -  	state.board() 
- секој вработен кој се качува на бродот ја повикува оваа функција,
- треба да гарантирате дека секој од четирите патници кои се качуваат на бродот го има повикано овој метод пред да биде повикан методот rowboat().
	

##  -   state.rowBoat()   
- методот треба да биде повикан откако претходно сите четири патници го повикале методот board()
- треба да гарантирате дека методот ќе биде повикан само од еден од четворицата патници, независно од кој.

Вашата задача е да ги имплементирате методите 

	Hacker.cross()
	Serf.cross() 
	init().
 При имплементацијата не смеете да користите try-catch блокови во нив. Потребните семафори и глобални променливи треба да ги дефинирате самите.

Доколку имате грешка, ќе ја добиете пораката:

	Procesot ne e sinhroniziran spored uslovite na zadacata.

После пораката ќе ви се прикаже логот на повикување на акциите и настанатите грешки. Овој лог треба да ви послужи за увидување на тоа каде имате грешка во извршувањето на вашата задача.

Напомена:
 Поради конкурентниот пристап за логирањето, можно е некои од пораките да не се на позицијата каде што треба да се. Токму затоа, овие пораки користете ги само како информација, но не се ослонувајте на нив.

