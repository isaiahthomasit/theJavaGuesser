JAVAC = javac
JAVA = java
MAIN = Guesser

.PHONY: all main run clean

all: main

main:
	$(JAVAC) $(MAIN).java
	$(JAVA) $(MAIN)

run: main

clean:
	rm: -f *.class
