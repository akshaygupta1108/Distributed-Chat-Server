# Distributed Chat Server 
------------------------------------------------------------------------------------------------

A distributed chat server through which many clients can interact with each other and send chat and
audio messages , create , join and leave chat rooms , and can send files to other Clients .

## Pre-requirements


* JDK 1.8 or above
------------------------------------------------------------------------------------------------

## How to Run

* Extract the project 
* Move to the `distributed-chat` folder
* Run Command on the terminal ---- **`make`**
* Run Command on the terminal ----  **`java -cp bin Main`**
* Follow the instructions as in GUI
* To setup SERVER
    * First argument is port Number 

* To add CLIENTS
    * First argument is Client Name
    * Second argument is port through which Client communicates with other Clients

* Opening Chat Rooms
* Add another Client through GUI and chatting can be done

---------------------------------------------------------------------------------------------------

## Functionality

* Create Chat Room - *press  `create room`* , a window pops-up , enter your room-name  and *press `ok`* to create a new chat room.
* Join Chat Room - *press  `join room`* , a windo pops-up , enter the *`room-id`* of the room , you want to enter and *press `ok`*.
* List Chat Room(s) - *press  `list rooms`* , to see all the current *Chat rooms* with their *room-id* in the paranthesis.
* List User(s) - *press  `list users`* , to see all the current users connected to that server .
* Start Recording - *press  `start recording`*  , to start audio recording .
* Stop & Send - *press  `stop & send`* , to send the recorded audio as message .
* Cancel Recording - *press  `cancel recording`* , to cancel the recorded audio .
-----------------------------------------------------------------------------------------------------

### Created by -
* Ishan Arora (**IIT2017501**)
* Vikrant Singh (**IIT2017502**)
* Srikar Anand Yellapragada (**IIT2017504**)
* Akshay Gupta (**IIT2017505**)