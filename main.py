#Developed by Jake Bildy, 2018

import requests
import RPi.GPIO as GPIO
import time 
import os

r = requests.get('https://google.ca')

#print(r.text)

for i in range(3):

	time.sleep(3)

	os.system("omxplayer -o local firing.wav")


