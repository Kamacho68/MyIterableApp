# MyIterableApp
Iterable Tech Test.
Create a new mobile app project via Android Development Studio and install the Iterable SDK.

This exercise consist of creating an Android app using the Iterable SDK to execute the following tasks:

# Step 1
- Initialize the SDK with the email address {{candidate’s email}}. You do not need to build a login flow. Use the API key (provided by email) to initialize.
- Implement a button in the app UI that when pressed, leverages the Iterable SDK to update the {{candidate’s email} user profile using the criteria below.

1. key: firstName, value: your first name
2. key: isRegisteredUser, value: true
3. key: SA_User_Test_Key, value: “completed”.

# Step 2
- Implement a second button in your app UI that sends a custom event to Iterable using the below criteria.

1. Event Name: mobileSATestEvent
2. key: platform, value: “Android”
3. key: isTestEvent, value: true
4. key: url, value: “https://iterable.com/sa-test/YOUR_FIRST_NAME_HERE”
5. key: secret_code_key, value: “CODE_PROVIDE_IN_EMAIL”

# Step 3
Render the in-app message on your device or simulator via an SDK in-app function or API. Then send:
1) Screenshot that message.
2) Submit the URL of a Github repository with your code + the in-app screenshot to the email address in the in-app.

# Screenshot

