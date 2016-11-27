from flask import Flask, request, redirect
from twilio import twiml

app = Flask(__name__)

entries = {}

@app.route("/sms", methods=['GET', 'POST'])
def sms_reply():
    """Respond to incoming calls with a simple text message."""
    # Start our TwiML response
    resp = twiml.Response()

    body = request.values.get('Body', None)


    # entries.update({str(body[0]): str(body[2])})
    el = body.split(',')
    entries.update({el[0]: el[1]})
    print entries

    # Add a message
    resp.message("Hello " + el[0] + ". You're in Week 2. Please schedule an appointment with your local doctor to diagnose risks of genetic diseases and environmental hazards. It is recommended that you also learn about necessary and suggested changes to ensure a healthy pregnancy and baby.")

    return str(resp)

if __name__ == "__main__":
    app.run(debug=True)
