# menu function
```
menu():
  print option 0: exit
  print option 1: human guesser
  print option 2: computer guesser

  prompt user to enter choice 0-2
  read user choice

  return user choice
```
# main function
```
main():
  initialize the user's choice as an empty string
  
  while choice is != to "0":
    call menu() and store the returned choice

    if choice = "1":
      run human guesser

    if choice = "2":
      run computer guesser

    else if choice is not "0":
      print error message
```
# humanGuesser function
```
humanGuesser():
  generate a random number 1-100
  initialize user's guess to 0 

  while the user's guess != the secret number:
    prompt the user to enter another guess
    read the guess

    if user's guess < secret number:
      print "too low"

    if user's guess > secret number:
      print "too high"

    else:
      print "correct! you got it!"

    return to menu
```
# computerGuesser function
```
computerGuesser():
  set lower bound to 1
  set upper bound to 100
  set correct to false

  set guess to the halfway point of the lower and upper bounds, rounded down

  while correct = false:
    calculate halfway point of the lower and upper bounds
    prompt user whether the guess is H (too high), L(too low), or C (correct)
    read user response

    if response = "L":
      lower bound = guess + 1

    else if response = "H":
      upper bound = guess - 1

    else if response = "c":
      correct = true

return to menu
```
  
  

