GaraAuto

In questo esercizio ci sono quattro classi:

Auto: classe che rappresenta le auto. Esse sono dotate di un numero e di un'altro attributo chiamato metripercorsi. 
Tramite un metodo, metripercorsi verrà incrementato con un numero randomico da 0 a 200. Sono inoltre dotate di un attributo di tipo giudice. 
Una volta che ogni thread auto finisce di percorrere 1000 m chiama un metodo di giudice (autoArrivata) che permette di inserire l'auto in classifica e termina il metodo run.

Giudice: classe di gestione della gara. Il giudice è dotato di un array con tutte le auto partecipanti e un altro array inizialmente vuoto che si riempirà mano a mano che le auto percorrono 1000 metri. 
Nel metodo iniziogara il giudice fa partire tutti i thread auto con auto.start() e invoca un join() su tutte le auto per attendere che terminino il loro metodo 
run per poi continuare con il suo metodo run, in cui dopo la fine di tutte le auto semplicemente stampa l'array classificafinale.

GaraAuto: classe main. Ci viene creato il giudice e le auto vengono istanziate in base a un menù che fa scegliere all'utente se vuole inserire un'auto, 
far partire la gara o terminare l'esecuzione del programma. All'avvio della gara semplicemente viene invocato il metodo iniziogara del giudice.

GestoreFile: classe che gestisce la scrittura e la lettura su file. Permette, una volta finita la gara, di scrivere la classifica finale in un file chiamato classifica.txt 
e di leggere un'eventuale classifica di un'esecuzione precedente già salvata nel file classifica.txt.
