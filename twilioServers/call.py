# Download the Python helper library from twilio.com/docs/python/install
from twilio.rest import TwilioRestClient

# Your Account Sid and Auth Token from twilio.com/user/account
account_sid = "ACxxxxxxxxxxxxx"
auth_token  = "yyyyyyyyyyyyyyyy"
client = TwilioRestClient(account_sid, auth_token)

call = client.calls.create(url="http://demo.twilio.com/docs/voice.xml",
    to="+17778889999",
    send_text="Hello World",
    from_="+17778889999",
    method="GET")
print(call.sid)

