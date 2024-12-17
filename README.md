[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/6WCkqZbI)
# Tic Tac Toe
<br/>(a)
<br/>Name of the project: Tic Tac Toe App
<br/>Names, ID and email:
<br/>-> Pranav Lekshminarayanan (2020AAPS1021G) - f20201021@goa.bits-pilani.ac.in
<br/>-> Garvit Arora (2020B2A72113G) - f20202113@goa.bits-pilani.ac.in
<br/>(b)
<br/>-> This app has single-player and two-player options for Tic Tac Toe after registering via e-mail
<br/>-> Clicking the plus floating action button creates a new game
<br/>-> There is also a menu bar button for logging out
<br/>-> Closing the app does not affect the number of wins, losses and draws stored by the app as it is stored in Firebase linked to your email
<br/>-> Bugs : The app does not check whether the email used is that specific person's or not. You cannot change the password either in case you forget it.
<br/>![image3](https://github.com/csf314-2023/a5-tic-tac-toe-a5_pranav-garvit/assets/129270909/210dd1b5-0520-4c7c-bbdb-27c34a4506ac)
![image2](https://github.com/csf314-2023/a5-tic-tac-toe-a5_pranav-garvit/assets/129270909/f43b3a49-483f-4d2a-8428-d2213a356004)
![image1](https://github.com/csf314-2023/a5-tic-tac-toe-a5_pranav-garvit/assets/129270909/81c7fb8b-2a57-455c-a276-45fb74e1aef1)
![image5](https://github.com/csf314-2023/a5-tic-tac-toe-a5_pranav-garvit/assets/129270909/82a9e9de-2d2c-4c9d-9a20-f05f16e7e6b9)

<br/>(c)
<br/>-> The authentication was done using firebase, the floating action button and all fragments were implemented using navigation graph.
<br/>-> Single-player is just randomized picking of boxes while multiplayer uses Firebase realtime database to connect the two players.
<br/>-> All the players wins draws and losses will be stored on firebase linked to their email ids.
<br/>-> Ideas were borrowed from the android documentation and also other codes that have implemented similar apps.
<br/>(d)
<br/>-> Once app is installed, register your email and set a password. After this, click on register or login.(password cannot be changed later)
<br/>-> Now you can see all the open games and the number of wins, losses and draws. Clicking on the plus button creates a new game of your choice. Clicking on the open games takes you into that specific game.
<br/>-> Pressing the back button in the middle of the game will ask you to forfeit the match. You can also logout using the 3 dots on the toolbar.
<br/>-> Hosting your own multiplayer game will cause other people online to see that there is an open match and they can click to play against you.
<br/>(e)
<br/>-> Unit testing was used to check the games logic, while instrumented tests to check the flow.
<br/>-> Accessibility was checked using the scanner which showed a few colour contrast issues and no labeling issues.
<br/>(f)
<br/>-> This assignment took about 35 hours. There were also many bugs that came up when firebase dependencies were added to the gradle.
<br/>(g)
<br/>-> I would rate this assignment a 9 in difficulty as it took a lot of time to understand concepts and then implementing them was even more time taking.
