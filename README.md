# Auth redirect

This is a sample project aimed to demonstrate the power of redirect URI used through the authorization / authentication process. 

## How to run

1. Start your local Docker machine and run "gradle startApp" in the project's base folder;
1. Access http://localhost:8081/authorize?redirect_uri=https://github.com/digital-consulting - an endpoint which behaves as an unsuccessful authorization and will redirect to the login page. The "redirect_uri" path parameter will be the URI to redirect after the login;
1. Submit your login data. There is no form data validation, you will be redirected to the initial "redirect_uri" URI
