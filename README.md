# Babbling Bubble (or in short, Babble)
This is a Chat App designed specially for friends, families and office commitees/teams using Firebase for Android.

# Features
**Sign-in/Sign-up** - Using email-password login.

**Groups (Called Bubbles)** - Can be created by entering your friend's email address. It will also allow you to automatically send an email to the friend, alerting him/her via email that you have added him/her to the Bubble.

**Chatting** - Simple text messages and images from your phone. You can also share text/links from other apps/websites, but not images as of yet.

**Todos** - You can add todos for each group. Anyone can claim and complete the todos. As of now, you cannot assign the task to someone or set a deadline for completion.

**Privacy Guarenteed** - This app uses [Firebase](https://firebase.google.com/) to manage authentication and store its data. Firebase is completely secure and trusted by a large number of tech companies. None of your data is sold to any other companies.


# Installation
If you want to try out the app, you can go to the folder app in this repository. In this folder, you will see two subfolders called debug and release, which contain all APKs of this app. The debug APKs are test versions and may crash when you install them. The release APKs are the final, stable and working versions which you can use on an Android phone. You can also visit find the APKs on  [Google Drive](https://drive.google.com/drive/folders/19ti7K6VNlwhNq70YjcckOWZdzqFeiOPI?usp=sharing).
You may distribute copies of this app among your friends, family or team members for use, but you must not reproduce or use this commercially. Any changes that you may make to the code must be open-sourced again and you must add a pull request for the changes you have made. If you want to change the code, please set up your own Firebase project and do not use the existing Firebase project.
You will need to download an individual google-services.json by linking the app with your Firebase project.


# Todos
There are several bugs in the code: 
1. When you first install the app, the app will show the Home screen (`GroupsActivity`) with a `ProgressBar` going round and round forever. This is because you are not signed in and so, it cannot access the database. To get the app to work, you need to press the menu icon and then press the Sign Out option. This signs you out and gets you to the sign-in screen and then the app works smoothly.
2. When you add a friend, it deletes the entire info about the group, including the messages and todos, and then recreates the group with the same Bubble (Chat group) name and id and the list of people in the group. The reason behind this is that in the `GroupItem` class, there is a setter for setting an ArrayList as the list of the people in the Bubble. But that setter doesn't work, we have no idea why.
3. You cannot add multiple friends at once.
4. There are no settings for the user (notifications, change password, update app, view app info, etc.)

Apart from this, we still need to:
1. Try to create a web app using the same Database and Auth providers and same interface.
2. Try to create a web app using [Solid](https://solid.inrupt.com/)
3. Add useful comments in the code to let others know what we want to do.

# License Info
Copyright (C) 2019  Vedant K

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.


**Thank you for contributing to or spreading word about this app!**
