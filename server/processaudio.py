#Jake Bildy, 2018

import os, wave, io

class ProcessAudio(object) :

    def __init__(self):
        print("ProcessAudio.py: AYY it's lit server-side")

    #loads streamed audio
    def load(self):

    def get_text(self):
        return "text"


    #Checks if keyword has been said
    def activation_said(self, text, keyword):
        if (keyword in text) :
            return True
        else :
            return False

