# Assignment 3: Favorite Calculator
## By: Brandon Hampstead

To run the Favorite Calculator App, go to ```MainActivity.kt``` located in the ```src/main/``` 
and hit the play button. I used the Pixel 7 as my emulator for this assignment

### Quick Layout:

<b>MainActivity</b>: uses```supportFragmentManager``` and ```NavHostFragment``` to implement our navgraph

<b>HomeFragment</b>: navigates to MVPFragment and MVVMFragment using buttons connected to navgraph

<b>.mvp.MVP</b>: directory containing Presenter, Model and View (MVPFragment). 
The Contract interface provides rules for how the pieces interact

<b>.mvvm.MVVM: </b> directory that contains the Model ViewModel and View (MVVMFragment) for the MVVM architecture. 
ViewModel uses LiveData to ensure that data remains even after orientation change.