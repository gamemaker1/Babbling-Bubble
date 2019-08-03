//import firebase functions modules
const functions = require('firebase-functions');
//import admin module
const admin = require('firebase-admin');
admin.initializeApp(functions.config().firebase);


// Listens for new messages added to messages/:pushId
exports.pushNotification = functions.database.ref('/messages/{pushId}').onWrite( event => {

    console.log('Push notification event triggered');

    //  Grab the current value of what was written to the Realtime Database.
    var valueObject = event.after.val();
    const messageTitle = valueObject.messageUser + " @ " + valueObject.messageBubble

    // Create a notification
    const payload = {
        notification: {
            title: messageTitle,
            body: valueObject.messageText, //|| valueObject.photoUrl,
        },
    };

    console.log("Payload for the notification: ", valueObject.messageUser, valueObject.messageText)

  //Create an options object that contains the time to live for the notification and the priority
    const options = {
        priority: "high",
        timeToLive: 60 * 60 * 0
    };

    return admin.messaging().sendToTopic(valueObject.messageBubble, payload, options)
	   .then(function (response) {
               console.log("Successfully sent message: ", payload, options, response);
           }).catch(function (error) {
               console.log("Error sending message: ", error);
           });

});
