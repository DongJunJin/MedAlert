# Download the twilio-python library from http://twilio.com/docs/libraries
from twilio.rest import TwilioRestClient

# Find these values at https://twilio.com/user/account
account_sid = "ACxxxxxxxxxxxxx"
auth_token = "yyyyyyyyyyyyyyyy"
client = TwilioRestClient(account_sid, auth_token)

message = client.messages.create(to="+17778889999", from_="+17778889999",
                                     body="Hello there!")
