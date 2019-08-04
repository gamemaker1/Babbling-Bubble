# Babbling Bubble (or in short, Babble)
This is a Chat App designed specially for friends, families and office commitees/teams using Firebase for Android.

# How It Works
In this Chat App, a user can sign up using their email address and a password. The auth process is managed completely by FirebaseAuth UI.
They are then guided to the Home Screen (`GroupsActivity`) and shown the groups that they are a part of (using a `ListView` and `ArrayAdapter`). If there are no groups, a blank screen is displayed. There is also a small `+` button (`Floating Action Button`) at the bottom right corner which allows you to add groups. You can press the button, which takes you to another screen (`AddFriend`), where you enter a name for your Bubble (Chat room/group) and add other friends (Babblers) to it. You can however, add only 1 friend at a time. When you press the ADD FRIEND button, it opens up your preferred email app and fills in a message which you can edit. It also automatically fills in the To field witht he email address of the friend that you just entered. If you don't want to send an email, you can press the back button. It will still add the group, but it won't send an email to the friend.
When you press on the name of a Bubble (Chat room/group), it opens up the chatting screen (`ChatActivity`) with the title of the screen set to the Bubble name. You can send messages or photos. If you tap on the little checkbox button, it will take you to the Todos screen (`TodoActivity`), where you can add tasks. Anyone can claim these tasks and complete them. Whenever you add/claim/complete a task, a message will appear in the chat automatically, saying that you have added/claimed/completed a task. You cannot assign tasks or set deadlines for them to be completed as of now. If you tap on a task, it will show you the details and the CLAIM and COMPLETED buttons.
Regarding account settings, not much has been done. In an effort to keep this app simple, we have not allowed users or groups to have their own icons/display photos and wish to keep it that way. Apart from this, we also lack a password and email reset option. Since we do store emails in the database, it becomes very difficult to implement the email reset option. However, we still need a password reset options, which could be achieved easily using FirebaseAuth. You also have options to sign out, delete your account, view group info if your in a chat screen or todo screen and view the acknowledgements page.
For notifications, we have used Firebase Cloud Functions, which functions as a reliable server that sends notifications even if the app is in the background.
For troubleshooting, all you need to do is kill the app and then start it again. Press the square button on your phone and then locate the Babble screen and swipe it left or right to kill the app. Then press the app icon to start it up again.

# Installation
If you want to try out the app, you can go to the folder app in this repository. In this folder, you will see two subfolders called debug and release, which contain all APKs of this app. The debug APKs are test versions and may crash when you install them. The release APKs are the final, stable and working versions which you can use on an Android phone.
You may distribute copies of this app among your friends, family or team members for use, but you must not reproduce or use this commercially. Any changes that you may make to the code must be open-sourced again and you must add a pull request for the changes you have made.

# Todos
There are several bugs in the code: 
1. When you first install the app, the app will show the Home screen (`GroupsActivity`) with a `ProgressBar` going round and round forever. This is because you are not signed in and so, it cannot access the database. To get the app to work, you need to press the menu icon and then press the Sign Out option. This signs you out and gets you to the sign-in screen and then the app works smoothly.
2. When you add a friend, it deletes the entire info about the group, including the messages and todos, and then recreates the group with the same Bubble (Chat group) name and id and the list of people in the group. The reason behind this is that in the `GroupItem` class, there is a setter for setting an ArrayList as the list of the people in the Bubble. But that setter doesn't work, we have no idea why.
3. You cannot add multiple friends at once.
4. You get notified about a message you yourself sent.

Other than that, we still need to add useful comments in the code to let others know what we want to do.

**Thank you for contributing to or spreading word about this app!**
